package gui;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AgentFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel panel;
	private JButton addClient, updateClient, viewClient;
	private JButton addHoliday, updateHoliday, viewHoliday, deleteHoliday;
	
	
	public AgentFrame() {
		this.setTitle("client informations");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 500);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		addClient = new JButton("add client");
		addClient.setFont(new Font("", Font.CENTER_BASELINE, 30));
		addClient.setBounds(50, 50, 250, 40);
		
		updateClient = new JButton("update client");
		updateClient.setFont(new Font("", Font.CENTER_BASELINE, 30));
		updateClient.setBounds(50, 150, 250, 40);
		
		viewClient = new JButton("view client");
		viewClient.setFont(new Font("", Font.CENTER_BASELINE, 30));
		viewClient.setBounds(50, 250, 250, 40);
		
		addHoliday = new JButton("add holiday");
		addHoliday.setFont(new Font("", Font.CENTER_BASELINE, 30));
		addHoliday.setBounds(350, 50, 250, 40);
		
		updateHoliday = new JButton("update holiday");
		updateHoliday.setFont(new Font("", Font.CENTER_BASELINE, 30));
		updateHoliday.setBounds(350, 150, 250, 40);

		viewHoliday = new JButton("view holiday");
		viewHoliday.setFont(new Font("", Font.CENTER_BASELINE, 30));
		viewHoliday.setBounds(350, 250, 250, 40);
		
		deleteHoliday = new JButton("delete holiday");
		deleteHoliday.setFont(new Font("", Font.CENTER_BASELINE, 30));
		deleteHoliday.setBounds(350, 350, 250, 40);
		
		panel.add(addClient);
		panel.add(updateClient);
		panel.add(viewClient);
		
		panel.add(addHoliday);
		panel.add(updateHoliday);
		panel.add(viewHoliday);
		panel.add(deleteHoliday);
		
		this.add(panel);
	}
	
	public void addClientEvent(ActionListener listener) {
		addClient.addActionListener(listener);
	}
	
	public void updateClientEvent(ActionListener listener) {
		updateClient.addActionListener(listener);
	}
	
	public void viewClientEvent(ActionListener listener) {
		viewClient.addActionListener(listener);
	}
	
	public void addHolidayEvent(ActionListener listener) {
		addHoliday.addActionListener(listener);
	}
	
	public void updateHolidayEvent(ActionListener listener) {
		updateHoliday.addActionListener(listener);
	}
	
	public void viewHolidayEvent(ActionListener listener) {
		viewHoliday.addActionListener(listener);
	}
	
	public void deleteHolidayEvent(ActionListener listener) {
		deleteHoliday.addActionListener(listener);
	}
	
	public JButton getAddClient() {
		return addClient;
	}
	
	public JButton getUpdateClient() {
		return updateClient;
	}
	
	public JButton getViewClient() {
		return viewClient;
	}
	
	public JButton getAddHoliday() {
		return addHoliday;
	}
	
	public JButton getUpdateHoliday() {
		return updateHoliday;
	}
	
	public JButton getViewHoliday() {
		return viewHoliday;
	}
	
	public JButton getDeleteHoliday() {
		return deleteHoliday;
	}
}
