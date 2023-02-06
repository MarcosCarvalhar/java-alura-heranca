package bytebankHerdado;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TesteSistemaInterno {

	private Diretor diretor;
	
	@Test
	
	public void testaSistemaInterno() {
		diretor = new Diretor("Marcos", "12398457", 3200.00, "eita");		
		SistemaInterno si = new SistemaInterno();
		assertTrue(si.autenticacao(diretor));
	}

}
