package com.ahnchan.grpc.server;


import com.ahnchan.gprc.greet.*;
import io.grpc.stub.StreamObserver;

public class GreetServiceImpl extends GreetServiceGrpc.GreetServiceImplBase {

    @Override
    public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {
        Greeting greeting = request.getGreeting();
        String firstName = greeting.getFirstName();

        String result = "Hello " + firstName;
        GreetResponse response = GreetResponse.newBuilder()
                .setResult(result)
                .build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();
    }


    @Override
    public void greetManyTime(GreetManyRequest request, StreamObserver<GreetManyResponse> responseObserver) {
        String firstName = request.getGreeting().getFirstName();

        try {
            for(int i=0; i<10; i++) {
                GreetManyResponse response = GreetManyResponse.newBuilder()
                        .setResult("Hello " + firstName + ", no: " + i)
                        .build();
                responseObserver.onNext(response);

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            responseObserver.onCompleted();
        }
    }

    @Override
    public StreamObserver<LongGreetRequest> longGreet(StreamObserver<LongGreetResponse> responseObserver) {

        StreamObserver<LongGreetRequest>  longGreetRequest = new StreamObserver<LongGreetRequest>() {

            String result = "";

            @Override
            public void onNext(LongGreetRequest value) {
                result += " Hello " + value.getGreeting().getFirstName();
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(LongGreetResponse.newBuilder()
                        .setResult(result)
                        .build());
                responseObserver.onCompleted();
            }
        };

        return longGreetRequest;
    }


    @Override
    public StreamObserver<GreetEveryRequest> greetEveryone(StreamObserver<GreetEveryResponse> responseObserver) {

        StreamObserver<GreetEveryRequest> greetEveryRequest = new StreamObserver<GreetEveryRequest>() {
            @Override
            public void onNext(GreetEveryRequest value) {
                System.out.println("Received from client: " + value.getGreet().getFirstName());
                String result = "Hello " +  value.getGreet().getFirstName();

                responseObserver.onNext(GreetEveryResponse.newBuilder()
                        .setResult(result)
                        .build());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };

        return greetEveryRequest;
    }
}
