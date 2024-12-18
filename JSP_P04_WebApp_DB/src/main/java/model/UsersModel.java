package model;

import java.sql.*;
import java.util.*;
import app.DatabaseConfig;
import entity.User;

public class UsersModel {
	
	public List<User> listusers() {
		// Initialize objects
		List<User> listusers = new ArrayList<User>();
		Connection connect = DatabaseConfig.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		
		// Create the query
		String query = "Select * from users";
		try {
			stmt = connect.createStatement();
			// Execute statement
			rs = stmt.executeQuery(query);
			while(rs.next())
				listusers.add(new User(rs.getInt("userid"),
						rs.getString("first_name"), rs.getString("last_name"),
						rs.getString("username"), rs.getString("email")));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listusers;
	}
	
	public void addUser(User newUser) {
		// Initialize objects
		Connection connect = DatabaseConfig.getConnection();
		PreparedStatement stmt = null;
		
		try {
			// Create the query			
			connect = DatabaseConfig.getConnection();
			String username = newUser.getUsername();
			String email = newUser.getEmail();
			String first_name = newUser.getFirst_name();
			String last_name = newUser.getLast_name();
			String query = "insert into users (first_name,last_name,username,email) values (?,?,?,?)";
			stmt = connect.prepareStatement(query);
			stmt.setString(1, first_name);
			stmt.setString(2, last_name);
			stmt.setString(3, username);
			stmt.setString(4, email);
			// Execute statement
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateUser(User updatedUser) {
		// Initialize objects
		Connection connect = DatabaseConfig.getConnection();
		PreparedStatement stmt = null;
		
		try {
			// Create the query			
			connect = DatabaseConfig.getConnection();
			int userId = updatedUser.getUserid();
			String username = updatedUser.getUsername();
			String email = updatedUser.getEmail();
			String first_name = updatedUser.getFirst_name();
			String last_name = updatedUser.getLast_name();
			String query = "update users set username = ?, email = ?," 
					+ "first_name = ?, last_name = ? where userid = ?";
			stmt = connect.prepareStatement(query);
			stmt.setString(1, username);
			stmt.setString(2, email);
			stmt.setString(3, first_name);
			stmt.setString(4, last_name);
			stmt.setInt(5, userId);
			// Execute statement
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteUser(int userID) {
		// Initialize objects
		Connection connect = DatabaseConfig.getConnection();
		PreparedStatement stmt = null;
				
		try {
			// Create the query			
			connect = DatabaseConfig.getConnection();
			String query = "delete from users where userid = ?";
			stmt = connect.prepareStatement(query);
			stmt.setInt(1, userID);
			// Execute statement
			stmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
