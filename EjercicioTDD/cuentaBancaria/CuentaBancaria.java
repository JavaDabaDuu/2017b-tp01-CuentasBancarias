package cuentaBancaria;

public class CuentaBancaria {
	private double monto;
	private long numCuenta;
	
	public void realizarTransferencia (double monto,CuentaBancaria cuenta2) {
		cuenta2.monto = 5100;
	}
	
	public double getMonto() {
		return this.monto;
	}
}
