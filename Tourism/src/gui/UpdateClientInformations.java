package gui;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;

public class UpdateClientInformations extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel panel;
	private JLabel name, identityCardNumber, personalNumericalCode, adress, newPersonalNumericalCode;
	private JTextField nameText, identityCardNumberText, personalNumericalCodeText, adressText, newPersonalNumericalCodeText;
	private JButton ok;
	
	public UpdateClientInformations() {
		this.setTitle("Update client informations");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		// labels
		name = new JLabel("name");
		name.setFont(new Font("", Font.BOLD, 20));
		name.setBounds(50, 50, 150, 30);
		
		identityCardNumber = new JLabel("card number");
		identityCardNumber.setFont(new Font("", Font.BOLD, 20));
		identityCardNumber.setBounds(50, 100, 150, 30);
		
		personalNumericalCode = new JLabel("personal code");
		personalNumericalCode.setFont(new Font("", Font.BOLD, 20));
		personalNumericalCode.setBounds(50, 150, 150, 30);
		
		adress = new JLabel("adress");
		adress.setFont(new Font("", Font.BOLD, 20));
		adress.setBounds(50, 200, 150, 30);
		
		newPersonalNumericalCode = new JLabel("new code");
		newPersonalNumericalCode.setFont(new Font("", Font.BOLD, 20));
		newPersonalNumericalCode.setBounds(50, 250, 150, 30);
		
		// texts
		nameText = new JTextField();
		nameText.setFont(new Font("", Font.BOLD, 20));
		nameText.setBounds(200, 50, 200, 30);
		
		identityCardNumberText = new JTextField();
		identityCardNumberText.setFont(new Font("", Font.BOLD, 20));
		identityCardNumberText.setBounds(200, 100, 200, 30);
		
		personalNumericalCodeText = new JTextField();
		personalNumericalCodeText.setFont(new Font("", Font.BOLD, 20));
		personalNumericalCodeText.setBounds(200, 150, 200, 30);
		
		adressText = new JTextField();
		adressText.setFont(new Font("", Font.BOLD, 20));
		adressText.setBounds(200, 200, 200, 30);

		newPersonalNumericalCodeText = new JTextField();
		newPersonalNumericalCodeText.setFont(new Font("", Font.BOLD, 20));
		newPersonalNumericalCodeText.setBounds(200, 250, 200, 30);
		
		// button
		ok = new JButton("OK");
		ok.setFont(new Font("", Font.BOLD, 20));
		ok.setBounds(200, 350, 100, 50);
		
		panel.add(name);
		panel.add(identityCardNumber);
		panel.add(personalNumericalCode);
		panel.add(adress);	
		panel.add(newPersonalNumericalCode);
		
		panel.add(nameText);
		panel.add(identityCardNumberText);
		panel.add(personalNumericalCodeText);
		panel.add(adressText);
		panel.add(newPersonalNumericalCodeText);
		
		panel.add(ok);
		
		this.add(panel);
	}
	
	public void event(ActionListener listener) {
		ok.addActionListener(listener);
	}

	public JButton getOk() {
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
	
	public int getNewCodeText() {
		return Integer.parseInt(newPersonalNumericalCodeText.getText());
	}
	
}
