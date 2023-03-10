package Vehiculosempresa;

public class Helicopteros extends Aereos{

private int NumHelices;
	
	public Helicopteros(String matricula, String modelo, int numAsientos, int NumHelices) {
		super(matricula, modelo, numAsientos);
		this.NumHelices=NumHelices;
	}
	
	public int getNumHelices() {
		return NumHelices;
	}

	public void setNumHelices(int numHelices) {
		NumHelices = numHelices;
	}

	public void imprimir() {
		System.out.println("La matricula del vehiculo es,"+ getMatricula()+ " el modelo del vehiculo es,"+ getModelo()+" tiene "+getNumAsientos()+" numero de asientos y tiene"+getNumHelices()+"numero de helices");
	}
}
