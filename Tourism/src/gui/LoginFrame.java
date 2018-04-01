package gui;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JPanel panel;
	private JLabel username, password, adress, personalCode;
	private JTextField userText, passText, adressText, personalCodeText;
	private JCheckBox admin, agent;
	private JButton login, register;
	
	private Font font = new Font("", Font.BOLD, 20);
	
	public LoginFrame() {
		this.setTitle("Login");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 600);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		username = new JLabel("username :");
		username.setFont(font);
		username.setBounds(150, 20, 150, 30);
		
		password = new JLabel("password :");
		password.setFont(font);
		password.setBounds(150, 100, 150, 30);
		
		adress = new JLabel("adress :");
		adress.setFont(font);
		adress.setBounds(150, 180, 150, 30);
		
		personalCode = new JLabel("personal code :");
		personalCode.setFont(font);
		personalCode.setBounds(150, 260, 150, 30);
		
		userText = new JTextField();
		userText.setFont(new Font("", 0, 20));
		userText.setBounds(350, 20, 200, 30);
		
		passText = new JTextField();
		passText.setFont(new Font("", 0, 20));
		passText.setBounds(350, 100, 200, 30);
		
		adressText = new JTextField();
		adressText.setFont(new Font("", 0, 20));
		adressText.setBounds(350, 180, 200, 30);
		
		personalCodeText = new JTextField();
		personalCodeText.setFont(font);
		personalCodeText.setBounds(350, 260, 200, 30);
		
		agent = new JCheckBox("Agent");
		agent.setFont(new Font("", 0, 20));
		agent.setBounds(200, 320, 100, 30);
		
		admin = new JCheckBox("Admin");
		admin.setFont(new Font("", 0, 20));
		admin.setBounds(400, 320, 100, 30);
		
		login = new JButton("login");
		login.setFont(font);
		login.setBounds(100, 400, 150, 50);
		
		register = new JButton("register");
		register.setFont(font);
		register.setBounds(400, 400, 150, 50);
		
		panel.add(username);
		panel.add(password);
		panel.add(adress);
		panel.add(personalCode);
		
		panel.add(userText);
		panel.add(passText);
		panel.add(adressText);
		panel.add(personalCodeText);
		
		panel.add(agent);
		panel.add(admin);
		panel.add(login);
		panel.add(register);
		
		this.add(panel);
	}

	public void loginEvent(ActionListener listener) {
		login.addActionListener(listener);
	}
	
	public void registerEvent(ActionListener listener) {
		register.addActionListener(listener);
	}
	
	public JCheckBox getAgent() {
		return agent;
	}
	
	public JCheckBox getAdmin() {
		return admin;
	}
	
	public JButton getLogin() {
		return login;
	}
	
	public JButton getRegister() {
		return register;
	}
	
	public String getUsername() { 
		return userText.getText();
	}
	
	public String getPass() {
		return passText.getText();
	}
	
	public String getAdress() {
		return adressText.getText();
	}
	
	public int getPersonalCode() {
		return Integer.parseInt(personalCodeText.getText());
	}
	
}
