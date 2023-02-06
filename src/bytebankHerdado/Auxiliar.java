package bytebankHerdado;

public class Auxiliar extends Funcionario {
	
	public Auxiliar(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	@Override
	public double getBonificacao() {		
		return getSalario()*0.7; //70% de bonificação
	}
}
