package bytebankHerdado;

public class SistemaInterno{

    private String senha = "eita";

    public boolean autenticacao(Funcionario funcionario){
    	return funcionario.autentica(this.senha);
    }
}

