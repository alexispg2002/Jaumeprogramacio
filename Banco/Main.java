package Banco;

public class Main {
	
	public static void main(String [] args) {
		
		CuentaCorriente cuenta1= new CuentaCorriente("26548", 150);
		CuentaCorriente cuenta2= new CuentaCorriente("59748", 1000);
		CuentaCorriente cuenta3= new CuentaCorriente("15648", 750);
		CuentaCorriente cuenta4= new CuentaCorriente("23654", 145);
		
		CuentaAhorro cuent1= new CuentaAhorro("26548", 150, 250, 420);
		CuentaAhorro cuent2= new CuentaAhorro("26849", 1000, 120, 300);
		CuentaAhorro cuent3= new CuentaAhorro("12353", 750, 2043, 120);
		CuentaAhorro cuent4= new CuentaAhorro("78954", 145, 578, 1440);
		
		System.out.println("Esta es la cuenta corriente de los clientes: ");
		cuenta1.calcularIntereses();
		cuenta2.calcularIntereses();
		cuenta3.calcularIntereses();
		cuenta4.calcularIntereses();
		
		
		System.out.println("Esta es la cuenta ahorro de los clientes: ");
		cuent1.calcularIntereses();
		cuent2.calcularIntereses();
		cuent3.calcularIntereses();
		cuent4.calcularIntereses();
	}

}
