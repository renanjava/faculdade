package service;

import java.util.ArrayList;
import java.util.List;
import domain.Monitor;
import domain.Produto;
import domain.Teclado;

public class Executavel {
	public static void main(String[] args) {
		double totalCompraMonitores, totalCompraTeclados;
		double totalDescontoMonitores, totalDescontoTeclados;
		double freteMonitores, freteTeclados;
		
		
		CalculadoraService calc = new CalculadoraService();
		
		Monitor mon1 = new Monitor("Acer",1300,false);
		Monitor mon2 = new Monitor("Samsung",900,true);
		Monitor mon3 = new Monitor("DELL",700,false);
		
		List<Produto> monitores = new ArrayList<Produto>();
		monitores.add(mon1);
		monitores.add(mon2);
		monitores.add(mon3);
		
		totalCompraMonitores = CalculadoraService.valorTotalCompra(monitores);
		totalDescontoMonitores = CalculadoraService.valorTotalDesconto(monitores);
		freteMonitores = CalculadoraService.calculaFrete(monitores);
		
		Teclado tec1 = new Teclado("Razer",500);
		Teclado tec2 = new Teclado("Pichau",100);
		Teclado tec3 = new Teclado("Logitech",90);
		
		List<Produto> teclados = new ArrayList<Produto>();
		teclados.add(tec1);
		teclados.add(tec2);
		teclados.add(tec3);
		
		totalCompraTeclados = CalculadoraService.valorTotalCompra(teclados);
		totalDescontoTeclados = CalculadoraService.valorTotalDesconto(teclados);
		freteTeclados = CalculadoraService.calculaFrete(teclados);
		
		
		
		
	}
}
