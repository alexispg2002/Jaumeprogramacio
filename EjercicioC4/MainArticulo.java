package EjercicioC4;

public class MainArticulo {

public static void main(String[] args) {
		
		
		Articulo art1=new Articulo("Camisa de cuadros",20,21,54);
		Articulo art2=new Articulo("Camisa de cuadros",26,21,54);
		
		System.out.println(art1.getNombre()+" - Precio:"+art1.getPrecio()+" - IVA:21% - PVP:"+(art1.getPrecio()+(art1.getPrecio()*art1.getIva()/100))+" ");
		
		
		System.out.println(art2.getNombre()+" - Precio:"+art2.getPrecio()+" - IVA:21% - PVP:"+(art2.getPrecio()+(art2.getPrecio()*art2.getIva()/100))+" ");
	
		art1.setNombre("Chaqueta de lana");
		art1.setPrecio(30);
		art1.getcuantosQuedan();
		
		art2.setNombre("Sudadera de lana");
		art2.setPrecio(60);
		art2.getcuantosQuedan();
		
		System.out.println(art1.getNombre()+" - Precio:"+art1.getPrecio()+" - IVA:21% - PVP:"+(art1.getPrecio()+(art1.getPrecio()*art1.getIva()/100))+" ");
		System.out.println(art2.getNombre()+" - Precio:"+art2.getPrecio()+" - IVA:21% - PVP:"+(art2.getPrecio()+(art2.getPrecio()*art2.getIva()/100))+" ");
	}
}
