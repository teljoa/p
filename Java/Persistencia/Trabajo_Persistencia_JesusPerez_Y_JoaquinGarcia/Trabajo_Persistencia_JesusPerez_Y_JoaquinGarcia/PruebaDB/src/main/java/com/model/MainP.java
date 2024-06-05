package main.java.com.model;


import java.time.LocalDate;


import main.java.com.Services.*;


public class MainP {

	public static void main(String[] args) {
		
		// PERSISTENCIA DE TABLAS

		// Persistir Catalogo
		ServicioProducto<Catalogo> servicioCatalogo = new ServicioProducto<Catalogo>();

		Catalogo catalogo = new Catalogo("Electronica");
		servicioCatalogo.persistirP(catalogo);

		// Persistir Producto
		ServicioProducto<Producto> servicioProducto = new ServicioProducto<Producto>();

		Producto producto1 = new Producto("Teclado", "Teclado", LocalDate.now(), LocalDate.now().plusDays(30), 1.0, catalogo);
		Producto producto2 = new Producto("Raton", "Raton", LocalDate.now(), LocalDate.now().plusDays(30), 6.0, catalogo);
		Producto producto3 = new Producto("Monitor", "Monitor de 24 pulgadas", LocalDate.now(), LocalDate.now().plusDays(30), 150.0, catalogo);
		Producto producto4 = new Producto("Impresora", "Impresora láser", LocalDate.now(), LocalDate.now().plusDays(30), 100.0, catalogo);
		Producto producto5 = new Producto("Altavoces", "Altavoces estéreo", LocalDate.now(), LocalDate.now().plusDays(30), 40.0, catalogo);
		Producto producto6 = new Producto("Cámara Web", "Cámara web HD", LocalDate.now(), LocalDate.now().plusDays(30), 30.0, catalogo);
		Producto producto7 = new Producto("Micrófono", "Micrófono de condensador", LocalDate.now(), LocalDate.now().plusDays(30), 25.0, catalogo);
		Producto producto8 = new Producto("USB", "Memoria USB 32GB", LocalDate.now(), LocalDate.now().plusDays(30), 15.0, catalogo);
		Producto producto9 = new Producto("Disco Duro", "Disco duro externo 1TB", LocalDate.now(), LocalDate.now().plusDays(30), 50.0, catalogo);
		Producto producto10 = new Producto("Router", "Router WiFi", LocalDate.now(), LocalDate.now().plusDays(30), 70.0, catalogo);
		Producto producto11 = new Producto("Silla", "Silla ergonómica", LocalDate.now(), LocalDate.now().plusDays(30), 80.0, catalogo);
		Producto producto12 = new Producto("Mochila", "Mochila para portátil", LocalDate.now(), LocalDate.now().plusDays(30), 20.0, catalogo);
		Producto producto13 = new Producto("Tableta", "Tableta gráfica", LocalDate.now(), LocalDate.now().plusDays(30), 60.0, catalogo);

		servicioProducto.persistirP(producto1);
		servicioProducto.persistirP(producto2);
		servicioProducto.persistirP(producto3);
		servicioProducto.persistirP(producto4);
		servicioProducto.persistirP(producto5);
		servicioProducto.persistirP(producto6);
		servicioProducto.persistirP(producto7);
		servicioProducto.persistirP(producto8);
		servicioProducto.persistirP(producto9);
		servicioProducto.persistirP(producto10);
		servicioProducto.persistirP(producto11);
		servicioProducto.persistirP(producto12);
		servicioProducto.persistirP(producto13);

		// Actualizar el catálogo para incluir los productos persistidos
		catalogo.addProducto(producto1);
		catalogo.addProducto(producto2);
		catalogo.addProducto(producto3);
		catalogo.addProducto(producto4);
		catalogo.addProducto(producto5);
		catalogo.addProducto(producto6);
		catalogo.addProducto(producto7);
		catalogo.addProducto(producto8);
		catalogo.addProducto(producto9);
		catalogo.addProducto(producto10);
		catalogo.addProducto(producto11);
		catalogo.addProducto(producto12);
		catalogo.addProducto(producto13);
		//servicioCatalogo.actualizar();

		// Persistir Cliente
		ServicioProducto<Cliente> servicioCliente = new ServicioProducto<Cliente>();

		Cliente cliente1 = new Cliente("joaquin", "32522323R");
		Cliente cliente2 = new Cliente("jesus", "28738273P");

		servicioCliente.persistirP(cliente1);
		servicioCliente.persistirP(cliente2);

		// Persistir Pedido
		ServicioProducto<Pedido> servicioPedido = new ServicioProducto<Pedido>();

		Pedido pedido1 = new Pedido("ADFAS13", cliente1);
		Pedido pedido2 = new Pedido("ADFXS15", cliente2);

		servicioPedido.persistirP(pedido1);
		servicioPedido.persistirP(pedido2);

		// Persistir Linea Pedido
		ServicioProducto<LineaPedido> servicioPersistenciaLinea = new ServicioProducto<LineaPedido>();

		LineaPedido lp1 = new LineaPedido(producto1, 3, pedido1, "SDJKA-980");
		LineaPedido lp2 = new LineaPedido(producto2, 23, pedido1, "SDJKA-908");
		LineaPedido lp3 = new LineaPedido(producto3, 30, pedido1, "SDJKA-928");
		LineaPedido lp4 = new LineaPedido(producto4, 10, pedido2, "SDJKA-918");
		LineaPedido lp5 = new LineaPedido(producto5, 37, pedido2, "SDJKA-978");
		LineaPedido lp6 = new LineaPedido(producto6, 9, pedido2, "SDJKA-988");
		LineaPedido lp7 = new LineaPedido(producto3, 11, pedido1, "SDJKA-9822");
		LineaPedido lp8 = new LineaPedido(producto8, 15, pedido2, "SDJKA-9811");
		LineaPedido lp9 = new LineaPedido(producto9, 20, pedido1, "SDJKA-968");

		servicioPersistenciaLinea.persistirP(lp1);
		servicioPersistenciaLinea.persistirP(lp2);
		servicioPersistenciaLinea.persistirP(lp3);
		servicioPersistenciaLinea.persistirP(lp4);
		servicioPersistenciaLinea.persistirP(lp5);
		servicioPersistenciaLinea.persistirP(lp6);
		servicioPersistenciaLinea.persistirP(lp7);
		servicioPersistenciaLinea.persistirP(lp8);
		servicioPersistenciaLinea.persistirP(lp9);

		// Añadir líneas de pedido a los pedidos
		pedido1.agregarLineaPedido(lp1);
		pedido1.agregarLineaPedido(lp2);
		pedido1.agregarLineaPedido(lp7);
		pedido1.agregarLineaPedido(lp9);
		pedido1.agregarLineaPedido(lp3);

		pedido2.agregarLineaPedido(lp3);
		pedido2.agregarLineaPedido(lp4);
		pedido2.agregarLineaPedido(lp5);
		pedido2.agregarLineaPedido(lp6);
		pedido2.agregarLineaPedido(lp8);

		// Asociar pedidos a clientes
		cliente1.hacerPedido(pedido1);
		cliente2.hacerPedido(pedido2);

		

		// Actualizar un producto
		servicioProducto.actualizarP(producto1, "descripcion", "Teclado molon");

		//OBTENER
		
		servicioProducto.obtenerP(producto1.getId(), Producto.class);

	
	//Eliminar ->Orden de borrado es: linea_pedido,producto,pedido,cliente,catalogo.
		
		servicioPersistenciaLinea.eliminar(lp2);
		servicioProducto.eliminar(producto2);
		
		
		//Borrar producto no añadido a linea 
		servicioProducto.mostrarTodosLosProductos();
		servicioProducto.eliminar(producto13);
		servicioProducto.imprimirProductosOrdenadosPorNombre();
	
	// EJ1 CONSULTAS //NUMERO DE PEDIDOS DE UN CLIENTE
		
		servicioCliente.consultarNumeroPedidosCliente(cliente1);
	
	//EJ2 CONSULTAS //IMPORTE TOTAL DE UN CLIENTE
		
		servicioCliente.calcularImporteTotalCliente(cliente1);
		
	//EJ3 CONSULTAS //PRODUCTO MAS DEMANDADO
		
		servicioProducto.productoMasDemandado();
	
	//////////////////CONSULTAS OPCIONALES//////////////////////
	servicioProducto.imprimirProductosOrdenadosPorNombre();	
	servicioProducto.mostrarProductosConPrecioMayor(50);	
	servicioPersistenciaLinea.imprimirLineasPedidoCantidadMayor(pedido1, 15);
	servicioCatalogo.mostrarProductosPorCadenaEnCatalogo(catalogo, "ra");
		
	}
}
