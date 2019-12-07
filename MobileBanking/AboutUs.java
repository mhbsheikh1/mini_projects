import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AboutUs {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the application.
	 */
	public AboutUs() {
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
		
		JLabel lblThisIsA = new JLabel("This is a project of CSE215");
		lblThisIsA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblThisIsA.setBounds(304, 240, 201, 26);
		frame.getContentPane().add(lblThisIsA);
		
		JLabel lblInfosWillUpdate = new JLabel("infos will update soon......");
		lblInfosWillUpdate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInfosWillUpdate.setBounds(314, 265, 201, 26);
		frame.getContentPane().add(lblInfosWillUpdate);
		
		JButton btnHome = new JButton("Home");
		btnHome.setBackground(Color.DARK_GRAY);
		btnHome.setForeground(Color.WHITE);
		btnHome.addActionListener(new ActionListener() {
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
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnHome.setBounds(348, 304, 148, 40);
		frame.getContentPane().add(btnHome);
	}
}
