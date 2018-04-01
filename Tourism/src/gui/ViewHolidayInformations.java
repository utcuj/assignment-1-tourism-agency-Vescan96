package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ViewHolidayInformations extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel panel;
	private JLabel client, destination, hotelName, finalPaymentDate, totalPrice, nrOfPerson;
	private JTextArea area;
	private JScrollPane scroll;
	private JButton ok;
	
	private Font font = new Font("", Font.BOLD, 20);
	
	public ViewHolidayInformations() {
		this.setTitle("holiday informations");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		client = new JLabel("code");
		client.setFont(font);
		client.setBounds(20, 10, 150, 30);
		
		destination = new JLabel("destination");
		destination.setFont(font);
		destination.setBounds(150, 10, 150, 30);
		
		hotelName = new JLabel("hotel");
		hotelName.setFont(font);
		hotelName.setBounds(280, 10, 150, 30);
		
		finalPaymentDate = new JLabel("final date");
		finalPaymentDate.setFont(font);
		finalPaymentDate.setBounds(420, 10, 150, 30);
		
		totalPrice = new JLabel("price");
		totalPrice.setFont(font);
		totalPrice.setBounds(560, 10, 150, 30);
		
		nrOfPerson = new JLabel("pers");
		nrOfPerson.setFont(font);
		nrOfPerson.setBounds(690, 10, 150, 30);
		
		area = new JTextArea();
		area.setEditable(false);
		area.setBackground(Color.white);
		area.setFont(font);
		
		scroll = new JScrollPane(area);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(10, 50, 780, 375);
		
		ok = new JButton("OK");
		ok.setFont(font);
		ok.setBounds(350, 450, 100, 50);
		
		panel.add(client);
		panel.add(destination);
		panel.add(hotelName);
		panel.add(finalPaymentDate);
		panel.add(totalPrice);
		panel.add(nrOfPerson);
		
		panel.add(scroll);
		
		panel.add(ok);
		
		this.add(panel);
	}
	
	public void event(ActionListener listener) {
		ok.addActionListener(listener);
	}
	
	public JButton getButton() {
		return ok;
	}
	
	public void addText(String[] data) {
		for(String row : data)
			area.append(row + "\t");

		area.append("\n");
	}
	
	public void clearArea() {
		area.setText("");
	}
	
}
