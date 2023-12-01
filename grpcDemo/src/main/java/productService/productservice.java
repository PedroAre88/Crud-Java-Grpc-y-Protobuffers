package productService;

import java.sql.SQLException;
import com.example.grpc.ProductServiceGrpc.ProductServiceImplBase;
import com.example.grpc.Productos.Product;
import com.example.grpc.Productos.ProductId;
import dbmanager.ProductDao;
import io.grpc.stub.StreamObserver;

public class productservice extends ProductServiceImplBase {

	@Override
	public void createProduct(Product request, StreamObserver<Product> responseObserver) {
		try {
	        ProductDao productDao = new ProductDao(null);
			productDao.createProduct(request);
	        responseObserver.onNext(request);
	        responseObserver.onCompleted();
	    } catch (SQLException e) {
	        responseObserver.onError(e);
	    }
	}
	
	@Override
	public void getProduct(ProductId request, StreamObserver<Product> responseObserver) {
		try {
	           Product product = ProductDao.getProduct(request.getId());
	           responseObserver.onNext(product);
	           responseObserver.onCompleted();
	       } catch (SQLException e) {
	           responseObserver.onError(e);
	       }
	}

	@Override
	public void updateProduct(Product request, StreamObserver<Product> responseObserver) {
		 try {
	           ProductDao.updateProduct(request);
	           responseObserver.onNext(request);
	           responseObserver.onCompleted();
	       } catch (SQLException e) {
	           responseObserver.onError(e);
	       }
	}

	@Override
	public void deleteProduct(ProductId request, StreamObserver<Product> responseObserver) {
		try {
	           ProductDao.deleteProduct(request.getId());     
	           responseObserver.onCompleted();
	       } catch (SQLException e) {
	           responseObserver.onError(e);
	       }
	   }
	}


