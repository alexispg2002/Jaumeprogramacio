package Vehiculosempresa;

public class Aviones extends Aereos{
	
	private double Tiempomaxvuelo;
	
	public Aviones(String matricula, String modelo, int numAsientos, double Tiempomaxvuelo) {
		super(matricula, modelo, numAsientos);
		this.Tiempomaxvuelo=Tiempomaxvuelo;
	}
	
	public double getTiempomaxvuelo() {
		return Tiempomaxvuelo;
	}

	public void setTiempomaxvuelo(double tiempomaxvuelo) {
		Tiempomaxvuelo = tiempomaxvuelo;
	}

	public void imprimir() {
		System.out.println("La matricula del vehiculo es,"+ getMatricula()+ " el modelo del vehiculo es,"+ getModelo()+" tiene "+getNumAsientos()+" numero de asientos y tiene"+getTiempomaxvuelo()+"tiempo maximo de vuelo");
	}

}
