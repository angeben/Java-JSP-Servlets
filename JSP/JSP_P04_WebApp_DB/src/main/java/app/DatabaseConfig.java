package app;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConfig {
	
	public static Connection getConnection() {
		// Initialize all the information for the DB connection
		String dbURL = "jdbc:mysql://localhost:3306/users?useSSL=false";
		String dbUsername = "root";
		String dbPassword = "root";
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dbURL,dbUsername,dbPassword);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}

}
