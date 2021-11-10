package com.ahnchan.gprc.greet;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: greet/greet.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GreetServiceGrpc {

  private GreetServiceGrpc() {}

  public static final String SERVICE_NAME = "greet.GreetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ahnchan.gprc.greet.GreetRequest,
      com.ahnchan.gprc.greet.GreetResponse> getGreetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greet",
      requestType = com.ahnchan.gprc.greet.GreetRequest.class,
      responseType = com.ahnchan.gprc.greet.GreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ahnchan.gprc.greet.GreetRequest,
      com.ahnchan.gprc.greet.GreetResponse> getGreetMethod() {
    io.grpc.MethodDescriptor<com.ahnchan.gprc.greet.GreetRequest, com.ahnchan.gprc.greet.GreetResponse> getGreetMethod;
    if ((getGreetMethod = GreetServiceGrpc.getGreetMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetMethod = GreetServiceGrpc.getGreetMethod) == null) {
          GreetServiceGrpc.getGreetMethod = getGreetMethod =
              io.grpc.MethodDescriptor.<com.ahnchan.gprc.greet.GreetRequest, com.ahnchan.gprc.greet.GreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "greet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ahnchan.gprc.greet.GreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ahnchan.gprc.greet.GreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("greet"))
              .build();
        }
      }
    }
    return getGreetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ahnchan.gprc.greet.GreetManyRequest,
      com.ahnchan.gprc.greet.GreetManyResponse> getGreetManyTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greetManyTime",
      requestType = com.ahnchan.gprc.greet.GreetManyRequest.class,
      responseType = com.ahnchan.gprc.greet.GreetManyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.ahnchan.gprc.greet.GreetManyRequest,
      com.ahnchan.gprc.greet.GreetManyResponse> getGreetManyTimeMethod() {
    io.grpc.MethodDescriptor<com.ahnchan.gprc.greet.GreetManyRequest, com.ahnchan.gprc.greet.GreetManyResponse> getGreetManyTimeMethod;
    if ((getGreetManyTimeMethod = GreetServiceGrpc.getGreetManyTimeMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetManyTimeMethod = GreetServiceGrpc.getGreetManyTimeMethod) == null) {
          GreetServiceGrpc.getGreetManyTimeMethod = getGreetManyTimeMethod =
              io.grpc.MethodDescriptor.<com.ahnchan.gprc.greet.GreetManyRequest, com.ahnchan.gprc.greet.GreetManyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "greetManyTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ahnchan.gprc.greet.GreetManyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ahnchan.gprc.greet.GreetManyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("greetManyTime"))
              .build();
        }
      }
    }
    return getGreetManyTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ahnchan.gprc.greet.LongGreetRequest,
      com.ahnchan.gprc.greet.LongGreetResponse> getLongGreetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "longGreet",
      requestType = com.ahnchan.gprc.greet.LongGreetRequest.class,
      responseType = com.ahnchan.gprc.greet.LongGreetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.ahnchan.gprc.greet.LongGreetRequest,
      com.ahnchan.gprc.greet.LongGreetResponse> getLongGreetMethod() {
    io.grpc.MethodDescriptor<com.ahnchan.gprc.greet.LongGreetRequest, com.ahnchan.gprc.greet.LongGreetResponse> getLongGreetMethod;
    if ((getLongGreetMethod = GreetServiceGrpc.getLongGreetMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getLongGreetMethod = GreetServiceGrpc.getLongGreetMethod) == null) {
          GreetServiceGrpc.getLongGreetMethod = getLongGreetMethod =
              io.grpc.MethodDescriptor.<com.ahnchan.gprc.greet.LongGreetRequest, com.ahnchan.gprc.greet.LongGreetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "longGreet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ahnchan.gprc.greet.LongGreetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ahnchan.gprc.greet.LongGreetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("longGreet"))
              .build();
        }
      }
    }
    return getLongGreetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ahnchan.gprc.greet.GreetEveryRequest,
      com.ahnchan.gprc.greet.GreetEveryResponse> getGreetEveryoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "greetEveryone",
      requestType = com.ahnchan.gprc.greet.GreetEveryRequest.class,
      responseType = com.ahnchan.gprc.greet.GreetEveryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.ahnchan.gprc.greet.GreetEveryRequest,
      com.ahnchan.gprc.greet.GreetEveryResponse> getGreetEveryoneMethod() {
    io.grpc.MethodDescriptor<com.ahnchan.gprc.greet.GreetEveryRequest, com.ahnchan.gprc.greet.GreetEveryResponse> getGreetEveryoneMethod;
    if ((getGreetEveryoneMethod = GreetServiceGrpc.getGreetEveryoneMethod) == null) {
      synchronized (GreetServiceGrpc.class) {
        if ((getGreetEveryoneMethod = GreetServiceGrpc.getGreetEveryoneMethod) == null) {
          GreetServiceGrpc.getGreetEveryoneMethod = getGreetEveryoneMethod =
              io.grpc.MethodDescriptor.<com.ahnchan.gprc.greet.GreetEveryRequest, com.ahnchan.gprc.greet.GreetEveryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "greetEveryone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ahnchan.gprc.greet.GreetEveryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ahnchan.gprc.greet.GreetEveryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreetServiceMethodDescriptorSupplier("greetEveryone"))
              .build();
        }
      }
    }
    return getGreetEveryoneMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceStub>() {
        @java.lang.Override
        public GreetServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceStub(channel, callOptions);
        }
      };
    return GreetServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceBlockingStub>() {
        @java.lang.Override
        public GreetServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceBlockingStub(channel, callOptions);
        }
      };
    return GreetServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreetServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreetServiceFutureStub>() {
        @java.lang.Override
        public GreetServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreetServiceFutureStub(channel, callOptions);
        }
      };
    return GreetServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class GreetServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void greet(com.ahnchan.gprc.greet.GreetRequest request,
        io.grpc.stub.StreamObserver<com.ahnchan.gprc.greet.GreetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client streaming
     * </pre>
     */
    public void greetManyTime(com.ahnchan.gprc.greet.GreetManyRequest request,
        io.grpc.stub.StreamObserver<com.ahnchan.gprc.greet.GreetManyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGreetManyTimeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.ahnchan.gprc.greet.LongGreetRequest> longGreet(
        io.grpc.stub.StreamObserver<com.ahnchan.gprc.greet.LongGreetResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getLongGreetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bi Directional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.ahnchan.gprc.greet.GreetEveryRequest> greetEveryone(
        io.grpc.stub.StreamObserver<com.ahnchan.gprc.greet.GreetEveryResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getGreetEveryoneMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGreetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.ahnchan.gprc.greet.GreetRequest,
                com.ahnchan.gprc.greet.GreetResponse>(
                  this, METHODID_GREET)))
          .addMethod(
            getGreetManyTimeMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.ahnchan.gprc.greet.GreetManyRequest,
                com.ahnchan.gprc.greet.GreetManyResponse>(
                  this, METHODID_GREET_MANY_TIME)))
          .addMethod(
            getLongGreetMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.ahnchan.gprc.greet.LongGreetRequest,
                com.ahnchan.gprc.greet.LongGreetResponse>(
                  this, METHODID_LONG_GREET)))
          .addMethod(
            getGreetEveryoneMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.ahnchan.gprc.greet.GreetEveryRequest,
                com.ahnchan.gprc.greet.GreetEveryResponse>(
                  this, METHODID_GREET_EVERYONE)))
          .build();
    }
  }

  /**
   */
  public static final class GreetServiceStub extends io.grpc.stub.AbstractAsyncStub<GreetServiceStub> {
    private GreetServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void greet(com.ahnchan.gprc.greet.GreetRequest request,
        io.grpc.stub.StreamObserver<com.ahnchan.gprc.greet.GreetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client streaming
     * </pre>
     */
    public void greetManyTime(com.ahnchan.gprc.greet.GreetManyRequest request,
        io.grpc.stub.StreamObserver<com.ahnchan.gprc.greet.GreetManyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGreetManyTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.ahnchan.gprc.greet.LongGreetRequest> longGreet(
        io.grpc.stub.StreamObserver<com.ahnchan.gprc.greet.LongGreetResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getLongGreetMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Bi Directional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.ahnchan.gprc.greet.GreetEveryRequest> greetEveryone(
        io.grpc.stub.StreamObserver<com.ahnchan.gprc.greet.GreetEveryResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getGreetEveryoneMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class GreetServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreetServiceBlockingStub> {
    private GreetServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public com.ahnchan.gprc.greet.GreetResponse greet(com.ahnchan.gprc.greet.GreetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGreetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Client streaming
     * </pre>
     */
    public java.util.Iterator<com.ahnchan.gprc.greet.GreetManyResponse> greetManyTime(
        com.ahnchan.gprc.greet.GreetManyRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGreetManyTimeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreetServiceFutureStub extends io.grpc.stub.AbstractFutureStub<GreetServiceFutureStub> {
    private GreetServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreetServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ahnchan.gprc.greet.GreetResponse> greet(
        com.ahnchan.gprc.greet.GreetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGreetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GREET = 0;
  private static final int METHODID_GREET_MANY_TIME = 1;
  private static final int METHODID_LONG_GREET = 2;
  private static final int METHODID_GREET_EVERYONE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREET:
          serviceImpl.greet((com.ahnchan.gprc.greet.GreetRequest) request,
              (io.grpc.stub.StreamObserver<com.ahnchan.gprc.greet.GreetResponse>) responseObserver);
          break;
        case METHODID_GREET_MANY_TIME:
          serviceImpl.greetManyTime((com.ahnchan.gprc.greet.GreetManyRequest) request,
              (io.grpc.stub.StreamObserver<com.ahnchan.gprc.greet.GreetManyResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LONG_GREET:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.longGreet(
              (io.grpc.stub.StreamObserver<com.ahnchan.gprc.greet.LongGreetResponse>) responseObserver);
        case METHODID_GREET_EVERYONE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.greetEveryone(
              (io.grpc.stub.StreamObserver<com.ahnchan.gprc.greet.GreetEveryResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GreetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ahnchan.gprc.greet.Greet.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreetService");
    }
  }

  private static final class GreetServiceFileDescriptorSupplier
      extends GreetServiceBaseDescriptorSupplier {
    GreetServiceFileDescriptorSupplier() {}
  }

  private static final class GreetServiceMethodDescriptorSupplier
      extends GreetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreetServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetServiceFileDescriptorSupplier())
              .addMethod(getGreetMethod())
              .addMethod(getGreetManyTimeMethod())
              .addMethod(getLongGreetMethod())
              .addMethod(getGreetEveryoneMethod())
              .build();
        }
      }
    }
    return result;
  }
}
