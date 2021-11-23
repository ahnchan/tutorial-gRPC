package com.ahnchan.grpc.client;

import com.ahnchan.gprc.dummy.DummyServiceGrpc;
import com.ahnchan.gprc.greet.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class GreetingClient {

    public static void main(String[] args) {
        GreetingClient client = new GreetingClient();
        client.run();
    }

    private void run() {
        System.out.println("Greeting gRPC client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

//        unary(channel); // Unar
//        serverStreaming(channel); // Server streaming
//        clientStreaming(channel); // Client streaming
        everyoneStreaming(channel);   // Bi-directional

        System.out.println("Shutting down channel");
        channel.shutdown();

    }

    private void unary(ManagedChannel channel) {
        // GreetService
        GreetServiceGrpc.GreetServiceBlockingStub greetClient = GreetServiceGrpc.newBlockingStub(channel);

        // Unary
        Greeting greeting = Greeting.newBuilder()
                .setFirstName("Gildong")
                .setLastName("Hong")
                .build();

        GreetRequest greetRequest = GreetRequest.newBuilder()
                .setGreeting(greeting)
                .build();

        GreetResponse result = greetClient.greet(greetRequest);
        System.out.println(result.getResult());
    }

    private void serverStreaming(ManagedChannel channel) {
        // GreetService
        GreetServiceGrpc.GreetServiceBlockingStub greetClient = GreetServiceGrpc.newBlockingStub(channel);

        // Server streaming
        GreetManyRequest greetManyRequest = GreetManyRequest.newBuilder()
                .setGreeting(Greeting.newBuilder()
                        .setFirstName("Gildong")
                        .setLastName("Hong")
                        .build())
                .build();

        greetClient.greetManyTime(greetManyRequest)
                .forEachRemaining(greetManyResponse -> {
                    System.out.println(greetManyResponse.getResult());
                });
    }

    private void clientStreaming(ManagedChannel channel) {
        GreetServiceGrpc.GreetServiceStub asyncClient = GreetServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<LongGreetRequest> requestObserver = asyncClient.longGreet(new StreamObserver<LongGreetResponse>() {
            @Override
            public void onNext(LongGreetResponse value) {
                // send from server onCompleted()
                System.out.println("Received message from server.");
                System.out.println(value.getResult());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                // send to server sending stream is done.
                System.out.println("completed.");
                latch.countDown();
            }
        });

         for(int i=1; i<= 10; i++) {
             requestObserver.onNext(LongGreetRequest.newBuilder()
                     .setGreeting(Greeting.newBuilder()
                             .setFirstName("Gildong #" + i)
                             .build())
                     .build());
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }

         }

         requestObserver.onCompleted();

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void everyoneStreaming(ManagedChannel channel) {
        GreetServiceGrpc.GreetServiceStub asyncClient = GreetServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<GreetEveryRequest> everyoneRequest = asyncClient.greetEveryone(new StreamObserver<GreetEveryResponse>() {
            @Override
            public void onNext(GreetEveryResponse value) {
                System.out.println("Received from server: "+ value.getResult());
            }

            @Override
            public void onError(Throwable t) {
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                latch.countDown();
            }
        });


        Arrays.asList("Gildong 1", "Gildong 2", "Gildong 3", "Gildong 4", "Gildong 5").forEach(
                name -> {
                    System.out.println("Send to server: "+ name);
                    everyoneRequest.onNext(GreetEveryRequest.newBuilder()
                            .setGreet(Greeting.newBuilder()
                                    .setFirstName(name)
                                    .build())
                            .build());
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );

        everyoneRequest.onCompleted();

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
