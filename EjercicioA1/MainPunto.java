package EjercicioA1;

public class MainPunto {
	

	public static void main(String[] args) {
		
		Punto p1 = new Punto(2,7);
		Punto p2 = new Punto(2,7);
		Punto p3 = new Punto(2,7);
		
		
		
		System.out.println("Coordenadas del punto p1= "+ p1.getX() +" y "+ p1.getY());
		System.out.println("Coordenadas del punto p2= "+ p2.getX() +" y "+ p2.getY());
		System.out.println("Coordenadas del punto p3= "+ p3.getX() +" y "+ p3.getY());
	
		p1.setX(p1.getX() + 3);
		p1.setY(6);
		
		p2.setX(p2.getX() / 2);
		p2.setY(p2.getY() * 2);
		
		p3.setX(p3.getX() - 5);
		p3.setY(p3.getY() - 10);
		
		System.out.println("Coordenadas del punto p1= "+ p1.getX() +" y "+ p1.getY());
		System.out.println("Coordenadas del punto p2= "+ p2.getX() +" y "+ p2.getY());
		System.out.println("Coordenadas del punto p3= "+ p3.getX() +" y "+ p3.getY());
	}
}
