package cuentaBancaria;

public class CuentaBancaria {
	private double monto;
	private long numCuenta;
	
	public CuentaBancaria (double monto) {
		this.monto = monto;
	}
	
	public void realizarTransferencia (double monto,CuentaBancaria cuenta2) {		
		if (monto < 0) {
			throw new IllegalArgumentException();
		}
		cuenta2.monto += monto;
		this.monto -=15000;
	}
	
	public double getMonto() {
		return this.monto;
	}
}
