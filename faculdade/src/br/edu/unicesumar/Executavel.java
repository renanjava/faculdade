package br.edu.unicesumar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Executavel {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formatada = new SimpleDateFormat("dd/MM/yyyy");
		
		Pessoa renan1 = new Pessoa("Renan", 19); //construtor01
		Pessoa renan2 = new Pessoa(formatada.parse("05/04/2004")); //construtor02
		Pessoa renan3 = new Pessoa(); //construtor03
		
		
		System.out.println("Construtor 01\n" 
		+ "Nome: " +renan1.getNome()
		+ " Idade: " +renan1.getIdade()
		+ " Nascimento: " +dadosInseridos(formatada.format(renan1.getDataNasc())));
		
		System.out.println("Construtor 02\n" 
		+ "Nome: " +renan2.getNome()							 
		+ " Idade: " +renan2.getIdade()						 
		+ " Nascimento: " +formatada.format(renan2.getDataNasc()));
		
		System.out.println("Construtor 03\n" 
		+ "Nome: " +renan3.getNome()							 
		+ " Idade: " +renan3.getIdade()							 
		+ " Nascimento: " +renan3.getDataNasc());
	}
	
	public static boolean dadosInseridos(String dadosUsuario) {
		return (dadosUsuario == "0" || dadosUsuario == null);
	}
}
