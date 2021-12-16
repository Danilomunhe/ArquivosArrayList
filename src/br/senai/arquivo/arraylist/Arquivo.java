package br.senai.arquivo.arraylist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {

	public DadosContato objDadosContato = new DadosContato();
	
	// Cria o arquivo caso ele n�o exista e grava dados em um arquivo
	public boolean escrever(String caminho, String texto) {
		try {

			// Objeto que representa o arquivo
			FileWriter arquivo = new FileWriter(caminho);

			// Objeto que representa a manipula��o (escrever) dos dados do arquivo
			PrintWriter escreverArquivo = new PrintWriter(arquivo);

			escreverArquivo.append(texto);
			escreverArquivo.close();
			return true;
		} catch (IOException e) {

			System.out.println("ERRO: " + e.getMessage());
			return false;
		}
	}

	// Ler um arquivo
	public DadosContato ler(String caminho) {
		
		
        try {
        	
        	//Representa o arquivo em modo de leitura
        	FileReader arquivo = new FileReader(caminho);
        	
        	//Representa o dado de leitura na mem�ria principal do programa
        	BufferedReader lerArquivo = new BufferedReader(arquivo);
        	
        	String linha = "";
        	
        	linha = lerArquivo.readLine();  
        	
        	while(linha != null) {
        	
        		String[] dadosLinha = linha.split(";");
        		
        		Contato objContato = new Contato();
        		objContato.setNome(dadosLinha[0]);
        		objContato.setEmail(dadosLinha[1]);
        		objContato.setTelefone(dadosLinha[2]);
        		objContato.setCidade(dadosLinha[3]);
        		
        		objDadosContato.cadastrarContato(objContato);
        		
        		linha = lerArquivo.readLine();
        	}
        	arquivo.close();
        	return objDadosContato;
        	
        }catch(IOException e) {
        	
        	System.out.println("ERRO: " + e.getMessage());
        	return null;
        }
	}
}
