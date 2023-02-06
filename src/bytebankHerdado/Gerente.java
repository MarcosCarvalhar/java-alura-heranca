package bytebankHerdado;

public class Gerente extends Funcionario {
	
	public Gerente(String nome, String cpf, double salario, String senha) {
		super(nome, cpf, salario, senha);
	}
	
	@Override
	public double getBonificacao() {		
		return getSalario(); //100% de bonificação
	}
}
