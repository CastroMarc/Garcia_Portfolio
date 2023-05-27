import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class home extends JFrame {

	private JPanel home;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
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
	public home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 844, 540);
		home = new JPanel();
		home.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(home);
		setLocationRelativeTo(null);
		home.setLayout(null);
		
		//About Me
		JButton btnAbtme = new JButton("");
		btnAbtme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AboutMe abtMe = new AboutMe();
				abtMe.setVisible(true);
				dispose();
			}
		});
		btnAbtme.setIcon(new ImageIcon("/Users/luiz/Downloads/Button_BG (2)/4.png"));
		btnAbtme.setBounds(90, 396, 214, 73);
		home.add(btnAbtme);
		
		//Skills and Abilities
		JButton btnsklls = new JButton("");
		btnsklls.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SkillsAndAbilities Sklls = new SkillsAndAbilities();
				Sklls.setVisible(true);
				dispose();
			}
		});
		btnsklls.setIcon(new ImageIcon("/Users/luiz/Downloads/Button_BG (2)/5.png"));
		btnsklls.setBounds(316, 396, 214, 73);
		home.add(btnsklls);
		
		//Achievements
		JButton btnAchvmnts = new JButton("");
		btnAchvmnts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Achievements Achvmnts = new Achievements();
				Achvmnts.setVisible(true);
				dispose();
			}
		});
		btnAchvmnts.setIcon(new ImageIcon("/Users/luiz/Downloads/Button_BG (2)/6.png"));
		btnAchvmnts.setBounds(542, 396, 214, 73);
		home.add(btnAchvmnts);
		
		JLabel homeBG = new JLabel("");
		homeBG.setIcon(new ImageIcon("/Users/luiz/Downloads/Garcia_portfolio/1.png"));
		homeBG.setBounds(0, 0, 844, 512);
		home.add(homeBG);
		
	}
}
