package Bank;

import java.nio.file.spi.FileSystemProvider;

import javax.sound.midi.SysexMessage;

public class CompteBancari {
	
	private String IBAN;
	private String Titular;
	private double Saldo;
	private int Moviments;
	
	
	public CompteBancari(String IBAN, String Titular, double Saldo, int Moviments) {
		this.IBAN=IBAN;
		this.Titular=Titular;
		this.Saldo=Saldo;
		this.Moviments=Moviments;
		
		
	}

	public String getIBAN() {
		return IBAN;
	}
	
	public void setIBAN(String IBAN) {
		this.IBAN=IBAN;
	}

	public String getTitular() {
		return Titular;
	}
	
	public void setTitular(String Titular) {
		this.Titular=Titular;
	}
	
	
	public double getSaldo() {
		return Saldo;
	}
	
	public void setSaldo(double Saldo) {
		this.Saldo=Saldo;
	}
	
	public int getMoviments() {
		return Moviments;
	}
	
	public void setMoviments(int Moviments) {
		this.Moviments=Moviments;
	}
	
	@Override
	public String toString() {
		return "CompteBancari [IBAN=" + IBAN + ", Titular=" + Titular + ", Saldo=" + Saldo + ", Moviments=" + Moviments
				+ "]";
	}
	
	public void imprimir() {
		System.out.println("IBAN:"+IBAN);
		System.out.println("Titular:"+Titular);
		System.out.println("Saldo:"+Saldo);
	}
	
	public void ingresar(double ingresar) {
		if(ingresar>3000) {
			System.out.println("Es NOTIFICARA A HISENDA");
			Saldo=Saldo+ingresar;
	}else {
		Saldo=Saldo+ingresar;
	}
}
	
	public void retirar(double retirada) {
		if (Saldo<0 && Saldo>-50) {
			System.out.println("El saldo es negatiu");
	}else if(Saldo <-50) {
			System.err.println("Saldo menor a 50€");
		}
	}
}
