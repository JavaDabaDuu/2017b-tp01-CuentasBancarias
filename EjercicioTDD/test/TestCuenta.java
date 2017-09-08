package test;

import org.junit.Assert;
import org.junit.Test;

import cuentaBancaria.CuentaBancaria;

public class TestCuenta {
	
	@Test
	public void haceTransferencia() {
		CuentaBancaria obj = new CuentaBancaria();
		Assert.assertEquals(3, obj.getMonto());
	}
}
