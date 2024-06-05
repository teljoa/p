package Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
	
	public static final String LINE_SEPARATOR =System.getProperty("line.separetor");
	
	private List<Producto> productos;

	public Catalogo() {
		super();
		this.productos=new ArrayList<Producto>();
	}
	
	public void addProducto(Producto p) throws CatalogoException {
		this.productos.add(p);
	}
	
	public String mostrarProductos() {
		StringBuilder sb=new StringBuilder();
		this.productos.stream().distinct().toList().forEach(p-> sb.append(p).append(LINE_SEPARATOR));
		return sb.toString();
	}
	
	public String mostrarProductosPorfechaAlta() {
		StringBuilder sb=new StringBuilder();
		
		this.productos.stream()
					  .distinct()
					  .sorted((producto1,producto2)->producto1.getfAlta().compareTo(producto2.getfAlta()))
					  .forEach(p->sb.append(p).append(LINE_SEPARATOR));
		
		return sb.toString();
	}
}
