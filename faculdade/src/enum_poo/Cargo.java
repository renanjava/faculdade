package enum_poo;

public enum Cargo {
	PROGRAMADOR(1, "Programador"){
		Double calcularSalario() {
			return 5000.0;	
		}
	},
	GUARDA_TRANSITO(2, "Guarda de Trânsito"){
		Double calcularSalario() {
			return 3000.0;	
		}
	},
	DBA(3, "Administrador do Banco de Dados"){
		Double calcularSalario() {
			return 900.0;	
		}
	},
	ANALISTA(4,"Analista de Sistemas"){
		Double calcularSalario() {
			return 10.0;	
		}
	};
	
	private Integer codigo;
	private String descricao;
	
	Cargo(Integer codigo, String descricao){
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public Integer getCodigo(){
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	abstract Double calcularSalario();
	
}
