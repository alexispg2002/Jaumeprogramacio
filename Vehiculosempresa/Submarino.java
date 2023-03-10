package Vehiculosempresa;

public class Submarino extends Acuatico{
	
private double ProfMax;
	
	
	public Submarino(String matricula, String modelo, double Eslora, double ProfMax) {
		super(matricula, modelo, Eslora);
		this.ProfMax=ProfMax;
	}
	
	public double getProfMax() {
		return ProfMax;
	}

	public void setProfMax(double profMax) {
		ProfMax = profMax;
	}

	public void imprimir() {
		System.out.println("La matricula del vehiculo es,"+ getMatricula()+ " el modelo del vehiculo es,"+ getModelo()+" tiene "+getEslora()+" metros de eslora y tiene una profundidad maxima de "+getProfMax()+"metros");
	}

}
