package restaurante;

import java.time.LocalDate;

import restaurante.model.Alergeno;
import restaurante.model.Bebida;
import restaurante.model.Cliente;
import restaurante.model.Plato;
import restaurante.model.ServicioNoDisponibleException;

public class Principal {

	public static void main(String[] args) {
		
		// Crear Restaurante
		 Restaurante restaurante = new Restaurante();
		
		// Crear clientes
        Cliente cliente1 = new Cliente(LocalDate.of(1990, 5, 15), Alergeno.GLUTEN);
        Cliente cliente2 = new Cliente(LocalDate.of(1985, 8, 20), Alergeno.LACTEOS);
        Cliente cliente3 = new Cliente(LocalDate.of(2000, 10, 10), null);
        Cliente cliente4 = new Cliente(LocalDate.of(2010, 12, 25), null);
        
     // Crear productos
        Bebida bebida1 = new Bebida("Cerveza", "Cerveza artesanal", Alergeno.GLUTEN, 3.0, 5.0);
        Plato plato1 = new Plato("Ensalada", "Ensalada de verduras", Alergeno.HUEVOS, 5.0);
        Bebida bebida2 = new Bebida("Agua", "Agua mineral", null, 1.0, 0.0);
        Plato plato2 = new Plato("Pasta", "Pasta al pesto", null, 7.0);
        Plato plato3 = new Plato("Sushi", "Sushi mixto", null, 10.0);
        Bebida bebida3 = new Bebida("Refresco", "Refresco de cola", null, 2.0, 0.0);
        
        try {
            // Dar de alta los clientes
            restaurante.darAltaCliente(cliente1);
            restaurante.darAltaCliente(cliente2);
            restaurante.darAltaCliente(cliente3);
            restaurante.darAltaCliente(cliente4);

            // Dar de alta los productos
            restaurante.darAltaProducto(bebida1);
            restaurante.darAltaProducto(plato1);
            restaurante.darAltaProducto(bebida2);
            restaurante.darAltaProducto(plato2);
            restaurante.darAltaProducto(plato3);
            restaurante.darAltaProducto(bebida3);

            // Cliente 1 solicita servicio de bebida con gluten (servicio no disponible)
            System.out.println("\nCliente 1 solicita servicio de bebida con gluten:");
            try {
            	System.out.println(cliente1.solicitarServicio(bebida1));
            } catch (ServicioNoDisponibleException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Cliente 3 solicita servicio de plato con huevos
            System.out.println("\nCliente 3 solicita servicio de plato con huevos:");
            try {
            	System.out.println(cliente3.solicitarServicio(plato1));
            } catch (ServicioNoDisponibleException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Cliente 4 solicita servicio de bebida sin alérgenos
            System.out.println("\nCliente 4 solicita servicio de bebida sin alérgenos:");
            try {
            	System.out.println(cliente4.solicitarServicio(bebida1));
            } catch (ServicioNoDisponibleException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Cliente 2 solicita servicio de plato sin alérgenos
            System.out.println("\nCliente 2 solicita servicio de plato sin alérgenos:");
            try {
            	System.out.println(cliente2.solicitarServicio(plato2));
            } catch (ServicioNoDisponibleException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Cliente 1 solicita servicio de plato sin alérgenos
            System.out.println("\nCliente 1 solicita servicio de plato sin alérgenos:");
            try {
            	System.out.println(cliente1.solicitarServicio(plato3));
            } catch (ServicioNoDisponibleException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Dar de baja el producto bebida2
            System.out.println("\nDar de baja el producto Bebida2:");
            try {
                restaurante.darBajaProducto(bebida2);
            } catch (ServicioNoDisponibleException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Mostrar los clientes no bebedores
            System.out.println("\nClientes no bebedores:");
            restaurante.obtenerClientesNoBebedores();

            // Mostrar clientes por alergia y edad
            System.out.println("\nClientes por alergia y edad:");
            restaurante.obtenerClientesPorAlergiaEdad();

            // Mostrar productos por alérgenos
            System.out.println("\nProductos por alérgenos:");
            restaurante.obtenerProductosPorAlergenos();

            // Mostrar clientes por consumo
            System.out.println("\nClientes por consumo:");
            restaurante.obtenerClientesPorConsumo();
            System.out.println("n");
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
