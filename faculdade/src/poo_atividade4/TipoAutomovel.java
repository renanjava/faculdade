package poo_atividade4;

public enum TipoAutomovel implements ValorFipe{
	PASSEIO("Carro comum"){
		public double valorFipe(double valor) {
			return 0.88;
		}
	},
	PASSEIO_PROFISSIONAL("Uso profissional"){
		public double valorFipe(double valor) {
			return 0.857;
		}
	},
	TRANSPORTE("Ônibus ou Van"){
		public double valorFipe(double valor) {
			return 0.865;
		}
	},
	CARGA("Caminhão"){
		public double valorFipe(double valor) {
			return 0.92;
		}
	};
	
	TipoAutomovel(String descricao){
		
	}
	
}
