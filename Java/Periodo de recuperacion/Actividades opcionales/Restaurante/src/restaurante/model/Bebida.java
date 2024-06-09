package restaurante.model;

public class Bebida extends Producto {
	
	private static final double IVA_BEBIDAS_ALC=15;
	public double graduaccion;
	
	public Bebida(String nombre, String descripcion, Alergeno alergeno, double precioBase, double graduaccion) {
		super(nombre, descripcion, alergeno, precioBase);
		this.graduaccion = graduaccion;
	}

	@Override
	public double getPrecioProducto() {
		return esBebidaAlcoholica()? precioBase+(precioBase*(IVA_BEBIDAS_ALC/100)):precioBase+(precioBase*(IVA_GENERAL/100));
	}
	
	public boolean esBebidaAlcoholica() {
		return graduaccion>0.0;
	}
	
	@Override
	public boolean estacaducado() {
		return false;
	}

	@Override
	public String toString() {
		return "Bebida:"+this.nombre +
			   "\nPrecio:"+this.getPrecioProducto() +
			   "\nPresenta alergenos:"+this.alergeno +
			   "\nGraduacion:"+this.graduaccion;
	}
}
