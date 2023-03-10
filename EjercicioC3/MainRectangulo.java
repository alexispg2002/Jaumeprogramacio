package EjercicioC3;


public class MainRectangulo {
	public static void main(String[] args) {
		

		Rectangulo r1 = new Rectangulo(0,0,5,5);
		Rectangulo r2 = new Rectangulo(7,9,2,3);
		
		System.out.println("Coordenadas del primer rectangulo= ("+ r1.getX1() +","+ r1.getY1()+") y ("+r1.getX2()+","+r1.getY2()+")");
		System.out.println("Coordenadas del primer rectangulo= ("+ r2.getX1() +","+ r2.getY1()+") y ("+r2.getX2()+","+r2.getY2()+")");
		System.out.println("El perametro del rectangulo 1 es: " + perimetro(r1));
	    System.out.println("El pera­metro del rectangulo 2 es: " + perimetro(r2));
	    System.out.println("El Area del rectangulo 1 es: " + area(r1));
	    System.out.println("El Area del rectangulo 2 es: " + area(r2));
	    System.out.println("");
		
	    r1.setX1(10);
	    r1.setX2(3);
	    
	    r2.setY1(12);
	    r2.setY2(5);
		
		System.out.println("Coordenadas del primer rectangulo= ("+ r1.getX1() +","+ r1.getY1()+") y ("+r1.getX2()+","+r1.getY2()+")");
		System.out.println("Coordenadas del primer rectangulo= ("+ r2.getX1() +","+ r2.getY1()+") y ("+r2.getX2()+","+r2.getY2()+")");
		System.out.println("El perametro del rectangulo 1 es: " + perimetro(r1));
	    System.out.println("El pera­metro del rectangulo 2 es: " + perimetro(r2));
	    System.out.println("El Area del rectangulo 1 es: " + area(r1));
	    System.out.println("El Area del rectangulo 2 es: " + area(r2));
	    System.out.println("");
	    }
	  public static double perimetro(Rectangulo rect) {
		  int lado1 = Math.abs(rect.getX1() - rect.getX2());
	      int lado2 = Math.abs(rect.getY1() - rect.getY2());

	       return (lado1 + lado2) * 2;
		}
	  
	  public static double area(Rectangulo rect) {
	        int lado1 = Math.abs(rect.getX1() - rect.getX2());
	        int lado2 = Math.abs(rect.getY1() - rect.getY2());

	        return lado1 * lado2;
	    }
	}


