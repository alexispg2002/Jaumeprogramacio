package Mascotas;

public class Gato extends Mascotas{

	private String color;
	private boolean peloLargo;
	
	public Gato (String nombre, int edad, String estado, String fechaNacimiento, String color, boolean peloLargo) {
		super(nombre, edad, estado, fechaNacimiento);
		this.color=color;
		this.peloLargo=peloLargo;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean ispeloLargo() {
		return peloLargo;
	}

	public void setpeloLargo(boolean peloLargo) {
		this.peloLargo = peloLargo;
	}
	
	public String habla() {
		return "Este animal no habla";
	}

	@Override
	public void muestra() {
		System.out.println("Nombre : " + this.getNombre());
	     System.out.println("Edad   : " + this.getEdad());
	     System.out.println("Estado : " + this.getEstado());
	     System.out.println("Nacido : " + this.getFechaNacimiento());
	     System.out.println("Raza : " + this.getColor());
	     System.out.println("Pulgas : " + this.ispeloLargo());
	}
	
}
