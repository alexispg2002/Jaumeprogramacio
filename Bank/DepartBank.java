package Bank;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class DepartBank {
	
	public static void main(String[]args) {
		
		ArrayList <String> Moviments=new ArrayList<String>();
		
		Scanner src=new Scanner(System.in);
		
		int opcion;
		double cantidad;
		CompteBancari Person1= new CompteBancari("","",0,0);
		
	
		
		System.out.println("Escriu el IBAN:");
		Person1.setIBAN(src.nextLine());
		
		System.out.println("Escriu el nom y el cognom del titular:");
		Person1.setTitular(src.nextLine());
		
		System.out.println("Posa el saldo del titular");
		Person1.setSaldo(src.nextDouble());
		
		
		do {
			
			System.out.println("*********************************");
			System.out.println("********Elegeix una opcio********");
			System.out.println("**1.Mostra els datos del conter**");
			System.out.println("*************2.IBAN**************");
			System.out.println("***********3.Titular*************");
			System.out.println("*************4.Saldo*************");
			System.out.println("************5.Ingreso************");
			System.out.println("***********6.Retirada************");
			System.out.println("**********7.Moviments************");
			System.out.println("************8.Salir**************");
			
		opcion=src.nextInt();
		
		switch(opcion) {
		
		case 1:
			Person1.imprimir();
		break;
		case 2:
			System.out.println("Aquest es el IBAN: "+Person1.getIBAN());
		break;
		
		case 3:
			System.out.println("Aquest es el titular del compte: "+Person1.getTitular());
		break;
		
		case 4:
			System.out.println("Aquest es el saldo del compte: "+Person1.getSaldo());
		break;
		
		case 5:
			System.out.print("Introduce la cantidad a ingresar:");
			cantidad=src.nextDouble();
			Person1.ingresar(cantidad);
			String cadena="Ingres de "+cantidad+" El saldo es: "+Person1.getSaldo();
			Moviments.add(cadena);
		break;
		
		case 6:
			System.out.print("Introduce la cantidad a retirar:");
			int b =src.nextInt();
			Person1.retirar(b);
			
			double resultado = Person1.getSaldo()-b;
			
			Person1.setSaldo(resultado);
			
			String cadena1="Retirada de "+b+" El saldo es de : "+Person1.getSaldo();
			Moviments.add(cadena1);
		break;
		
		case 7:
		
		 for (int a=0; a<Moviments.size();a++) {
			 System.out.println(Moviments.get(a).toString());
		 }
		break;
		
		case 8:
			System.out.println("Has eixit del programa");
		break;
		default:
			System.out.println("Has ficat un nombre que no es correcte");
		break;
			
			}
		}while(opcion!=8);
	}
}
