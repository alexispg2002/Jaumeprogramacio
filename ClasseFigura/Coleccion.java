package ClasseFigura;

import java.util.ArrayList;
import java.util.Iterator;

public class Coleccion {
	
	private String nomColeccio;
	private ArrayList<Figura>llistaFigures;
	
	public Coleccion(String nomColeccio, ArrayList<Figura>llistaFigures){
		
		this.nomColeccio=nomColeccio;
		this.llistaFigures=llistaFigures;
	}

	public String getNomColeccio() {
		return nomColeccio;
	}

	public void setNomColeccio(String nomColeccio) {
		this.nomColeccio = nomColeccio;
	}
	
	public void afegirFigura(Figura fig) {
		llistaFigures.add(fig);
	}
	
	public void pujarPreuArray(double quantitat, String id) {
		
		for (Figura o:llistaFigures) {
			if (o.getCodi()==id) {
				o.setPreu(quantitat);
			}
		}
		
	}
	
	public Figura mesCar() {
		double preuMajor =0.0;
		
		Figura fMajor=null;
		
		for (Figura o:llistaFigures) {
			if(o.getPreu()>preuMajor) {
				preuMajor = o.getPreu();
				fMajor=o;
			}
		}
		return fMajor;
	}
	
	public String ambCapa() {
		
		String cadena ="";
		
		cadena=cadena + nomColeccio;
		for (Figura o:llistaFigures) {
			if (o.getSuperheroe().isCapa()==true) {
				
				cadena +=o.toString(); 		
				
				}
			}
		return cadena;		
	}
	
	public String getValorColeccio() {
		String cadena;
		double preuTotal=0.0;
		
		for(Figura o:llistaFigures) {
			preuTotal=preuTotal+o.getPreu();
		}
		cadena ="El valor de la coleccio es:"+preuTotal;
		return cadena;
	}
	
	public String getVolumColeccio() {
		String cadena;
		double valor=0.0;
		
		for(Figura o:llistaFigures) {
			valor=valor+o.getPreu();
		}
		valor = valor +200;
		cadena ="El volum de la coleccio es:"+valor;
		return cadena;
	}
	
}
