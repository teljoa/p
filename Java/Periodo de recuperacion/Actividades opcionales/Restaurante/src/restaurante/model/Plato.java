package restaurante.model;

import java.time.LocalDate;

public class Plato extends Producto {
	protected LocalDate fechaConsumoPreferente;

	public Plato(String nombre, String descripcion, Alergeno alergeno, double precioBase) {
		super(nombre, descripcion, alergeno, precioBase);
		this.fechaConsumoPreferente=this.fechaAltaMenu.plusDays(15);
	}

	@Override
	public double getPrecioProducto() {
		return precioBase+(precioBase*(IVA_GENERAL/100));
	}
	
	public LocalDate getFechaConsumoPreferente() {
		return fechaConsumoPreferente;
	}

	public void setFechaConsumoPreferente(LocalDate fechaConsumoPreferente) {
		this.fechaConsumoPreferente = fechaConsumoPreferente;
	}

	@Override
	public boolean estacaducado() {
		return LocalDate.now().isAfter(fechaConsumoPreferente);
	}

	@Override
	public String toString() {
		return "Plato:"+this.nombre +
			   "\nPrecio:"+this.getPrecioProducto() +
			   "\nPresenta alergenos:"+this.alergeno +
			   "\nFecha de consumo preferente:"+this.fechaConsumoPreferente +
			   "\nIngredientes:"+this.descripcion;
	}
}
