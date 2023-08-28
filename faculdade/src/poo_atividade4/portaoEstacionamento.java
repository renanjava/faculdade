package poo_atividade4;

public enum portaoEstacionamento implements ValorSeguro{
	AUTOMATICO{
		public double valorSeguro(double valor) {
			return 0.956;
		}
	},
	MANUAL{
		public double valorSeguro(double valor) {
			return 0.98;
		}
	};
}
