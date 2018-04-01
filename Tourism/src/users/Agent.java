package users;

import java.util.List;

import databaseConnection.DatabaseConnection;
import informations.HolidayInformations;

public class Agent extends User{
		
	public Agent() {}
	
	public void addHolidayReservation(DatabaseConnection connection, HolidayInformations holiday) {
		holiday.insertData(connection);
	}
	
	public void updateHolidayReservation(DatabaseConnection connection, HolidayInformations holiday) {
		holiday.updateHoliday(connection);
	}
	
	public List<String> viewHolidayReservation(DatabaseConnection connection) {
		String data = "select * from holidays";
		
		return connection.viewHolidayInformations(data);
	}
	
	public void deleteHolidayReservation(DatabaseConnection connection, int clientCode) {
		String data = "delete from holidays where client = " + clientCode + ";";
		
		connection.delete(data);
	}
	
	public List<Integer> getHolidayCode(DatabaseConnection connection) {
		String data = "select client from holidays";
		
		return connection.getHolidayCode(data);
	}
	
	public List<Integer> getClientCodes(DatabaseConnection connection) {
		String data = "select personalNumericalCode from clients";
		
		return connection.getClientCodes(data);
	}
}
