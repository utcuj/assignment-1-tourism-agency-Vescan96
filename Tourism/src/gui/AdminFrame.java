package gui;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AdminFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel panel;
	private JButton createAgent, viewAgents, updateAgent, deleteAgent;
	private JButton reports;
	
	private Font font = new Font("", Font.BOLD, 20);
	
	public AdminFrame() {
		this.setTitle("");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 500);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		createAgent = new JButton("add agent");
		createAgent.setFont(font);
		createAgent.setBounds(50, 50, 250, 50);
		
		viewAgents = new JButton("view agents");
		viewAgents.setFont(font);
		viewAgents.setBounds(50, 150, 250, 50);
		
		updateAgent = new JButton("update agent");
		updateAgent.setFont(font);
		updateAgent.setBounds(50, 250, 250, 50);
		
		deleteAgent = new JButton("delete agent");
		deleteAgent.setFont(font);
		deleteAgent.setBounds(50, 350, 250, 50);
		
		reports = new JButton("reports");
		reports.setFont(new Font("", Font.BOLD, 35));
		reports.setBounds(400, 175, 200, 100);
		
		panel.add(createAgent);
		panel.add(viewAgents);
		panel.add(updateAgent);
		panel.add(deleteAgent);
		panel.add(reports);
		
		this.add(panel);
		this.setVisible(true);
	}
	
	public void createAgentEvent(ActionListener listener) {
		createAgent.addActionListener(listener);
	}
	
	public void viewAgentsEvent(ActionListener listener) {
		viewAgents.addActionListener(listener);
	}

	public void updateAgentEvent(ActionListener listener) {
		updateAgent.addActionListener(listener);
	}

	public void deleteAgentEvent(ActionListener listener) {
		deleteAgent.addActionListener(listener);
	}

	public void reportEvent(ActionListener listener) {
		reports.addActionListener(listener);
	}

	public JButton getCreateAgent() {
		return createAgent;
	}

	public JButton getViewAgents() {
		return viewAgents;
	}

	public JButton getUpdateAgent() {
		return updateAgent;
	}

	public JButton getDeleteAgent() {
		return deleteAgent;
	}

	public JButton getReports() {
		return reports;
	}
	
	
}
