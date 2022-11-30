package tarefas.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JProgressBar;
import javax.swing.DropMode;
import javax.swing.ListSelectionModel;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Font;
import java.awt.Choice;
import javax.swing.SpinnerNumberModel;
import java.awt.ComponentOrientation;
import java.awt.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class PaginaTarefas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField input_nomeTarefa;
	private JTextField input_descricaoTarefa;
	private JTextField textField_1;
	private JTextField textField_3;
	
	String[] listaVazia;
	String[] listaAcademico = {"estudar 1", "estudar 2"};
	String[] listaPessoal = {"arrumar casa", "cozinhar", "lavar louça"};
	String[] listaProfissional = {"alura"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaginaTarefas frame = new PaginaTarefas();
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
	public PaginaTarefas() {
		
		this.setLocationRelativeTo(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(139, 235, 1, 1);
		contentPane.add(table);
		
		JPanel panel_categoria = new JPanel();
		panel_categoria.setBorder(new TitledBorder(null, "CATEGORIA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_categoria.setBounds(10, 11, 215, 116);
		contentPane.add(panel_categoria);
		
		JRadioButton radioBtn_tarefasPessoais = new JRadioButton("Pessoal");
		radioBtn_tarefasPessoais.setBounds(6, 22, 104, 23);
		
		JRadioButton radioBtn_tarefasAcademicas = new JRadioButton("Acadêmico");
		radioBtn_tarefasAcademicas.setBounds(6, 74, 104, 23);
		
		JRadioButton radioBtn_tarefasProfissionais = new JRadioButton("Profissional");
		radioBtn_tarefasProfissionais.setBounds(6, 48, 104, 23);
		
		panel_categoria.setLayout(null);
		panel_categoria.add(radioBtn_tarefasPessoais);
		panel_categoria.add(radioBtn_tarefasAcademicas);
		panel_categoria.add(radioBtn_tarefasProfissionais);

	
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(25);
		progressBar.setBounds(134, 31, 61, 14);
		panel_categoria.add(progressBar);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setValue(100);
		progressBar_1.setBounds(134, 57, 61, 14);
		panel_categoria.add(progressBar_1);
		
		JProgressBar progressBar_1_1 = new JProgressBar();
		progressBar_1_1.setValue(50);
		progressBar_1_1.setBounds(134, 83, 61, 14);
		panel_categoria.add(progressBar_1_1);
		
	
	
		JPanel panel_adicionarTarefa = new JPanel();
		panel_adicionarTarefa.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "ADICIONAR TAREFA", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_adicionarTarefa.setBounds(10, 138, 215, 230);
		contentPane.add(panel_adicionarTarefa);
		panel_adicionarTarefa.setLayout(null);
		
		JLabel label_nometarefa = new JLabel("Tarefa");
		label_nometarefa.setBounds(10, 21, 75, 14);
		panel_adicionarTarefa.add(label_nometarefa);
		
		input_nomeTarefa = new JTextField();
		input_nomeTarefa.setBounds(72, 21, 133, 20);
		panel_adicionarTarefa.add(input_nomeTarefa);
		input_nomeTarefa.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Urgência");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(10, 49, 67, 14);
		panel_adicionarTarefa.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Dificuldade");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1.setBounds(10, 74, 52, 14);
		panel_adicionarTarefa.add(lblNewLabel_1_1_1);
		
		JComboBox comboBox_dificuldade = new JComboBox();
		comboBox_dificuldade.setModel(new DefaultComboBoxModel(new String[] {"Fácil", "Médio ", "Sênior"}));
		comboBox_dificuldade.setBounds(72, 71, 133, 18);
		panel_adicionarTarefa.add(comboBox_dificuldade);
		
		JComboBox comboBox_urgencia = new JComboBox();
		comboBox_urgencia.setModel(new DefaultComboBoxModel(new String[] {"Urgente", "Importante", "Quando Possível", "Rotina"}));
		comboBox_urgencia.setBounds(72, 46, 133, 18);
		panel_adicionarTarefa.add(comboBox_urgencia);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Tempo");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1.setBounds(10, 101, 110, 14);
		panel_adicionarTarefa.add(lblNewLabel_1_1_1_1);
		
		JComboBox comboBox_tempo = new JComboBox();
		comboBox_tempo.setModel(new DefaultComboBoxModel(new String[] {"Até 30 min", "1 hora", "Entre 1 e 3 horas", "Entre 3 e 5 horas"}));
		comboBox_tempo.setBounds(72, 97, 133, 18);
		panel_adicionarTarefa.add(comboBox_tempo);
		
		JButton btnAdicionar = new JButton("ADICIONAR");
		btnAdicionar.setBounds(10, 198, 195, 23);
		panel_adicionarTarefa.add(btnAdicionar);
		
		input_descricaoTarefa = new JTextField();
		input_descricaoTarefa.setColumns(10);
		input_descricaoTarefa.setBounds(72, 129, 133, 58);
		panel_adicionarTarefa.add(input_descricaoTarefa);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Descrição");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_1.setBounds(10, 126, 110, 14);
		panel_adicionarTarefa.add(lblNewLabel_1_1_1_1_1);
		
		JPanel panel_direita = new JPanel();
		panel_direita.setBounds(235, 11, 189, 357);
		contentPane.add(panel_direita);
		panel_direita.setLayout(null);
		
		
		
		JButton btnMarcarConcluido = new JButton("Marcar como Concluído");
		btnMarcarConcluido.setBounds(0, 326, 189, 23);
		panel_direita.add(btnMarcarConcluido);
		
		JPanel panel_descricaoTarefa = new JPanel();
		panel_descricaoTarefa.setBounds(10, 134, 169, 181);
		panel_direita.add(panel_descricaoTarefa);
		panel_descricaoTarefa.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(84, 21, 1, 1);
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "ADICIONAR TAREFA", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_descricaoTarefa.add(panel_4);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tarefa");
		lblNewLabel_1_2.setBounds(10, 21, 75, 14);
		panel_4.add(lblNewLabel_1_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(72, 21, 133, 20);
		panel_4.add(textField_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Urgência");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_2.setBounds(10, 49, 67, 14);
		panel_4.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Dificuldade");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_2.setBounds(10, 74, 52, 14);
		panel_4.add(lblNewLabel_1_1_1_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(72, 71, 133, 18);
		panel_4.add(comboBox_3);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(72, 46, 133, 18);
		panel_4.add(comboBox_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Tempo");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_2.setBounds(10, 101, 110, 14);
		panel_4.add(lblNewLabel_1_1_1_1_2);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setBounds(72, 97, 133, 18);
		panel_4.add(comboBox_2_1);
		
		JButton btnNewButton_1_1 = new JButton("ADICIONAR");
		btnNewButton_1_1.setBounds(10, 198, 195, 23);
		panel_4.add(btnNewButton_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(72, 129, 133, 58);
		panel_4.add(textField_3);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Descrição");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_1_1.setBounds(10, 126, 110, 14);
		panel_4.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel show_urgencia = new JLabel("Urgência: ");
		show_urgencia.setFont(new Font("Tahoma", Font.PLAIN, 11));
		show_urgencia.setBounds(10, 49, 67, 14);
		panel_descricaoTarefa.add(show_urgencia);
		
		JLabel show_dificuldade = new JLabel("Dificuldade: ");
		show_dificuldade.setFont(new Font("Tahoma", Font.PLAIN, 11));
		show_dificuldade.setBounds(10, 74, 67, 14);
		panel_descricaoTarefa.add(show_dificuldade);
		
		JLabel show_tempo = new JLabel("Tempo: ");
		show_tempo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		show_tempo.setBounds(10, 101, 110, 14);
		panel_descricaoTarefa.add(show_tempo);
		
		JLabel show_descricao = new JLabel("Descrição: ");
		show_descricao.setFont(new Font("Tahoma", Font.PLAIN, 11));
		show_descricao.setBounds(10, 126, 110, 14);
		panel_descricaoTarefa.add(show_descricao);
		
		JLabel show_tarefa = new JLabel("Tarefa: ");
		show_tarefa.setFont(new Font("Tahoma", Font.PLAIN, 11));
		show_tarefa.setBounds(10, 24, 67, 14);
		panel_descricaoTarefa.add(show_tarefa);
		
		
		
		JList list_listaTarefas = new JList();
		list_listaTarefas.setBounds(10, 11, 169, 112);
		panel_direita.add(list_listaTarefas);
		
		
		// INICIO - SELECIONAR CATEGORIA  
		radioBtn_tarefasAcademicas.addActionListener(e -> {
			if(radioBtn_tarefasAcademicas.isSelected() == true) { // Se ativar "Academico"
				radioBtn_tarefasPessoais.setSelected(false); // Tira o selecionado "Pessoal"
				radioBtn_tarefasProfissionais.setSelected(false); // Tira o selecionado "Profissional"
				list_listaTarefas.setListData(listaAcademico); // Seleciona a lista de tarefas "Academico"	
			}
		});
		radioBtn_tarefasPessoais.addActionListener(e -> {
			if(radioBtn_tarefasPessoais.isSelected() == true) {
				radioBtn_tarefasAcademicas.setSelected(false);
				radioBtn_tarefasProfissionais.setSelected(false);
				list_listaTarefas.setListData(listaPessoal);
			}
		});			
		radioBtn_tarefasProfissionais.addActionListener(e -> {
			if(radioBtn_tarefasProfissionais.isSelected() == true) {						
				radioBtn_tarefasPessoais.setSelected(false);
				radioBtn_tarefasAcademicas.setSelected(false);
				list_listaTarefas.setListData(listaProfissional);
			}
		});
		// FIM - SELECIONAR CATEGORIA
		
		// INICIO - ADICIONAR TAREFA  	
		btnAdicionar.addActionListener(evt ->{
			if(radioBtn_tarefasAcademicas.isSelected()) {
				// Lê o campo do nome da nova tarefa
				String novaTarefa = input_nomeTarefa.getText(); 
				// Redimensiona o Array
				String[] novaListaAcademico = new String[listaAcademico.length + 1];
				System.arraycopy(listaAcademico, 0, novaListaAcademico, 0, listaAcademico.length);	
				// Adiciona Tarefa ao Array
				novaListaAcademico[listaAcademico.length] = novaTarefa;
				// Atualiza Array
				listaAcademico = novaListaAcademico;
				list_listaTarefas.setListData(listaAcademico);
			}
			
			else if(radioBtn_tarefasPessoais.isSelected()) {
				String novaTarefa = input_nomeTarefa.getText();
				String[] novaListaPessoal = new String[listaPessoal.length + 1];
				System.arraycopy(listaPessoal, 0, novaListaPessoal, 0, listaPessoal.length);
				novaListaPessoal[listaPessoal.length] = novaTarefa;
				listaPessoal = novaListaPessoal;
				list_listaTarefas.setListData(listaPessoal);
			}
			else if(radioBtn_tarefasProfissionais.isSelected()) {
				String novaTarefa = input_nomeTarefa.getText();
				String[] novaListaProfissional = new String[listaProfissional.length + 1];
				System.arraycopy(listaProfissional, 0, novaListaProfissional, 0, listaProfissional.length);
				novaListaProfissional[listaProfissional.length] = novaTarefa;
				listaProfissional = novaListaProfissional;
				list_listaTarefas.setListData(listaProfissional);
			}
			else {
				JOptionPane.showMessageDialog(show_descricao, "Escolha uma Categoria!");
			}
			
			input_nomeTarefa.setText(null);
			// Limpar os campos depois de adicionar
			
		// FIM - ADICIONAR TAREFA 	
					
			
					
				});
				
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
