package gui;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DeleteHolidayFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel panel;
	private JLabel clientCode;
	private JTextField clientCodeText;
	private JButton ok;
	
	private Font font = new Font("", Font.BOLD, 20);
	
	public DeleteHolidayFrame() {
		this.setTitle("delete holiday");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 200);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		clientCode = new JLabel("client code");
		clientCode.setFont(font);
		clientCode.setBounds(50, 50, 150, 30);
		
		clientCodeText = new JTextField();
		clientCodeText.setFont(font);
		clientCodeText.setBounds(200, 50, 150, 30);
		
		ok = new JButton("OK");
		ok.setFont(font);
		ok.setBounds(150, 100, 100, 50);
		
		panel.add(clientCode);
		panel.add(clientCodeText);
		panel.add(ok);
		
		this.add(panel);
	}
	
	public void event(ActionListener listener) {
		ok.addActionListener(listener);
	}
	
	public JButton getButton() {
		return ok;
	}
	
	public int getClientCode() {
		return Integer.parseInt(clientCodeText.getText());
	}
}
