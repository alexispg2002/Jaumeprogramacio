package EjercicioE1;

public class Punto {

	private int x;
	private int y;
	public Punto(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void imprime() {
		System.out.println("("+this.x+","+this.y+")");
	}
	public void setXY(int a, int b) {
		this.x=a;
		this.y=b;
	}
	public void desplaza(int dx,int dy) {
		this.x +=dx;
		this.y +=dy;
	}
	public double distancia(Punto p) {
		return Math.sqrt(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y,2));
	}
	
	public static Punto creaPuntoAleatorio() {
	
		 int a=0;
		 int b=0;
		 
		 a =(int)((-100)+Math.random()*(100-(-100)+1));
		 b =(int)((-100)+Math.random()*(100-(-100)+1));
		 
		 System.out.println("("+a+","+b+")");
		 Punto result;
		 return result=new Punto(a,b);
	}
	public static Punto creaPuntoAleatorio1() {
		
		 int a=0;
		 int b=0;
		 
		 a =(int)((-100)+Math.random()*(100-(-100)+1));
		 b =(int)((-100)+Math.random()*(100-(-100)+1));
		 
		 System.out.println("("+a+","+b+")");
		 Punto result;
		 return result=new Punto(a,b);
	}
	public static Punto creaPuntoAleatorio2() {
		
		 int a=0;
		 int b=0;
		 
		 a =(int)((-100)+Math.random()*(100-(-100)+1));
		 b =(int)((-100)+Math.random()*(100-(-100)+1));
		 
		 System.out.println("("+a+","+b+")");
		 Punto result;
		 return result=new Punto(a,b);
	}
	
}
