package gui;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CreateAgentFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel panel;
	private JLabel name, pass, adress, rank, personalCode;
	private JTextField nameText, passText, adressText, rankText, personalCodeText;
	private JButton ok;
	
	private Font font = new Font("", Font.BOLD, 20);
	
	public CreateAgentFrame() {
		this.setTitle("add agent");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 400);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		// start labels
		name = new JLabel("name");
		name.setFont(font);
		name.setBounds(50, 20, 150, 30);
		
		pass = new JLabel("password"); 
		pass.setFont(font);
		pass.setBounds(50, 70, 150, 30);
		
		adress = new JLabel("adress");
		adress.setFont(font);
		adress.setBounds(50, 120, 150, 30);
		
		rank = new JLabel("rank"); 
		rank.setFont(font);
		rank.setBounds(50, 170, 150, 30);
		
		personalCode = new JLabel("personal code");
		personalCode.setFont(font);
		personalCode.setBounds(50, 220, 150, 30);
		// end labels
		
		// start text
		nameText = new JTextField();
		nameText.setFont(font);
		nameText.setBounds(200, 20, 200, 30);
		
		passText = new JTextField();
		passText.setFont(font);
		passText.setBounds(200, 70, 200, 30);
		
		adressText = new JTextField();
		adressText.setFont(font);
		adressText.setBounds(200, 120, 200, 30);
		
		rankText = new JTextField();
		rankText.setFont(font);
		rankText.setBounds(200, 170, 200, 30);
		
		personalCodeText = new JTextField();
		personalCodeText.setFont(font);
		personalCodeText.setBounds(200, 220, 200, 30);
		// end text
		
		// button
		ok = new JButton("OK");
		ok.setFont(font);
		ok.setBounds(200, 275, 100, 50);
		
		// labels
		panel.add(name);
		panel.add(pass);
		panel.add(adress);
		panel.add(rank);
		panel.add(personalCode);
		
		// texts
		panel.add(nameText);
		panel.add(passText);
		panel.add(adressText);
		panel.add(rankText);
		panel.add(personalCodeText);
		
		// button
		panel.add(ok);
		
		this.add(panel);
	}

	public void event (ActionListener listener) {
		ok.addActionListener(listener);
	}
	
	public JButton getButton() {
		return ok;
	}
	
	public String getnameText() {
		return nameText.getText();
	}
	
	public String getpassText() {
		return passText.getText();
	}
	
	public String getadressText() {
		return adressText.getText();
	}
	
	public int getrankText() {
		return Integer.parseInt(rankText.getText());
	}
	
	public int getpersonalCodeText() {
		return Integer.parseInt(personalCodeText.getText());
	}
}
