package test;

import org.junit.Assert;
import org.junit.Test;

import cuentaBancaria.CuentaBancaria;

public class TestCuenta {
	
	@Test
	public void haceTransferencia() {
		CuentaBancaria obj = new CuentaBancaria();
		obj.realizarTransferencia(5100, obj.getMonto());
		Assert.assertEquals(5100, obj.getMonto(),0.001);
	}
}
