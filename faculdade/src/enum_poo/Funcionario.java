package enum_poo;

public class Funcionario {
	private String nome;
	private String matricula;
	private int idade;
	private Cargo cargo;
	
	public Funcionario(String nome, String matricula, int idade, Cargo cargo) {
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	
}
