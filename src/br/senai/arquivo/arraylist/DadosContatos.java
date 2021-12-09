package br.senai.arquivo.arraylist;

import java.util.ArrayList;

public class DadosContatos {

	ArrayList<Contato> contatos = new ArrayList<Contato>();
	Contato contato = new Contato();
	
	public void cadastrarContato(Contato contato) {
		contatos.add(contato);
	}
	public ArrayList<Contato> listarContato(){
		return contatos;
	}
	public int contarContatos() {
		return contatos.size();
	}
}
