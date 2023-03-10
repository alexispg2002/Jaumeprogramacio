package Vehiculosempresa;

public class Coches extends Terrestres{
	
	private boolean AireCondicionado;
	
	public Coches(String matricula, String modelo, int numRuedas, boolean AireCondicionado) {
		super(matricula, modelo, numRuedas);
		this.AireCondicionado=AireCondicionado;
	}
	
	public boolean isAireCondicionado() {
		return AireCondicionado;
	}

	public void setAireCondicionado(boolean aireCondicionado) {
		AireCondicionado = aireCondicionado;
	}

	public void imprimir() {
		System.out.println("La matricula del vehiculo es,"+ getMatricula()+ " el modelo del vehiculo es,"+ getModelo()+" tiene "+getNumRuedas()+" numero de ruedas y tiene aire acondicionado="+isAireCondicionado());

	}
}
