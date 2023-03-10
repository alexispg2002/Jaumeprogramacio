package Vehiculo;

public class Avion extends Aereo{

	public Avion(String nombreAereo) {
		super(nombreAereo);
	}
	
	public String bajarTrenDeAterrizaje() {
		return "Este vehiculo aereo tiene que bajar el tren de aterrizaje";
	}
}
