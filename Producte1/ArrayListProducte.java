package Producte1;

import java.util.ArrayList;
import java.util.Iterator;

import javax.annotation.processing.AbstractProcessor;

public class ArrayListProducte {

	public static void main(String[] args) {
		
	Producte pa = new Producte("barra de pa",10);
	Producte llet = new Producte("litre de llet",5);
	Producte sucre = new Producte("paquet de sucre",7);
	Producte oli = new Producte("garrafa d'oli",2);
	Producte aigua = new Producte("garrafa d'aigua",1);
	Producte sal = new Producte("paquet de sal",1);

	
	ArrayList<Producte> llistaCompra = new ArrayList<Producte>();
	
	
	llistaCompra.add(pa);
	llistaCompra.add(llet);
	llistaCompra.add(sucre);
	llistaCompra.add(oli);
	llistaCompra.add(aigua);
	llistaCompra.add(sal);
	
	Iterator it = llistaCompra.iterator();
	
	System.out.println("\n Amb ITERATOR");
	
	while(it.hasNext())
		System.out.println(it.next().toString());
	
	llistaCompra.remove(0);
	llistaCompra.remove(0);
	
	int x = llistaCompra.size();
	System.out.println("ara te " + x +" posicions");
	
	llistaCompra.add(3, new Producte("Pescado",3));
	
	System.out.println("\nara te "+llistaCompra.size()+" posicions");
	
	System.out.println("\nAmb FOR");
	
	for(int i=0;i<llistaCompra.size();i++) {
		System.out.println(llistaCompra.get(i).toString());
	}
	System.out.println("\nAmb FOR-EACH");
	
	for(Producte p:llistaCompra) {
		System.out.println(p.toString());
	}
	llistaCompra.clear();
	
	System.out.println("\nAmb ITERATOR");
	
	Iterator it1=llistaCompra.iterator();
	while(it.hasNext())
		System.out.println(it.next().toString());
	}
}
