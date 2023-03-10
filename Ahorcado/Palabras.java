package Ahorcado;

public class Palabras {
	
	private String Letras;
	
	private String LetrasErroneas;
	
	private int puntos;
	
	public Palabras(String Letras, String LetrasErroneas, int puntos) {
		
		this.Letras=Letras;
		
		this.LetrasErroneas=LetrasErroneas;
		
		this.puntos=puntos;	
	}
	
	
	
	public String getLetras() {
		return Letras;
	}



	public void setLetras(String Letras) {
		this.Letras = Letras;
	}



	public String getLetrasErroneas() {
		return LetrasErroneas;
	}



	public void setLetrasErroneas(String LetrasErroneas) {
		this.LetrasErroneas = LetrasErroneas;
	}



	public int getPuntos() {
		return puntos;
	}



	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}



	public void Puntos() {	
		if(this.Letras==this.Letras) {
			this.puntos=this.puntos+4;
		}else {
			this.puntos=this.puntos-1;
		}
	}
}
