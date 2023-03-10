package Astros;

public class Planetas extends Astros{
	
	private double distanciaalsol;
	private double orbitaalsol;
	private double tienesatelites;
	
	
	public Planetas(double radioecuatorial, double rotacionsobresueje, double masa, double temperaturamedia,
			double gavedad, double distanciaalsol, double orbitaalsol, double tienesatelites) {
		super(radioecuatorial, rotacionsobresueje, masa, temperaturamedia, gavedad);
		this.distanciaalsol = distanciaalsol;
		this.orbitaalsol = orbitaalsol;
		this.tienesatelites = tienesatelites;
	}


	public double getDistanciaalsol() {
		return distanciaalsol;
	}


	public void setDistanciaalsol(double distanciaalsol) {
		this.distanciaalsol = distanciaalsol;
	}


	public double getOrbitaalsol() {
		return orbitaalsol;
	}


	public void setOrbitaalsol(double orbitaalsol) {
		this.orbitaalsol = orbitaalsol;
	}


	public double getTienesatelites() {
		return tienesatelites;
	}


	public void setTienesatelites(double tienesatelites) {
		this.tienesatelites = tienesatelites;
	}
	
	public String toString() {
		return "Astros [radioecuatorial=" + radioecuatorial + ", rotacionsobresueje=" + rotacionsobresueje + ", masa="
				+ masa + ", temperaturamedia=" + temperaturamedia + ", gavedad=" + gavedad + ", distancia al sol"+distanciaalsol+", orbita al sol"+orbitaalsol+"tiene satelites"+tienesatelites+"]";
	}
}
