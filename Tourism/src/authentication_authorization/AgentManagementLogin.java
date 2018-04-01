package authentication_authorization;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JOptionPane;
import databaseConnection.DatabaseConnection;
import gui.*;
import informations.*;
import users.Agent;

public class AgentManagementLogin {
	private Agent agent = new Agent();
	
	private String personalCode;
	
	public AgentManagementLogin(DatabaseConnection connection, AgentFrame frame) {
		frame.setVisible(true);

		frame.addClientEvent(new ActionListener() {
		
			String clientName, cardNumber, adress;
		
			@Override
			public void actionPerformed(ActionEvent event) {
				if(event.getSource() == frame.getAddClient()) {					
					ClientDataFrame clientData = new ClientDataFrame();
					clientData.setVisible(true);
					clientData.event(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent ev) {
							if(ev.getSource() == clientData.getButton()) {
								clientName = clientData.getNameText();
								cardNumber = clientData.getIdentityCardNumberText();
								personalCode = clientData.getPersonalNumericalCodeText();
								adress = clientData.getAdressText();
								
								JOptionPane.showMessageDialog(null, "Done!", null, JOptionPane.INFORMATION_MESSAGE);
							}
							
							agent.add(connection, new ClientInformations(clientName, cardNumber, personalCode, adress));
							
							clientData.setVisible(false);
						}
						
					});
				}
			}
			
		});
			
		frame.viewClientEvent(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				if(event.getSource() == frame.getViewClient()) {
					List<String> clientInfo = agent.viewInformations(connection, new ClientInformations());
					
					ViewClientInformations clientInformations = new ViewClientInformations();
					clientInformations.setVisible(true);
					
					for(String client : clientInfo)
						clientInformations.addText(client.split(" "));	
					
					clientInformations.event(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent ev) {
							if(ev.getSource() == clientInformations.getButton()) {
								clientInformations.clearArea();
								clientInfo.clear();
								
								clientInformations.setVisible(false);
							}
						}
					});
					
				};
			}
			
		});

		frame.updateClientEvent(new ActionListener() {
			String name, identityCardNumber, personalNumericalCode, adress;
			int newPersonalNumericalCode = 0;
			
			@Override
			public void actionPerformed(ActionEvent event) {
				if(event.getSource() == frame.getUpdateClient()) {
					UpdateClientInformations update = new UpdateClientInformations();
					update.setVisible(true);
					
					update.event(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent ev) {
							if(ev.getSource() == update.getOk()) {
								name = update.getNameText();
								identityCardNumber = update.getIdentityCardNumberText(); 
								personalNumericalCode = update.getPersonalNumericalCodeText(); 
								adress = update.getAdressText();
								newPersonalNumericalCode = update.getNewCodeText();
								
								update.setVisible(false);
								
								agent.updateInformations(connection, new ClientInformations(name, identityCardNumber, personalNumericalCode, adress), newPersonalNumericalCode);
							}
						}
						
					});
					
				}
			}
			
		});
		
		frame.addHolidayEvent(new ActionListener() {

			String destination, hotelName, finalPaymentDate;
			int clientCode, totalPrice, numberOfPerson;
			
			@Override
			public void actionPerformed(ActionEvent event) {
				if(event.getSource() == frame.getAddHoliday()) {
					HolidayDataFrame holidayData = new HolidayDataFrame();
					holidayData.setVisible(true);
					holidayData.event(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent ev) {
							if(ev.getSource() == holidayData.getButton()) {
								clientCode = holidayData.getClientCodeText();
								destination = holidayData.getDestinationText();
								hotelName = holidayData.getHotelNameText();
								finalPaymentDate = holidayData.getFinalPaymentDateText();
								totalPrice = holidayData.getTotalPriceText();
								numberOfPerson = holidayData.getNumberOfPersonText();
							}
							
							agent.addHolidayReservation(connection, new HolidayInformations(clientCode, destination, hotelName, numberOfPerson, totalPrice, finalPaymentDate));
							
							JOptionPane.showMessageDialog(null, "Done!", null, JOptionPane.INFORMATION_MESSAGE);

							holidayData.setVisible(false);
						}
						
					});
				}
			}
			
		});
		
		frame.updateHolidayEvent(new ActionListener() {
						
			@Override
			public void actionPerformed(ActionEvent event) {
				if(event.getSource() == frame.getUpdateHoliday()) {
					UpdateHolidayFrame update = new UpdateHolidayFrame();
					update.setVisible(true);
					update.event(new ActionListener() {
						String destination, hotelName, finalPaymentDate;
						int clientCode, totalPrice, nrOfPerson;
						int exists = 0;
						
						@Override
						public void actionPerformed(ActionEvent ev) {
							if(ev.getSource() == update.getButton()) {
								clientCode = update.getClientCodeText();
								destination = update.getDestinationText();
								hotelName = update.getHotelNameText();
								finalPaymentDate = update.getFinalPaymentDateText();
								totalPrice = update.gettotalPriceText();
								nrOfPerson = update.getNumberOfPersonText();
									
								List<Integer> holidayCodes = agent.getHolidayCode(connection);
								
								for(int code : holidayCodes)
									if(clientCode == code) {
										exists = 1;
										break;
									}
								
								if(exists == 1)
									agent.updateHolidayReservation(connection, new HolidayInformations(clientCode, destination, hotelName, nrOfPerson, totalPrice, finalPaymentDate));
								else
									JOptionPane.showMessageDialog(null, "maybe wrong code", "this holiday doesn't exist!", JOptionPane.ERROR_MESSAGE);
							
								update.setVisible(false);
							
							}
						}
					});
				}
			}
		});

		frame.viewHolidayEvent(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				if(event.getSource() == frame.getViewHoliday()) {
					List<String> holidayReservation = agent.viewHolidayReservation(connection);
					
					ViewHolidayInformations holiday = new ViewHolidayInformations();
					holiday.setVisible(true);
					
					for(String row : holidayReservation)
						holiday.addText(row.split(" "));
					
					holiday.event(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent ev) {
							if(ev.getSource() == holiday.getButton()) {
								holiday.clearArea();
								holidayReservation.clear();
								
								holiday.setVisible(false);
							}
						}
						
					});
				}			
			}
			
		});
			
		frame.deleteHolidayEvent(new ActionListener() {
			int clientCode = 0;
			boolean validate = false;
			
			@Override
			public void actionPerformed(ActionEvent event) {
				if(event.getSource() == frame.getDeleteHoliday()) {
					DeleteHolidayFrame delete = new DeleteHolidayFrame();
					delete.setVisible(true);
			
					delete.event(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent ev) {
							if(ev.getSource() == delete.getButton()) {
								clientCode = delete.getClientCode();
								
								List<Integer> holidayCodes = agent.getHolidayCode(connection);
								
								for(int code : holidayCodes) 
									if(clientCode == code) {
										validate = true;
										break;
									}

								if(validate)
									agent.deleteHolidayReservation(connection, clientCode);
								else
									JOptionPane.showMessageDialog(null, "wrong code", "this holiday doesn't exist", JOptionPane.ERROR_MESSAGE);						
							}							

							delete.setVisible(false);
						}
					});
				}
			}
		});
	}

}
