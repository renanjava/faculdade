package poo_atividade4;

public enum EstadoCivil implements ValorFipe{
	SOLTEIRO{
		public double valorFipe(double valor) {
			return 1.08;
		}
	},
	DIVORCIADO{
		public double valorFipe(double valor) {
			return 1.08;
		}
	},
	CASADO{
		public double valorFipe(double valor) {
			return 0.975;
		}
	},
	UNIAO_ESTAVEL{
		public double valorFipe(double valor) {
			return 0.975;
		}
	},
	VIUVO{
		public double valorFipe(double valor) {
			return 0.95;
		}
	};

}
