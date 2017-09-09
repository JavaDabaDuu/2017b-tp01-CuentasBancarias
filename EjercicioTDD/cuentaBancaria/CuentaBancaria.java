package cuentaBancaria;

public class CuentaBancaria {
	private double monto;
	private long nroCuenta;

	public CuentaBancaria(double monto, long nroCuenta) {
		this.monto = monto;
		this.nroCuenta = nroCuenta;
	}

	public CuentaBancaria(double monto) {
		this.monto = monto;
	}

	public void realizarTransferencia(double monto, CuentaBancaria cuenta2) {
		if (monto < 0) {
			throw new IllegalArgumentException();
		}

		if (this.esMontoSuficiente(monto)) {
			cuenta2.monto += monto;
			this.monto -= monto;
		}
	}

	public boolean esMontoSuficiente(double monto) {
		return monto <= this.monto;
	}

	public boolean distintasCuentas(CuentaBancaria cuenta2) {
		return this.nroCuenta != cuenta2.getNroCuenta();
	}

	public double getMonto() {
		return this.monto;
	}

	public long getNroCuenta() {
		return this.nroCuenta;
	}
}
