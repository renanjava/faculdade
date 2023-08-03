package poo_atividade2;

public abstract class Transportadora {
	
	private int largura;
	private int altura;
	
	public Transportadora(int largura, int altura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	public abstract double calculaFrete(int largura, int altura);

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
}
