package Mascotas;

public class Canario extends Aves{
	
	private String color;
	private boolean canta;
	
	public Canario(String nombre, int edad, String estado, String fechaNacimiento,String pico, boolean vuela, String color, boolean canta) {
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);
		this.color=color;
		this.canta=canta;
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isCanta() {
		return canta;
	}

	public void setCanta(boolean canta) {
		this.canta = canta;
	}

	@Override
	public void muestra() {
		System.out.println("Nombre : " + this.getNombre());
	     System.out.println("Edad   : " + this.getEdad());
	     System.out.println("Estado : " + this.getEstado());
	     System.out.println("Nacido : " + this.getFechaNacimiento());
	     System.out.println("Raza : " + this.getPico());
	     System.out.println("Pulgas : " + this.isVuela());
	     System.out.println("Raza : " + this.getColor());
	     System.out.println("Pulgas : " + this.isCanta());
	}
	
	@Override
	public void volar() {
		System.out.println("Volando");
	}

	public String habla() {
		return"PIO PIO";
	}
	
	public void saluda() {
		System.out.println("Hola hola, como estas?");
	}
}
