package databaseConnection;

import java.sql.*;
import java.util.*;

public class DatabaseConnection {
	private Connection connection;
	private Statement statement;
	private ResultSet result;
	
	private List<String> informations = new ArrayList<String>();
	private List<Integer> code = new ArrayList<Integer>();
	
	public DatabaseConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");		
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tourism", "root", "root");
						
			statement = connection.createStatement();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void insert(String data) {
		try {
			statement.executeUpdate(data);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public String getUser(String data, String name, String password) {
		try {
			result = statement.executeQuery(data);
		
			while(result.next()) 
				return result.getString("name") + " " + result.getString("password");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public List<Integer> getClientCodes(String data) {
		code.clear();
		
		try {
			result = statement.executeQuery(data);
			
			while(result.next())
				code.add(result.getInt("client"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return code;
		
	}
	
	public List<String> getClientInformations(String data) {		
		try {
			result = statement.executeQuery(data);
			
			while(result.next())
				informations.add(result.getString("name") + " " 
									 + result.getString("identityCardNumber") + " " 
									 + result.getString("personalNumericalCode") + " " 
									 + result.getString("adress"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return informations;
	}
	
	public int getTotalPrice(String data) {
		try {
			result = statement.executeQuery(data);
			
			while(result.next())
				return result.getInt("totalPrice");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public void update(String data) {
		try {
			statement.executeUpdate(data);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Integer> getHolidayCode(String data) {
		code.clear();
		
		try {
			result = statement.executeQuery(data);
			
			while(result.next())
				code.add(result.getInt("client"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return code;
	}
	
	public List<String> viewHolidayInformations(String data) {
		informations.clear();
		
		try {
			result = statement.executeQuery(data);
			
			while(result.next())
				informations.add(result.getInt("client") + " " + result.getString("destination") + " "
							   + result.getString("hotelName") + " " + result.getString("finalPaymentDate") 
							   + " " + result.getInt("totalPrice") + " " + result.getInt("numberOfPerson"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return informations;
	}
	
	public void delete(String data) {
		try {
			statement.executeUpdate(data);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Integer> getAgentCodes(String data) {
		code.clear();
		
		try {
			result = statement.executeQuery(data);
			
			while(result.next())
				code.add(result.getInt("personalCode"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return code;
	}
	
	public List<String> viewAgentsInformations(String data) {
		informations.clear();
		
		try {
			result = statement.executeQuery(data);
			
			while(result.next())
				informations.add(result.getString("name") + " " + result.getString("password") + " "
							   + result.getString("adress") + " " + result.getInt("rank") + " " 
							   + result.getInt("personalCode"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return informations;
	}
	
}
