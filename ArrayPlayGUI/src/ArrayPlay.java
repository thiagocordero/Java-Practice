import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class ArrayPlay extends JFrame {	
	
	int selected = 0;
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
					ArrayPlay frame = new ArrayPlay();
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
	@SuppressWarnings("unchecked")
	public ArrayPlay() {
		
		setBounds(100, 100, 350, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JSpinner spinnerNumberToAdd = new JSpinner();
		spinnerNumberToAdd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		spinnerNumberToAdd.setBounds(28, 31, 40, 38);
		getContentPane().add(spinnerNumberToAdd);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBounds(100, 28, 89, 23);
		getContentPane().add(btnAdd);
		
		JButton btnRemove = new JButton("REMOVE");
		btnRemove.setBounds(100, 73, 89, 23);
		getContentPane().add(btnRemove);
		
		JButton btnOrder = new JButton("ORDER");
		btnOrder.setBounds(100, 118, 89, 23);
		getContentPane().add(btnOrder);
		
		JLabel lblArray = new JLabel("array");
		lblArray.setBounds(230, 32, 40, 14);
		getContentPane().add(lblArray);
		
		JLabel lblSelected = new JLabel("[0]");
		lblSelected.setBounds(263, 31, 20, 14);
		getContentPane().add(lblSelected);
		
		@SuppressWarnings("rawtypes")
		JList JListArray = new JList();
		JListArray.setBounds(215, 57, 98, 125);
		getContentPane().add(JListArray);
		
		

		
		// CODING
		
		// Change the selected Item
		JListArray.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				selected = JListArray.getSelectedIndex();
				lblSelected.setText("[" + selected + "]");
			}
		});
		
		// Create and Set List
		int array[] = new int[5];
		DefaultListModel<Integer> listArray = new DefaultListModel<Integer>();
		JListArray.setModel(listArray);
		
		for (int i = 0; i < array.length; i++) {
			listArray.addElement(array[i]);
		}
		
		
		
		// BUTTON ADD
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// The selected position in the array receives the number chosen in the spinner	
				array[selected] = Integer.parseInt(spinnerNumberToAdd.getValue().toString());
				// Clean the List and Add New elements
				listArray.removeAllElements();
				for (int i = 0; i < array.length; i++) {
					listArray.addElement(array[i]);
				}
				
			}
		});
		
		// BUTTON REMOVE
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				array[selected] = 0;
				listArray.removeAllElements();
				for (int i = 0; i < array.length; i++) {
					listArray.addElement(array[i]);
				}
				
			}
		});
		
		// BUTTON ORDER
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arrays.sort(array);
				listArray.removeAllElements();
				for (int i = 0; i < array.length; i++) {
					listArray.addElement(array[i]);
				}
			}
			
		});

	}
}
