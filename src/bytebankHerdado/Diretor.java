package bytebankHerdado;

public class Diretor extends Funcionario {
	
	public Diretor(String nome, String cpf, double salario, String senha) {
		super(nome, cpf, salario, senha);		
	}
	
	@Override
	public double getBonificacao() {
		return getSalario()+1000; //100% de bonificação + 1000,00
	}

}
