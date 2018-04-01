package users;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import databaseConnection.DatabaseConnection;

public class Admin extends User{
	
	private static final String file = "reports.txt";
	
	public void deleteAgent(DatabaseConnection connection, int code) {
		String data = "delete from agents where personalCode = " + code;
		
		connection.delete(data);
	}

	public List<Integer> getAgentCodes(DatabaseConnection connection) {
		String data = "select personalCode from agents";
		
		return connection.getAgentCodes(data);
	}
	
	public List<String> getHolidayInformations(DatabaseConnection connection) {
		String data = "select * from holidays";
		
		return connection.viewHolidayInformations(data);
	}
	
	public void reports(List<String> data) throws IOException {
		BufferedWriter writer = Files.newBufferedWriter(Paths.get(file));
				
		for(String info : data ) 
			writer.write(info + "\n");
		
		writer.close();
	}
}
