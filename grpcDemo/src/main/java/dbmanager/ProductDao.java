package dbmanager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.example.grpc.Productos.Product;

public class ProductDao {
	
	private static DBManager dbManager;
	
	public ProductDao(DBManager dbManager) {
	       ProductDao.dbManager = dbManager;
	   }
	public void createProduct(Product product) throws SQLException {
	       String sql = "INSERT INTO products (id, description) VALUES (?, ?)";

	       try (Connection conn = dbManager.getConnection();
	            PreparedStatement stmt = conn.prepareStatement(sql)) {

	           stmt.setString(1, product.getId());
	           stmt.setString(2, product.getDescription());
	           stmt.executeUpdate();
	       }
	   }

	   public static Product getProduct(String id) throws SQLException {
	       String sql = "SELECT * FROM products WHERE id = ?";

	       try (Connection conn = dbManager.getConnection();
	            PreparedStatement stmt = conn.prepareStatement(sql)) {

	           stmt.setString(1, id);
	           ResultSet rs = stmt.executeQuery();

	           if (rs.next()) {
	               return new Product(rs.getString("id"), rs.getString("description"));
	           } else {
	               return null;
	           }
	       }
	   }

	   public static void updateProduct(Product product) throws SQLException {
	       String sql = "UPDATE products SET description = ? WHERE id = ?";

	       try (Connection conn = dbManager.getConnection();
	            PreparedStatement stmt = conn.prepareStatement(sql)) {

	           stmt.setString(1, product.getDescription());
	           stmt.setString(2, product.getId());
	           stmt.executeUpdate();
	       }
	   }

	   public static void deleteProduct(String id) throws SQLException {
	       String sql = "DELETE FROM products WHERE id = ?";

	       try (Connection conn = dbManager.getConnection();
	            PreparedStatement stmt = conn.prepareStatement(sql)) {

	           stmt.setString(1, id);
	           stmt.executeUpdate();
	       }
	   }
	}


