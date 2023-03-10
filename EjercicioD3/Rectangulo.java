package EjercicioD3;

public class Rectangulo {

	private int X1;
	private int Y1;
	private int X2;
	private int Y2;
	
	public Rectangulo(int X1, int Y1, int X2, int Y2) {
		if((X1<X2)&&(Y1<Y2)) {
		this.X1=X1;
		this.Y1=Y1;
		this.X2=X2;
		this.Y2=Y2;
		}else {
			System.err.println("ERROR al intanciar el rectangulo ("+X1+","+Y1+")("+X2+","+Y2+")");
		}
	}
	public int getX1(){
		return X1;
	}
	public int getY1(){
		return Y1;
	}
	public int getX2(){
		return X2;
	}
	public int getY2(){
		return Y2;
	}
	
	public void setX1(int X1) {
		if(X1>this.X2) {
			System.err.println("ERROR el valor de x1 no puede ser mayor que el valor de x2");
        } else {
		this.X1=X1;
		}
	}
	public void setY1(int Y1) {
		if(Y1>this.Y2) {System.err.println("ERROR el valor de y1 no puede ser mayor que el valor de y2");
        } else {
		this.Y1=Y1;
		}
	}
	public void setX2(int X2) {
		if(X2<this.X1) {
			System.err.println("ERROR el valor de x2 no puede ser mayor que el valor de x1");
        } else {
		this.X2=X2;
		}
	}
	public void setY2(int Y2) {
		if(Y2>this.Y1) {System.err.println("ERROR el valor de y2 no puede ser mayor que el valor de y1");
        } else {
		this.Y2=Y2;
		}
	}
	
	public void setX1Y1(int x1, int y1) {
		this.setX1(x1);
		this.setY1(y1);
	}
	
	public void setX2Y2(int x2, int y2) {
		this.setX2(x2);
		this.setY2(y2);
	}
	
	public void setAll(int x1, int y1, int x2, int y2) {
		this.setX1(x1);
		this.setY1(y1);
		this.setX2(x2);
		this.setY2(y2);
	}
	
	public int getPerimetro() {
		return (this.X1-this.X2)*2 + (this.Y1-this.Y2)*2;
	}
	
	public int getArea() {
		return (this.X1 - this.X2) * (this.Y1 - this.Y2);
	}
	public void imprime() {
		 System.out.println("Coordenadas: (" + this.X1 + "," + this.Y1 + ")-(" + this.X2 + "," + this.Y2 + ")");
	        System.out.println("Perimetro: " + this.getPerimetro());
	        System.out.println("Area: " + this.getArea());
		
	}
}
