package coding;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Guessing extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Guessing frame = new Guessing();
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
	public Guessing() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Guessing.class.getResource("/images/tiger.png")));
		lblNewLabel.setBounds(306, 92, 128, 144);
		getContentPane().add(lblNewLabel);
		
		JSpinner spinner_choice = new JSpinner();
		spinner_choice.setModel(new SpinnerNumberModel(0, 0, 5, 1));
		spinner_choice.setBounds(71, 180, 31, 23);
		getContentPane().add(spinner_choice);
		
		JButton btnGuess = new JButton("GUESS!");
		btnGuess.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnGuess.setBounds(112, 180, 101, 23);
		getContentPane().add(btnGuess);
		
		JLabel lblNewLabel_2 = new JLabel("<html> What number am I thinking of? </html>");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(71, 40, 142, 93);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lbl_answer = new JLabel("<html>It's between 1 and 5!</html>");
		lbl_answer.setForeground(new Color(255, 200, 0));
		lbl_answer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_answer.setBounds(71, 117, 159, 41);
		getContentPane().add(lbl_answer);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Guessing.class.getResource("/images/balloon.png")));
		lblNewLabel_1.setBounds(10, 11, 286, 226);
		getContentPane().add(lblNewLabel_1);
		
		
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n = 1+ Math.random() * (6-1);
				int value = (int) n;
				System.out.println(value);
				int choice = Integer.parseInt(spinner_choice.getValue().toString());
				String f1 = "<html>THAT'S RIGHT!!!</html>";
				String f2 = "<html>NOT REALLY! It was " + value + "</html>";
				String result = (value == choice) ? f1 : f2;
				lbl_answer.setText(result);
				
			}
		});

	}
}
