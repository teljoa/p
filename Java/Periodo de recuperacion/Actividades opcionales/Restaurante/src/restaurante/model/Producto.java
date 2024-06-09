package restaurante.model;

import java.time.LocalDate;

public abstract class Producto {
	protected static final double IVA_GENERAL=7;
	protected LocalDate fechaAltaMenu;
	protected LocalDate fechaBajaMenu;
	protected String nombre;
	protected String descripcion;
	protected Alergeno alergeno;
	protected double precioBase;
	protected String codigoProducto;
	private static int sec=0;
	
	public Producto(String nombre, String descripcion, Alergeno alergeno, double precioBase) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.alergeno = alergeno;
		this.precioBase = precioBase;
		this.fechaAltaMenu=LocalDate.now();
		sec++;
		this.codigoProducto=this.getClass().getSimpleName()+sec;
	}

	public Alergeno getAlergeno() {
		return alergeno;
	}
	
	public abstract double getPrecioProducto();

	public LocalDate getFechaBajaMenu() {
		return fechaBajaMenu;
	}

	public void setFechaBajaMenu(LocalDate fechaBajaMenu) {
		this.fechaBajaMenu = fechaBajaMenu;
	}
	
	public abstract boolean estacaducado();

	public String getCodigoProducto() {
		return codigoProducto;
	}

	@Override
	public String toString() {
		return "Producto [fechaAltaMenu=" + fechaAltaMenu + ", fechaBajaMenu=" + fechaBajaMenu + ", nombre=" + nombre
				+ ", descripcion=" + descripcion + ", alergeno=" + alergeno + ", precioBase=" + precioBase
				+ ", codigoProducto=" + codigoProducto + "]";
	}
	
}
