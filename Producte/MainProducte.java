package Producte;

public class MainProducte {
	public static void main(String[] args) {
	
	Producte p0 = new Producte("barra de pa",10);
	Producte p1 = new Producte("litre de llet",5);
	Producte p2 = new Producte("paquet de sucre",7);
	Producte p3 = new Producte("garrafa d'oli",2);
	Producte p4 = new Producte("garrafa d'aigua",1);
	Producte p5 = new Producte("paquet de sal",1);

	
	System.out.println(p1.toString());
	
	
	Producte[] vectorProductes = new Producte[5];
	
	vectorProductes[0]=p0;
	vectorProductes[1]=p1;
	vectorProductes[2]=p2;
	vectorProductes[3]=p3;
	vectorProductes[4]=p4;
	
	System.out.println(vectorProductes[2].toString());
	
	for (int i=0; i<vectorProductes.length; i++) {
		System.out.println(vectorProductes[i].getNom()+" "+vectorProductes[i].getQuantitat());
	}
	
	for(int i=0; i<vectorProductes.length; i++) {
		System.out.println(vectorProductes[i].toString());
	}
	
	}
}
