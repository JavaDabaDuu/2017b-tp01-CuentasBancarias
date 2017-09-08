package test;

import org.junit.Assert;
import org.junit.Test;

import cuentaBancaria.CuentaBancaria;

public class TestCuenta {
	
	@Test(expected = IllegalArgumentException.class)
	public void haceTransferencia() {
		CuentaBancaria obj1 = new CuentaBancaria(15000);
		CuentaBancaria obj2 = new CuentaBancaria(20000);
		
		obj1.realizarTransferencia(15000, obj2);
		Assert.assertEquals(35000, obj2.getMonto(),0.001);
	}
}
