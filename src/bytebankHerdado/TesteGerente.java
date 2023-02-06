package bytebankHerdado;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TesteGerente {
	private Gerente gerente;
	private SistemaInterno sistema;
	
	@Test

	public void testaCriacao() {
		gerente = new Gerente("Nico Ni", "2131204813-01", 1800.00, "eita");
		sistema = new SistemaInterno();
		assertTrue(gerente.getNome().equals("Nico Ni"));
		assertTrue(gerente.getCpf().equals("2131204813-01"));
		assertTrue(gerente.getSalario() == 1800.00);
		assertTrue(gerente.getBonificacao() == 1800.00);
		assertTrue(sistema.autenticacao(gerente));
	}		
}