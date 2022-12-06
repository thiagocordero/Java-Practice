package tarefas.gui;

import tarefas.entidades.*;
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

import tarefas.entidades.Tarefa;

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
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PaginaTarefas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField input_nomeTarefa;
	private JTextArea input_descricaoTarefa;
	
	Tarefa t1 = new Tarefa("Terminar A3", "Concluir gerenciador de tarefas", "Urgente", "Médio", "Entre 3 e 5 horas");
	Tarefa t2 = new Tarefa("Estudar SQL", "Curso do Gustavo Guanabara", "Importante", "Fácil", "Entre 3 e 5 horas");
	Tarefa t3 = new Tarefa("Arrumar Quarto", "Organizar mesa e guarda-roupa", "Urgente", "Fácil", "1 hora");
	Tarefa t4 = new Tarefa("Academia", "Ir 4 vezes na semana", "Rotina", "Fácil", "1 hora");
	Tarefa t5 = new Tarefa("Cozinhar", "Fazer 10 marmitas para a semana", "Rotina", "Fácil", "Entre 1 e 3 horas");
	Tarefa t6 = new Tarefa("Atualizar LinkedIn", "Incluir cursos e certificados", "Quando Possível", "Médio", "Entre 1 e 3 horas");
	
	Tarefa[] listaAcademico = new Tarefa[] {t1, t2};
	Tarefa[] listaPessoal = new Tarefa[] {t3, t4, t5};
	Tarefa[] listaProfissional = new Tarefa[] {t6};

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
		setBounds(100, 100, 462, 404);
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
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 21, 75, 14);
		panel_adicionarTarefa.add(lblNome);
		
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
		comboBox_dificuldade.setModel(new DefaultComboBoxModel(new String[] {"", "Fácil", "Médio", "Sênior"}));
		comboBox_dificuldade.setBounds(72, 71, 133, 18);
		panel_adicionarTarefa.add(comboBox_dificuldade);
		
		JComboBox comboBox_urgencia = new JComboBox();
		comboBox_urgencia.setModel(new DefaultComboBoxModel(new String[] {"", "Urgente", "Importante", "Quando Possível", "Rotina"}));
		comboBox_urgencia.setBounds(72, 46, 133, 18);
		panel_adicionarTarefa.add(comboBox_urgencia);
		
		JLabel label_tempo = new JLabel("Tempo");
		label_tempo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_tempo.setBounds(10, 101, 110, 14);
		panel_adicionarTarefa.add(label_tempo);
		
		JComboBox comboBox_tempo = new JComboBox();
		comboBox_tempo.setModel(new DefaultComboBoxModel(new String[] {"", "Até 30 min", "1 hora", "Entre 1 e 3 horas", "Entre 3 e 5 horas"}));
		comboBox_tempo.setBounds(72, 97, 133, 18);
		panel_adicionarTarefa.add(comboBox_tempo);
		
		JButton btnAdicionar = new JButton("ADICIONAR");
		btnAdicionar.setBounds(10, 199, 195, 20);
		panel_adicionarTarefa.add(btnAdicionar);
		
		JButton btnSalvarEditado = new JButton("SALVAR ALTERAÇÕES");
		btnSalvarEditado.setBounds(10, 198, 195, 20);
		panel_adicionarTarefa.add(btnSalvarEditado);
		btnSalvarEditado.setVisible(false);
		
		input_descricaoTarefa = new JTextArea();
		input_descricaoTarefa.setLineWrap(true);
		input_descricaoTarefa.setWrapStyleWord(true);
		input_descricaoTarefa.setColumns(10);
		input_descricaoTarefa.setBounds(72, 129, 133, 58);
		panel_adicionarTarefa.add(input_descricaoTarefa);
		
		JLabel label_descricao = new JLabel("Descrição");
		label_descricao.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_descricao.setBounds(10, 126, 110, 14);
		panel_adicionarTarefa.add(label_descricao);
		
		JPanel panel_direita = new JPanel();
		panel_direita.setBounds(235, 11, 201, 357);
		contentPane.add(panel_direita);
		panel_direita.setLayout(null);
		
		
		JButton btnMarcarConcluido = new JButton("CONCLUIR");
		btnMarcarConcluido.setBounds(106, 326, 95, 20);
		panel_direita.add(btnMarcarConcluido);
		
		JButton btnEditar = new JButton("EDITAR");
		btnEditar.setBounds(0, 326, 95, 20);
		panel_direita.add(btnEditar);
		
		JPanel panel_descricaoTarefa = new JPanel();
		panel_descricaoTarefa.setBounds(0, 134, 201, 181);
		panel_direita.add(panel_descricaoTarefa);
		panel_descricaoTarefa.setLayout(null);
		
		JLabel show_tarefa = new JLabel("Tarefa: ");
		show_tarefa.setFont(new Font("Tahoma", Font.PLAIN, 11));
		show_tarefa.setBounds(10, 25, 149, 14);
		panel_descricaoTarefa.add(show_tarefa);
		
		JLabel show_urgencia = new JLabel("Urgência: ");
		show_urgencia.setFont(new Font("Tahoma", Font.PLAIN, 11));
		show_urgencia.setBounds(10, 50, 149, 14);
		panel_descricaoTarefa.add(show_urgencia);
		
		JLabel show_dificuldade = new JLabel("Dificuldade: ");
		show_dificuldade.setFont(new Font("Tahoma", Font.PLAIN, 11));
		show_dificuldade.setBounds(10, 75, 149, 14);
		panel_descricaoTarefa.add(show_dificuldade);
		
		JLabel show_tempo = new JLabel("Tempo: ");
		show_tempo.setVerticalTextPosition(SwingConstants.TOP);
		show_tempo.setVerticalAlignment(SwingConstants.TOP);
		show_tempo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		show_tempo.setBounds(10, 100, 149, 14);
		panel_descricaoTarefa.add(show_tempo);
		
		JTextPane show_descricao = new JTextPane();
		show_descricao.setBackground(new Color(240, 240, 240));
		show_descricao.setFont(new Font("Tahoma", Font.PLAIN, 11));
		show_descricao.setBounds(7, 120, 149, 44);
		panel_descricaoTarefa.add(show_descricao);
		
		JList list_listaTarefas = new JList();
		list_listaTarefas.setValueIsAdjusting(true);
		list_listaTarefas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		DefaultListModel model = new DefaultListModel();
		list_listaTarefas.setModel(model);
		list_listaTarefas.setBounds(0, 11, 201, 100);
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
	
	
		// INICIO - BOTAO ADICIONAR TAREFA  	
		btnAdicionar.addActionListener(evt ->{
			
			// Lê os campos da nova tarefa
			Tarefa novaTarefa = new Tarefa();
			novaTarefa.setNomeTarefa(input_nomeTarefa.getText());
			novaTarefa.setDificuldadeTarefa(comboBox_dificuldade.getSelectedItem().toString());
			novaTarefa.setUrgenciaTarefa(comboBox_urgencia.getSelectedItem().toString());
			novaTarefa.setTempoTarefa(comboBox_tempo.getSelectedItem().toString());
			novaTarefa.setDescricaoTarefa(input_descricaoTarefa.getText());
			
			if (input_nomeTarefa.getText() != null) {
				if(radioBtn_tarefasAcademicas.isSelected()) {
					// Redimensiona o Array
					Tarefa[] novaLista = new Tarefa[listaAcademico.length + 1];
					System.arraycopy(listaAcademico, 0, novaLista, 0, listaAcademico.length);
					// Adiciona Tarefa ao Array
					novaLista[listaAcademico.length] = novaTarefa;
					// Atualiza Array
					listaAcademico = novaLista;
					list_listaTarefas.setListData(listaAcademico);
					
				} else if (radioBtn_tarefasPessoais.isSelected()) {
					Tarefa[] novaLista = new Tarefa[listaPessoal.length + 1];
					System.arraycopy(listaPessoal, 0, novaLista, 0, listaPessoal.length);
					novaLista[listaPessoal.length] = novaTarefa;
					listaPessoal = novaLista;
					list_listaTarefas.setListData(listaPessoal);	
				} else if  (radioBtn_tarefasProfissionais.isSelected()) {
					Tarefa[] novaLista = new Tarefa[listaProfissional.length + 1];
					System.arraycopy(listaProfissional, 0, novaLista, 0, listaProfissional.length);
					novaLista[listaProfissional.length] = novaTarefa;
					listaProfissional = novaLista;
					list_listaTarefas.setListData(listaProfissional);
				} else {
					JOptionPane.showMessageDialog(show_descricao, "Escolha uma Categoria!");
				}
				// Limpar áreas escritas depois de adicionar
				input_nomeTarefa.setText(null);	
				input_descricaoTarefa.setText(null);
				comboBox_dificuldade.setSelectedIndex(0);
				comboBox_tempo.setSelectedIndex(0);
				comboBox_urgencia.setSelectedIndex(0);
			}			
		});
		// FIM - ADICIONAR TAREFA
		
		// INICIO - MOSTRAR DETALHES AO SELECIONAR
		
		list_listaTarefas.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				int indexSelecionado = list_listaTarefas.getSelectedIndex();
				if (indexSelecionado == -1) {
					show_tarefa.setText("Tarefa: ");
					show_dificuldade.setText("Dificuldade: ");
					show_urgencia.setText("Urgência: ");
					show_tempo.setText("Tempo: ");
					show_descricao.setText("Descrição: ");	
				}
				else {
					if(radioBtn_tarefasAcademicas.isSelected()) {
						Tarefa tarefaSelecionada = listaAcademico[indexSelecionado];
						show_tarefa.setText("Tarefa: " + tarefaSelecionada.getNomeTarefa());
						show_dificuldade.setText("Dificuldade: " + tarefaSelecionada.getDificuldadeTarefa());
						show_urgencia.setText("Urgência: " + tarefaSelecionada.getUrgenciaTarefa());
						show_tempo.setText("Tempo: " + tarefaSelecionada.getTempoTarefa());
						show_descricao.setText("Descrição: " + tarefaSelecionada.getDescricaoTarefa());
					} else if (radioBtn_tarefasPessoais.isSelected()) {
						Tarefa tarefaSelecionada = listaPessoal[indexSelecionado];
						show_tarefa.setText("Tarefa: " + tarefaSelecionada.getNomeTarefa());
						show_dificuldade.setText("Dificuldade: " + tarefaSelecionada.getDificuldadeTarefa());
						show_urgencia.setText("Urgência: " + tarefaSelecionada.getUrgenciaTarefa());
						show_tempo.setText("Tempo: " + tarefaSelecionada.getTempoTarefa());
						show_descricao.setText("Descrição: " + tarefaSelecionada.getDescricaoTarefa());
					} else if (radioBtn_tarefasProfissionais.isSelected()) {
						Tarefa tarefaSelecionada = listaProfissional[indexSelecionado];
						show_tarefa.setText("Tarefa: " + tarefaSelecionada);
						show_tarefa.setText("Tarefa: " + tarefaSelecionada.getNomeTarefa());
						show_dificuldade.setText("Dificuldade: " + tarefaSelecionada.getDificuldadeTarefa());
						show_urgencia.setText("Urgência: " + tarefaSelecionada.getUrgenciaTarefa());
						show_tempo.setText("Tempo: " + tarefaSelecionada.getTempoTarefa());
						show_descricao.setText("Descrição: " + tarefaSelecionada.getDescricaoTarefa());
					}	
				}	
			}
		});		
		// FIM - MOSTRAR DETALHES AO SELECIONAR
		
		// INICIO - MARCAR COMO CONCLUÍDO
		btnMarcarConcluido.addActionListener(evt -> {
			if (radioBtn_tarefasAcademicas.isSelected()) {
				// Ver a tarefa selecionada
				int selecionado = list_listaTarefas.getSelectedIndex();
				// Remover o selecionado
				Tarefa[] novaLista = new Tarefa[listaAcademico.length - 1];
				System.arraycopy(listaAcademico, 0, novaLista, 0, selecionado);
				if (listaAcademico.length != selecionado) {
					 System.arraycopy(listaAcademico, selecionado + 1, novaLista, selecionado, listaAcademico.length - selecionado - 1);
			    }
				// Atualizar a lista de tarefas com a nova lista
				listaAcademico = novaLista;
				list_listaTarefas.setListData(listaAcademico);
			} else if (radioBtn_tarefasPessoais.isSelected()) {
				int selecionado = list_listaTarefas.getSelectedIndex();
				Tarefa[] novaLista = new Tarefa[listaPessoal.length - 1];
				System.arraycopy(listaPessoal, 0, novaLista, 0, selecionado);
				if (listaPessoal.length != selecionado) {
					 System.arraycopy(listaPessoal, selecionado + 1, novaLista, selecionado, listaPessoal.length - selecionado - 1);
			    }
				listaPessoal = novaLista;
				list_listaTarefas.setListData(listaPessoal);
			} else if(radioBtn_tarefasProfissionais.isSelected()) {
				int selecionado = list_listaTarefas.getSelectedIndex();
				Tarefa[] novaLista = new Tarefa[listaProfissional.length - 1];
				System.arraycopy(listaProfissional, 0, novaLista, 0, selecionado);
				if (listaProfissional.length != selecionado) {
					 System.arraycopy(listaProfissional, selecionado + 1, novaLista, selecionado, listaProfissional.length - selecionado - 1);
			    }
				listaProfissional = novaLista;
				list_listaTarefas.setListData(listaProfissional); 
			}
		});
		// FIM - MARCAR COMO CONCLUÍDO
		
		
		// INICIO - EDITAR TAREFA
		btnEditar.addActionListener( evt -> {
			if (radioBtn_tarefasAcademicas.isSelected()) {
				// Identifica a tarefa selecionada no Array de Objetos
				int selecionado = list_listaTarefas.getSelectedIndex();
				Tarefa tarefaSelecionada = listaAcademico[selecionado];
				// Inputs e ComboBox recebem os valores salvos
				input_nomeTarefa.setText(tarefaSelecionada.getNomeTarefa());
				comboBox_dificuldade.setSelectedItem(tarefaSelecionada.getDificuldadeTarefa());
				comboBox_urgencia.setSelectedItem(tarefaSelecionada.getUrgenciaTarefa());
				comboBox_tempo.setSelectedItem(tarefaSelecionada.getTempoTarefa());
				input_descricaoTarefa.setText(tarefaSelecionada.getDescricaoTarefa());
				// Botão "ADICIONAR" muda para "SALVAR ALTERAÇÕES"
				btnAdicionar.setVisible(false);
				btnSalvarEditado.setVisible(true);
			} else if (radioBtn_tarefasPessoais.isSelected()) {
				int selecionado = list_listaTarefas.getSelectedIndex();
				Tarefa tarefaSelecionada = listaPessoal[selecionado];
				input_nomeTarefa.setText(tarefaSelecionada.getNomeTarefa());
				comboBox_dificuldade.setSelectedItem(tarefaSelecionada.getDificuldadeTarefa());
				comboBox_urgencia.setSelectedItem(tarefaSelecionada.getUrgenciaTarefa());
				comboBox_tempo.setSelectedItem(tarefaSelecionada.getTempoTarefa());
				input_descricaoTarefa.setText(tarefaSelecionada.getDescricaoTarefa());
				btnAdicionar.setVisible(false);
				btnSalvarEditado.setVisible(true);
			} else if (radioBtn_tarefasProfissionais.isSelected()) {
				int selecionado = list_listaTarefas.getSelectedIndex();
				Tarefa tarefaSelecionada = listaProfissional[selecionado];
				input_nomeTarefa.setText(tarefaSelecionada.getNomeTarefa());
				comboBox_dificuldade.setSelectedItem(tarefaSelecionada.getDificuldadeTarefa());
				comboBox_urgencia.setSelectedItem(tarefaSelecionada.getUrgenciaTarefa());
				comboBox_tempo.setSelectedItem(tarefaSelecionada.getTempoTarefa());
				input_descricaoTarefa.setText(tarefaSelecionada.getDescricaoTarefa());
				btnAdicionar.setVisible(false);
				btnSalvarEditado.setVisible(true);				
			} else {
				JOptionPane.showMessageDialog(show_descricao, "Escolha uma Categoria!");
			}
		});
		// FIM - EDITAR TAREFA
		
		// INICIO - BOTAO SALVAR ALTERAÇÕES
		btnSalvarEditado.addActionListener( e -> {
			if (radioBtn_tarefasAcademicas.isSelected()) {
				int selecionado= list_listaTarefas.getSelectedIndex();
				// Substituir os atributos alterados no mesmo objeto
				listaAcademico[selecionado].setNomeTarefa(input_nomeTarefa.getText());
				listaAcademico[selecionado].setDificuldadeTarefa(comboBox_dificuldade.getSelectedItem().toString());
				listaAcademico[selecionado].setUrgenciaTarefa(comboBox_urgencia.getSelectedItem().toString());
				listaAcademico[selecionado].setTempoTarefa(comboBox_tempo.getSelectedItem().toString());
				listaAcademico[selecionado].setDescricaoTarefa(input_descricaoTarefa.getText());
				// Atualizar a lista
				list_listaTarefas.setListData(listaAcademico);
				// Limpar Campos Escritos
				input_nomeTarefa.setText(null);
				input_descricaoTarefa.setText(null);
				comboBox_dificuldade.setSelectedIndex(0);
				comboBox_tempo.setSelectedIndex(0);
				comboBox_urgencia.setSelectedIndex(0);
				// Botão "SALVAR ALTERAÇÕES" volta para "ADICIONAR"
				btnSalvarEditado.setVisible(false);
				btnAdicionar.setVisible(true);
				// Mensagem de alterações salvas com sucesso
				JOptionPane.showMessageDialog(null, "Alterações salvas com sucesso!", "EDITAR", JOptionPane.DEFAULT_OPTION);
			} else if (radioBtn_tarefasPessoais.isSelected()) {
				int selecionado= list_listaTarefas.getSelectedIndex();
				listaPessoal[selecionado].setNomeTarefa(input_nomeTarefa.getText());
				listaPessoal[selecionado].setDificuldadeTarefa(comboBox_dificuldade.getSelectedItem().toString());
				listaPessoal[selecionado].setUrgenciaTarefa(comboBox_urgencia.getSelectedItem().toString());
				listaPessoal[selecionado].setTempoTarefa(comboBox_tempo.getSelectedItem().toString());
				listaPessoal[selecionado].setDescricaoTarefa(input_descricaoTarefa.getText());
				list_listaTarefas.setListData(listaPessoal);
				input_nomeTarefa.setText(null);
				input_descricaoTarefa.setText(null);
				comboBox_dificuldade.setSelectedIndex(0);
				comboBox_tempo.setSelectedIndex(0);
				comboBox_urgencia.setSelectedIndex(0);
				btnSalvarEditado.setVisible(false);
				btnAdicionar.setVisible(true);
				JOptionPane.showMessageDialog(null, "Alterações salvas com sucesso!", "EDITAR", JOptionPane.DEFAULT_OPTION);
			} else if (radioBtn_tarefasProfissionais.isSelected()) {
				int selecionado= list_listaTarefas.getSelectedIndex();
				listaProfissional[selecionado].setNomeTarefa(input_nomeTarefa.getText());
				listaProfissional[selecionado].setDificuldadeTarefa(comboBox_dificuldade.getSelectedItem().toString());
				listaProfissional[selecionado].setUrgenciaTarefa(comboBox_urgencia.getSelectedItem().toString());
				listaProfissional[selecionado].setTempoTarefa(comboBox_tempo.getSelectedItem().toString());
				listaProfissional[selecionado].setDescricaoTarefa(input_descricaoTarefa.getText());
				list_listaTarefas.setListData(listaProfissional);
				input_nomeTarefa.setText(null);
				input_descricaoTarefa.setText(null);
				comboBox_dificuldade.setSelectedIndex(0);
				comboBox_tempo.setSelectedIndex(0);
				comboBox_urgencia.setSelectedIndex(0);
				JOptionPane.showMessageDialog(null, "Alterações salvas com sucesso!", "EDITAR", JOptionPane.DEFAULT_OPTION);
				btnSalvarEditado.setVisible(false);
				btnAdicionar.setVisible(true);
			}
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
