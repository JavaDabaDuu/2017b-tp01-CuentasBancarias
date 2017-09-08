package test;

import org.junit.Assert;
import org.junit.Test;

import cuentaBancaria.CuentaBancaria;

public class TestCuenta {
	
	@Test
	public void haceTransferencia() {
		CuentaBancaria obj = new CuentaBancaria();
		obj.realizarTransferencia();
		Assert.assertEquals(3.5, obj.getMonto());
	}
}
