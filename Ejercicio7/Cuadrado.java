package Ejercicio7;

public class Cuadrado implements iFigura2D{
	
	private double lado;

	public Cuadrado(double lado) {
		this.lado=lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double perimetro() {
		
		return lado+lado+lado+lado;
	}
	
	public double area() {
		
		return lado*lado;
	}

	public void escalar(double escala) {
		
		lado=lado*escala;
		
	}
	
	public void imprimir() {
		System.out.println("El lado de los cuadrados= "+lado+" el perimetro="+perimetro()+" y el area="+area());
	}
	
	
}
