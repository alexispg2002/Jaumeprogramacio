package Agenda;

public class Agenda {

	private String DNI;
	private String Nom;
	private String Cognoms;
	private int Telef;
	private String Email;
	
	public Agenda(String DNI, String Nom, String Cognoms, int Telef, String Email) {
		this.DNI=DNI;
		this.Nom=Nom;
		this.Cognoms=Cognoms;
		this.Telef=Telef;
		this.Email=Email;
	}
	
	public String getDNI() {
		return DNI;
	}
	
	public void setDNI(String DNI) {
		this.DNI=DNI;
	}
	
	public String getNom() {
		return Nom;
	}
	
	public void setNom(String Nom) {
		this.Nom=Nom;
	}
	
	public String getCognoms() {
		return Cognoms;
	}
	
	public void setCognoms(String Cognoms) {
		this.Cognoms=Cognoms;
	}
	
	public int getTelef() {
		return Telef;
	}
	
	public void setTelef(int Telef) {
		this.Telef=Telef;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String Email) {
		this.Email=Email;
	}

	@Override
	public String toString() {
		return "Agenda [DNI=" + DNI + ", Nom=" + Nom + ", Cognoms=" + Cognoms + ", Telef=" + Telef + ", Email=" + Email
				+ "]";
	}
	
	
	
	
}
