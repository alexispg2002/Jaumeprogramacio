package Vehiculo;

public class Helicoptero extends Aereo{
	
	public Helicoptero(String nombreAereo) {
		super(nombreAereo);
	}
	
	public String encerderHelices() {
		return "Este vehiculo aereo para arrancar tiene que encender las helices";
	}
	

}
