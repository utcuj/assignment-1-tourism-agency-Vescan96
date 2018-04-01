package informations;

import java.util.List;

import databaseConnection.DatabaseConnection;

public class ClientInformations {
	private String name, identityCardNumber, personalNumericalCode, adress;
	
	public ClientInformations() {}
	
	public ClientInformations(String name, String identityCardNumber, String personalNumericalCode, String adress) {
		this.name = name;
		this.identityCardNumber = identityCardNumber;
		this.personalNumericalCode = personalNumericalCode;
		this.adress = adress;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}	
	
	public String getIdentityCardNumber() {
		return identityCardNumber;
	}
	
	public void setIdentityCardNumber(String identityCardNumber) {
		this.identityCardNumber = identityCardNumber;
	}
	
	public String getPersonalNumericalCode() {
		return personalNumericalCode;
	}
	
	public void setPersonalNumericalCode(String personalNumericalCode) {
		this.personalNumericalCode = personalNumericalCode;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public void insertData(DatabaseConnection connection) {
		String data = "insert into clients (name, identityCardNumber, personalNumericalCode, adress) values ('"
					  + name + "', '" + identityCardNumber + "', '" + personalNumericalCode + "', '" + adress +"');";
	
		connection.insert(data);
	}
	
	public List<String> viewClientInformations(DatabaseConnection connection) {
		String data = "select * from clients;";
		
		return connection.getClientInformations(data);
	}
	
	public void updateInformations(DatabaseConnection connection, int newPersonalNumericalCode) {
		String update = "update clients set name = '" + name + "', identityCardNumber = '" + identityCardNumber
						+ "', personalNumericalCode = " + newPersonalNumericalCode + ", adress = '" + adress 
						+"' where personalNumericalCode = " + personalNumericalCode + ";";
		
		connection.update(update);
	}
	
}
