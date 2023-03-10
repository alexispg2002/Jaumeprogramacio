package EjercicioA3;

public class MainRectangulo {
public static void main(String[] args) {
	

	Rectangulo r1 = new Rectangulo(0,0,5,5);
	Rectangulo r2 = new Rectangulo(7,9,2,3);
	

	
	int perimetro1 = r1.x1+r1.y1+r1.x2+r1.y2;
	int perimetro2 = r2.x1+r2.y1+r2.x2+r2.y2;
	
	int area1 = r1.x2*r1.y2;
	int area2 = r2.x1*r2.y1;
	
	System.out.println("Coordenadas del primer rectangulo= ("+ r1.x1 +","+ r1.y1+") y ("+r1.x2+","+r1.y2+"), el perimetro es "+ perimetro1+" y el area es "+area1);
	System.out.println("Coordenadas del primer rectangulo= ("+ r2.x1 +","+ r2.y1+") y ("+r2.x2+","+r2.y2+"), el perimetro es "+ perimetro2+" y el area es "+area2);
	
	r1.x1+=3;
	r1.y1-=2;
	r1.x2*=5;
	r1.y2/=5;
	
	r2.x1+=7;
	r2.y1*=9;
	r2.x2-=2;
	r2.y2/=3;
	
	System.out.println("Coordenadas del primer rectangulo= ("+ r1.x1 +","+ r1.y1+") y ("+r1.x2+","+r1.y2+"), el perimetro es "+ perimetro1+" y el area es "+area1);
	System.out.println("Coordenadas del primer rectangulo= ("+ r2.x1 +","+ r2.y1+") y ("+r2.x2+","+r2.y2+"), el perimetro es "+ perimetro2+" y el area es "+area2);
	
	}
}
