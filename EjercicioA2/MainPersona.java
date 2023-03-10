package EjercicioA2;
import java.util.Scanner;
public class MainPersona {
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		Persona p1=new Persona("20548712M", "Alex", "Lopez", 18);
		Persona p2=new Persona("15648795J", "Carles", "Ortiz", 16);
		
		String cadena1 = p1.dni+" "+p1.nombre+" "+p1.apellido+" "+p1.edad;
		String cadena2 = p2.dni+" "+p2.nombre+" "+p2.apellido+" "+p2.edad;
		
		if (p1.edad>=18) {
			cadena1 += " es mayor de edad";
		}else {
			cadena1 += "No es mayor de edad";
		}
		if(p2.edad>=18) {
			cadena2 += " es mayor de edad";
		}else {
			cadena2 +=" No es mayor de edat";
		}
		
		System.out.println(cadena1);
		System.out.println(cadena2);
		
	}
}
