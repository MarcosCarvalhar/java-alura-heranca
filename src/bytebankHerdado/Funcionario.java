package bytebankHerdado;

public abstract class Funcionario implements Autenticavel{

	private String nome;
	private String cpf;
	private double salario;	
	private String senha;
	
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	public Funcionario(String nome, String cpf, double salario, String senha) {
		this(nome, cpf, salario);
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public abstract double getBonificacao();

	public boolean autentica(String senhaDigitada) {		
		return (senhaDigitada.equals(senha));		
	}
	
}
