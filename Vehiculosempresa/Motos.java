package Vehiculosempresa;

public class Motos extends Terrestres{

	private String Color;
	
	public Motos(String matricula, String modelo, int numRuedas, String Color) {
		super(matricula, modelo, numRuedas);
		this.Color=Color;
	}
	
	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public void imprimir() {
		System.out.println("La matricula del vehiculo es,"+ getMatricula()+ " el modelo del vehiculo es,"+ getModelo()+" tiene "+getNumRuedas()+" numero de ruedas y su color es "+getColor());
	}
	
	

}
