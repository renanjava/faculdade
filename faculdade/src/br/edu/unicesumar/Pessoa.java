package br.edu.unicesumar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
	private String nome;
	private Date dataNasc;
	private int idade;
	
	public Pessoa(String nome, int idade){ //construtor 01
		this.nome = nome;
		this.idade = idade;
	}
	
	public Pessoa(Date dataNasc) { //construtor 02
		this.dataNasc = dataNasc;		
	}
	
	public Pessoa(){ //construtor 03
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
