import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage {
	
	double mainBalance = 50000.0;

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the application.
	 */
	public MainPage() {
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
		
		JButton btnSendMoney = new JButton("Send Money");
		btnSendMoney.setForeground(Color.WHITE);
		btnSendMoney.setBackground(new Color(153, 153, 204));
		btnSendMoney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = JOptionPane.showInputDialog("Enter Receiver Number: ");
				String a = JOptionPane.showInputDialog("Enter Amount: ");
				int amount = Integer.parseInt(a);
				if(mainBalance < 20) {
					JOptionPane.showMessageDialog(null, "insufficient balance", "Empty Account", JOptionPane.WARNING_MESSAGE);
				}else if(amount > mainBalance) {
					JOptionPane.showMessageDialog(null, "insufficient balance", "Empty Account", JOptionPane.WARNING_MESSAGE);
				}else {
					if(amount>19) {
						mainBalance -= amount;
						JOptionPane.showMessageDialog(frame, "Sucessful!");
					}else {
						JOptionPane.showMessageDialog(null, "Follow rules", "Terms & Conditions", JOptionPane.WARNING_MESSAGE);
					}
				}
			}
		});
		btnSendMoney.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSendMoney.setBounds(123, 179, 254, 56);
		frame.getContentPane().add(btnSendMoney);
		
		JButton btnMobileRecharge = new JButton("Mobile Recharge");
		btnMobileRecharge.setForeground(Color.WHITE);
		btnMobileRecharge.setBackground(new Color(204, 153, 153));
		btnMobileRecharge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							MobileRecharge window = new MobileRecharge();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnMobileRecharge.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMobileRecharge.setBounds(123, 283, 254, 56);
		frame.getContentPane().add(btnMobileRecharge);
		
		JButton btnCashOut = new JButton("Cash Out");
		btnCashOut.setForeground(Color.WHITE);
		btnCashOut.setBackground(new Color(153, 153, 204));
		btnCashOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							CashOut window = new CashOut();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnCashOut.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCashOut.setBounds(455, 283, 254, 56);
		frame.getContentPane().add(btnCashOut);
		
		JButton btnPayBill = new JButton("Pay Bill");
		btnPayBill.setForeground(Color.WHITE);
		btnPayBill.setBackground(new Color(204, 153, 153));
		btnPayBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							PayBill window = new PayBill();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnPayBill.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPayBill.setBounds(455, 179, 254, 56);
		frame.getContentPane().add(btnPayBill);
		
		JButton btnMyAccount = new JButton("My Account");
		btnMyAccount.setForeground(Color.WHITE);
		btnMyAccount.setBackground(new Color(153, 153, 204));
		btnMyAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
		});
		btnMyAccount.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMyAccount.setBounds(123, 383, 254, 56);
		frame.getContentPane().add(btnMyAccount);
		
		JButton btnSignOut = new JButton("Sign Out");
		btnSignOut.setForeground(Color.WHITE);
		btnSignOut.setBackground(new Color(204, 153, 153));
		btnSignOut.addActionListener(new ActionListener() {
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
		btnSignOut.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSignOut.setBounds(455, 383, 254, 56);
		frame.getContentPane().add(btnSignOut);
	}
}
