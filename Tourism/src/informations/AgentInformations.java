package informations;

import databaseConnection.DatabaseConnection;

public class AgentInformations {
	private String name, password, adress;
	private int rank, personalCode;
	
	public AgentInformations() {}
	
	public AgentInformations(String name, String password, String adress, int rank,  int personalCode) {
		this.name = name;
		this.password = password;
		this.adress = adress;
		this.rank = rank;
		this.personalCode = personalCode;
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
	
	public String getAdress() {
		return adress;
	}
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public int getPersonalCode() {
		return personalCode;
	}

	public void setPersonalCode(int personalCode) {
		this.personalCode = personalCode;
	}
	
	public int getRank() {
		return rank;
	}
	
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public void insertAgent(DatabaseConnection connection) {		
		String data = "insert into agents (name, password, adress, rank, personalCode) values ('" 
					  + name + "', '" + password + "', '" + adress + "', " + rank + ", " 
					  + personalCode + ");";
		connection.insert(data);
	}
	
	public String checkData(DatabaseConnection connection) {
		String data = "select name, password from agents where name = '" + name + "' and password = '" + password + "';";
		
		return connection.getUser(data, name, password);
	}
}
