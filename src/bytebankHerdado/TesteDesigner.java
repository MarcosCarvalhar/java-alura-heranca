package bytebankHerdado;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TesteDesigner {
	private Funcionario designer;
	
	@Test

	public void testaCriacao() {
		designer = new Designer("Nico Ni", "2131204813-01", 1800.00);		
		
		assertTrue(designer.getNome().equals("Nico Ni"));
		assertTrue(designer.getCpf().equals("2131204813-01"));
		assertTrue(designer.getSalario() == 1800.00);
		assertTrue(designer.getBonificacao() == designer.getSalario()*0.6);
	}		
}