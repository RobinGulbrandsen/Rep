package no.bluebit.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tressure extends JFrame{
	private String[] btnLabels = {
			"Knapp 1", "Knapp2", "Knapp3", "Knapp4",
			"Knapp 5", "Knapp6", "Knapp7", "Knapp8",
			"Knapp 9", "Knapp10", "Knapp11", "Knapp12",
			"Knapp 13", "Knapp14", "Knapp15", "Knapp16",
			"Knapp 17", "Knapp18", "Knapp19", "Knapp20",
	};
	
	private JButton[] btnList;
	
	public Tressure() {
		super("Clik the buttons");
		
		add(BorderLayout.CENTER, new ManyButtons());
		
		setVisible(true);
		setSize(475,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class ManyButtons extends JPanel{
		
		public ManyButtons() {
			setLayout(new GridLayout(4,5));
			
			EventHandler scanner = new EventHandler();
			
			JButton btn;
			btnList = new JButton[btnLabels.length];
			for (int i = 0; i < btnLabels.length; i++) {
				btn = new JButton(btnLabels[i]);
				btn.setBackground(Color.YELLOW);
				btn.setForeground(Color.BLUE);
				btn.addActionListener(scanner);
				btnList[i] = btn;
				add(btn);
			}
		}
	}
	
	private class EventHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String btnLabel = e.getActionCommand();
			JButton btnClicked = (JButton) e.getSource();
			
			btnClicked.setText("Not here");
			
			for (int i = 0; i < btnLabels.length; i++) {
				if(btnClicked == btnList[i]) {
					btnList[i].setBackground(Color.BLUE);
					btnList[i].setForeground(Color.YELLOW);
				}
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		new Tressure();
	}

}
