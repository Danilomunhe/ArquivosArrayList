package br.senai.arquivo.arraylist;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		FrameCadastro f = new FrameCadastro();
		f.setVisible(true);

//		DadosContatos objDadosContatos = new DadosContatos();
//		Arquivo objArquivo = new Arquivo();
//
//		String caminho = "C:\\Users\\21276321\\Desktop\\Contato\\contatos.txt";

		// Objetos de contatos para teste
//		Contato contato1 = new Contato("Danilo", "danilomunhe@gmail.com", "11977623364", "Jandira-SP");
//		Contato contato2 = new Contato("Ana", "ana@gmail.com", "11977624748", "Itapevi-SP");
//		Contato contato3 = new Contato("Fernanda", "fernanda@gmail.com", "11965483364", "Barueri-SP");
//		Contato contato4 = new Contato("Luane", "luane@gmail.com", "11954640326", "Osasco-SP");

		// Teste de cadastro de contatos
//		objDadosContatos.cadastrarContato(contato1);
//		objDadosContatos.cadastrarContato(contato2);
//		objDadosContatos.cadastrarContato(contato3);
//		objDadosContatos.cadastrarContato(contato4);

		// Percorre o Array List de contatos e grava os dados no arquivo txt

		// 1ºExemplo
//		ArrayList<Contato> listagem = objDadosContatos.listarContato();
//		for(Contato contato : listagem) {
//			System.out.println("Nome: "+ contato.getNome() + " E-mail: "+contato.getEmail() + " Telefone: "+ contato.getTelefone() + " Cidade: " + contato.getCidade());
//		}

		// 2ºExemplo
//		String texto = "";
//		for (Contato contato : objDadosContatos.listarContato()) {
//			// System.out.println(contato.getNome() + ";" + contato.getEmail() + ";" +
//			// contato.getTelefone() + ";" + contato.getCidade());
//         texto += contato.getNome() + "; " + contato.getEmail() + "; " +
//     			 contato.getTelefone() + "; " + contato.getCidade() + "\n";
//		}
//
//		System.out.println(texto);
//		objArquivo.escrever(caminho, texto);
//		System.out.println(objDadosContatos.contarContatos());
//		objDadosContatos.listarContato();
	}

}
