package Mascotas;

public class Perro extends Mascotas{
	private String raza;
	private boolean pulgas;
	
	public Perro(String nombre, int edad, String estado, String fechaNacimiento, String raza, boolean pulgas) {
		super(nombre, edad, estado, fechaNacimiento);
		this.raza=raza;
		this.pulgas=pulgas;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}

	public boolean isPulgas() {
		return pulgas;
	}

	public void setPulgas(boolean pulgas) {
		this.pulgas = pulgas;
	}

	public String habla() {
		return"GUAU GUAU";
	}

	@Override
	public void muestra() {
		 System.out.println("Nombre : " + this.getNombre());
	     System.out.println("Edad   : " + this.getEdad());
	     System.out.println("Estado : " + this.getEstado());
	     System.out.println("Nacido : " + this.getFechaNacimiento());
	     System.out.println("Raza : " + this.getRaza());
	     System.out.println("Pulgas : " + this.isPulgas());
	        }
	
}
