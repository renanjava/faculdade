package br.edu.unicesumar;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Pessoa {
	private String nome = "Não informado";
	private Date dataNasc;
	private int idade;
	
	public Pessoa(String nome, int idade){ //construtor que seta apenas o nome e a idade
		this.nome = nome;
		this.idade = idade;
	}
	
	public Pessoa(Date dataNasc) { //construtor que seta a data de nascimento
		this.dataNasc = dataNasc;		
	}
	
	public Pessoa(){ //construtor default do java sobrescrito 
		
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
