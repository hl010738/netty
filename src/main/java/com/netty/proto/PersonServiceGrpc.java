package com.netty.proto;

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
    value = "by gRPC proto compiler (version 1.9.0)",
    comments = "Source: Person.proto")
public final class PersonServiceGrpc {

  private PersonServiceGrpc() {}

  public static final String SERVICE_NAME = "com.netty.proto.PersonService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetRealNameByUserNameMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.netty.proto.MyRequest,
      com.netty.proto.MyResponse> METHOD_GET_REAL_NAME_BY_USER_NAME = getGetRealNameByUserNameMethod();

  private static volatile io.grpc.MethodDescriptor<com.netty.proto.MyRequest,
      com.netty.proto.MyResponse> getGetRealNameByUserNameMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.netty.proto.MyRequest,
      com.netty.proto.MyResponse> getGetRealNameByUserNameMethod() {
    io.grpc.MethodDescriptor<com.netty.proto.MyRequest, com.netty.proto.MyResponse> getGetRealNameByUserNameMethod;
    if ((getGetRealNameByUserNameMethod = PersonServiceGrpc.getGetRealNameByUserNameMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getGetRealNameByUserNameMethod = PersonServiceGrpc.getGetRealNameByUserNameMethod) == null) {
          PersonServiceGrpc.getGetRealNameByUserNameMethod = getGetRealNameByUserNameMethod = 
              io.grpc.MethodDescriptor.<com.netty.proto.MyRequest, com.netty.proto.MyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.netty.proto.PersonService", "getRealNameByUserName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netty.proto.MyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netty.proto.MyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("getRealNameByUserName"))
                  .build();
          }
        }
     }
     return getGetRealNameByUserNameMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetPersonByAgeMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.netty.proto.PersonRequest,
      com.netty.proto.PersonResponse> METHOD_GET_PERSON_BY_AGE = getGetPersonByAgeMethod();

  private static volatile io.grpc.MethodDescriptor<com.netty.proto.PersonRequest,
      com.netty.proto.PersonResponse> getGetPersonByAgeMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.netty.proto.PersonRequest,
      com.netty.proto.PersonResponse> getGetPersonByAgeMethod() {
    io.grpc.MethodDescriptor<com.netty.proto.PersonRequest, com.netty.proto.PersonResponse> getGetPersonByAgeMethod;
    if ((getGetPersonByAgeMethod = PersonServiceGrpc.getGetPersonByAgeMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getGetPersonByAgeMethod = PersonServiceGrpc.getGetPersonByAgeMethod) == null) {
          PersonServiceGrpc.getGetPersonByAgeMethod = getGetPersonByAgeMethod = 
              io.grpc.MethodDescriptor.<com.netty.proto.PersonRequest, com.netty.proto.PersonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.netty.proto.PersonService", "getPersonByAge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netty.proto.PersonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netty.proto.PersonResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("getPersonByAge"))
                  .build();
          }
        }
     }
     return getGetPersonByAgeMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetPersonWrapperByAgesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.netty.proto.PersonRequest,
      com.netty.proto.PersonResponseList> METHOD_GET_PERSON_WRAPPER_BY_AGES = getGetPersonWrapperByAgesMethod();

  private static volatile io.grpc.MethodDescriptor<com.netty.proto.PersonRequest,
      com.netty.proto.PersonResponseList> getGetPersonWrapperByAgesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.netty.proto.PersonRequest,
      com.netty.proto.PersonResponseList> getGetPersonWrapperByAgesMethod() {
    io.grpc.MethodDescriptor<com.netty.proto.PersonRequest, com.netty.proto.PersonResponseList> getGetPersonWrapperByAgesMethod;
    if ((getGetPersonWrapperByAgesMethod = PersonServiceGrpc.getGetPersonWrapperByAgesMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getGetPersonWrapperByAgesMethod = PersonServiceGrpc.getGetPersonWrapperByAgesMethod) == null) {
          PersonServiceGrpc.getGetPersonWrapperByAgesMethod = getGetPersonWrapperByAgesMethod = 
              io.grpc.MethodDescriptor.<com.netty.proto.PersonRequest, com.netty.proto.PersonResponseList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.netty.proto.PersonService", "getPersonWrapperByAges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netty.proto.PersonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netty.proto.PersonResponseList.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("getPersonWrapperByAges"))
                  .build();
          }
        }
     }
     return getGetPersonWrapperByAgesMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getBiTalkMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.netty.proto.StreamRequest,
      com.netty.proto.StreamResponse> METHOD_BI_TALK = getBiTalkMethod();

  private static volatile io.grpc.MethodDescriptor<com.netty.proto.StreamRequest,
      com.netty.proto.StreamResponse> getBiTalkMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.netty.proto.StreamRequest,
      com.netty.proto.StreamResponse> getBiTalkMethod() {
    io.grpc.MethodDescriptor<com.netty.proto.StreamRequest, com.netty.proto.StreamResponse> getBiTalkMethod;
    if ((getBiTalkMethod = PersonServiceGrpc.getBiTalkMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getBiTalkMethod = PersonServiceGrpc.getBiTalkMethod) == null) {
          PersonServiceGrpc.getBiTalkMethod = getBiTalkMethod = 
              io.grpc.MethodDescriptor.<com.netty.proto.StreamRequest, com.netty.proto.StreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.netty.proto.PersonService", "biTalk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netty.proto.StreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.netty.proto.StreamResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("biTalk"))
                  .build();
          }
        }
     }
     return getBiTalkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PersonServiceStub newStub(io.grpc.Channel channel) {
    return new PersonServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PersonServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PersonServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PersonServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PersonServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PersonServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRealNameByUserName(com.netty.proto.MyRequest request,
        io.grpc.stub.StreamObserver<com.netty.proto.MyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRealNameByUserNameMethod(), responseObserver);
    }

    /**
     */
    public void getPersonByAge(com.netty.proto.PersonRequest request,
        io.grpc.stub.StreamObserver<com.netty.proto.PersonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPersonByAgeMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.netty.proto.PersonRequest> getPersonWrapperByAges(
        io.grpc.stub.StreamObserver<com.netty.proto.PersonResponseList> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetPersonWrapperByAgesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.netty.proto.StreamRequest> biTalk(
        io.grpc.stub.StreamObserver<com.netty.proto.StreamResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getBiTalkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRealNameByUserNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.netty.proto.MyRequest,
                com.netty.proto.MyResponse>(
                  this, METHODID_GET_REAL_NAME_BY_USER_NAME)))
          .addMethod(
            getGetPersonByAgeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.netty.proto.PersonRequest,
                com.netty.proto.PersonResponse>(
                  this, METHODID_GET_PERSON_BY_AGE)))
          .addMethod(
            getGetPersonWrapperByAgesMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.netty.proto.PersonRequest,
                com.netty.proto.PersonResponseList>(
                  this, METHODID_GET_PERSON_WRAPPER_BY_AGES)))
          .addMethod(
            getBiTalkMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.netty.proto.StreamRequest,
                com.netty.proto.StreamResponse>(
                  this, METHODID_BI_TALK)))
          .build();
    }
  }

  /**
   */
  public static final class PersonServiceStub extends io.grpc.stub.AbstractStub<PersonServiceStub> {
    private PersonServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceStub(channel, callOptions);
    }

    /**
     */
    public void getRealNameByUserName(com.netty.proto.MyRequest request,
        io.grpc.stub.StreamObserver<com.netty.proto.MyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRealNameByUserNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPersonByAge(com.netty.proto.PersonRequest request,
        io.grpc.stub.StreamObserver<com.netty.proto.PersonResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetPersonByAgeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.netty.proto.PersonRequest> getPersonWrapperByAges(
        io.grpc.stub.StreamObserver<com.netty.proto.PersonResponseList> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGetPersonWrapperByAgesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.netty.proto.StreamRequest> biTalk(
        io.grpc.stub.StreamObserver<com.netty.proto.StreamResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getBiTalkMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class PersonServiceBlockingStub extends io.grpc.stub.AbstractStub<PersonServiceBlockingStub> {
    private PersonServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.netty.proto.MyResponse getRealNameByUserName(com.netty.proto.MyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRealNameByUserNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.netty.proto.PersonResponse> getPersonByAge(
        com.netty.proto.PersonRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetPersonByAgeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PersonServiceFutureStub extends io.grpc.stub.AbstractStub<PersonServiceFutureStub> {
    private PersonServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.netty.proto.MyResponse> getRealNameByUserName(
        com.netty.proto.MyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRealNameByUserNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_REAL_NAME_BY_USER_NAME = 0;
  private static final int METHODID_GET_PERSON_BY_AGE = 1;
  private static final int METHODID_GET_PERSON_WRAPPER_BY_AGES = 2;
  private static final int METHODID_BI_TALK = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PersonServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PersonServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_REAL_NAME_BY_USER_NAME:
          serviceImpl.getRealNameByUserName((com.netty.proto.MyRequest) request,
              (io.grpc.stub.StreamObserver<com.netty.proto.MyResponse>) responseObserver);
          break;
        case METHODID_GET_PERSON_BY_AGE:
          serviceImpl.getPersonByAge((com.netty.proto.PersonRequest) request,
              (io.grpc.stub.StreamObserver<com.netty.proto.PersonResponse>) responseObserver);
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
        case METHODID_GET_PERSON_WRAPPER_BY_AGES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getPersonWrapperByAges(
              (io.grpc.stub.StreamObserver<com.netty.proto.PersonResponseList>) responseObserver);
        case METHODID_BI_TALK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.biTalk(
              (io.grpc.stub.StreamObserver<com.netty.proto.StreamResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PersonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PersonServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.netty.proto.PersonProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PersonService");
    }
  }

  private static final class PersonServiceFileDescriptorSupplier
      extends PersonServiceBaseDescriptorSupplier {
    PersonServiceFileDescriptorSupplier() {}
  }

  private static final class PersonServiceMethodDescriptorSupplier
      extends PersonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PersonServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PersonServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PersonServiceFileDescriptorSupplier())
              .addMethod(getGetRealNameByUserNameMethod())
              .addMethod(getGetPersonByAgeMethod())
              .addMethod(getGetPersonWrapperByAgesMethod())
              .addMethod(getBiTalkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
