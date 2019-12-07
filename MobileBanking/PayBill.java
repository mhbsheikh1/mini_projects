import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PayBill extends MainPage {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the application.
	 */
	public PayBill() {
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
		
		JButton btnElectricityBill = new JButton("Electricity Bill");
		btnElectricityBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mainBalance < 20) {
					JOptionPane.showMessageDialog(null, "insufficient balance!", "Electricity Bill", JOptionPane.WARNING_MESSAGE);
				}else {
					String a = JOptionPane.showInputDialog("Electricity Bill No: ");
					String b = JOptionPane.showInputDialog("Confirm Bill No: ");
					double aa = Double.parseDouble(a);
					double bb = Double.parseDouble(b);
					String c = JOptionPane.showInputDialog("Bill Amount: ");
					double bill = Double.parseDouble(c);
					if(bill>mainBalance) {
						JOptionPane.showMessageDialog(null, "insufficient balance!", "Electricity Bill", JOptionPane.WARNING_MESSAGE);
					}else {
						if(aa == bb) {
							mainBalance -= bill;
							JOptionPane.showMessageDialog(null, "successful!", "Electricity Bill", JOptionPane.INFORMATION_MESSAGE);
						}else {
							JOptionPane.showMessageDialog(null, "Wrong Bill Number!", "Electricity Bill", JOptionPane.WARNING_MESSAGE);
						}
					}
				}
			}
		});
		btnElectricityBill.setForeground(Color.WHITE);
		btnElectricityBill.setBackground(new Color(153, 153, 255));
		btnElectricityBill.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnElectricityBill.setBounds(286, 172, 257, 40);
		frame.getContentPane().add(btnElectricityBill);
		
		JButton btnGasBill = new JButton("Gas Bill");
		btnGasBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mainBalance < 20) {
					JOptionPane.showMessageDialog(null, "insufficient balance!", "Gas Bill", JOptionPane.WARNING_MESSAGE);
				}else {
					String a = JOptionPane.showInputDialog("Gas Bill No: ");
					String b = JOptionPane.showInputDialog("Confirm Bill No: ");
					double aa = Double.parseDouble(a);
					double bb = Double.parseDouble(b);
					String c = JOptionPane.showInputDialog("Bill Amount: ");
					double bill = Double.parseDouble(c);
					if(bill>mainBalance) {
						JOptionPane.showMessageDialog(null, "insufficient balance!", "Gas Bill", JOptionPane.WARNING_MESSAGE);
					}else {
						if(aa == bb) {
							mainBalance -= bill;
							JOptionPane.showMessageDialog(null, "successful!", "Gas Bill", JOptionPane.INFORMATION_MESSAGE);
						}else {
							JOptionPane.showMessageDialog(null, "Wrong Bill Number!", "Electricity Bill", JOptionPane.WARNING_MESSAGE);
						}
					}
				}
			}
		});
		btnGasBill.setForeground(Color.WHITE);
		btnGasBill.setBackground(new Color(204, 153, 153));
		btnGasBill.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnGasBill.setBounds(286, 244, 257, 40);
		frame.getContentPane().add(btnGasBill);
		
		JButton btnTelephoneBill = new JButton("Telephone Bill");
		btnTelephoneBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mainBalance < 20) {
					JOptionPane.showMessageDialog(null, "insufficient balance!", "Telephone Bill", JOptionPane.WARNING_MESSAGE);
				}else {
					String a = JOptionPane.showInputDialog("Telephone Bill No: ");
					String b = JOptionPane.showInputDialog("Confirm Bill No: ");
					double aa = Double.parseDouble(a);
					double bb = Double.parseDouble(b);
					String c = JOptionPane.showInputDialog("Bill Amount: ");
					double bill = Double.parseDouble(c);
					if(bill>mainBalance) {
						JOptionPane.showMessageDialog(null, "insufficient balance!", "Telephone Bill", JOptionPane.WARNING_MESSAGE);
					}else {
						if(aa == bb) {
							mainBalance -= bill;
							JOptionPane.showMessageDialog(null, "successful!", "Telephone Bill", JOptionPane.INFORMATION_MESSAGE);
						}else {
							JOptionPane.showMessageDialog(null, "Wrong Bill Number!", "Electricity Bill", JOptionPane.WARNING_MESSAGE);
						}
					}
				}
			}
		});
		btnTelephoneBill.setForeground(Color.WHITE);
		btnTelephoneBill.setBackground(new Color(153, 153, 255));
		btnTelephoneBill.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnTelephoneBill.setBounds(286, 313, 257, 40);
		frame.getContentPane().add(btnTelephoneBill);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

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
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.setBackground(Color.DARK_GRAY);
		btnBack.setForeground(new Color(255, 255, 51));
		btnBack.setBounds(286, 385, 257, 40);
		frame.getContentPane().add(btnBack);
	}
}
