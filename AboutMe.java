import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AboutMe extends JFrame {

	private JPanel abtMe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutMe frame = new AboutMe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AboutMe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 844, 540);
		abtMe = new JPanel();
		abtMe.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(abtMe);
		setLocationRelativeTo(null);
		abtMe.setLayout(null);
		
		//Back Button
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				home home = new home();
				home.setVisible(true);
				dispose();
			}
		});
		btnBack.setIcon(new ImageIcon("/Users/luiz/Downloads/Button_BG (2)/7.png"));
		btnBack.setBounds(660, 450, 121, 30);
		abtMe.add(btnBack);
		
		//BACKGROUND
		JLabel lblAboutMeBG = new JLabel("");
		lblAboutMeBG.setIcon(new ImageIcon("/Users/luiz/Downloads/Garcia_portfolio/2.png"));
		lblAboutMeBG.setBounds(0, 0, 844, 512);
		abtMe.add(lblAboutMeBG);
		
	}

}
