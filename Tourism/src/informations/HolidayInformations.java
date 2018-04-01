package informations;

import databaseConnection.DatabaseConnection;

public class HolidayInformations {
	private String destination, hotelName, finalPaymentDate;
	private int clientCode, totalPrice, numberOfPerson;
	
	public HolidayInformations() {}
	
	public HolidayInformations(int clientCode, String destination, String hotelName, int numberOfPerson, int totalPrice, String finalPaymentDate) {
		this.clientCode = clientCode;
		this.destination = destination;
		this.hotelName = hotelName;
		this.numberOfPerson = numberOfPerson;
		this.totalPrice = totalPrice;
		this.finalPaymentDate = finalPaymentDate;
	}
	
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getNumberOfPerson() {
		return numberOfPerson;
	}

	public void setNumberOfPerson(int numberOfPerson) {
		this.numberOfPerson = numberOfPerson;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getFinalPaymentDate() {
		return finalPaymentDate;
	}

	public void setFinalPaymentDate(String finalPaymentDate) {
		this.finalPaymentDate = finalPaymentDate;
	}
	
	public int getClientCode() {
		return clientCode;
	}

	public void setClientCode(int clientCode) {
		this.clientCode = clientCode;
	}
	
	public void insertData(DatabaseConnection connection) {
		String data = "insert into holidays (client, destination, hotelName, finalPaymentDate, totalPrice, numberOfPerson) values ("
					  + clientCode + ", '" + destination + "', '" + hotelName + "', '" + finalPaymentDate + "', " 
					  + totalPrice + ", " + numberOfPerson + ");";
		
		connection.insert(data);
	}
	
	public void updateHoliday(DatabaseConnection connection) {
		String update = "update holidays set client = " + clientCode + ", destination = '" + destination 
						+ "', hotelName = '" + hotelName + "', finalPaymentDate = '" + finalPaymentDate 
						+ "', totalPrice = " + totalPrice + ", numberOfPerson = " + numberOfPerson 
						+ " where client = " + clientCode + ";";
		
		connection.update(update);
	}

}