package br.edu.unicesumar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Executavel {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formatada = new SimpleDateFormat("dd/MM/yyyy");
		
		Pessoa renan1 = new Pessoa("Renan", 19); //construtor01
		Pessoa renan2 = new Pessoa(formatada.parse("05/04/2004")); //construtor02
		Pessoa renan3 = new Pessoa(); //construtor03
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(renan1);
		pessoas.add(renan2);
		pessoas.add(renan3);
		
		for (Pessoa p : pessoas) {
			System.out.println("Construtor 0"+(pessoas.indexOf(p)+1)+"\n" 
				+ "Nome: " +(p.getNome() == null ? "Não informado" : p.getNome())
				+ "\nIdade: " +(p.getIdade() == 0 ? "Não informado" : p.getIdade())
				+ "\nNascimento: " +(p.getDataNasc() == null ? 
					"Não informado" : formatada.format(p.getDataNasc()))
					+"\n");
		}
	}
}
