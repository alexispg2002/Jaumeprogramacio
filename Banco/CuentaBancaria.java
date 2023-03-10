package Banco;

public abstract class CuentaBancaria {
	
	protected String IBAN;
	protected double saldo;
	
	
	protected static final double interesAnualBasico=2.5;
	

	
	
	public CuentaBancaria(String IBAN, double saldo) {
		super();
		this.IBAN=IBAN;
		this.saldo=saldo;
	}
	public String getIBAN() {
		return IBAN;
	}
	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public abstract void calcularIntereses();
	
	public double ingresar(double ingresar) {
		return this.saldo += ingresar;
	}
	
	public double retirar(double retirar) {
		return this.saldo -= retirar;
	}
	
	public String traspaso(CuentaAhorro x,double traspaso) {
		this.saldo -= traspaso;
		
		traspaso += x.getSaldo();
		
		return "El saldo de la cuenta es "+this.saldo;
	}
	
	
}
