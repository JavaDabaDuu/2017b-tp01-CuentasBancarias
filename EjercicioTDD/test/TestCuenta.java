package test;

import org.junit.Assert;
import org.junit.Test;

import cuentaBancaria.CuentaBancaria;

public class TestCuenta {
	
	@Test
	public void haceTransferencia() {
		CuentaBancaria obj = new CuentaBancaria(15000);
		CuentaBancaria obj2 = new CuentaBancaria(20000);
		
		obj.realizarTransferencia(15000, obj2);
		Assert.assertEquals(35000, obj2.getMonto(), 0.01);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void fallaConNegativo() {
		CuentaBancaria obj1 = new CuentaBancaria(15000);
		CuentaBancaria obj2 = new CuentaBancaria(2000);
		
		obj1.realizarTransferencia(-15000, obj2);
		Assert.assertEquals(-500, obj2.getMonto(),0.001);
	}
	
	
}
