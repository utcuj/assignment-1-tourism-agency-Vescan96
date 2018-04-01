package informations;

import databaseConnection.DatabaseConnection;

public class AdminInformations {	
	private String name, password;
	
	public AdminInformations() {}
	
	public AdminInformations(String name, String password) {
		this.name = name;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String checkData(DatabaseConnection connection) {
		String data = "select name, password from admin where name = '" + name +"' and password = '" + password + "';";
		
		return connection.getUser(data, name, password);
	}
	
}
