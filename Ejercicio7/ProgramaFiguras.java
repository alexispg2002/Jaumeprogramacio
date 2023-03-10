package Ejercicio7;

import java.util.ArrayList;

public class ProgramaFiguras {
	
	public static void man(String []args) {
		
		ArrayList<iFigura2D>Figura= new ArrayList();
		
		
		Circulo fig1 = new Circulo(25.36);
		Rectangulo fig2 = new Rectangulo(24,16.5);
		Triangulo fig3 = new Triangulo(12.48,4.2); 
		Cuadrado fig4 = new Cuadrado(14.36);
		
		Figura.add(fig1);
		Figura.add(fig2);
		Figura.add(fig3);
		Figura.add(fig4);
		
		
		fig1.imprimir();
		fig2.imprimir();
		fig3.imprimir();
		fig4.imprimir();
		
		fig1.escalar(2);
		fig2.escalar(2);
		fig3.escalar(2);
		fig4.escalar(2);
		
		fig1.imprimir();
		fig2.imprimir();
		fig3.imprimir();
		fig4.imprimir();
		
		fig1.escalar(0.1);
		fig2.escalar(0.1);
		fig3.escalar(0.1);
		fig4.escalar(0.1);
		
		fig1.imprimir();
		fig2.imprimir();
		fig3.imprimir();
		fig4.imprimir();
	}

}
