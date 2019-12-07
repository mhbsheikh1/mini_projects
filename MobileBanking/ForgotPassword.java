import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ForgotPassword {

	JFrame frame;
	private JTextField txtPhoneNumber;
	private JTextField txtEmail;
	private JTextField txtPinNumber;
	private JTextField txtNewPassword;
	private JTextField txtConfirmPassword;
	private JButton btnGoHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotPassword window = new ForgotPassword();
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
	public ForgotPassword() {
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
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPhoneNumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtPhoneNumber.setText("Phone Number");
		txtPhoneNumber.setBounds(282, 130, 264, 40);
		frame.getContentPane().add(txtPhoneNumber);
		txtPhoneNumber.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtEmail.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmail.setText("Email");
		txtEmail.setBounds(282, 181, 264, 40);
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		txtPinNumber = new JTextField();
		txtPinNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPinNumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtPinNumber.setText("Pin Number (menual)");
		txtPinNumber.setBounds(282, 232, 264, 40);
		frame.getContentPane().add(txtPinNumber);
		txtPinNumber.setColumns(10);
		
		txtNewPassword = new JTextField();
		txtNewPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNewPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtNewPassword.setText("New Password");
		txtNewPassword.setBounds(282, 285, 264, 40);
		frame.getContentPane().add(txtNewPassword);
		txtNewPassword.setColumns(10);
		
		txtConfirmPassword = new JTextField();
		txtConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtConfirmPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtConfirmPassword.setText("Confirm password");
		txtConfirmPassword.setBounds(282, 338, 264, 40);
		frame.getContentPane().add(txtConfirmPassword);
		txtConfirmPassword.setColumns(10);
		
		JButton btnResetPassword = new JButton("Reset Password");
		btnResetPassword.setBackground(new Color(204, 102, 102));
		btnResetPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showInternalMessageDialog(null, "Conformation text!", "Your password has been changed sucessfully...", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnResetPassword.setForeground(Color.WHITE);
		btnResetPassword.setFont(new Font("Tahoma", Font.ITALIC, 18));
		btnResetPassword.setBounds(282, 391, 264, 40);
		frame.getContentPane().add(btnResetPassword);
		
		btnGoHome = new JButton("Home");
		btnGoHome.setBackground(Color.DARK_GRAY);
		btnGoHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Login window = new Login();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnGoHome.setForeground(Color.WHITE);
		btnGoHome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnGoHome.setBounds(283, 441, 261, 40);
		frame.getContentPane().add(btnGoHome);
	}
}
