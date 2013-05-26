package no.bluebit.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFirstGUI extends JFrame {

	public MyFirstGUI() {
		super("New Window");
		
		add(BorderLayout.CENTER, new MyBigButton());
		add(BorderLayout.SOUTH, new Menu());
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	private class MyBigButton extends JPanel {
		
		public MyBigButton() {
			setLayout(new GridLayout());
			
			JButton btn1 = new JButton("DON'T CLICK!");
			add(btn1);
		}
		
	}
	
	private class Menu extends JPanel {
		
		public Menu() {
			setLayout(new GridLayout(1,3));
			
			JLabel lblName = new JLabel("Navn:");
			JTextField txtInputName = new JTextField();
			JButton btnSubmit = new JButton("Ok");
			add(lblName);
			add(txtInputName);
			add(btnSubmit);
		}
		
	}
	
	public static void main(String[] args) {
		new MyFirstGUI();
	}
}
