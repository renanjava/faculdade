package heranca;

public class Cerveja extends Produto {
	private double alcool;
	
	public Cerveja(String nome, double valor) {
		super(nome,valor);
	}
	
	public double calcularDesconto() {
		
		return getValor() * 0.25;
	}
}
