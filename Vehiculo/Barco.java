package Vehiculo;

public class Barco extends Acuatico{
	
	public Barco(String nombreAcuatico) {
		super(nombreAcuatico, nombreAcuatico);
	}
	
	public String prenderMotor() {
		return "Este vehiculo acuatico va a motor";
	}

}
