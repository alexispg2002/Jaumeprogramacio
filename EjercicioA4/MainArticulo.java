package EjercicioA4;
public class MainArticulo {

	public static void main(String[] args) {
		
		
		Articulo art1=new Articulo("Camisa de cuadros",20,21,54);
		Articulo art2=new Articulo("Camisa de cuadros",26,21,54);
		
		System.out.println(art1.nombre+" - Precio:"+art1.precio+" - IVA:21% - PVP:"+(art1.precio+(art1.precio*art1.iva/100))+" ");
		
		
		System.out.println(art2.nombre+" - Precio:"+art2.precio+" - IVA:21% - PVP:"+(art2.precio+(art2.precio*art2.iva/100))+" ");
	}
	
}
