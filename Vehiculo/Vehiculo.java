package Vehiculo;

public class Vehiculo {
	
protected String nombreVehiculo;
	
	public Vehiculo(String nombreVehiculo) {
		this.nombreVehiculo=nombreVehiculo;
	}

	public String getNombreVehiculo() {
		return nombreVehiculo;
	}

	public void setNombreVehiculo(String nombreVehiculo) {
		this.nombreVehiculo = nombreVehiculo;
	}

	public String transportar() {
		return "Este vehiculo puede transportar";
	}
}
