package Agenda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class MainAgenda {

	public static void main(String[]args) {
		
		ArrayList<Agenda> Agenda = new ArrayList<Agenda>();
		
		Scanner src = new Scanner(System.in);
		int opcion;
		
	do {
		System.out.println("****************************************************");
		System.out.println("*****************MENU*******************************");
		System.out.println("****************************************************");
		System.out.println("*******1.Inserir contactes a l'aganda***************");
		System.out.println("***2.Consultar la informació de tos els contactes***");
		System.out.println("**3.Consultar la informació d'un contacte l'angenda**");
		System.out.println("*********4.Esborrar un contacte de l'agenda**********");
		System.out.println("*******************5.EIXIR***************************");
		System.out.println("*****************************************************");
	
		opcion=src.nextInt();
		switch(opcion) {
		case 1:
		
			System.out.println("Has selecionat la eleccion 1");
			InserixContacte(Agenda);
			
		break;
		
		case 2:
			
			System.out.println("Has selecionat la eleccion 2");
			
			Iterator it =Agenda.iterator();
			while(it.hasNext())
				System.out.println(it.next().toString());
			
		break;
		
		case 3:
			
			System.out.println("Has selecionat la eleccion 3");
			MostraContactePerDNI(Agenda);
		break;
		
		case 4:
			
			System.out.println("Has selecionat la eleccion 4");
			EsborrarContactes(Agenda);
			
		break;
		}
	
	}while(opcion!=5);
	
	System.out.println("Has posat un nombre no valid");
	
	}
	
	public static void InserixContacte(ArrayList<Agenda> Agenda) {

		Agenda Cont1 = new Agenda("","","",0,"");

		Scanner src = new Scanner(System.in);
		
		
		
		Agenda.add(Cont1);
		
		System.out.println("Escriu el DNI del contacte:");
		Cont1.setDNI(src.nextLine());
		
		System.out.println("Escriu el Nom del contacte:");
		Cont1.setNom(src.nextLine());
		
		System.out.println("Escriu el Cognom del contacte:");
		Cont1.setCognoms(src.nextLine());
		
		System.out.println("Escriu el Telefono del contacte:");
		Cont1.setTelef(src.nextInt());
		
		src.nextLine();
		
		System.out.println("Escriu el Email del contacte:");
		Cont1.setEmail(src.nextLine());
		
		
	}
	
	public static void MostraContactePerDNI(ArrayList <Agenda>Agenda) {
		
		String DNI;
		Scanner src = new Scanner(System.in);
		
		System.out.println("Pon el DNI de la persona que quieres buscar?");
		DNI=src.nextLine();
		
		for (Agenda o: Agenda) {
			o.getDNI().equals(DNI);
			if(o.getDNI().equals(DNI)) {
				System.out.println(o.toString());
			}
		}
	}
	
	public static void EsborrarContactes(ArrayList<Agenda>Agenda) {
		int pos;
		Scanner src = new Scanner(System.in);
		
		System.out.println("Que posicion tiene el contacto que quires borrar?");
		pos=src.nextInt();
		
		Agenda.remove(pos);
		
		Iterator it =Agenda.iterator();
		while(it.hasNext())
			System.out.println(it.next().toString());
	}
}
