package Calculadora_de_Complexes;
import java.util.Scanner;

public class MainCalculadora {
	
public static void main(String[]args) {
		Calculadora a = new Calculadora(0,0);
		Calculadora b = new Calculadora(0,0);
		Calculadora resultat = new Calculadora (0,0);
	
		Scanner src=new Scanner(System.in);
		int opcion;
		
		
		System.out.println("Donam el valor de A");
		a.setReal(src.nextDouble());
		System.out.println("Donam el valor de B");
		a.setImg(src.nextDouble());
		System.out.println("Donam el valor de C");
		b.setReal(src.nextDouble());
		System.out.println("Donam el valor de D");
		b.setImg(src.nextDouble());

		do {
		System.out.println("*********************************************");
		System.out.println("*****************MENU************************");
		System.out.println("*********************************************");
		System.out.println("*****************1.SUMA**********************");
		System.out.println("*****************2.RESTA*********************");
		System.out.println("************3.MULTIPLICAR DOS NOMBRES********");
		System.out.println("********4.MULTIPLICAR UN NÚMERO DOBLE********");
		System.out.println("***************5.DIVIDIR*********************");
		System.out.println("***************6.EIXIR***********************");
		System.out.println("*********************************************");
		
		opcion=src.nextInt();
		switch (opcion) {
		
		case 1:
			
			System.out.println("Has elegit la suma");
			System.out.println("(a, b) + (c, d) = (a + c, b + d)");
			resultat=a.Suma(b);
			
			System.out.println(resultat.toString());
			System.out.println(a.equals(b));
			
		break;
		
		case 2:
			
			System.out.println("Has elegit la resta");
			System.out.println("(a, b) - (c, d) = (a - c, b - d)");
			
			resultat=a.Resta(b);
			
			System.out.println(resultat.toString());
			System.out.println(a.equals(b));
			
		break;
		
		case 3:
			
			System.out.println("Has elegit la multiplicacio de dos nombres");
			System.out.println("(a, b) * (c, d) = (a*c – b*d, a*d + b*c)");
			
			resultat=a.Multiplicar1(b);
			
			System.out.println(resultat.toString());
			System.out.println(a.equals(b));
			
		break;
		
		case 4:
			System.out.println("Has elegit la multiplicacio de un nombre doble");
			System.out.println("Fica el nombre a multiplicar");
			double n=src.nextDouble();
			
			System.out.println("(a, b) * n = (a * n, b * n)");
			
			resultat=a.Multiplicar2(n);
			
			System.out.println(resultat.toString());
			System.out.println(a.equals(b));
		break;
		
		case 5:
			
			System.out.println("Has elegit la divisio");
			System.out.println("(a, b) / (c, d) = ((a*c + b*d) / (c2 + d2) , (b*c – a*d) / (c2 + d2))");
		
			resultat=a.Dividir(b);
			System.out.println(resultat.toString());
			System.out.println(a.equals(b));
		break;
		}
		}while(opcion!=6);
	
		System.out.println("Has eixit del programa.");
	
	}

}
