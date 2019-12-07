import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CashOut extends MainPage {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the application.
	 */
	public CashOut() {
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
		
		JButton btnAgent = new JButton("Agent");
		btnAgent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = JOptionPane.showInputDialog("Agent's Phone Number: ");
				String b = JOptionPane.showInputDialog("Confirm Phone Number: ");
				String c = JOptionPane.showInputDialog("Amount: ");
				double aa = Double.parseDouble(a);
				double bb = Double.parseDouble(b);
				double amount = Double.parseDouble(c);
				if(aa!=bb) {
					JOptionPane.showMessageDialog(null, "Agent's Phone number is invalid!", "Cash Out", JOptionPane.WARNING_MESSAGE);
				}else {
					if(amount > mainBalance) {
						JOptionPane.showMessageDialog(null, "insufficient balance!", "Cash Out", JOptionPane.WARNING_MESSAGE);
					}else if(amount > 1000) {
						JOptionPane.showMessageDialog(null, "Rule's Exception!", "Cash Out", JOptionPane.INFORMATION_MESSAGE);
					}else {
						mainBalance -= amount;
						JOptionPane.showMessageDialog(null, "Successful");
					}
				}
			}
		});
		btnAgent.setForeground(Color.WHITE);
		btnAgent.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAgent.setBackground(new Color(153, 153, 204));
		btnAgent.setBounds(303, 198, 257, 40);
		frame.getContentPane().add(btnAgent);
		
		JButton btnPersonal = new JButton("Personal");
		btnPersonal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = JOptionPane.showInputDialog("Personal Phone Number: ");
				String b = JOptionPane.showInputDialog("Confirm Phone Number: ");
				String c = JOptionPane.showInputDialog("Amount: ");
				double aa = Double.parseDouble(a);
				double bb = Double.parseDouble(b);
				double amount = Double.parseDouble(c);
				if(aa!=bb) {
					JOptionPane.showMessageDialog(null, "Personal Phone number is invalid!", "Cash Out", JOptionPane.WARNING_MESSAGE);
				}else {
					if(amount > mainBalance) {
						JOptionPane.showMessageDialog(null, "insufficient balance!", "Cash Out", JOptionPane.WARNING_MESSAGE);
					}else if(amount > 1000) {
						JOptionPane.showMessageDialog(null, "Rule's Exception!", "Cash Out", JOptionPane.INFORMATION_MESSAGE);
					}else {
						mainBalance -= amount;
						JOptionPane.showMessageDialog(null, "Successful");
					}
				}
			}
		});
		btnPersonal.setForeground(Color.WHITE);
		btnPersonal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPersonal.setBackground(new Color(204, 153, 153));
		btnPersonal.setBounds(303, 265, 257, 40);
		frame.getContentPane().add(btnPersonal);
		
		JButton button_2 = new JButton("Back");
		button_2.addActionListener(new ActionListener() {
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
		button_2.setForeground(Color.YELLOW);
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_2.setBackground(Color.DARK_GRAY);
		button_2.setBounds(303, 331, 257, 40);
		frame.getContentPane().add(button_2);
	}

}
