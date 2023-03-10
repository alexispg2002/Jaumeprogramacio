package EjercicioD1;

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
}
