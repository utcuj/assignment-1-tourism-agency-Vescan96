package authentication_authorization;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

import databaseConnection.DatabaseConnection;
import gui.*;
import informations.*;
import users.*;

public class AdminManagementLogin {

	private Admin admin = new Admin();
	
	public AdminManagementLogin(DatabaseConnection connection, AdminFrame frame) {
		frame.setVisible(true);
		
		frame.createAgentEvent(new ActionListener() {
			 
			@Override
			public void actionPerformed(ActionEvent event) {
				if(event.getSource() == frame.getCreateAgent()) {
					CreateAgentFrame create = new CreateAgentFrame();
					create.setVisible(true);
					
					create.event(new ActionListener() {

						String name, pass, adress;
						int rank, personalCode;
						boolean validate = true;
						
						@Override
						public void actionPerformed(ActionEvent ev) {
							if(ev.getSource() == create.getButton()) {
								name = create.getnameText();
								pass = create.getpassText();
								adress = create.getadressText();
								rank = create.getrankText();
								personalCode = create.getpersonalCodeText();
								
								List<Integer> agentCodes = admin.getAgentCodes(connection);
								
								for(int code : agentCodes)
									if(personalCode == code) {
										validate = false;
										break;
									}
								
								if(validate)
									admin.add(connection, new AgentInformations(name, pass, adress, rank, personalCode));
								else
									JOptionPane.showMessageDialog(null, "already exist this agent!", "ERROR", JOptionPane.ERROR_MESSAGE );
							
								create.setVisible(false);
							}
						}
						
					});
					
				}
			}
			
		});
	
		frame.viewAgentsEvent(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				if(event.getSource() == frame.getViewAgents()) {
					List<String> info = admin.viewInformations(connection, new Agent());						
					
					ViewAgentsInformations view = new ViewAgentsInformations();
					view.setVisible(true);
					
					for(String row : info)
						view.addText(row.split(" "));
					
					view.event(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent ev) {
							if(ev.getSource() == view.getButton()) {
								info.clear();
								view.clearArea();
								
								view.setVisible(false);
							}
						}
						
					});
				}
			}
			
		});

		frame.updateAgentEvent(new ActionListener() {
						
			@Override
			public void actionPerformed(ActionEvent event) {
				if(event.getSource() == frame.getUpdateAgent()) {
					UpdateAgentFrame update = new UpdateAgentFrame();
					update.setVisible(true);
					
					update.event(new ActionListener() {
						String name, pass, adress;
						int rank, personalCode, newCode;
						
						@Override
						public void actionPerformed(ActionEvent ev) {
							if(ev.getSource() == update.getButton()) {
								name = update.getName();
								pass = update.getPass();
								adress = update.getAdress();
								rank = update.getRank();
								personalCode = update.getPersonalCode();
								newCode = update.getNewCode();
								
								admin.updateInformations(connection, new AgentInformations(name, pass, adress, rank, personalCode), newCode);
						
								update.setVisible(false);
							}
						}
						
					});
					
				}
			}
			
		});

		frame.deleteAgentEvent(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				if(event.getSource() == frame.getDeleteAgent()) {
					
					DeleteAgentFrame delete = new DeleteAgentFrame();
					delete.setVisible(true);
					
					delete.event(new ActionListener() {
						int code = 0;
						boolean validate = false;
						
						@Override
						public void actionPerformed(ActionEvent e) {
							if(e.getSource() == delete.getButton()) {
								code = delete.getcode();
								
								List<Integer> agentCodes = admin.getAgentCodes(connection);
								
								for(int c : agentCodes) 
									if(code == c) {
										validate = true;
										break;
									}

								if(validate)
									admin.deleteAgent(connection, code);
								else
									JOptionPane.showMessageDialog(null, "wrong code", "this holiday doesn't exist", JOptionPane.ERROR_MESSAGE);						
												
								delete.setVisible(false);
							}
						}
						
					});
				}
			}
			
		});
	
		frame.reportEvent(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				if(event.getSource() == frame.getReports()) {
					List<String> holidayInfo = admin.getHolidayInformations(connection);
					
					List<String> rowInfo = holidayInfo.stream()
							.filter(row -> row.split(" ")[3].compareTo("2016.03.14") > 0 
										&& row.split(" ")[3].compareTo("2020.08.28") < 0)
							.collect(Collectors.toList());
					
					try {
						admin.reports(rowInfo);
					} catch (IOException e) {
						e.printStackTrace();
					}
					
					JOptionPane.showMessageDialog(null, "Done!", null, JOptionPane.INFORMATION_MESSAGE);
					
					frame.setVisible(false);
				}
			}
			
		});
		
	}
}
