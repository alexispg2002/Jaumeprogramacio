package EjercicioA4;


public class Articulo {

	String nombre;
	double precio;
	int iva=21;
	int cuantosQuedan;
	
	public Articulo(String nombre, double precio, int iva, int cuantosQuedan) {
		if(nombre.equals("")) {
			System.err.println("El nombre no puede estar vacio");
		}else if(precio<=0){
			System.err.println("El precio no puede ser menor o igual a cero");
		}else if(iva!=21) {
			System.err.println("El iva del producto debe ser un 21%");
		}else if(cuantosQuedan<0) {
			System.err.println("El numero de productos que quedan en el aalmacen no puede ser menor a cero");
		}else {
		this.nombre=nombre;
		this.precio=precio;
		this.iva=iva;
		this.cuantosQuedan=cuantosQuedan;
		}
	}
}
