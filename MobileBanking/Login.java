import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	JFrame frame;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the application.
	 */
	public Login() {
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
		
		txtUsername = new JTextField();
		txtUsername.setHorizontalAlignment(SwingConstants.CENTER);
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtUsername.setText("Username");
		txtUsername.setBounds(301, 154, 232, 33);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setHorizontalAlignment(SwingConstants.CENTER);
		pwdPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pwdPassword.setText("Password");
		pwdPassword.setBounds(301, 200, 232, 33);
		frame.getContentPane().add(pwdPassword);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if("admin".equals(txtUsername.getText()) || "mhbsheikh".equals(txtUsername.getText())) {
					if("admin".equals(pwdPassword.getText()) || "12345678".equals(pwdPassword.getText())) {
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
					}else {
						JOptionPane.showMessageDialog(null, "Wrong Password!", "Warning!", JOptionPane.ERROR_MESSAGE);
					}
				}else {
					JOptionPane.showMessageDialog(null, "Wrong Username!", "Warning!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnSignIn.setForeground(new Color(255, 255, 240));
		btnSignIn.setBackground(new Color(51, 204, 255));
		btnSignIn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSignIn.setBounds(301, 246, 232, 33);
		frame.getContentPane().add(btnSignIn);
		
		JLabel lblOr = new JLabel("Or");
		lblOr.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblOr.setBounds(407, 277, 34, 32);
		frame.getContentPane().add(lblOr);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
		btnSignUp.setForeground(new Color(255, 255, 240));
		btnSignUp.setBackground(new Color(204, 153, 102));
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSignUp.setBounds(301, 312, 232, 33);
		frame.getContentPane().add(btnSignUp);
		
		JButton btnForgotPassword = new JButton("Forgot password?");
		btnForgotPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		});
		btnForgotPassword.setForeground(new Color(255, 0, 0));
		btnForgotPassword.setFont(new Font("Tahoma", Font.ITALIC, 16));
		btnForgotPassword.setBounds(301, 358, 232, 33);
		frame.getContentPane().add(btnForgotPassword);
		
		JLabel lblMobileBanking = new JLabel("Mobile Banking");
		lblMobileBanking.setForeground(new Color(0, 0, 139));
		lblMobileBanking.setFont(new Font("Monotype Corsiva", Font.BOLD, 30));
		lblMobileBanking.setBounds(12, 13, 201, 40);
		frame.getContentPane().add(lblMobileBanking);
		
		JButton btnAboutUs = new JButton("About Us");
		btnAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							AboutUs window = new AboutUs();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnAboutUs.setForeground(Color.BLACK);
		btnAboutUs.setFont(new Font("Tahoma", Font.ITALIC, 16));
		btnAboutUs.setBounds(301, 404, 232, 33);
		frame.getContentPane().add(btnAboutUs);
	}
}
