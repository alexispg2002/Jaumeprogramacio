package ClasseFigura;

public class Superheroe {

	private String Nom;
	private String Des;
	private boolean Capa;
	
	public Superheroe(String Nom) {
		this.Nom=Nom;
		this.Des="";
		this.Capa=false;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = this.Nom;
	}

	public String getDes() {
		return Des;
	}

	public void setDes(String des) {
		Des = this.Des;
	}

	public boolean getCapa() {
		return Capa;
	}

	public boolean isCapa() {
		return Capa = this.Capa;
	}

	@Override
	public String toString() {
		return "Superheroe [Nom=" + Nom + ", Des=" + Des + ", Capa=" + Capa + "]";
	}
}
