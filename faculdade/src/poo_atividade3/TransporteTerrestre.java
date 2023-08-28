package poo_atividade3;

public class TransporteTerrestre implements InterfaceTransporte {
	
	private int largura;
	private int altura;
	
	public TransporteTerrestre(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}

	public double calculaFrete(int largura, int altura) {
		return (largura / altura) * 0.20;
	}
}
