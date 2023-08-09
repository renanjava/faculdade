package heranca;

public class Relogio extends Produto {
	String material;
	
	public Relogio(String nome, double valor) {
		super(nome,valor);
	}
	
	public double calcularDesconto() {
		return getValor() * 0.15;
	}
}
