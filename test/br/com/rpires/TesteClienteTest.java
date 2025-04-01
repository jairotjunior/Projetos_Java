package br.com.rpires;

import org.junit.Assert;
import org.junit.Test;

import br.com.rpires.TesteCliente;

public class TesteClienteTest {

	@Test
	public void testeClasseCliente() {
		TesteCliente cli = new TesteCliente();
		cli.adicionarNome("Rodrigo");

		Assert.assertEquals("Rodrigo", cli.getNome());
	}s
}
