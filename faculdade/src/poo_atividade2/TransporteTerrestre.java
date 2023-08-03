package poo_atividade2;

public class TransporteTerrestre extends Transportadora {
	
	public TransporteTerrestre(int largura, int altura) {
		super(largura,altura);
	}

	public double calculaFrete(int largura, int altura) {
		return (largura / altura) * 0.20;
	}
}
