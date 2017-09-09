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
	
	@Test
	public void restaEnCuentaOrigen() {
		CuentaBancaria obj = new CuentaBancaria(15000);
		CuentaBancaria obj2 = new CuentaBancaria(20000);
		
		obj.realizarTransferencia(15000, obj2);
		Assert.assertEquals(0, obj.getMonto(),0.1);
		
		obj.realizarTransferencia(20, obj2);
		Assert.assertEquals(-20, obj.getMonto(),20);
	}
	
	@Test
	public void esMontoSuficiente() {
		CuentaBancaria obj = new CuentaBancaria(15000);
		
		 Assert.assertFalse(obj.esMontoSuficiente(15100));
		 Assert.assertTrue(obj.esMontoSuficiente(15000));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void fallaConNegativo() {
		CuentaBancaria obj1 = new CuentaBancaria(15000);
		CuentaBancaria obj2 = new CuentaBancaria(2000);
		
		obj1.realizarTransferencia(-15000, obj2);
		Assert.assertEquals(-500, obj2.getMonto(),0.001);
	}
	
	@Test
	public void encuentraCuentasIguales() {
		CuentaBancaria obj = new CuentaBancaria(1234,25000);
		Assert.assertTrue(obj.distintasCuentas(obj));
	}
	
	
}
