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

import tarefas.entidades.Tarefas;

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
import java.util.ArrayList;
import java.util.Arrays;

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
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class PaginaTarefas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField input_nomeTarefa;
	private JTextField input_descricaoTarefa;
	private JTextField textField_3;


	String[] listaAcademico = new String[] {"estudar 1", "estudar 2"};
	String[] listaPessoal = new String[] {"arrumar casa", "cozinhar", "lavar louça"};
	String[] listaProfissional = new String[] {"alura"};
	/*
	Tarefas[] lista=new Tarefas[4];

	public void inserir(Tarefas tarefa) {
		
		 lista[0]=tarefa;
	}
	*/
	
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
		
		JPanel panel_categoria = new JPanel();
		panel_categoria.setBorder(new TitledBorder(null, "CATEGORIA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_categoria.setBounds(10, 11, 215, 116);
		contentPane.add(panel_categoria);
		
		JRadioButton radioBtn_tarefasPessoais = new JRadioButton("Pessoal");
		radioBtn_tarefasPessoais.setBounds(18, 22, 104, 23);
		
		JRadioButton radioBtn_tarefasAcademicas = new JRadioButton("Acadêmico");
		radioBtn_tarefasAcademicas.setBounds(18, 74, 104, 23);
		
		JRadioButton radioBtn_tarefasProfissionais = new JRadioButton("Profissional");
		radioBtn_tarefasProfissionais.setBounds(18, 48, 104, 23);
		
		panel_categoria.setLayout(null);
		panel_categoria.add(radioBtn_tarefasPessoais);
		panel_categoria.add(radioBtn_tarefasAcademicas);
		panel_categoria.add(radioBtn_tarefasProfissionais);
	
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
		
		JLabel label_urgencia = new JLabel("Urgência");
		label_urgencia.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_urgencia.setBounds(10, 49, 67, 14);
		panel_adicionarTarefa.add(label_urgencia);
		
		JLabel label_dificuldade = new JLabel("Dificuldade");
		label_dificuldade.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_dificuldade.setBounds(10, 74, 52, 14);
		panel_adicionarTarefa.add(label_dificuldade);
		
		JComboBox comboBox_dificuldade = new JComboBox();
		comboBox_dificuldade.setModel(new DefaultComboBoxModel(new String[] {"Fácil", "Médio ", "Sênior"}));
		comboBox_dificuldade.setBounds(72, 71, 133, 18);
		panel_adicionarTarefa.add(comboBox_dificuldade);
		
		JComboBox comboBox_urgencia = new JComboBox();
		comboBox_urgencia.setModel(new DefaultComboBoxModel(new String[] {"Urgente", "Importante", "Quando Possível", "Rotina"}));
		comboBox_urgencia.setBounds(72, 46, 133, 18);
		panel_adicionarTarefa.add(comboBox_urgencia);
		
		JLabel label_tempo = new JLabel("Tempo");
		label_tempo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_tempo.setBounds(10, 101, 110, 14);
		panel_adicionarTarefa.add(label_tempo);
		
		JComboBox comboBox_tempo = new JComboBox();
		comboBox_tempo.setModel(new DefaultComboBoxModel(new String[] {"Até 30 min", "1 hora", "Entre 1 e 3 horas", "Entre 3 e 5 horas"}));
		comboBox_tempo.setBounds(72, 97, 133, 18);
		panel_adicionarTarefa.add(comboBox_tempo);
		
		JButton btnAdicionar = new JButton("ADICIONAR");
		btnAdicionar.setBounds(10, 198, 195, 23);
		panel_adicionarTarefa.add(btnAdicionar);
		
		input_descricaoTarefa = new JTextField();
		input_descricaoTarefa.setHorizontalAlignment(SwingConstants.LEFT);
		input_descricaoTarefa.setColumns(10);
		input_descricaoTarefa.setBounds(72, 129, 133, 58);
		panel_adicionarTarefa.add(input_descricaoTarefa);
		
		JLabel label_descricao = new JLabel("Descrição");
		label_descricao.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_descricao.setBounds(10, 126, 110, 14);
		panel_adicionarTarefa.add(label_descricao);
		
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
		
		JLabel show_tarefa = new JLabel("Tarefa: ");
		show_tarefa.setFont(new Font("Tahoma", Font.PLAIN, 11));
		show_tarefa.setBounds(10, 24, 149, 14);
		panel_descricaoTarefa.add(show_tarefa);
		
		JLabel show_urgencia = new JLabel("Urgência: ");
		show_urgencia.setFont(new Font("Tahoma", Font.PLAIN, 11));
		show_urgencia.setBounds(10, 49, 149, 14);
		panel_descricaoTarefa.add(show_urgencia);
		
		JLabel show_dificuldade = new JLabel("Dificuldade: ");
		show_dificuldade.setFont(new Font("Tahoma", Font.PLAIN, 11));
		show_dificuldade.setBounds(10, 74, 149, 14);
		panel_descricaoTarefa.add(show_dificuldade);
		
		JLabel show_tempo = new JLabel("Tempo: ");
		show_tempo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		show_tempo.setBounds(10, 101, 149, 14);
		panel_descricaoTarefa.add(show_tempo);
		
		JLabel show_descricao = new JLabel("Descrição: ");
		show_descricao.setVerticalAlignment(SwingConstants.TOP);
		show_descricao.setFont(new Font("Tahoma", Font.PLAIN, 11));
		show_descricao.setBounds(10, 126, 149, 44);
		panel_descricaoTarefa.add(show_descricao);
		
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
		});
			
			input_nomeTarefa.setText(null);
			// Limpar os campos depois de adicionar
		// FIM - ADICIONAR TAREFA
		
		// INICIO - MARCAR COMO CONCLUÍDO 	
		btnMarcarConcluido.addActionListener( evt -> {
			if(radioBtn_tarefasAcademicas.isSelected()) {
				// Ver a tarefa selecionada
				int selecionado = list_listaTarefas.getSelectedIndex();
				// Transformar em Array LIst e remover o selecionado
				ArrayList<String> listaArray = new ArrayList<String>(Arrays.asList(listaAcademico));
				listaArray.remove(selecionado);
				// Atualizar a lista de tarefas com a nova lista
				String[] novaLista = listaArray.toArray(new String[listaAcademico.length - 1]);
				listaAcademico = novaLista;
				list_listaTarefas.setListData(listaAcademico);				
			} else if (radioBtn_tarefasPessoais.isSelected()) {
				int selecionado = list_listaTarefas.getSelectedIndex();
				ArrayList<String> listaArray = new ArrayList<String>(Arrays.asList(listaPessoal));
				listaArray.remove(selecionado);
				String[] novaLista = listaArray.toArray(new String[listaPessoal.length - 1]);
				listaPessoal = novaLista;
				list_listaTarefas.setListData(listaPessoal);
			} else if (radioBtn_tarefasProfissionais.isSelected()) {
				int selecionado = list_listaTarefas.getSelectedIndex();
				ArrayList<String> listaArray = new ArrayList<String>(Arrays.asList(listaProfissional));
				listaArray.remove(selecionado);
				String[] novaLista = listaArray.toArray(new String[listaProfissional.length - 1]);
				listaProfissional = novaLista;
				list_listaTarefas.setListData(listaProfissional);	
			}	
		});
		// FIM - MARCAR COMO CONCLUÍDO
		
		// INICIO - MOSTRAR DETALHES AO SELECIONAR
		
		list_listaTarefas.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				int indexSelecionado = list_listaTarefas.getSelectedIndex();
				if (indexSelecionado != -1) {
					if(radioBtn_tarefasAcademicas.isSelected()) {
						String tarefaSelecionada = listaAcademico[indexSelecionado];
						show_tarefa.setText("Tarefa: " + tarefaSelecionada);
					} else if (radioBtn_tarefasPessoais.isSelected()) {
						String tarefaSelecionada = listaPessoal[indexSelecionado];
						show_tarefa.setText("Tarefa: " + tarefaSelecionada);	
					} else if (radioBtn_tarefasProfissionais.isSelected()) {
						String tarefaSelecionada = listaProfissional[indexSelecionado];
						show_tarefa.setText("Tarefa: " + tarefaSelecionada);
					}	
				}	
			}
		});		
		// FIM - MOSTRAR DETALHES AO SELECIONAR
		
		
				
		
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
