package ExerciciCompisicio;


import java.util.ArrayList;
import java.util.Iterator;

public class MainExamen {
	
	public static void main(String[] args) {
		
		ArrayList <Examen> Examens=new ArrayList <Examen>();
		
		Data Fecha = new Data(12, 10, 2023);
		Hora Hora = new Hora(12,10);
	
		Examen examenA = new Examen(Fecha,Hora,"Valencia", "3C");
		
		examenA.setData(Fecha);
		examenA.setHora(Hora);
		
		Examen examenB = new Examen(Fecha,Hora,"Madrid", "4E");
		
		Data FechaB=new Data(14,11,2023);
		Hora HoraB=new Hora(10,10);
		
		examenB.setData(FechaB);
		examenB.setHora(HoraB);
		
		Examen examenC = new Examen(Fecha,Hora,"Castello", "1A");
		
		Data FechaC=new Data(9,05,2023);
		Hora HoraC=new Hora(12,30);
		
		examenC.setData(FechaC);
		examenC.setHora(HoraC);
		
		
		Examen examenD = new Examen(Fecha,Hora,"Barcelona", "2B");
		
		Data FechaD=new Data(31,12,2023);
		Hora HoraD=new Hora(14,00);
		
		examenD.setData(FechaB);
		examenD.setHora(HoraB);
		
		Examen examenE = new Examen(Fecha,Hora,"La Vall D'Uixo", "Informatica");
		
		Data FechaE=new Data(25,9,2023);
		Hora HoraE=new Hora(13,00);
		
		examenE.setData(FechaE);
		examenE.setHora(HoraE);
		
		
		
		System.out.println("FOR-EACH");
		for(Examen l:Examens) {
			System.out.println(l.toString());
		}
		
		System.out.println("ITERATOR");
		Iterator it=Examens.iterator();
		while(it.hasNext())
			System.out.println(it.next().toString());
	}

}
