package bytebankHerdado;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TesteAuxiliar {
	private Funcionario auxiliar;
	
	@Test

	public void testaCriacao() {
		auxiliar = new Auxiliar("Nico Ni", "2131204813-01", 1800.00);		
		
		assertTrue(auxiliar.getNome().equals("Nico Ni"));
		assertTrue(auxiliar.getCpf().equals("2131204813-01"));
		assertTrue(auxiliar.getSalario() == 1800.00);
		assertTrue(auxiliar.getBonificacao() == auxiliar.getSalario()*0.7);
	}		
}