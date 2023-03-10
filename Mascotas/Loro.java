package Mascotas;

public class Loro extends Aves{

	private String origen;
	private boolean habla;
	public Loro(String nombre, int edad, String estado, String fechaNacimiento,String pico, boolean vuela, String origen, boolean habla) {
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);
		this.origen=origen;
		this.habla=habla;
		
	}
	
	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public boolean isHabla() {
		return habla;
	}

	public void setHabla(boolean habla) {
		this.habla = habla;
	}

	@Override
	public void muestra() {
		 System.out.println("Nombre : " + this.getNombre());
	     System.out.println("Edad   : " + this.getEdad());
	     System.out.println("Estado : " + this.getEstado());
	     System.out.println("Nacido : " + this.getFechaNacimiento());
	     System.out.println("Raza : " + this.getPico());
	     System.out.println("Pulgas : " + this.isVuela());
	     System.out.println("Raza : " + this.getOrigen());
	     System.out.println("Pulgas : " + this.isHabla());
	}
	
	@Override
	public void volar() {
		System.out.println("Volando");
	}
	
	public String saluda() {
		return "Buenos dias";
	}
}
