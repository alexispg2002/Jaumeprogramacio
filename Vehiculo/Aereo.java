package Vehiculo;

public class Aereo extends Vehiculo{

	protected String nombreAreo;
	
	public Aereo(String nombreVehiculo) {
		super(nombreVehiculo);
		this.nombreAreo=nombreAreo;
	}

	public String getNombreAcuatico() {
		return nombreAreo;
	}

	public void setNombreAcuatico(String nombreAreo) {
		this.nombreAreo = nombreAreo;
	}
	
	public String volar() {
		return "Este vehiculo puede volar";
	}
}
