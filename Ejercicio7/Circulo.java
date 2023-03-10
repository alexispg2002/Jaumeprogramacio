package Ejercicio7;

public class Circulo implements iFigura2D{

	private double radio;
	
	public Circulo(double radio) {
		this.radio=radio;	
	}
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double perimetro() {
		
		return 2*Math.PI*radio;
	}
	
	public double area() {
		
		return Math.PI*radio;
	}

	public void escalar(double escala) {
		
		radio=radio*escala;
		
	}
	
	public void imprimir() {
		System.out.println("El radio de los circulos= "+radio+" el perimetro="+perimetro()+" y el area="+area());
	}
	

}
