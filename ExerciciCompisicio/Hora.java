package ExerciciCompisicio;

public class Hora {
	
	private int hora;
	private int min;
	
	
	public Hora(int hora, int min) {
		this.hora=hora;
		this.min=min;
	}

	
	
	public int gethora() {
		return hora;
	}
	
	public void sethora(int hora) {
		this.hora=hora;
	}
	
	public int getmin() {
		return min;
	}
	
	public void setmin(int min) {
		this.min=min;
	}



	@Override
	public String toString() {
		return "Hora [hora=" + hora + ", min=" + min + "]";
	}
	
	
	
}
