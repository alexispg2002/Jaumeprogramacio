package Mascotas;

import java.util.ArrayList;

public class Inventario {
	
	private ArrayList<Mascotas>animales= new ArrayList();
	
	private String getTipoMascota(Mascotas m) {
		if (m instanceof Perro) {
			return "Perro";
		}else if (m instanceof Gato) {
			return "Gato";
		}else if (m instanceof Loro) {
			return "Loro";
		}else if (m instanceof Canario) {
			return "Canario";
		}else {
			return null;
		}
	}
	
	public void mostrarListaAnimales() {
		System.out.println("===LISTA DE ANIMALES===");
		for (int i=0; i<animales.size(); i++) {
			Mascotas m = animales.get(i);
			String tipo = getTipoMascota(m);
			String nombre = m.getNombre();
			System.out.println(i +":"+ tipo +" "+ nombre);
		}
	}
	
	public void mostrarUnAnimal(int indice) {
		if(indice>=0&&indice<animales.size()) {
			System.out.println("===MASCOTAS"+ indice + "===");
			Mascotas m = animales.get(indice);
			m.muestra();
		}
	}
	
	public void mostrarTodosAnimales() {
		for(int i=0; i<animales.size(); i++) {
			mostrarUnAnimal(i);
			System.out.println("");
		}
	}
	
	public void insertarAnimal(Mascotas a) {
		animales.add(a);
	}
	
	public boolean eliminarAnimal(int indice) {
		if (indice >= 0 && indice < animales.size()) {
            animales.remove(indice);
            return true;
        } else {
            return false;
        }	
	}
	
	public void vaciarInventario() {
		animales.clear();
	}

}
