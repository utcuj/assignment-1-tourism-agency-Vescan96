package users;

import java.util.List;

import databaseConnection.DatabaseConnection;
import informations.*;

public class User {
	
	private ClientInformations client = new ClientInformations();
	private AgentInformations agent = new AgentInformations();
	private AdminInformations admin = new AdminInformations();
	
	public String checkUser(DatabaseConnection connection, Object obj) {
		if(obj.getClass().isInstance(admin)) {
			admin = (AdminInformations) obj;
			return admin.checkData(connection);
		}
		
		if(obj.getClass().isInstance(agent)) {
			agent = (AgentInformations) obj;
			return agent.checkData(connection);
		}
		
		return null;
	}
	
	public void add(DatabaseConnection connection, Object obj) {
		if(obj.getClass().isInstance(client)) {
			client = (ClientInformations) obj;
			client.insertData(connection);
		}
		
		if(obj.getClass().isInstance(agent)) {
			agent = (AgentInformations) obj;
			agent.insertAgent(connection);
		}
	}
	
	public List<String> viewInformations(DatabaseConnection connection, Object obj) {
		if(obj.getClass().isInstance(client))  
			return client.viewClientInformations(connection);
		if(obj.getClass().isInstance(new Agent())) {
			String data = "select * from agents";
			
			return connection.viewAgentsInformations(data);
		}
		
		return null;
	}
	
	public void updateInformations(DatabaseConnection connection, Object obj, int newCode) {
		if(obj.getClass().isInstance(client)) { 
			client = (ClientInformations) obj;
			client.updateInformations(connection, newCode);
		}
		if(obj.getClass().isInstance(agent)) {
			agent = (AgentInformations) obj;
			
			String data = "update agents set name = '" + agent.getName() + "', password = '" 
						+ agent.getPassword() + "', adress = '" + agent.getAdress() + "', rank = " 
						+ agent.getRank() + ", personalCode = " + newCode + " where personalCode = "
						+ agent.getPersonalCode() + ";";

			connection.update(data);
		}
	}
	

}
