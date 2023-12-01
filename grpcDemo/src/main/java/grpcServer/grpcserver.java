package grpcServer;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import dbmanager.DBManager;
import productService.productservice;


public class grpcserver {
	
	public static void main(String [] args) throws IOException, InterruptedException {
		
		 String url = "jdbc:postgresql://localhost:5432/productos";
	     String username = "postgres";
	     String password = "";
		
		DBManager dbManager = new DBManager(url, username, password);
		
		 try (Connection conn = dbManager.getConnection()) {
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		
		Server server = ServerBuilder.
				forPort(9090).addService(new productservice()).build();
		
		server.start();
		
		System.out.println("Servidor iniciado en el puerto " + server.getPort());
		
		server.awaitTermination();
	}

}
