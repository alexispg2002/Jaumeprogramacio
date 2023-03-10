package Mascotas;

public abstract class Aves extends Mascotas{
	
	protected String pico;
	protected boolean vuela;
	
	public Aves(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela) {
		super( nombre,  edad,  estado, fechaNacimiento);
		this.pico=pico;
		this.vuela=vuela;
	}

	public String getPico() {
		return pico;
	}

	public void setPico(String pico) {
		this.pico = pico;
	}

	public boolean isVuela() {
		return vuela;
	}

	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}
	
	public abstract void volar();

}
