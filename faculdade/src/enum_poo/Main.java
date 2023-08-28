package enum_poo;

public class Main {

	public static void main(String[] args) {
		Funcionario renan = new Funcionario("Renan","123",19,Cargo.ANALISTA);
		
		System.out.println(renan.getNome() +" "+ renan.getMatricula() +" "
		+ renan.getIdade() +" "+ renan.getCargo());

	}
}
