package com.google.ads.googleads.v10.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to generate keyword ideas.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v10/services/keyword_plan_idea_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class KeywordPlanIdeaServiceGrpc {

  private KeywordPlanIdeaServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v10.services.KeywordPlanIdeaService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v10.services.GenerateKeywordIdeasRequest,
      com.google.ads.googleads.v10.services.GenerateKeywordIdeaResponse> getGenerateKeywordIdeasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateKeywordIdeas",
      requestType = com.google.ads.googleads.v10.services.GenerateKeywordIdeasRequest.class,
      responseType = com.google.ads.googleads.v10.services.GenerateKeywordIdeaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v10.services.GenerateKeywordIdeasRequest,
      com.google.ads.googleads.v10.services.GenerateKeywordIdeaResponse> getGenerateKeywordIdeasMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v10.services.GenerateKeywordIdeasRequest, com.google.ads.googleads.v10.services.GenerateKeywordIdeaResponse> getGenerateKeywordIdeasMethod;
    if ((getGenerateKeywordIdeasMethod = KeywordPlanIdeaServiceGrpc.getGenerateKeywordIdeasMethod) == null) {
      synchronized (KeywordPlanIdeaServiceGrpc.class) {
        if ((getGenerateKeywordIdeasMethod = KeywordPlanIdeaServiceGrpc.getGenerateKeywordIdeasMethod) == null) {
          KeywordPlanIdeaServiceGrpc.getGenerateKeywordIdeasMethod = getGenerateKeywordIdeasMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v10.services.GenerateKeywordIdeasRequest, com.google.ads.googleads.v10.services.GenerateKeywordIdeaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateKeywordIdeas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v10.services.GenerateKeywordIdeasRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v10.services.GenerateKeywordIdeaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeywordPlanIdeaServiceMethodDescriptorSupplier("GenerateKeywordIdeas"))
              .build();
        }
      }
    }
    return getGenerateKeywordIdeasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v10.services.GenerateKeywordHistoricalMetricsRequest,
      com.google.ads.googleads.v10.services.GenerateKeywordHistoricalMetricsResponse> getGenerateKeywordHistoricalMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateKeywordHistoricalMetrics",
      requestType = com.google.ads.googleads.v10.services.GenerateKeywordHistoricalMetricsRequest.class,
      responseType = com.google.ads.googleads.v10.services.GenerateKeywordHistoricalMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v10.services.GenerateKeywordHistoricalMetricsRequest,
      com.google.ads.googleads.v10.services.GenerateKeywordHistoricalMetricsResponse> getGenerateKeywordHistoricalMetricsMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v10.services.GenerateKeywordHistoricalMetricsRequest, com.google.ads.googleads.v10.services.GenerateKeywordHistoricalMetricsResponse> getGenerateKeywordHistoricalMetricsMethod;
    if ((getGenerateKeywordHistoricalMetricsMethod = KeywordPlanIdeaServiceGrpc.getGenerateKeywordHistoricalMetricsMethod) == null) {
      synchronized (KeywordPlanIdeaServiceGrpc.class) {
        if ((getGenerateKeywordHistoricalMetricsMethod = KeywordPlanIdeaServiceGrpc.getGenerateKeywordHistoricalMetricsMethod) == null) {
          KeywordPlanIdeaServiceGrpc.getGenerateKeywordHistoricalMetricsMethod = getGenerateKeywordHistoricalMetricsMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v10.services.GenerateKeywordHistoricalMetricsRequest, com.google.ads.googleads.v10.services.GenerateKeywordHistoricalMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateKeywordHistoricalMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v10.services.GenerateKeywordHistoricalMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v10.services.GenerateKeywordHistoricalMetricsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeywordPlanIdeaServiceMethodDescriptorSupplier("GenerateKeywordHistoricalMetrics"))
              .build();
        }
      }
    }
    return getGenerateKeywordHistoricalMetricsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeywordPlanIdeaServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordPlanIdeaServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordPlanIdeaServiceStub>() {
        @java.lang.Override
        public KeywordPlanIdeaServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordPlanIdeaServiceStub(channel, callOptions);
        }
      };
    return KeywordPlanIdeaServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeywordPlanIdeaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordPlanIdeaServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordPlanIdeaServiceBlockingStub>() {
        @java.lang.Override
        public KeywordPlanIdeaServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordPlanIdeaServiceBlockingStub(channel, callOptions);
        }
      };
    return KeywordPlanIdeaServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeywordPlanIdeaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeywordPlanIdeaServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeywordPlanIdeaServiceFutureStub>() {
        @java.lang.Override
        public KeywordPlanIdeaServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeywordPlanIdeaServiceFutureStub(channel, callOptions);
        }
      };
    return KeywordPlanIdeaServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to generate keyword ideas.
   * </pre>
   */
  public static abstract class KeywordPlanIdeaServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns a list of keyword ideas.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanIdeaError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateKeywordIdeas(com.google.ads.googleads.v10.services.GenerateKeywordIdeasRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v10.services.GenerateKeywordIdeaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateKeywordIdeasMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of keyword historical metrics.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateKeywordHistoricalMetrics(com.google.ads.googleads.v10.services.GenerateKeywordHistoricalMetricsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v10.services.GenerateKeywordHistoricalMetricsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateKeywordHistoricalMetricsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenerateKeywordIdeasMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v10.services.GenerateKeywordIdeasRequest,
                com.google.ads.googleads.v10.services.GenerateKeywordIdeaResponse>(
                  this, METHODID_GENERATE_KEYWORD_IDEAS)))
          .addMethod(
            getGenerateKeywordHistoricalMetricsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v10.services.GenerateKeywordHistoricalMetricsRequest,
                com.google.ads.googleads.v10.services.GenerateKeywordHistoricalMetricsResponse>(
                  this, METHODID_GENERATE_KEYWORD_HISTORICAL_METRICS)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to generate keyword ideas.
   * </pre>
   */
  public static final class KeywordPlanIdeaServiceStub extends io.grpc.stub.AbstractAsyncStub<KeywordPlanIdeaServiceStub> {
    private KeywordPlanIdeaServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanIdeaServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordPlanIdeaServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a list of keyword ideas.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanIdeaError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateKeywordIdeas(com.google.ads.googleads.v10.services.GenerateKeywordIdeasRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v10.services.GenerateKeywordIdeaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateKeywordIdeasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of keyword historical metrics.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public void generateKeywordHistoricalMetrics(com.google.ads.googleads.v10.services.GenerateKeywordHistoricalMetricsRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v10.services.GenerateKeywordHistoricalMetricsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateKeywordHistoricalMetricsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to generate keyword ideas.
   * </pre>
   */
  public static final class KeywordPlanIdeaServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeywordPlanIdeaServiceBlockingStub> {
    private KeywordPlanIdeaServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanIdeaServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordPlanIdeaServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a list of keyword ideas.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanIdeaError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v10.services.GenerateKeywordIdeaResponse generateKeywordIdeas(com.google.ads.googleads.v10.services.GenerateKeywordIdeasRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateKeywordIdeasMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of keyword historical metrics.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.ads.googleads.v10.services.GenerateKeywordHistoricalMetricsResponse generateKeywordHistoricalMetrics(com.google.ads.googleads.v10.services.GenerateKeywordHistoricalMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateKeywordHistoricalMetricsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to generate keyword ideas.
   * </pre>
   */
  public static final class KeywordPlanIdeaServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KeywordPlanIdeaServiceFutureStub> {
    private KeywordPlanIdeaServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeywordPlanIdeaServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeywordPlanIdeaServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a list of keyword ideas.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [KeywordPlanIdeaError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v10.services.GenerateKeywordIdeaResponse> generateKeywordIdeas(
        com.google.ads.googleads.v10.services.GenerateKeywordIdeasRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateKeywordIdeasMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of keyword historical metrics.
     * List of thrown errors:
     *   [AuthenticationError]()
     *   [AuthorizationError]()
     *   [CollectionSizeError]()
     *   [HeaderError]()
     *   [InternalError]()
     *   [QuotaError]()
     *   [RequestError]()
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v10.services.GenerateKeywordHistoricalMetricsResponse> generateKeywordHistoricalMetrics(
        com.google.ads.googleads.v10.services.GenerateKeywordHistoricalMetricsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateKeywordHistoricalMetricsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE_KEYWORD_IDEAS = 0;
  private static final int METHODID_GENERATE_KEYWORD_HISTORICAL_METRICS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeywordPlanIdeaServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeywordPlanIdeaServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GENERATE_KEYWORD_IDEAS:
          serviceImpl.generateKeywordIdeas((com.google.ads.googleads.v10.services.GenerateKeywordIdeasRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v10.services.GenerateKeywordIdeaResponse>) responseObserver);
          break;
        case METHODID_GENERATE_KEYWORD_HISTORICAL_METRICS:
          serviceImpl.generateKeywordHistoricalMetrics((com.google.ads.googleads.v10.services.GenerateKeywordHistoricalMetricsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v10.services.GenerateKeywordHistoricalMetricsResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class KeywordPlanIdeaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeywordPlanIdeaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v10.services.KeywordPlanIdeaServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeywordPlanIdeaService");
    }
  }

  private static final class KeywordPlanIdeaServiceFileDescriptorSupplier
      extends KeywordPlanIdeaServiceBaseDescriptorSupplier {
    KeywordPlanIdeaServiceFileDescriptorSupplier() {}
  }

  private static final class KeywordPlanIdeaServiceMethodDescriptorSupplier
      extends KeywordPlanIdeaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeywordPlanIdeaServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeywordPlanIdeaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeywordPlanIdeaServiceFileDescriptorSupplier())
              .addMethod(getGenerateKeywordIdeasMethod())
              .addMethod(getGenerateKeywordHistoricalMetricsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
