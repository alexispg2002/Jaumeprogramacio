package ExerciciCompisicio;

public class Examen {
	
	private Data Data;
	private Hora Hora;
	private String Asignatura;
	private String Aula;
	
	
	public Examen(Data Data, Hora Hora, String Asignatura, String Aula ) {
		this.Data=Data;
		this.Hora=Hora;
		this.Asignatura=Asignatura;
		this.Aula=Aula;
	}
	
	public Hora getHora() {
		return Hora;
	}
	
	public void setHora(Hora Hora) {
		this.Hora=Hora;
	}
	
	public Data getData() {
		return Data;
	}
	
	public void setData(Data Data) {
		this.Data=Data;
	}
	
	public String getAsignatura() {
		return Asignatura;
	}
	
	public void setAsignatura(String Asignatura) {
		this.Asignatura=Asignatura;
	}
	
	public String getAula() {
		return Aula;
	}
	
	public void setAula(String Aula) {
		this.Aula=Aula;
	}

	@Override
	public String toString() {
		return "Examen [Data=" + Data + ", Hora=" + Hora + ", Asignatura=" + Asignatura + ", Aula=" + Aula + "]";
	}
}
