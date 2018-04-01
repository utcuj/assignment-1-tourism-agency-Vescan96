package gui;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ViewClientInformations extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel panel;
	private JLabel name, identityCardNumber, personalNumericalCode, adress;
	private JTextArea area;
	private JScrollPane scroll;
	private JButton ok;
	
	public ViewClientInformations() {
		this.setTitle("Clients Informations");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		name = new JLabel("name");
		name.setFont(new Font("", Font.BOLD, 20));
		name.setBounds(10, 10, 100, 30);
		
		identityCardNumber = new JLabel("CardNr");
		identityCardNumber.setFont(new Font("", Font.BOLD, 20));
		identityCardNumber.setBounds(125, 10, 200, 30);
		
		personalNumericalCode = new JLabel("PersonalCode");
		personalNumericalCode.setFont(new Font("", Font.BOLD, 20));
		personalNumericalCode.setBounds(250, 10, 200, 30);
		
		adress = new JLabel("adress");
		adress.setFont(new Font("", Font.BOLD, 20));
		adress.setBounds(425, 10, 100, 30);
		
		area = new JTextArea();
		area.setEditable(false);
		area.setBackground(Color.WHITE);
		area.setFont(new Font("", Font.BOLD, 20));
		
		scroll = new JScrollPane(area);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(0, 50, 490, 300);
		
		ok = new JButton("OK");
		ok.setFont(new Font("", Font.BOLD, 20));
		ok.setBounds(200, 375, 100, 50);
		
		panel.add(name);
		panel.add(identityCardNumber);
		panel.add(personalNumericalCode);
		panel.add(adress);
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
	
	public void clearArea() {
		area.setText("");
	}

	public void addText(String[] text) {

		for(int i = 0; i < text.length; i++)
			area.append(text[i] + "\t");
		
		area.append("\n");
	}
}
