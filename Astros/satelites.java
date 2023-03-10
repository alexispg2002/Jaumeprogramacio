package Astros;

public class satelites extends Astros{
	
	private double distanciaalplaneta;
	private double orbitaplanetaria;
	private String planetaalquepertenece;
	
	
	public satelites(double radioecuatorial, double rotacionsobresueje, double masa, double temperaturamedia,
			double gavedad, double distanciaalplaneta, double orbitaplanetaria, String planetaalquepertenece) {
		super(radioecuatorial, rotacionsobresueje, masa, temperaturamedia, gavedad);
		this.distanciaalplaneta = distanciaalplaneta;
		this.orbitaplanetaria = orbitaplanetaria;
		this.planetaalquepertenece = planetaalquepertenece;
	}


	public double getDistanciaalplaneta() {
		return distanciaalplaneta;
	}


	public void setDistanciaalplaneta(double distanciaalplaneta) {
		this.distanciaalplaneta = distanciaalplaneta;
	}


	public double getOrbitaplanetaria() {
		return orbitaplanetaria;
	}


	public void setOrbitaplanetaria(double orbitaplanetaria) {
		this.orbitaplanetaria = orbitaplanetaria;
	}


	public String getPlanetaalquepertenece() {
		return planetaalquepertenece;
	}


	public void setPlanetaalquepertenece(String planetaalquepertenece) {
		this.planetaalquepertenece = planetaalquepertenece;
	}
	
	public String toString() {
		return "Astros [radioecuatorial=" + radioecuatorial + ", rotacionsobresueje=" + rotacionsobresueje + ", masa="
				+ masa + ", temperaturamedia=" + temperaturamedia + ", gavedad=" + gavedad + ", distancia al planeta"+distanciaalplaneta+", orbita planetaria"+orbitaplanetaria+"planeta al que pertenece"+planetaalquepertenece+"]";
	}
	
	
}
