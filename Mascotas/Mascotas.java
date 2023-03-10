package Mascotas;

public abstract class Mascotas {
	
	protected String nombre;
	protected int edad;
	protected String estado;
	protected String fechaNacimiento;
	
	public Mascotas(String nombre, int edad, String estado, String fechaNacimiento) {
		this.edad=edad;
		this.edad=edad;
		this.estado=estado;
		this.fechaNacimiento=fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public abstract void muestra();
	
	public String cumpleaños() {
		return "El cumpleaños de tu mascota es mañana si no es mañana lo vuelve a leer";
	}
	
	public void morir() {
		
	}
	public String habla() {
		return "Esta mascota puede hablar";
	}
}
