package Banco;

public class CuentaCorriente extends CuentaBancaria{

	public CuentaCorriente(String IBAN, double saldo) {
		super(IBAN, saldo);
	}
	
	@Override 
	public void calcularIntereses() {
		double saldo2;
		
		saldo2= this.saldo *= interesAnualBasico/100;
		
		this.saldo += saldo2;
		
		System.out.println(saldo2);
	}
	
	

}
