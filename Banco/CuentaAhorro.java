package Banco;

public class CuentaAhorro extends CuentaBancaria{
	
	private double saldoMinimo;
	
	public CuentaAhorro(String IBAN, double saldo, double interesAnualBasico ,double saldoMinimo) {
		super(IBAN, saldo);
		this.saldo=saldo;
	}

	public double getSaldoMinimo() {
		return saldoMinimo;
	}

	public void setSaldoMinimo(double saldoMinimo) {
		this.saldoMinimo = saldoMinimo;
	}
	
	@Override
	public void calcularIntereses() {
		if(this.saldo<this.saldoMinimo) {
			this.saldo += interesAnualBasico / 2;
			System.out.println(this.saldo);
		}else {
			this.saldo += interesAnualBasico * 2;
			System.out.println(this.saldo);
		}
	}

	
}
