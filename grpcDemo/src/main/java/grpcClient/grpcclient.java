package grpcClient;

import com.example.grpc.ProductServiceGrpc;
import com.example.grpc.Productos.Product;
import com.example.grpc.Productos.ProductId;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


public class grpcclient {

	public static void main(String[] args) {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
		
		
		ProductServiceGrpc.ProductServiceBlockingStub stub = ProductServiceGrpc.newBlockingStub(channel);
		
		Product requestCreate = Product.newBuilder()
			    .setId("")
			    .setDescription("")
			    .build();
			Product responseCreate = stub.createProduct(requestCreate);
			System.out.println("Producto Creado: " + responseCreate);
			
			
		ProductId requestGet = ProductId.newBuilder()
		        .setId("")
		        .build();
		    Product responseGet = stub.getProduct(requestGet);
		    System.out.println("Producto obtenido: " + responseGet);
		    
		 
		Product requestUpdate = Product.newBuilder()
		            .setId("")
		            .setDescription("")
		            .build();
		        Product responseUpdate = stub.updateProduct(requestUpdate);
		        System.out.println("Producto actualizado: " + responseUpdate);
		    
		 ProductId requestDelete = ProductId.newBuilder()
		                .setId("")
		                .build();
		 Product responseDelete = stub.getProduct(requestDelete);
		            stub.deleteProduct(requestDelete);
		            System.out.println("Producto eliminado: "+ responseDelete);
		    
		    
		    
		    
		    
		    channel.shutdownNow();
	}
}
