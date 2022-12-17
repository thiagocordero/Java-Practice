package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuadraticEquation extends JFrame {

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
					QuadraticEquation frame = new QuadraticEquation();
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
	public QuadraticEquation() {
		
		// GRAPHIC USER INTERFACE (SWING)
		
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		setBounds(100, 100, 450, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>X<sup>2</sup>+</html>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(118, 28, 40, 25);
		getContentPane().add(lblNewLabel);
		
		JLabel lblx = new JLabel("<html>X +</html>");
		lblx.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblx.setBounds(223, 32, 40, 25);
		getContentPane().add(lblx);
		
		JLabel lblx_1 = new JLabel("= 0");
		lblx_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblx_1.setBounds(327, 30, 40, 28);
		getContentPane().add(lblx_1);
		
		JSpinner txtA = new JSpinner();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtA.setBounds(63, 32, 45, 25);
		getContentPane().add(txtA);
		
		JSpinner txtB = new JSpinner();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtB.setBounds(163, 32, 45, 25);
		getContentPane().add(txtB);
		
		JSpinner txtC = new JSpinner();
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtC.setBounds(268, 32, 45, 25);
		getContentPane().add(txtC);
		
		JLabel lblA = new JLabel("A");
		lblA.setForeground(Color.RED);
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblA.setBounds(258, 100, 27, 25);
		getContentPane().add(lblA);
		
		JLabel lblB = new JLabel("B");
		lblB.setForeground(Color.RED);
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblB.setBounds(136, 100, 40, 25);
		getContentPane().add(lblB);
		
		JLabel lblC = new JLabel("C");
		lblC.setForeground(Color.RED);
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblC.setBounds(318, 100, 40, 25);
		getContentPane().add(lblC);
		
		JLabel lblNewLabel_1 = new JLabel("<html>&Delta = </html>");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(66, 94, 60, 37);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblX = new JLabel("<html><sup>2</sup> - 4  . </html> ");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblX.setBounds(163, 84, 91, 43);
		getContentPane().add(lblX);
		
		JLabel lblA_1 = new JLabel(".");
		lblA_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblA_1.setBounds(293, 100, 27, 25);
		getContentPane().add(lblA_1);
		
		JButton btnSolve = new JButton("<html>SOLVE </html>");
		btnSolve.setForeground(Color.BLUE);
		btnSolve.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSolve.setBounds(152, 150, 111, 23);
		getContentPane().add(btnSolve);
		
		JPanel panSolution = new JPanel();
		panSolution.setBounds(65, 190, 304, 83);
		getContentPane().add(panSolution);
		panSolution.setLayout(null);
		panSolution.setVisible(false);
		
		JLabel lblNewLabel_2 = new JLabel("<html>&Delta Value</html>");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 15, 85, 25);
		panSolution.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Roots");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(10, 50, 128, 25);
		panSolution.add(lblNewLabel_2_1);
		
		JLabel lblDeltaValue = new JLabel("0");
		lblDeltaValue.setForeground(Color.BLUE);
		lblDeltaValue.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDeltaValue.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDeltaValue.setBounds(166, 15, 128, 25);
		panSolution.add(lblDeltaValue);
		
		JLabel lblRoot2 = new JLabel("0");
		lblRoot2.setForeground(Color.BLUE);
		lblRoot2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRoot2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRoot2.setBounds(252, 50, 42, 25);
		panSolution.add(lblRoot2);
		
		JLabel lblRootsAnd = new JLabel("and");
		lblRootsAnd.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRootsAnd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRootsAnd.setBounds(56, 51, 183, 25);
		panSolution.add(lblRootsAnd);
		
		JLabel lblRoot1 = new JLabel("0");
		lblRoot1.setForeground(Color.BLUE);
		lblRoot1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRoot1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRoot1.setBounds(144, 50, 42, 25);
		panSolution.add(lblRoot1);
		
		// CODING
		
		// Reproducing changes in the spinners A, B and C
		txtA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblA.setText(txtA.getValue().toString());
			}
		});
		txtB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblB.setText(txtB.getValue().toString());
			}
		});
		txtC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblC.setText(txtC.getValue().toString());
			}
		});
		
		// Solving Button
		btnSolve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panSolution.setVisible(true);
				
				// Solving Delta
				int a = Integer.parseInt(txtA.getValue().toString());
				int b = Integer.parseInt(txtB.getValue().toString());
				int c = Integer.parseInt(txtC.getValue().toString());
				double delta = Math.pow(b, 2) - 4 * a * c;
				lblDeltaValue.setText(String.format("%.2f",delta));
				// Solving Roots
				
				if (delta < 0) {
					lblRoot1.setVisible(false);
					lblRoot2.setVisible(false);
					lblRootsAnd.setText("Imaginary and Unequal");
				} else if (delta > 0) {
					double root1 = (- b + Math.sqrt(delta)) / (2 * a);
					double root2 = (- b - Math.sqrt(delta)) / (2 * a);
					lblRoot1.setText(String.format("%.2f",  root1));
					lblRoot2.setText(String.format("%.2f", root2));
				} else if (delta == 0) {
		
					
				}
				
				
			}
		});

	}
}
