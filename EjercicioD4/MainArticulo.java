package EjercicioD4;

public class MainArticulo {
	
public static void main(String[] args) {
		
		
		Articulo art1=new Articulo("Camisa de cuadros",20,21,54);
		Articulo art2=new Articulo("Camisa de cuadros",26,21,54);
		art1.imprimir();
		art2.imprimir();
		System.out.println("");
		
		
		art1.setNombre("Chaqueta de lana");
		art1.setPrecio(0);
		art1.setPrecio(30);
		art2.setIva(10);
		art2.getcuantosQuedan();
		art1.imprimir();
		art2.imprimir();
		System.out.println("");
		
		if(art1.vender(1000)) {
			System.out.println("He vendido mil!");
		}else {
			System.out.println("No he vendido mil, se cancela la venta por falta de stock");
		}
		if (art1.vender(2)) {
            System.out.println("He vendido 2!");
        } else {
            System.out.println("No he vendido 2, se cancela la venta por falta de stock");
        }
        
        System.out.println("Voy a almacenar 3 mas");
        if (art1.almacenar(3)) {
            System.out.println("He almacenado 3!");
        } else {
            System.out.println("No he almacenado 3, no hay sitio");
        }

        art1.imprimir();
        art2.imprimir();
	}

}
