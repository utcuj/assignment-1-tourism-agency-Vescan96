package authentication_authorization;

import java.awt.event.*;
import javax.swing.JOptionPane;
import databaseConnection.DatabaseConnection;
import gui.*;
import informations.*;
import users.*;

public class UImanagement {
	
	private Agent agent = new Agent();
	private Admin admin = new Admin();	
	
	public UImanagement(DatabaseConnection connection, LoginFrame frame) {
		frame.setVisible(true);
		
		frame.registerEvent(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				boolean pass = true;
				
				if(frame.getAgent().isSelected() && frame.getAdmin().isSelected() && event.getSource() == frame.getRegister()) {
					JOptionPane.showMessageDialog(null, "choose just 1 option!", "ERROR", JOptionPane.ERROR_MESSAGE);
					pass = false;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
					
				}
				
				if(frame.getAdmin().isSelected() && event.getSource() == frame.getRegister() && pass) {
					JOptionPane.showMessageDialog(null, "already exist an administrator!", "ERROR", JOptionPane.ERROR_MESSAGE);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				if(frame.getAgent().isSelected() && event.getSource() == frame.getRegister() && pass) {
					String name = frame.getUsername();
					String adress = frame.getAdress();
					String password = frame.getPass();
					int code = frame.getPersonalCode();
					
					agent.add(connection, new AgentInformations(name, password, adress, -1, code));
					
					JOptionPane.showMessageDialog(null, "Success!", null, JOptionPane.INFORMATION_MESSAGE);
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}						
				}
			}
		});
		
		frame.loginEvent(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				boolean pass = true;
				
				if(frame.getAgent().isSelected() && frame.getAdmin().isSelected() && event.getSource() == frame.getLogin()) {
					JOptionPane.showMessageDialog(null, "choose just 1 option!", "ERROR", JOptionPane.ERROR_MESSAGE);
					pass = false;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
					
				}
				
				if(frame.getAgent().isSelected() && event.getSource() == frame.getLogin() && pass) {
					String name = frame.getUsername();
					String password = frame.getPass();
					String adress = frame.getAdress();
					String[] data = null;
					
					String info = agent.checkUser(connection, new AgentInformations(name, password, adress, -1, -1));
					if(info != null) {
						data = info.split(" ");
						
						if(name.equals(data[0]) && password.equals(data[1])) {							
							new AgentManagementLogin(connection, new AgentFrame());
											
							frame.setVisible(false);
						}
					}
					else					
						JOptionPane.showMessageDialog(null, "this user doesn't exist!", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				
				if(frame.getAdmin().isSelected() && event.getSource() == frame.getLogin() && pass) {
					String adminName = frame.getUsername();
					String adminPass = frame.getPass();
					String[] data = null;
					
					String info = admin.checkUser(connection, new AdminInformations(adminName, adminPass));
					if(info != null) {
						data = info.split(" ");
					
					if(adminName.equals(data[0]) && adminPass.equals(data[1]))
						new AdminManagementLogin(connection, new AdminFrame());
					
						frame.setVisible(false);
					}
					else
						JOptionPane.showMessageDialog(null, "this user doesn't exist!", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}	
		});
	}

}
