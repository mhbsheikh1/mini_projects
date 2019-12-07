import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyAccount extends MainPage {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyAccount window = new MyAccount();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyAccount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 846, 646);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Mobile Banking");
		label.setForeground(new Color(0, 0, 139));
		label.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));
		label.setBounds(12, 13, 201, 40);
		frame.getContentPane().add(label);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							MainPage window = new MainPage();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		button.setForeground(Color.YELLOW);
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(296, 339, 257, 40);
		frame.getContentPane().add(button);
		
		JButton btnCheckBalance = new JButton("Check Balance");
		btnCheckBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Current Account Balance: $"+mainBalance);
			}
		});
		btnCheckBalance.setForeground(Color.WHITE);
		btnCheckBalance.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCheckBalance.setBackground(new Color(204, 153, 153));
		btnCheckBalance.setBounds(296, 273, 257, 40);
		frame.getContentPane().add(btnCheckBalance);
		
		JButton btnResetPassword = new JButton("Reset Password");
		btnResetPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ChangePassword window = new ChangePassword();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnResetPassword.setForeground(Color.WHITE);
		btnResetPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnResetPassword.setBackground(new Color(153, 153, 204));
		btnResetPassword.setBounds(296, 206, 257, 40);
		frame.getContentPane().add(btnResetPassword);
	}

}
