package test;

import org.junit.Assert;
import org.junit.Test;

import cuentaBancaria.CuentaBancaria;

public class TestCuenta {
	
	@Test(expected = IllegalArgumentException.class)
	public void haceTransferencia() {
		CuentaBancaria obj1 = new CuentaBancaria();
		CuentaBancaria obj2 = new CuentaBancaria();
		
		obj1.realizarTransferencia(-5100, obj2);
		Assert.assertEquals(-5100, obj2.getMonto(),0.001);
	}
}
