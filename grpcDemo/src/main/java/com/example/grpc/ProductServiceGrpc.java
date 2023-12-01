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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: productos.proto")
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final String SERVICE_NAME = "ProductService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Productos.Product,
      com.example.grpc.Productos.Product> getCreateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProduct",
      requestType = com.example.grpc.Productos.Product.class,
      responseType = com.example.grpc.Productos.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Productos.Product,
      com.example.grpc.Productos.Product> getCreateProductMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Productos.Product, com.example.grpc.Productos.Product> getCreateProductMethod;
    if ((getCreateProductMethod = ProductServiceGrpc.getCreateProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getCreateProductMethod = ProductServiceGrpc.getCreateProductMethod) == null) {
          ProductServiceGrpc.getCreateProductMethod = getCreateProductMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.Productos.Product, com.example.grpc.Productos.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProductService", "CreateProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Productos.Product.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Productos.Product.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("CreateProduct"))
                  .build();
          }
        }
     }
     return getCreateProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Productos.ProductId,
      com.example.grpc.Productos.Product> getGetProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProduct",
      requestType = com.example.grpc.Productos.ProductId.class,
      responseType = com.example.grpc.Productos.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Productos.ProductId,
      com.example.grpc.Productos.Product> getGetProductMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Productos.ProductId, com.example.grpc.Productos.Product> getGetProductMethod;
    if ((getGetProductMethod = ProductServiceGrpc.getGetProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetProductMethod = ProductServiceGrpc.getGetProductMethod) == null) {
          ProductServiceGrpc.getGetProductMethod = getGetProductMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.Productos.ProductId, com.example.grpc.Productos.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProductService", "GetProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Productos.ProductId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Productos.Product.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetProduct"))
                  .build();
          }
        }
     }
     return getGetProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Productos.Product,
      com.example.grpc.Productos.Product> getUpdateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProduct",
      requestType = com.example.grpc.Productos.Product.class,
      responseType = com.example.grpc.Productos.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Productos.Product,
      com.example.grpc.Productos.Product> getUpdateProductMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Productos.Product, com.example.grpc.Productos.Product> getUpdateProductMethod;
    if ((getUpdateProductMethod = ProductServiceGrpc.getUpdateProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getUpdateProductMethod = ProductServiceGrpc.getUpdateProductMethod) == null) {
          ProductServiceGrpc.getUpdateProductMethod = getUpdateProductMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.Productos.Product, com.example.grpc.Productos.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProductService", "UpdateProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Productos.Product.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Productos.Product.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("UpdateProduct"))
                  .build();
          }
        }
     }
     return getUpdateProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.Productos.ProductId,
      com.example.grpc.Productos.Product> getDeleteProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProduct",
      requestType = com.example.grpc.Productos.ProductId.class,
      responseType = com.example.grpc.Productos.Product.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.Productos.ProductId,
      com.example.grpc.Productos.Product> getDeleteProductMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.Productos.ProductId, com.example.grpc.Productos.Product> getDeleteProductMethod;
    if ((getDeleteProductMethod = ProductServiceGrpc.getDeleteProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getDeleteProductMethod = ProductServiceGrpc.getDeleteProductMethod) == null) {
          ProductServiceGrpc.getDeleteProductMethod = getDeleteProductMethod = 
              io.grpc.MethodDescriptor.<com.example.grpc.Productos.ProductId, com.example.grpc.Productos.Product>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ProductService", "DeleteProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Productos.ProductId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.Productos.Product.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("DeleteProduct"))
                  .build();
          }
        }
     }
     return getDeleteProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    return new ProductServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProductServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProductServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProductServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createProduct(com.example.grpc.Productos.Product request,
        io.grpc.stub.StreamObserver<com.example.grpc.Productos.Product> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateProductMethod(), responseObserver);
    }

    /**
     */
    public void getProduct(com.example.grpc.Productos.ProductId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Productos.Product> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProductMethod(), responseObserver);
    }

    /**
     */
    public void updateProduct(com.example.grpc.Productos.Product request,
        io.grpc.stub.StreamObserver<com.example.grpc.Productos.Product> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateProductMethod(), responseObserver);
    }

    /**
     */
    public void deleteProduct(com.example.grpc.Productos.ProductId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Productos.Product> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteProductMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.Productos.Product,
                com.example.grpc.Productos.Product>(
                  this, METHODID_CREATE_PRODUCT)))
          .addMethod(
            getGetProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.Productos.ProductId,
                com.example.grpc.Productos.Product>(
                  this, METHODID_GET_PRODUCT)))
          .addMethod(
            getUpdateProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.Productos.Product,
                com.example.grpc.Productos.Product>(
                  this, METHODID_UPDATE_PRODUCT)))
          .addMethod(
            getDeleteProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.Productos.ProductId,
                com.example.grpc.Productos.Product>(
                  this, METHODID_DELETE_PRODUCT)))
          .build();
    }
  }

  /**
   */
  public static final class ProductServiceStub extends io.grpc.stub.AbstractStub<ProductServiceStub> {
    private ProductServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     */
    public void createProduct(com.example.grpc.Productos.Product request,
        io.grpc.stub.StreamObserver<com.example.grpc.Productos.Product> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProduct(com.example.grpc.Productos.ProductId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Productos.Product> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProduct(com.example.grpc.Productos.Product request,
        io.grpc.stub.StreamObserver<com.example.grpc.Productos.Product> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProduct(com.example.grpc.Productos.ProductId request,
        io.grpc.stub.StreamObserver<com.example.grpc.Productos.Product> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteProductMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductServiceBlockingStub extends io.grpc.stub.AbstractStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.Productos.Product createProduct(com.example.grpc.Productos.Product request) {
      return blockingUnaryCall(
          getChannel(), getCreateProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Productos.Product getProduct(com.example.grpc.Productos.ProductId request) {
      return blockingUnaryCall(
          getChannel(), getGetProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Productos.Product updateProduct(com.example.grpc.Productos.Product request) {
      return blockingUnaryCall(
          getChannel(), getUpdateProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.Productos.Product deleteProduct(com.example.grpc.Productos.ProductId request) {
      return blockingUnaryCall(
          getChannel(), getDeleteProductMethod(), getCallOptions(), request);
    }

	public Object newBuilder() {
		// TODO Auto-generated method stub
		return null;
	}
  }

  /**
   */
  public static final class ProductServiceFutureStub extends io.grpc.stub.AbstractStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Productos.Product> createProduct(
        com.example.grpc.Productos.Product request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Productos.Product> getProduct(
        com.example.grpc.Productos.ProductId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Productos.Product> updateProduct(
        com.example.grpc.Productos.Product request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.Productos.Product> deleteProduct(
        com.example.grpc.Productos.ProductId request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PRODUCT = 0;
  private static final int METHODID_GET_PRODUCT = 1;
  private static final int METHODID_UPDATE_PRODUCT = 2;
  private static final int METHODID_DELETE_PRODUCT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PRODUCT:
          serviceImpl.createProduct((com.example.grpc.Productos.Product) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Productos.Product>) responseObserver);
          break;
        case METHODID_GET_PRODUCT:
          serviceImpl.getProduct((com.example.grpc.Productos.ProductId) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Productos.Product>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCT:
          serviceImpl.updateProduct((com.example.grpc.Productos.Product) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Productos.Product>) responseObserver);
          break;
        case METHODID_DELETE_PRODUCT:
          serviceImpl.deleteProduct((com.example.grpc.Productos.ProductId) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.Productos.Product>) responseObserver);
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

  private static abstract class ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.Productos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductService");
    }
  }

  private static final class ProductServiceFileDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier {
    ProductServiceFileDescriptorSupplier() {}
  }

  private static final class ProductServiceMethodDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceFileDescriptorSupplier())
              .addMethod(getCreateProductMethod())
              .addMethod(getGetProductMethod())
              .addMethod(getUpdateProductMethod())
              .addMethod(getDeleteProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
