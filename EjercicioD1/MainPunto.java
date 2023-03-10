package EjercicioD1;

public class MainPunto {
	
public static void main(String[] args) {
		
		Punto p1 = new Punto(2,7);
		Punto p2 = new Punto(6,5);
		Punto p3 = new Punto(8,1);
		
		p1.imprime();
		p2.imprime();
		p3.imprime();
		System.out.println();
		
		p1.setX(p1.getX() + 3);
		p1.setY(6);
		
		p2.setX(p2.getX() / 2);
		p2.setY(p2.getY() * 2);
		
		p3.setX(p3.getX() - 5);
		p3.setY(p3.getY() % 2);
		
		p1.imprime();
		p2.imprime();
		p3.imprime();
		System.out.println();

		System.out.println("La diferencia entre P1 y P2 es:"+p1.distancia(p2));
		System.out.println("La diferencia entre p2 y p3 es:"+p2.distancia(p3));
		System.out.println("La diferencia entre p3 y p1 es:"+p3.distancia(p1));
		
		p1.desplaza(-1, -5);
		System.out.println("P1 tras deplazarse -1 y -5");
		p1.imprime();
		
		p2.desplaza(1, 8);
		System.out.println("P2 tras deplazarse 1 y 8");
		p2.imprime();
		
		p3.desplaza(10, -8);
		System.out.println("P3 tras deplazarse 10 y -8");
		p3.imprime();
	}

}
