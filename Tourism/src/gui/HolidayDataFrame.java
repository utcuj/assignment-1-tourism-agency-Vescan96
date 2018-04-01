package gui;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HolidayDataFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JPanel panel;
	private JLabel holidayInformations;
	private JLabel clientCode, destination, hotelName, finalPaymentDate, totalPrice, numberOfPerson;
	private JTextField clientCodeText, destinationText, hotelNameText, finalPaymentDateText, totalPriceText, numberOfPersonText;
	private JButton ok;
	
	public HolidayDataFrame() {
		this.setTitle("Holiday informations");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		// start holiday
		holidayInformations = new JLabel("holiday informations :");
		holidayInformations.setFont(new Font("", Font.BOLD, 20));
		holidayInformations.setBounds(100, 10, 300, 30);
		
		clientCode = new JLabel("client code");
		clientCode.setFont(new Font("", Font.BOLD, 20));
		clientCode.setBounds(50, 50, 200, 30);
		
		destination = new JLabel("destination");
		destination.setFont(new Font("", Font.BOLD, 20));
		destination.setBounds(50, 90, 200, 30);
		
		hotelName = new JLabel("hotel name");
		hotelName.setFont(new Font("", Font.BOLD, 20));
		hotelName.setBounds(50, 130, 200, 30);
		
		finalPaymentDate = new JLabel("final payment date");
		finalPaymentDate.setFont(new Font("", Font.BOLD, 20));
		finalPaymentDate.setBounds(50, 170, 250, 30);
		
		totalPrice = new JLabel("total price");
		totalPrice.setFont(new Font("", Font.BOLD, 20));
		totalPrice.setBounds(50, 210, 200, 30);
		
		numberOfPerson = new JLabel("number of person");
		numberOfPerson.setFont(new Font("", Font.BOLD, 20));
		numberOfPerson.setBounds(50, 250, 250, 30);
		
		clientCodeText = new JTextField();
		clientCodeText.setFont(new Font("", Font.BOLD, 20));
		clientCodeText.setBounds(250, 50, 200, 30);
		
		destinationText = new JTextField();
		destinationText.setFont(new Font("", Font.BOLD, 20));
		destinationText.setBounds(250, 90, 200, 30);
		
		hotelNameText = new JTextField();
		hotelNameText.setFont(new Font("", Font.BOLD, 20));
		hotelNameText.setBounds(250, 130, 200, 30);
		
		finalPaymentDateText = new JTextField();
		finalPaymentDateText.setFont(new Font("", Font.BOLD, 20));
		finalPaymentDateText.setBounds(250, 170, 200, 30);
		
		totalPriceText = new JTextField();
		totalPriceText.setFont(new Font("", Font.BOLD, 20));
		totalPriceText.setBounds(250, 210, 200, 30);
		
		numberOfPersonText = new JTextField();
		numberOfPersonText.setFont(new Font("", Font.BOLD, 20));
		numberOfPersonText.setBounds(250, 250, 200, 30);
		// end holiday

		// ok button
		ok = new JButton("OK");
		ok.setFont(new Font("", Font.BOLD, 30));
		ok.setBounds(200, 310, 100, 40);
		
		// panel add holiday informations
		panel.add(holidayInformations);
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
		
		// panel add button
		panel.add(ok);
		
		this.add(panel);
	}
	
	public void event(ActionListener listener) {
		ok.addActionListener(listener);
	}
	
	public JButton getButton() {
		return ok;
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

	public int getTotalPriceText() {
		return Integer.parseInt(totalPriceText.getText());
	}

	public int getNumberOfPersonText() {
		return Integer.parseInt(numberOfPersonText.getText());
	}
	
	public int getClientCodeText() {
		return Integer.parseInt(clientCodeText.getText());
	}
}
