package tarefas.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PaginaLogin extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField txt_senha;
	private JTextField txt_usuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaginaLogin frame = new PaginaLogin();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PaginaLogin() {
		
		setTitle("<<< TELA DE LOGIN TAREFAS >>>");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_senha = new JPasswordField();
		txt_senha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_senha.setBounds(123, 133, 200, 40);
		contentPane.add(txt_senha);
		
		JLabel lblNewLabel = new JLabel("<html><h2> USUÁRIO </h2></html>");
		lblNewLabel.setBounds(123, 27, 98, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblSenha = new JLabel("<html><h2> SENHA </h2></html>");
		lblSenha.setBounds(123, 107, 98, 26);
		contentPane.add(lblSenha);
		
		txt_usuario = new JTextField();
		txt_usuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_usuario.setBounds(123, 56, 200, 40);
		contentPane.add(txt_usuario);
		txt_usuario.setColumns(10);
		
	// INICIO - Lógica do Login
		JButton btn_entrar = new JButton("ENTRAR");
		btn_entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkLogin(txt_usuario.getText(), new String(txt_senha.getPassword()))) {
					PaginaTarefas novaTela = new PaginaTarefas();
					setVisible(false);
					novaTela.setVisible(true);
					novaTela.setLocationRelativeTo(null);
				} else {
					JOptionPane.showMessageDialog(null, "Usuário ou senha inválida. Tente novamente!", "LOGIN INVÁLIDO", JOptionPane.ERROR_MESSAGE);
					txt_usuario.setText(null);
					txt_senha.setText(null);
				}
			}
		});
		btn_entrar.setBounds(123, 197, 200, 38);
		contentPane.add(btn_entrar);
	// FIM- Lógica do Login
	}
	
	// FUNÇÃO Login
	public boolean checkLogin(String login, String senha) {
		return login.equals("user1") && senha.equals("1234");
	}
}
