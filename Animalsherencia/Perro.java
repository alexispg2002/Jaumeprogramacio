package Animalsherencia;

public class Perro extends Mamifero{

	private String raza;
	
	public Perro(String nombre, String tipo_alimentacio, int edad, int gestacion, String raza) {
		super(nombre, tipo_alimentacio, edad, gestacion);
		this.raza=raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", tipo_alimentacion=" + tipo_alimentacion + ", edad=" + edad + ", raza"+raza+"]";
	}
}
