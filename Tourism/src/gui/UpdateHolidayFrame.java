package gui;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;

public class UpdateHolidayFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel panel;
	private JLabel clientCode, destination, hotelName, finalPaymentDate, totalPrice, numberOfPerson;
	private JTextField clientCodeText, destinationText, hotelNameText, finalPaymentDateText, totalPriceText, numberOfPersonText;
	private JButton ok;
	
	private Font font = new Font("", Font.BOLD, 20);
	
	public UpdateHolidayFrame() {
		this.setTitle("update holiday");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		clientCode = new JLabel("client code");
		clientCode.setFont(font);
		clientCode.setBounds(50, 50, 150, 30);
		
		destination = new JLabel("destination");
		destination.setFont(font);
		destination.setBounds(50, 100, 150, 30);
		
		hotelName = new JLabel("hotel name");
		hotelName.setFont(font);
		hotelName.setBounds(50, 150, 150, 30);
		
		finalPaymentDate = new JLabel("finalPayDate");
		finalPaymentDate.setFont(font);
		finalPaymentDate.setBounds(50, 200, 150, 30);
		
		totalPrice = new JLabel("totalPrice");
		totalPrice.setFont(font);
		totalPrice.setBounds(50, 250, 150, 30);
		
		numberOfPerson = new JLabel("nr. of pers.");
		numberOfPerson.setFont(font);
		numberOfPerson.setBounds(50, 300, 150, 30);
		
		clientCodeText = new JTextField();
		clientCodeText.setFont(font);
		clientCodeText.setBounds(200, 50, 200, 30);
		
		destinationText = new JTextField();
		destinationText.setFont(font);
		destinationText.setBounds(200, 100, 200, 30);
		
		hotelNameText = new JTextField();
		hotelNameText.setFont(font);
		hotelNameText.setBounds(200, 150, 200, 30);
		
		finalPaymentDateText = new JTextField();
		finalPaymentDateText.setFont(font);
		finalPaymentDateText.setBounds(200, 200, 200, 30);
		
		totalPriceText = new JTextField();
		totalPriceText.setFont(font);
		totalPriceText.setBounds(200, 250, 200, 30);		
		
		numberOfPersonText = new JTextField();
		numberOfPersonText.setFont(font);
		numberOfPersonText.setBounds(200, 300, 200, 30);
		
		ok = new JButton("OK");
		ok.setFont(font);
		ok.setBounds(200, 375, 100, 50);
		
		panel.add(clientCode);
		panel.add(destination);
		panel.add(hotelName);
		panel.add(finalPaymentDate);
		panel.add(totalPrice);
		panel.add(numberOfPerson);
		
		panel.add(clientCodeText);
		panel.add(destinationText);
		panel.add(hotelNameText);
		panel.add(finalPaymentDateText);
		panel.add(totalPriceText);
		panel.add(numberOfPersonText);
		
		panel.add(ok);
		
		this.add(panel);
	}
	
	public void event(ActionListener listener) {
		ok.addActionListener(listener);
	}
	
	public JButton getButton() {
		return ok;
	}
	
	public int getClientCodeText() {
		return Integer.parseInt(clientCodeText.getText());
	}
	
	public int gettotalPriceText() {
		return Integer.parseInt(totalPriceText.getText());
	}
	
	public int getNumberOfPersonText() {
		return Integer.parseInt(numberOfPersonText.getText());
	}

	public String getDestinationText() {
		return destinationText.getText();
	}

	public String getHotelNameText() {
		return hotelNameText.getText();
	}

	public String getFinalPaymentDateText() {
		return finalPaymentDateText.getText();
	}
}
