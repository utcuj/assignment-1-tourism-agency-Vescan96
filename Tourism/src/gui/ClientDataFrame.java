package gui;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ClientDataFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JPanel panel;
	private JLabel clientInformations;
	private JLabel name, identityCardNumber, personalNumericalCode, adress;
	private JTextField nameText, identityCardNumberText, personalNumericalCodeText, adressText; 
	private JButton ok;
	
	public ClientDataFrame() {
		this.setTitle("Client informations");
		this.setSize(500, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		// start client
		clientInformations = new JLabel("client informations :");
		clientInformations.setFont(new Font("", Font.BOLD, 20));
		clientInformations.setBounds(100, 10, 300, 30);
		
		name = new JLabel("name");
		name.setFont(new Font("", Font.BOLD, 20));
		name.setBounds(50, 50, 200, 30);
		
		identityCardNumber = new JLabel("CardNumber");
		identityCardNumber.setFont(new Font("", Font.BOLD, 20));
		identityCardNumber.setBounds(50, 90, 200, 30);
		
		personalNumericalCode = new JLabel("CNP");
		personalNumericalCode.setFont(new Font("", Font.BOLD, 20));
		personalNumericalCode.setBounds(50, 130, 200, 30);
		
		adress = new JLabel("adress");
		adress.setFont(new Font("", Font.BOLD, 20));
		adress.setBounds(50, 170, 200, 30);
		
		nameText = new JTextField();
		nameText.setFont(new Font("", Font.BOLD, 20));
		nameText.setBounds(250, 50, 200, 30);
		
		identityCardNumberText = new JTextField();
		identityCardNumberText.setFont(new Font("", Font.BOLD, 20));
		identityCardNumberText.setBounds(250, 90, 200, 30);
		
		personalNumericalCodeText = new JTextField();
		personalNumericalCodeText.setFont(new Font("", Font.BOLD, 20));
		personalNumericalCodeText.setBounds(250, 130, 200, 30);
		
		adressText = new JTextField();
		adressText.setFont(new Font("", Font.BOLD, 20));
		adressText.setBounds(250, 170, 200, 30);
		// end client
		
		// ok button
		ok = new JButton("OK");
		ok.setFont(new Font("", Font.BOLD, 30));
		ok.setBounds(200, 250, 100, 40);
				
		// panel add client informations
		panel.add(clientInformations);
		panel.add(name);
		panel.add(identityCardNumber);
		panel.add(personalNumericalCode);
		panel.add(adress);
		
		panel.add(nameText);
		panel.add(identityCardNumberText);
		panel.add(personalNumericalCodeText);
		panel.add(adressText);
				
		// panel add button
		panel.add(ok);
		
		this.add(panel);
		this.setVisible(true);
	}
	
	public void event(ActionListener listener) {
		ok.addActionListener(listener);
	}
	
	public JButton getButton() {
		return ok;
	}
	
	public String getNameText() {
		return nameText.getText();
	}

	public String getIdentityCardNumberText() {
		return identityCardNumberText.getText();
	}

	public String getPersonalNumericalCodeText() {
		return personalNumericalCodeText.getText();
	}

	public String getAdressText() {
		return adressText.getText();
	}

}
