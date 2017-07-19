package slspackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SimpleLoginSystem1 extends JFrame {

	private JPanel contentPane;
	public JTextField username;
	public JTextField passwordField; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleLoginSystem1 frame = new SimpleLoginSystem1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SimpleLoginSystem1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setBounds(70, 134, 77, 21);
		contentPane.add(lblPassword);
		
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setBounds ( 70, 105, 77, 21 );
		contentPane.add(lblUsername);
		
		username = new JTextField();
		username.setBounds ( 146, 105, 145, 20 );
		contentPane.add(username);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(146, 134, 145, 20 );
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.setBounds(156, 165, 89, 32);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String uname = username.getText();
				String pad = passwordField.getText();
				
				if (uname.equals("name") && pad.equals("pad")){
					JOptionPane.showMessageDialog(contentPane, "you are logged in");
				}else{
					JOptionPane.showMessageDialog(contentPane, "you suck");
				}
			}
		}
	);}
}
