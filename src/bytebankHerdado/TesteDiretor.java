package bytebankHerdado;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TesteDiretor {
	private Funcionario diretor;
	
	@Test

	public void testaCriacao() {
		diretor = new Diretor("Nico Ni", "2131204813-01", 1800.00, "eita");		
		
		assertTrue(diretor.getNome().equals("Nico Ni"));
		assertTrue(diretor.getCpf().equals("2131204813-01"));
		assertTrue(diretor.getSalario() == 1800.00);
		assertTrue(diretor.getBonificacao() == 2800.00);
	}		
}