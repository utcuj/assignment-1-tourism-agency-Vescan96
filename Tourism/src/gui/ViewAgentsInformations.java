package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ViewAgentsInformations extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel panel;
	private JLabel name, pass, adress, rank, personalCode;
	private JTextArea area;
	private JScrollPane scroll;
	private JButton ok;
	
	private Font font = new Font("", Font.BOLD, 20);
	
	public ViewAgentsInformations() {
		this.setTitle("agents informations");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(720, 500);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		name = new JLabel("name");
		name.setFont(font);
		name.setBounds(10, 10, 100, 30);
		
		pass = new JLabel("password"); 
		pass.setFont(font);
		pass.setBounds(150, 10, 100, 30);
		
		adress = new JLabel("adress");
		adress.setFont(font);
		adress.setBounds(280, 10, 100, 30);
		
		rank = new JLabel("rank");
		rank.setFont(font);
		rank.setBounds(420, 10, 100, 30);
		
		personalCode = new JLabel("personal code");
		personalCode.setFont(font);
		personalCode.setBounds(550, 10, 150, 30);
		
		area = new JTextArea();
		area.setEditable(false);
		area.setBackground(Color.white);
		area.setFont(font);
		
		scroll = new JScrollPane(area);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(10, 50, 700, 350);
		
		ok = new JButton("OK");
		ok.setFont(font);
		ok.setBounds(325, 400, 100, 50);
		
		panel.add(name);
		panel.add(pass);
		panel.add(adress);
		panel.add(rank);
		panel.add(personalCode);
		
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

	public void addText(String[] row) {
		for(String data : row)
			area.append(data + "\t");
		
		area.append("\n");
	}
}
