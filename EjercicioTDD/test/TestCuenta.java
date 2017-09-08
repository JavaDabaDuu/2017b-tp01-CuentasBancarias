package test;

import org.junit.Assert;
import org.junit.Test;

import cuentaBancaria.CuentaBancaria;

public class TestCuenta {
	
	@Test(expected = IllegalArgumentException.class)
	public void haceTransferencia() {
		CuentaBancaria obj1 = new CuentaBancaria(15000);
		CuentaBancaria obj2 = new CuentaBancaria(20000);
		
		obj1.realizarTransferencia(-5100, obj2);
		Assert.assertEquals(-5100, obj2.getMonto(),0.001);
	}
}
