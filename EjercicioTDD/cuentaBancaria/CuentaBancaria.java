package cuentaBancaria;

public class CuentaBancaria {
	private double monto;
	private long numCuenta;
	
	public void realizarTransferencia (double monto,CuentaBancaria cuenta2) {
		
		if (monto < 0) {
			throw new IllegalArgumentException();
		}
		cuenta2.monto = monto;
	}
	
	public double getMonto() {
		return this.monto;
	}
}
