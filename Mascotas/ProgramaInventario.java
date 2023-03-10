package Mascotas;

import java.util.*;

public class ProgramaInventario {
	
	public static void main(String []args) {
	
		Perro p1 = new Perro("Bobby", 5, "jugando", "Feb-2018", "Pastor alemán", false);
		Perro p2 = new Perro("Lulu", 7, "durmiendo", "Abril-2016", "Rottweiler", false);
		Gato g1 = new Gato("Luna", 2, "durmiendo", "Sept-2020", "negro", false);
		Gato g2 = new Gato("Pecas", 2, "rascandose", "Julio-2019", "blanco", true);
		Loro l1 = new Loro("Arturito", 10, "hablando", "Enero-2015", "largo", true, "Murcia", true);
		Canario c1 = new Canario("Basilio", 5, "piando", "Dic-2018", "corto", true, "amarillo", true);
	
		
		Inventario inventario = new Inventario();
		
		
		inventario.insertarAnimal(p1);
		inventario.insertarAnimal(p2);
		inventario.insertarAnimal(g1);
		inventario.insertarAnimal(g2);
		inventario.insertarAnimal(l1);
		inventario.insertarAnimal(c1);
		
		
		inventario.mostrarListaAnimales();
		System.out.println("");
		
		
		inventario.mostrarTodosAnimales();
		
		
		inventario.eliminarAnimal(1);
		inventario.eliminarAnimal(2);
		
		
		inventario.mostrarListaAnimales();
		System.out.println("");
	}

}
