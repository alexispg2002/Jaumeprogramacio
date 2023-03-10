package Calculadora_de_Complexes;

public class Calculadora {
	
	private double real=0;
	private double img=0;
	
	public Calculadora(double real, double img) {
	this.real=real;
	this.img=img;
	}
	
	public double getReal() {
		return real;
	}
	
	public double getImg() {
		return img;
	}
	
	public void setReal(double real) {
		this.real=real;
	}
	
	public void setImg(double img) {
		this.img=img;
	}
	
	public Calculadora Suma (Calculadora obj) {
		
		double sumReal = this.real + obj.real;
		double sumImg = this.img + obj.img;
		
		Calculadora resultat=new Calculadora(sumReal, sumImg);
		return resultat;
	}
	
	public Calculadora Resta (Calculadora obj) {
		double restaReal = this.real - obj.real;
		double restaImg = this.img - obj.img;
		
		Calculadora resultat=new Calculadora(restaReal, restaImg);
		return resultat;
	}
	
	public Calculadora Multiplicar1 (Calculadora obj) {
		double multReal = this.real*obj.real - this.img*obj.img;
		double multImg = this.real*obj.img + this.img*obj.real;
		
		Calculadora resultat= new Calculadora (multReal,multImg);
		return resultat;
	}
	
	public Calculadora Multiplicar2 (double numero) {
		double multiReal = this.real*numero;
		double multiImg = this.img*numero;
		
		Calculadora resultat= new Calculadora (multiReal,multiImg);
		return resultat;
		
	}
	
	public Calculadora Dividir (Calculadora obj) {
		double divReal = (this.real*obj.real+this.img*obj.img)/(Math.pow(obj.real, 2)+Math.pow(obj.img, 2));
		double divImg = (this.img*obj.real-this.real*obj.img/(Math.pow(obj.real, 2)+Math.pow(obj.img, 2)));
		
		Calculadora resultat= new Calculadora (divReal,divImg);
		return resultat;
	}
	
	public String toString() {
		String imp;
		
		imp="("+ this.real+","+this.img+"i)";
		
		return imp;
	}
}
