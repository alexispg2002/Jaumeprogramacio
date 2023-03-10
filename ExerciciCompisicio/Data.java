package ExerciciCompisicio;

public class Data {
	
	private int dia;
	private int mes;
	private int any;
	
	public Data(int dia, int mes, int any) {
		this.dia=dia;
		this.mes=mes;
		this.any=any;
	}
	
	public int getdia() {
		return dia;
	}

	public void setdia(int dia) {
		this.dia=dia;
	}
	
	public int getmes() {
		return mes;
	}
	
	public void setmes(int mes) {
		this.mes=mes;
	}
	
	public int getany() {
		return any;
	}
	
	public void setany(int any) {
		this.any=any;
	}

	@Override
	public String toString() {
		return "Data [dia=" + dia + ", mes=" + mes + ", any=" + any + "]";
	}
}
