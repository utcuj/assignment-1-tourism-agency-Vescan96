package gui;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;

public class UpdateAgentFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel panel;
	private JLabel name, pass, adress, rank, personalCode, newCode;
	private JTextField nameText, passText, adressText, rankText, personalCodeText, newCodeText;
	private JButton ok;
	
	private Font font = new Font("", Font.BOLD, 20);
	
	public UpdateAgentFrame() {
		this.setTitle("update agent information");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		// start label
		name = new JLabel("name");
		name.setFont(font);
		name.setBounds(50, 50, 150, 30);
		
		pass = new JLabel("password"); 
		pass.setFont(font);
		pass.setBounds(50, 100, 150, 30);
		
		adress = new JLabel("adress");
		adress.setFont(font);
		adress.setBounds(50, 150, 150, 30);
		
		rank = new JLabel("rank");
		rank.setFont(font);
		rank.setBounds(50, 200, 150, 30);
		
		personalCode = new JLabel("personal code");
		personalCode.setFont(font);
		personalCode.setBounds(50, 250, 150, 30);
		
		newCode = new JLabel("new code");
		newCode.setFont(font);
		newCode.setBounds(50, 300, 150, 30);
		// end label
		
		// start text
		nameText = new JTextField();
		nameText.setFont(font);
		nameText.setBounds(200, 50, 200, 30);
		
		passText = new JTextField(); 
		passText.setFont(font);
		passText.setBounds(200, 100, 200, 30);
		
		adressText = new JTextField();
		adressText.setFont(font);
		adressText.setBounds(200, 150, 200, 30);
		
		rankText = new JTextField();
		rankText.setFont(font);
		rankText.setBounds(200, 200, 200, 30);
		
		personalCodeText = new JTextField();
		personalCodeText.setFont(font);
		personalCodeText.setBounds(200, 250, 200, 30);
		
		newCodeText = new JTextField();
		newCodeText.setFont(font);
		newCodeText.setBounds(200, 300, 200, 30);
		//end text
		
		// button
		ok = new JButton("OK");
		ok.setFont(font);
		ok.setBounds(200, 375, 100, 50);
		
		// add label
		panel.add(name);
		panel.add(pass);
		panel.add(adress);
		panel.add(rank);
		panel.add(personalCode);
		panel.add(newCode);
		
		// add text
		panel.add(nameText);
		panel.add(passText);
		panel.add(adressText);
		panel.add(rankText);
		panel.add(personalCodeText);
		panel.add(newCodeText);
		
		// add button
		panel.add(ok);
		
		this.add(panel);
	}
	
	public void event(ActionListener listener) {
		ok.addActionListener(listener);
	}
	
	public JButton getButton() {
		return ok;
	}

	public String getName() {
		return nameText.getText();
	}

	public String getPass() {
		return passText.getText();
	}

	public String getAdress() {
		return adressText.getText();
	}

	public int getRank() {
		return Integer.parseInt(rankText.getText());
	}

	public int getPersonalCode() {
		return Integer.parseInt(personalCodeText.getText());
	}

	public int getNewCode() {
		return Integer.parseInt(newCodeText.getText());
	}
	

}
