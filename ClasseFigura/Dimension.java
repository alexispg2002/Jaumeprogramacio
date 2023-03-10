package ClasseFigura;

public class Dimension {

	private double Alt=0;
	private double Ample=0;
	private double Profunditat=0;
	private double Volumen;
	
	
	public Dimension (double Alt, double Ample, double profunditat) {
		this.Alt=Alt;
		this.Ample=Ample;
		this.Profunditat=profunditat;
	}


	public double getAlt() {
		return Alt;
	}


	public void setAlt(double alt) {
		this.Alt = alt;
	}


	public double getAmple() {
		return Ample;
	}


	public void setAmple(double ample) {
		this.Ample = ample;
	}


	public double getProfunditat() {
		return Profunditat;
	}


	public void setProfunditat(double profunditat) {
		this.Profunditat = profunditat;
	}

	
	public double getVolumen(double volumenmax) {
		return volumenmax= this.Alt*this.Ample*this.Profunditat;
	}
	
	public void setVolumen(double volumen) {
		this.Volumen=Volumen;
	}
	@Override
	public String toString() {
		return "Dimension [Alt=" + this.Alt + ", Ample=" + this.Ample + ", Profunditat=" + this.Profunditat + ", Volumen"+this.Volumen+"]";
	}
	
}
