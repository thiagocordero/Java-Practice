import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;

public class Counter extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Counter frame = new Counter();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Counter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSlider sliderStart = new JSlider();
		sliderStart.setMinimum(1);
		sliderStart.setMaximum(20);
		sliderStart.setValue(1);
		sliderStart.setBounds(116, 19, 200, 26);
		contentPane.add(sliderStart);
		
		JSlider sliderEnd = new JSlider();
		sliderEnd.setMinimum(1);
		sliderEnd.setMaximum(20);
		sliderEnd.setValue(1);
		sliderEnd.setBounds(116, 56, 200, 26);
		contentPane.add(sliderEnd);
		
		JSlider sliderIncreaseBy = new JSlider();
		sliderIncreaseBy.setMinimum(1);
		sliderIncreaseBy.setMaximum(20);
		sliderIncreaseBy.setValue(1);
		sliderIncreaseBy.setBounds(116, 93, 200, 26);
		contentPane.add(sliderIncreaseBy);
		
		JLabel lblNewLabel = new JLabel("START");
		lblNewLabel.setBounds(14, 19, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("END");
		lblNewLabel_1.setBounds(14, 56, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("INCREASE BY");
		lblNewLabel_1_1.setBounds(14, 93, 92, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblStart = new JLabel("1");
		lblStart.setBounds(326, 19, 46, 14);
		contentPane.add(lblStart);
		
		JLabel lblEnd = new JLabel("1");
		lblEnd.setBounds(326, 56, 46, 14);
		contentPane.add(lblEnd);
		
		JLabel lblIncreaseBy = new JLabel("1");
		lblIncreaseBy.setBounds(326, 93, 46, 14);
		contentPane.add(lblIncreaseBy);
		
		JButton btnNewButton = new JButton("COUNT!");
		btnNewButton.setBounds(148, 130, 89, 23);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(359, 19, 115, 131);
		contentPane.add(scrollPane);
		
		JList<Integer> listCounter = new JList<Integer>();
		scrollPane.setViewportView(listCounter);
		listCounter.setModel(new AbstractListModel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		// START
		sliderStart.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String start = Integer.toString(sliderStart.getValue());
				lblStart.setText(start);
			}
		});
		
		// END
		sliderEnd.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String end = Integer.toString(sliderEnd.getValue());
				lblEnd.setText(end);
			}
		});
		
		// INCREASE BY
		sliderIncreaseBy.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				String increaseBy = Integer.toString(sliderIncreaseBy.getValue());
				lblIncreaseBy.setText(increaseBy);
			}
		});
		
		// COUNT
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int start = sliderStart.getValue();
				int end = sliderEnd.getValue();
				int increaseBy = sliderIncreaseBy.getValue();
				
				DefaultListModel<Integer> list = new DefaultListModel<Integer>();
				for (int i = start; i <= end ; i += increaseBy) {
					list.addElement(i);			
				}
				listCounter.setModel(list);		
			}
		});		
		
	}
}
