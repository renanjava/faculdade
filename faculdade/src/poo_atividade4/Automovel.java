package poo_atividade4;

public class Automovel {
	TipoAutomovel tipo;
	double valorFipe;
	double valorSeguro;
	
	public double calcularValorFipe(){
		return valorFipe / 1.00;
	}
	
	public double calcularValorSeguro() {
		return valorSeguro / 1.00;
	}
}
