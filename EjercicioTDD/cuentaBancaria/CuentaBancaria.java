package cuentaBancaria;

public class CuentaBancaria {
	private double monto;
	private long numCuenta;
	
	public void realizarTransferencia (double monto,CuentaBancaria cuenta2) {
		this.monto = 3.5;
	}
	
	public double getMonto() {
		return this.monto;
	}
}
