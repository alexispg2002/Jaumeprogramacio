package Astros;

public class Astros {
	
	protected double radioecuatorial;
	protected double rotacionsobresueje;
	protected double masa;
	protected double temperaturamedia;
	protected double gavedad;
	
	
	public Astros(double radioecuatorial, double rotacionsobresueje, double masa, double temperaturamedia,
			double gavedad) {
		this.radioecuatorial = radioecuatorial;
		this.rotacionsobresueje = rotacionsobresueje;
		this.masa = masa;
		this.temperaturamedia = temperaturamedia;
		this.gavedad = gavedad;
	}


	public double getRadioecuatorial() {
		return radioecuatorial;
	}


	public void setRadioecuatorial(double radioecuatorial) {
		this.radioecuatorial = radioecuatorial;
	}


	public double getRotacionsobresueje() {
		return rotacionsobresueje;
	}


	public void setRotacionsobresueje(double rotacionsobresueje) {
		this.rotacionsobresueje = rotacionsobresueje;
	}


	public double getMasa() {
		return masa;
	}


	public void setMasa(double masa) {
		this.masa = masa;
	}


	public double getTemperaturamedia() {
		return temperaturamedia;
	}


	public void setTemperaturamedia(double temperaturamedia) {
		this.temperaturamedia = temperaturamedia;
	}


	public double getGavedad() {
		return gavedad;
	}


	public void setGavedad(double gavedad) {
		this.gavedad = gavedad;
	}


	@Override
	public String toString() {
		return "Astros [radioecuatorial=" + radioecuatorial + ", rotacionsobresueje=" + rotacionsobresueje + ", masa="
				+ masa + ", temperaturamedia=" + temperaturamedia + ", gavedad=" + gavedad + "]";
	}
}
