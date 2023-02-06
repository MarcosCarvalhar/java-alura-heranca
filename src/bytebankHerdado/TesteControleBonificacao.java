package bytebankHerdado;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TesteControleBonificacao {
	private Gerente gerente;
	private Auxiliar auxiliar;
	private Designer designer;
	private Diretor diretor;
	private ControleBonificacao controle;
	
	@Test

	public void testaControleBonificacao() {		
		controle = new ControleBonificacao();		
		gerente  = new Gerente("Julia", "2131204813-01", 5400.00, "eita");				
		diretor  = new Diretor("Carlos", "2131204813-01", 4000.00, "eita");				
		auxiliar = new Auxiliar("Alessandro", "2131204813-01", 1800.00);
		designer = new Designer("Marcela", "2131204813-01", 2800.00);
		
		controle.registra(gerente);
		controle.registra(diretor);
		controle.registra(auxiliar);
		controle.registra(designer);
		
		assertTrue(controle.getSoma() == 
				   gerente.getBonificacao() +
				   diretor.getBonificacao() + 
				   auxiliar.getBonificacao() +
				   designer.getBonificacao() 
				  );		   
	}		
}