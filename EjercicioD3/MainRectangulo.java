package EjercicioD3;

public class MainRectangulo {
	public static void main(String[] args) {
		

		Rectangulo r1 = new Rectangulo(0,0,5,5);
		Rectangulo r2 = new Rectangulo(7,9,2,3);
		
		r1.imprime();
		r2.imprime();
		
	    r1.setX1(10);
	    r1.setX2(3);
	    
	    r2.setY1(12);
	    r2.setY2(5);
		
	    r1.imprime();
	    r2.imprime();
	    
	    r1.setX1Y1(2, 4);
	    r1.setX2Y2(10, 20);
	    r2.setAll(3, 4, 5, 6);
	    r1.imprime();
	    r2.imprime();
	}
}
