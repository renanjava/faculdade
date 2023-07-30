package br.edu.unicesumar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formatada = new SimpleDateFormat("dd/MM/yyyy");
		
		Pessoa renan1 = new Pessoa("Renan", 19); //construtor01 nome e idade
		Pessoa renan2 = new Pessoa(formatada.parse("05/04/2004")); //construtor02 dataNasc Apenas
		Pessoa renan3 = new Pessoa(); //construtor03 default
		
		
		System.out.println("Construtor 01\n" + "Nome: " +renan1.getNome()
											 + " Idade: " +renan1.getIdade()
											 + " Nascimento: " +renan1.getDataNasc());
		
		System.out.println("Construtor 02\n" + "Nome: " +renan2.getNome()
		 									 + " Idade: " +renan2.getIdade()
		 									 + " Nascimento: " +formatada.format(renan2.getDataNasc()));
		
		System.out.println("Construtor 03\n" + "Nome: " +renan3.getNome()
		 									 + " Idade: " +renan3.getIdade()
		 									 + " Nascimento: " +renan3.getDataNasc());
	}	
}
