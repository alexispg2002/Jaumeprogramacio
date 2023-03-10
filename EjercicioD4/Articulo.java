package EjercicioD4;

public class Articulo {
	
	private String nombre;
	private double precio;
	private int iva=21;
	private int cuantosQuedan;
	
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
	
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public int getIva() {
		return iva;
	}
	public int getcuantosQuedan() {
		return cuantosQuedan;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setPrecio(double precio) {
		this.precio=precio;
	}
	public void setIva(int iva) {
		this.iva=iva;
	}
	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan=cuantosQuedan;
	}
	
	public double getPVP() {
		return this.precio+(this.precio/100.0*this.iva);
	}
	
	public double getPVPDescuento(double descuento) {
		double precio=this.getPVP();
		return precio - (precio*descuento/100.0);
	}
	
	public boolean vender(int unidades) {
		int cuantos=this.getcuantosQuedan();
		if(cuantos+unidades>0) {
			this.setCuantosQuedan(cuantos+unidades);
			return true;
		}else {
			return false;
		}
	}
	
    public boolean almacenar(int unidades) {
        int cuantos = this.getcuantosQuedan();
        if (cuantos + unidades > 0) {
            this.setCuantosQuedan(cuantos + unidades);
            return true;
        } else {
            return false;
        }
    }
    
	public void imprimir() {
		System.out.println("Nombre:"+this.getNombre()+" IVA:"+this.getIva()+" Precio:"+this.getPrecio()+" PVP:"+this.getPVP()+" Unidades:"+this.cuantosQuedan);
	}
	
}
