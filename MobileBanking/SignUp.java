import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUp {

	JFrame frame;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtPhoneNumber;
	private JTextField txtEmail;
	private JTextField txtUsername;
	private JTextField txtAdress;
	private JPasswordField pwdPass;
	private JTextField txtAge;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp window = new SignUp();
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
	public SignUp() {
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
		
		txtFirstName = new JTextField();
		txtFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		txtFirstName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFirstName.setText("First Name");
		txtFirstName.setBounds(118, 173, 279, 31);
		frame.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setHorizontalAlignment(SwingConstants.CENTER);
		txtLastName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtLastName.setText("Surname");
		txtLastName.setBounds(448, 173, 279, 31);
		frame.getContentPane().add(txtLastName);
		txtLastName.setColumns(10);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPhoneNumber.setText("Phone Number");
		txtPhoneNumber.setBounds(118, 227, 279, 31);
		frame.getContentPane().add(txtPhoneNumber);
		txtPhoneNumber.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtEmail.setText("Email");
		txtEmail.setBounds(449, 227, 278, 31);
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setHorizontalAlignment(SwingConstants.CENTER);
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtUsername.setText("Username");
		txtUsername.setBounds(118, 277, 279, 31);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtAdress = new JTextField();
		txtAdress.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdress.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtAdress.setText("Mailing Adress");
		txtAdress.setBounds(118, 327, 279, 31);
		frame.getContentPane().add(txtAdress);
		txtAdress.setColumns(10);
		
		pwdPass = new JPasswordField();
		pwdPass.setHorizontalAlignment(SwingConstants.CENTER);
		pwdPass.setText("Password");
		pwdPass.setBounds(448, 278, 279, 31);
		frame.getContentPane().add(pwdPass);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtAge.setHorizontalAlignment(SwingConstants.CENTER);
		txtAge.setText("Age (ex. 18)");
		txtAge.setBounds(449, 327, 278, 31);
		frame.getContentPane().add(txtAge);
		txtAge.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("I have read policy section carefully!");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.ITALIC, 14));
		chckbxNewCheckBox.setBounds(118, 371, 609, 25);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							SignneUp window = new SignneUp();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnSignUp.setBackground(new Color(204, 153, 102));
		btnSignUp.setForeground(new Color(255, 255, 255));
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSignUp.setBounds(429, 405, 176, 31);
		frame.getContentPane().add(btnSignUp);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							SignUp window = new SignUp();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReset.setBounds(231, 405, 176, 31);
		frame.getContentPane().add(btnReset);
		
		JLabel label = new JLabel("Mobile Banking");
		label.setForeground(new Color(0, 0, 139));
		label.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));
		label.setBounds(12, 13, 201, 40);
		frame.getContentPane().add(label);
		
		JLabel lblfillThisForm = new JLabel("*fill this form with valid informations!");
		lblfillThisForm.setForeground(new Color(0, 51, 204));
		lblfillThisForm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblfillThisForm.setBounds(307, 144, 249, 16);
		frame.getContentPane().add(lblfillThisForm);
	}
}
