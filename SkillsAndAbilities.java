import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SkillsAndAbilities extends JFrame {

	private JPanel SkllsAndAblts;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkillsAndAbilities frame = new SkillsAndAbilities();
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
	public SkillsAndAbilities() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 844, 540);
		SkllsAndAblts = new JPanel();
		SkllsAndAblts.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(SkllsAndAblts);
		setLocationRelativeTo(null);
		SkllsAndAblts.setLayout(null);
		
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
		btnBack.setBounds(691, 446, 123, 32);
		SkllsAndAblts.add(btnBack);
		
		//BACKGROUND
		JLabel lblSkllsAndAbltsBG = new JLabel("");
		lblSkllsAndAbltsBG.setIcon(new ImageIcon("/Users/luiz/Downloads/Garcia_portfolio/3.png"));
		lblSkllsAndAbltsBG.setBounds(0, 0, 844, 512);
		SkllsAndAblts.add(lblSkllsAndAbltsBG);
		

	}

}
