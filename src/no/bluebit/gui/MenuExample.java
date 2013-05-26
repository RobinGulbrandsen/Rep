package no.bluebit.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuExample extends JFrame {
	
	private String[] btnLabels = { "Ny", "Vis", "Opdater", "Slett", "Avslutt", "Ny knapp" };

	public MenuExample() {
		super("Menu");
		
		add(BorderLayout.CENTER, new MenuButtons());
		
		setSize(200,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	private class MenuButtons extends JPanel {
		
		public MenuButtons() {
			setLayout(new GridLayout(btnLabels.length, 1));
			
			JButton btn;
			for (int i = 0; i < btnLabels.length; i++) {
				btn = new JButton(btnLabels[i]);
				btn.addActionListener(new EventHandler());
				add(btn);
			}
		}
	}
	
	private class EventHandler implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String btnLabel = e.getActionCommand();
			
			switch (btnLabel) {
			case "Ny":			createNew();		break;
			case "Vis":			show();				break;
			case "Avslutt":		System.exit(0);		break;
			case "Ny2":			createNew();		break;
			case "Vis2":		show();				break;
			case "Avslutt2":	exitProgram();		break;
			case "Ny3":			createNew();		break;
			case "Vis3":		show();				break;
			case "Avslutt3":	exitProgram();		break;
			}
			
			if(btnLabel.equals("Ny")) {
				
			}
		}
		
		public void createNew() {
			System.out.println("Lager ny");
		}
		
		public void show() {
			System.out.println("Viser");
		}
		
		public void exitProgram() {
			System.exit(0);
			
		}
	}
	
	public static void main(String[] args) {
		new MenuExample();
	}
}
