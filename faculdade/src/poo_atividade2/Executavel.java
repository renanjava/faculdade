package poo_atividade2;

public class Executavel {
	public static void main(String[] args) {
		TransporteNautico nau = new TransporteNautico(10, 10);
		TransporteTerrestre ter = new TransporteTerrestre(30, 80);
		
		System.out.println("Nautico: "+nau.calculaFrete(
				nau.getAltura(),nau.getLargura()));
		
		System.out.println("Terrestre: "+ter.calculaFrete(
				ter.getAltura(),ter.getLargura()));
	}
}
