package Ejercicios;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		Catalogo catalogo =new Catalogo();
		try {
			catalogo.addProducto(new Producto("12345678901", "Raton0", "Raton de Ordenador", LocalDate.now(), null, LocalDate.now().plusYears(3)));
			catalogo.addProducto(new Producto("12345678901", "Raton1", "Raton de Ordenador", LocalDate.now(), null, LocalDate.now().plusYears(3)));
			catalogo.addProducto(new Producto("12345678901", "Raton2", "Raton de Ordenador", LocalDate.now(), null, LocalDate.now().plusYears(3)));
			catalogo.addProducto(new Producto("12345678901", "Raton3", "Raton de Ordenador", LocalDate.now(), null, LocalDate.now().plusYears(3)));
			catalogo.addProducto(new Producto("12345678901", "Raton4", "Raton de Ordenador", LocalDate.now(), null, LocalDate.now().plusYears(3)));
			catalogo.addProducto(new Producto("12345678901", "Raton5", "Raton de Ordenador", LocalDate.now(), null, LocalDate.now().plusYears(3)));
			
			System.out.println(catalogo.mostrarProductos());
			System.out.println(catalogo.mostrarProductosPorfechaAlta());
		}catch(CatalogoException e){
			
		}

	}

}
