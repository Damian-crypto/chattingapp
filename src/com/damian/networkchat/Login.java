package com.damian.networkchat;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JLabel;
import java.awt.Font;

public class Login extends JFrame {

	private static final long serialVersionUID = -4020925074485153000L;
	
	private JPanel contentPane;
	private JTextField textName;

	public Login() {
		setFont(new Font("Dialog", Font.PLAIN, 13));
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 380);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textName = new JTextField();
		textName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textName.setBounds(39, 60, 216, 28);
		contentPane.add(textName);
		textName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(121, 35, 52, 14);
		contentPane.add(lblNewLabel);
	}
	
	public static void main(String[] args) {

		for(LookAndFeelInfo laf: UIManager.getInstalledLookAndFeels()) {
			if(laf.getName().contains("Nimbus")) {
				try {
					UIManager.setLookAndFeel(laf.getClassName());
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e) {
					e.printStackTrace();
				}
			}
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
