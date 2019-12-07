import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MobileRecharge extends MainPage {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the application.
	 */
	public MobileRecharge() {
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
		button.setForeground(new Color(255, 255, 0));
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBackground(Color.DARK_GRAY);
		button.setBounds(271, 381, 257, 40);
		frame.getContentPane().add(button);
		
		JButton btnRobi = new JButton("Banglalink");
		btnRobi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mainBalance < 20) {
					JOptionPane.showMessageDialog(null, "insufficient balance!", "Mobile Recharge (BL)", JOptionPane.WARNING_MESSAGE);
				}else {
					String a = JOptionPane.showInputDialog("BL Number: 019");
					String b = JOptionPane.showInputDialog("Confirm Number 019: ");
					String c = JOptionPane.showInputDialog("Amount: ");
					double amount = Double.parseDouble(c);
					double aa = Double.parseDouble(a);
					double bb = Double.parseDouble(b);
					if(amount>mainBalance) {
						JOptionPane.showMessageDialog(null, "insufficient balance!", "Mobile Recharge (BL)", JOptionPane.WARNING_MESSAGE);
					}else {
						if(aa==bb) {
							mainBalance -= amount;
							JOptionPane.showMessageDialog(null, "successful!", "Mobile Recharge (BL)", JOptionPane.INFORMATION_MESSAGE);
						}else {
							JOptionPane.showMessageDialog(null, "Wrong number provided!", "Mobile Recharge (BL)", JOptionPane.WARNING_MESSAGE);
						}
					}
				}
			}
		});
		btnRobi.setForeground(Color.WHITE);
		btnRobi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRobi.setBackground(new Color(153, 153, 255));
		btnRobi.setBounds(271, 309, 257, 40);
		frame.getContentPane().add(btnRobi);
		
		JButton btnTeletalk = new JButton("Teletalk");
		btnTeletalk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mainBalance < 20) {
					JOptionPane.showMessageDialog(null, "insufficient balance!", "Mobile Recharge (TT)", JOptionPane.WARNING_MESSAGE);
				}else {
					String a = JOptionPane.showInputDialog("TT Number: 015");
					String b = JOptionPane.showInputDialog("Confirm Number 015: ");
					String c = JOptionPane.showInputDialog("Amount: ");
					double amount = Double.parseDouble(c);
					double aa = Double.parseDouble(a);
					double bb = Double.parseDouble(b);
					if(amount>mainBalance) {
						JOptionPane.showMessageDialog(null, "insufficient balance!", "Mobile Recharge (TT)", JOptionPane.WARNING_MESSAGE);
					}else {
						if(aa==bb) {
							mainBalance -= amount;
							JOptionPane.showMessageDialog(null, "successful!", "Mobile Recharge (TT)", JOptionPane.INFORMATION_MESSAGE);
						}else {
							JOptionPane.showMessageDialog(null, "Wrong number provided!", "Mobile Recharge (TT)", JOptionPane.WARNING_MESSAGE);
						}
					}
				}
			}
		});
		btnTeletalk.setForeground(Color.WHITE);
		btnTeletalk.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTeletalk.setBackground(new Color(204, 153, 153));
		btnTeletalk.setBounds(271, 240, 257, 40);
		frame.getContentPane().add(btnTeletalk);
		
		JButton btnGrameenphone = new JButton("GrameenPhone");
		btnGrameenphone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mainBalance < 20) {
					JOptionPane.showMessageDialog(null, "insufficient balance!", "Mobile Recharge (GP)", JOptionPane.WARNING_MESSAGE);
				}else {
					String a = JOptionPane.showInputDialog("GP Number: 017");
					String b = JOptionPane.showInputDialog("Confirm Number 017: ");
					String c = JOptionPane.showInputDialog("Amount: ");
					double amount = Double.parseDouble(c);
					double aa = Double.parseDouble(a);
					double bb = Double.parseDouble(b);
					if(amount>mainBalance) {
						JOptionPane.showMessageDialog(null, "insufficient balance!", "Mobile Recharge (GP)", JOptionPane.WARNING_MESSAGE);
					}else {
						if(aa==bb) {
							mainBalance -= amount;
							JOptionPane.showMessageDialog(null, "successful!", "Mobile Recharge (GP)", JOptionPane.INFORMATION_MESSAGE);
						}else {
							JOptionPane.showMessageDialog(null, "Wrong number provided!", "Mobile Recharge (GP)", JOptionPane.WARNING_MESSAGE);
						}
					}
				}
			}
		});
		btnGrameenphone.setForeground(Color.WHITE);
		btnGrameenphone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnGrameenphone.setBackground(new Color(153, 153, 255));
		btnGrameenphone.setBounds(271, 168, 257, 40);
		frame.getContentPane().add(btnGrameenphone);
	}

}
