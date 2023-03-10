package ClasseFigura;

public class Figura {
	
	
	private String Codi;
	private double Preu;
	private Superheroe Superheroe;
	private Dimension dimensions;
	
	public Figura (String Codi, double Preu, Superheroe Superheroe, Dimension dimensions) {
		this.Codi=Codi;
		this.Preu=Preu;
		this.Superheroe=Superheroe;
		this.dimensions=dimensions;
	}

	public String getCodi() {
		return Codi;
	}

	public void setCodi(String codi) {
		this.Codi = codi;
	}

	public double getPreu() {
		return Preu;
	}

	public void setPreu(double preu) {
		this.Preu = preu;
	}

	public Superheroe getSuperheroe() {
		return Superheroe;
	}

	public void setSuperheroe(Superheroe Superheroe) {
		this.Superheroe = Superheroe;
	}

	public Dimension getdimensions() {
		return dimensions;
	}

	public void setVolumen(Dimension dimensions) {
		this.dimensions = dimensions;
	}

	@Override
	public String toString() {
		return "Figura [Codi=" + this.Codi + ", Preu=" + this.Preu + ", Des=" + this.Superheroe + ", Dimensions=" + this.dimensions + "]";
	}
	
	public void pujarPreu(double quantitat) {
		this.Preu +=quantitat;
	}

}
