package Vehiculosempresa;
import java.util.ArrayList;
public class Programa {
	
	public static void main (String[]args) {
		
		
		
		Acuatico Barco1 = new Acuatico(null, null, 287.45);
		
		Barco Barco2 = new Barco(null, null, 126.34, false);
		
		Submarino Barco3 = new Submarino(null, null, 365.24, 2459.27);
		
		Terrestres Veh1 = new Terrestres(null, null, 2);
		
		Coches Veh2 = new Coches(null, null, 4, true);
		
		Motos Veh3 = new Motos(null, null, 2, null);
		
		Aereos Avion1 = new Aereos(null, null, 3);
		
		Aviones Avion2 = new Aviones(null, null, 423, 487);
		
		Helicopteros Avion3 = new Helicopteros(null, null, 7, 8); 
	}

}
