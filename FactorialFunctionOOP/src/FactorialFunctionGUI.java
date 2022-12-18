import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class FactorialFunctionGUI extends JFrame {

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
					FactorialFunctionGUI frame = new FactorialFunctionGUI();
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
	public FactorialFunctionGUI() {
		setBounds(100, 100, 310, 241);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JSpinner spinnerNum = new JSpinner();
		spinnerNum.setBounds(10, 25, 42, 31);
		getContentPane().add(spinnerNum);
		
		JButton btnFactorial = new JButton("!");
		btnFactorial.setBounds(72, 29, 89, 23);
		getContentPane().add(btnFactorial);
		
		JLabel lblFormula = new JLabel("");
		lblFormula.setBounds(10, 94, 274, 22);
		getContentPane().add(lblFormula);
		lblFormula.setForeground(Color.BLUE);
		lblFormula.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		// BUTTON FACTORIAL
		
		btnFactorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(spinnerNum.getValue().toString());
				Factorial f = new Factorial();
				f.setNum(n);
				lblFormula.setText(f.getFormula());
				//lblResult.setText(Integer.toString(f.getFactorial()));
			}
		});

	}
}
