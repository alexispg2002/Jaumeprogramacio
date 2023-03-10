package EjercicioC2;

import java.util.Scanner;

public class MainPersona {
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		Persona p1=new Persona("20548712M", "Alex", "Lopez", 18);
		Persona p2=new Persona("15648795J", "Carles", "Ortiz", 16);
		
		String cadena1 = p1.getDni()+" "+p1.getNombre()+" "+p1.getApellidos()+" "+p1.getEdad();
		String cadena2 = p2.getDni()+" "+p2.getNombre()+" "+p2.getApellidos()+" "+p2.getEdad();
		
		if (p1.getEdad()>=18) {
			cadena1 += " es mayor de edad";
		}else {
			cadena1 += "No es mayor de edad";
		}
		if(p2.getEdad()>=18) {
			cadena2 += " es mayor de edad";
		}else {
			cadena2 +=" No es mayor de edat";
		}
		
		System.out.println(cadena1);
		System.out.println(cadena2);
		System.out.println("");
		
		p1.setNombre("Juan");
		p1.setApellidos("Perez");
		p1.setDni("22556688M");
		p1.setEdad(34);
		
		p2.setNombre("Angel");
		p2.setApellidos("Alegre");
		p2.setDni("25586778M");
		p2.setEdad(17);
		
		String cadena11 = p1.getDni()+" "+p1.getNombre()+" "+p1.getApellidos()+" "+p1.getEdad();
		String cadena12 = p2.getDni()+" "+p2.getNombre()+" "+p2.getApellidos()+" "+p2.getEdad();
		
		if (p1.getEdad()>=18) {
			cadena11 += " es mayor de edad";
		}else {
			cadena11 += "No es mayor de edad";
		}
		if(p2.getEdad()>=18) {
			cadena12 += " es mayor de edad";
		}else {
			cadena12 +=" No es mayor de edat";
		}
		
		System.out.println(cadena11);
		System.out.println(cadena12);
	}

}
