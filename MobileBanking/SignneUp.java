import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class SignneUp {

	JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the application.
	 */
	public SignneUp() {
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
		
		JButton button = new JButton("Sign In");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if("admin".equals(textField.getText()) || "mhbsheikh".equals(textField.getText())) {
					if("admin".equals(passwordField.getText()) || "12345678".equals(passwordField.getText())) {
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
		button.setForeground(new Color(255, 255, 240));
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBackground(new Color(51, 204, 255));
		button.setBounds(295, 351, 232, 33);
		frame.getContentPane().add(button);
		
		JLabel lblYourAccountHas = new JLabel("one step left: offline activation (please meet an admin)");
		lblYourAccountHas.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblYourAccountHas.setBounds(264, 220, 388, 16);
		frame.getContentPane().add(lblYourAccountHas);
		
		JLabel lblHiThere = new JLabel("Hi there!");
		lblHiThere.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblHiThere.setBounds(254, 191, 74, 16);
		frame.getContentPane().add(lblHiThere);
		
		JLabel lblWelcome = new JLabel("Congratulation!");
		lblWelcome.setForeground(new Color(0, 102, 51));
		lblWelcome.setFont(new Font("Dialog", Font.BOLD, 18));
		lblWelcome.setBounds(322, 191, 152, 16);
		frame.getContentPane().add(lblWelcome);
		
		passwordField = new JPasswordField();
		passwordField.setText("Password");
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.setBounds(295, 305, 232, 33);
		frame.getContentPane().add(passwordField);
		
		textField = new JTextField();
		textField.setText("Username");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(295, 259, 232, 33);
		frame.getContentPane().add(textField);
		
		JLabel lblYourAccountIs = new JLabel("your account is almost ready");
		lblYourAccountIs.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblYourAccountIs.setBounds(466, 191, 213, 16);
		frame.getContentPane().add(lblYourAccountIs);
	}

}
