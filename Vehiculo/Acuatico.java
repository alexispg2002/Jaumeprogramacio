package Vehiculo;

public class Acuatico extends Vehiculo{

	protected String nombreAcuatico;
	
	public Acuatico(String nombreVehiculo, String nombreAcuatico) {
		super(nombreVehiculo);
		this.nombreAcuatico=nombreAcuatico;
	}

	public String getNombreAcuatico() {
		return nombreAcuatico;
	}

	public void setNombreAcuatico(String nombreAcuatico) {
		this.nombreAcuatico = nombreAcuatico;
	}
	
	public String navegar() {
		return "Este vehiculo puede navegar";
	}
}
