package EjercicioE2;

public class MainPersona {

public static void main(String[] args) {
		
		Persona p1=new Persona("20548712M", "Alex", "Lopez", 18);
		Persona p2=new Persona("15648795J", "Carles", "Ortiz", 16);
		
		p1.imprime();
		p2.imprime();
		System.out.println("");
		
		
		p1.setNombre("Juan");
		p1.setApellidos("Perez");
		
		p1.setEdad(34);
		
		p2.setNombre("Angel");
		p2.setApellidos("Alegre");
		
		p2.setEdad(17);
		
		p1.imprime();
		p2.imprime();
		System.out.println("");
		
		System.out.println("La diferencia de edad es "+p1.diferenciaEdad(p2));
	}
}
