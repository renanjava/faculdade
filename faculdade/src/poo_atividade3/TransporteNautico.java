package poo_atividade3;

public class TransporteNautico implements InterfaceTransporte {
	
	private int largura;
	private int altura;
	
	public TransporteNautico(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	public double calculaFrete(int largura, int altura) {
		return (largura + altura) * 0.10;
	}
} 