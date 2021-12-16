package br.senai.arquivo.arraylist;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;

public class FrameCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtCidade;

	// Atributos referentes a criação/gravação de contatos
	Contato objContato = null;
	DadosContato objDadosContato = null;
	Arquivo objArquivo = null;
	String texto = "";

	public FrameCadastro() {

		objContato = new Contato();
		objDadosContato = new DadosContato();
		objArquivo = new Arquivo();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 412);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCadastroDeContatos = new JLabel("Cadastro de Contatos");
		lblCadastroDeContatos.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCadastroDeContatos.setBounds(141, 11, 192, 22);
		contentPane.add(lblCadastroDeContatos);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome.setBounds(19, 114, 67, 14);
		contentPane.add(lblNome);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(19, 150, 67, 14);
		contentPane.add(lblEmail);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setForeground(Color.WHITE);
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTelefone.setBounds(19, 188, 75, 14);
		contentPane.add(lblTelefone);

		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setForeground(Color.WHITE);
		lblCidade.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCidade.setBounds(19, 227, 67, 14);
		contentPane.add(lblCidade);

		txtNome = new JTextField();
		txtNome.setBounds(96, 113, 300, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(96, 149, 300, 20);
		contentPane.add(txtEmail);

		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(96, 187, 300, 20);
		contentPane.add(txtTelefone);

		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(96, 226, 300, 20);
		contentPane.add(txtCidade);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCadastrar.setBounds(34, 272, 177, 41);
		contentPane.add(btnCadastrar);

		btnCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Caputura dos dados para o objeto contato
				objContato.setNome(txtNome.getText());
				objContato.setEmail(txtEmail.getText());
				objContato.setTelefone(txtTelefone.getText());
				objContato.setCidade(txtCidade.getText());

				// Preparação doas dados para o arquivo txt
//				String texto = objContato.getNome() + "; " + objContato.getEmail() + "; " + objContato.getTelefone()
//						+ "; " + objContato.getCidade() + "\n";

				// Gravação dos dados no arquivo txt
				String caminho = "C:\\Users\\21276321\\Desktop\\Contato\\contatos.txt";

				// Teste de leitura de arquivo txt
				objDadosContato = objArquivo.ler(caminho);

				// Gravação
				objDadosContato.cadastrarContato(objContato);

				// Leitura
				ArrayList<Contato> contatos = objDadosContato.listarContatos();

				contatos.forEach(contato -> {
					// System.out.println("Nome: " + contato.getNome() + " E-mail: " +
					// contato.getEmail() + " Telefone: " + contato.getTelefone() + " Cidade " +
					// contato.getCidade());

					texto += contato.getNome()+ "; "+ contato.getEmail() + "; "+ contato.getTelefone() + "; "+ contato.getCidade()
							+ "\n";
			
				});
				//System.out.println(texto);
				objArquivo.escrever(caminho, texto);
				contatos.clear();
		
			}
		});
	}
}
