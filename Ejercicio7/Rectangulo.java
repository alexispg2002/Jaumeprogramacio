package Ejercicio7;

public class Rectangulo implements iFigura2D{
	
	private double ancho;
	private double alto;
	
	public Rectangulo(double ancho,double alto) {
		this.ancho=ancho;
		this.alto=alto;
	}
	
	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double perimetro() {
		
		return 2*ancho+2*alto;
	}
	
	public double area() {
		
		return ancho*alto;
	}

	public void escalar(double escala) {
		
		ancho=ancho*escala;
		alto=alto*escala;
		
	}
	
	public void imprimir() {
		System.out.println("El ancho de los rectangulos= "+ancho+" el alto de los rectangulos= "+alto+" el perimetro="+perimetro()+" y el area="+area());
	}

}
