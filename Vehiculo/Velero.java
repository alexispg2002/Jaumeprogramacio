package Vehiculo;

public class Velero extends Acuatico{

	public Velero(String nombreAcuatico) {
		super(nombreAcuatico, nombreAcuatico);
	}
	
	public String izarVelas() {
		return "Este vehiculo acuatico va con velas";
	}
}
