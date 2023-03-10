package Animalsherencia;

public class Mamifero extends Animal{
	
	protected int gestacion;
	
	public Mamifero(String nombre, String tipo_alimentacio, int edad, int gestacion) {
		super(nombre, tipo_alimentacio, edad);
		this.gestacion=gestacion;
	}

	public int getGestacion() {
		return gestacion;
	}

	public void setGestacion(int gestacion) {
		this.gestacion = gestacion;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", tipo_alimentacion=" + tipo_alimentacion + ", edad=" + edad + ", gestacion= "+gestacion+"]";
	}
	

}
