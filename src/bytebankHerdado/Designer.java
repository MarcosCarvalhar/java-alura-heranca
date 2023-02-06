package bytebankHerdado;

public class Designer extends Funcionario {
	
	public Designer(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	@Override
	public double getBonificacao() {
		return getSalario()*0.6; //60% de bonificação
	}
}
