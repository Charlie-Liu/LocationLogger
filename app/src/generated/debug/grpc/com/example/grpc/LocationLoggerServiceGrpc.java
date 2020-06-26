package com.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.30.1)",
    comments = "Source: location.proto")
public final class LocationLoggerServiceGrpc {

  private LocationLoggerServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.LocationLoggerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.LocationInfo,
      com.example.grpc.LocationAddResponse> getLocationAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "locationAdd",
      requestType = com.example.grpc.LocationInfo.class,
      responseType = com.example.grpc.LocationAddResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.LocationInfo,
      com.example.grpc.LocationAddResponse> getLocationAddMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.LocationInfo, com.example.grpc.LocationAddResponse> getLocationAddMethod;
    if ((getLocationAddMethod = LocationLoggerServiceGrpc.getLocationAddMethod) == null) {
      synchronized (LocationLoggerServiceGrpc.class) {
        if ((getLocationAddMethod = LocationLoggerServiceGrpc.getLocationAddMethod) == null) {
          LocationLoggerServiceGrpc.getLocationAddMethod = getLocationAddMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.LocationInfo, com.example.grpc.LocationAddResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "locationAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.example.grpc.LocationInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.example.grpc.LocationAddResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getLocationAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.LocationListRequest,
      com.example.grpc.LocationInfo> getLocationListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "locationList",
      requestType = com.example.grpc.LocationListRequest.class,
      responseType = com.example.grpc.LocationInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.LocationListRequest,
      com.example.grpc.LocationInfo> getLocationListMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.LocationListRequest, com.example.grpc.LocationInfo> getLocationListMethod;
    if ((getLocationListMethod = LocationLoggerServiceGrpc.getLocationListMethod) == null) {
      synchronized (LocationLoggerServiceGrpc.class) {
        if ((getLocationListMethod = LocationLoggerServiceGrpc.getLocationListMethod) == null) {
          LocationLoggerServiceGrpc.getLocationListMethod = getLocationListMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.LocationListRequest, com.example.grpc.LocationInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "locationList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.example.grpc.LocationListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.example.grpc.LocationInfo.getDefaultInstance()))
              .build();
        }
      }
    }
    return getLocationListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LocationLoggerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocationLoggerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocationLoggerServiceStub>() {
        @java.lang.Override
        public LocationLoggerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocationLoggerServiceStub(channel, callOptions);
        }
      };
    return LocationLoggerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LocationLoggerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocationLoggerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocationLoggerServiceBlockingStub>() {
        @java.lang.Override
        public LocationLoggerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocationLoggerServiceBlockingStub(channel, callOptions);
        }
      };
    return LocationLoggerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LocationLoggerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LocationLoggerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LocationLoggerServiceFutureStub>() {
        @java.lang.Override
        public LocationLoggerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LocationLoggerServiceFutureStub(channel, callOptions);
        }
      };
    return LocationLoggerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class LocationLoggerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void locationAdd(com.example.grpc.LocationInfo request,
        io.grpc.stub.StreamObserver<com.example.grpc.LocationAddResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLocationAddMethod(), responseObserver);
    }

    /**
     */
    public void locationList(com.example.grpc.LocationListRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.LocationInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getLocationListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLocationAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.LocationInfo,
                com.example.grpc.LocationAddResponse>(
                  this, METHODID_LOCATION_ADD)))
          .addMethod(
            getLocationListMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.example.grpc.LocationListRequest,
                com.example.grpc.LocationInfo>(
                  this, METHODID_LOCATION_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class LocationLoggerServiceStub extends io.grpc.stub.AbstractAsyncStub<LocationLoggerServiceStub> {
    private LocationLoggerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationLoggerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocationLoggerServiceStub(channel, callOptions);
    }

    /**
     */
    public void locationAdd(com.example.grpc.LocationInfo request,
        io.grpc.stub.StreamObserver<com.example.grpc.LocationAddResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLocationAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void locationList(com.example.grpc.LocationListRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.LocationInfo> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getLocationListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LocationLoggerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LocationLoggerServiceBlockingStub> {
    private LocationLoggerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationLoggerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocationLoggerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.LocationAddResponse locationAdd(com.example.grpc.LocationInfo request) {
      return blockingUnaryCall(
          getChannel(), getLocationAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.example.grpc.LocationInfo> locationList(
        com.example.grpc.LocationListRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getLocationListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LocationLoggerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LocationLoggerServiceFutureStub> {
    private LocationLoggerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocationLoggerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LocationLoggerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.LocationAddResponse> locationAdd(
        com.example.grpc.LocationInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getLocationAddMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOCATION_ADD = 0;
  private static final int METHODID_LOCATION_LIST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LocationLoggerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LocationLoggerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOCATION_ADD:
          serviceImpl.locationAdd((com.example.grpc.LocationInfo) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.LocationAddResponse>) responseObserver);
          break;
        case METHODID_LOCATION_LIST:
          serviceImpl.locationList((com.example.grpc.LocationListRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.LocationInfo>) responseObserver);
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

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LocationLoggerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getLocationAddMethod())
              .addMethod(getLocationListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
