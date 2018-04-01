package gui;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DeleteAgentFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel panel;
	private JLabel code;
	private JTextField codeText;
	private JButton ok;
	
	private Font font = new Font("", Font.BOLD, 20);
	
	public DeleteAgentFrame() {
		this.setTitle("delete agent");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 200);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		code = new JLabel("client code");
		code.setFont(font);
		code.setBounds(50, 50, 150, 30);
		
		codeText = new JTextField();
		codeText.setFont(font);
		codeText.setBounds(200, 50, 150, 30);
		
		ok = new JButton("OK");
		ok.setFont(font);
		ok.setBounds(150, 100, 100, 50);
		
		panel.add(code);
		panel.add(codeText);
		panel.add(ok);
		
		this.add(panel);
	}
	
	public void event(ActionListener listener) {
		ok.addActionListener(listener);
	}
	
	public JButton getButton() {
		return ok;
	}
	
	public int getcode() {
		return Integer.parseInt(codeText.getText());
	}

}
