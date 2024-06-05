package main.java.com.Services;

import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.List;
import org.hibernate.Session;
import main.java.com.hibernate.ConnectionUtil;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import main.java.com.model.*;



public class ServicioProducto <T>{
	
	private Session session;
	
	public ServicioProducto() {
        this.session = ConnectionUtil.getSessionFactory().openSession();
    }
	
	public void persistir() {
	Session session = ConnectionUtil. getSessionFactory() .openSession();
	session.beginTransaction();
	Producto producto = new Producto("Teclado", "Teclado de ordenador",LocalDate.now(),LocalDate.now().plusDays(30),0,null);
	session.persist (producto) ;
	session.getTransaction().commit();
	session.close();
	}
	
	//Persistir bueno 
	public void persistirP(T producto) {

		//Creamos transaccion 
		Session session = ConnectionUtil. getSessionFactory() .openSession();
		session.beginTransaction();

		//Persiste 
		session.persist (producto) ;

		//Hacemos commit
		session.getTransaction().commit();

		//Cierre
		session.close();
		}
	
	
	
	public void obtener() {
		
		Session session = ConnectionUtil.getSessionFactory() .openSession();
		session.beginTransaction();

		var producto = session.find(Producto.class, 11);
		assert(producto!=null && producto.getId()==1L);

		session.close();
		
		
	}
	
	
	public void obtenerP(long id, Class<T> clazz) {
	    Session session = ConnectionUtil.getSessionFactory().openSession();
	    Transaction transaction = null;
	    try {
	        transaction = session.beginTransaction();
	        T objeto = session.find(clazz, id);
	        transaction.commit();

	        if (objeto != null) {
	            System.out.println("Objeto encontrado: " + objeto);
	        } else {
	            System.out.println("Objeto no encontrado");
	        }
	    } catch (Exception e) {
	        if (transaction != null) {
	            transaction.rollback();
	        }
	        e.printStackTrace();
	    } finally {
	        session.close();
	    }
	}

	
	
	public void actualizar() {
		
		Session session = ConnectionUtil.getSessionFactory().openSession();
		session.beginTransaction();
		var producto = session. find(Producto.class, 11);

		producto.setDescripcion("Nuevo producto");
		session.merge(producto);

		session.getTransaction().commit();
		session.close();
		
		
	}
	
	//Actualizar bueno
	public void actualizarP(T objeto, String nombreAtributo, Object nuevoValor) {
	    Session session = ConnectionUtil.getSessionFactory().openSession();
	    Transaction transaction = null;
	    try {
	        transaction = session.beginTransaction();

	        Method getIdMethod = objeto.getClass().getMethod("getId");
	        Object id = getIdMethod.invoke(objeto);

	        
	        @SuppressWarnings("unchecked")
	        T objetoPersistido = (T) session.get(objeto.getClass(), id);

	        String nombreMetodoSetter = "set" + nombreAtributo.substring(0, 1).toUpperCase() + nombreAtributo.substring(1);

	        
	        Method metodoSetter = objetoPersistido.getClass().getMethod(nombreMetodoSetter, nuevoValor.getClass());
	        metodoSetter.invoke(objetoPersistido, nuevoValor);

	        
	        session.merge(objetoPersistido);

	        transaction.commit();
	    } catch (Exception e) {
	        if (transaction != null) {
	            transaction.rollback();
	        }
	        e.printStackTrace();
	    } finally {
	        session.close();
	    }
	}

	
	
	public void eliminar() {
		Session session = ConnectionUtil.getSessionFactory().openSession();
		session.beginTransaction();
		//PONER ID PARA ELIMINAR EN LUGAR DE 11 
		session.remove(session. find(Producto.class, 11));
		session.getTransaction().commit();

		session.close();
	}
	
	
	public void eliminar(T entidad) {
	    Transaction transaction = null;
	    try {
	    	session = ConnectionUtil.getSessionFactory().openSession();								
	        transaction = session.beginTransaction(); 
	        session.remove(entidad); 
	        transaction.commit(); 
	    } catch (Exception e) {
	        if (transaction != null) {
	            transaction.rollback(); 
	        }
	        e.printStackTrace();
	    } finally {
	        if (session != null) {
	            session.close(); 
	        }
	    }
	}
	
	/////////////////////////////////////////////////////////
	///CONSULTAS///////////:)////////////////////////////////
	/////////////////////////////////////////////////////////
	
	//Consulta opcional 
	public void mostrarProductosConPrecioMayor(double precio) {
	    Session session = ConnectionUtil.getSessionFactory().openSession();
	    Transaction transaction = null;
	    try {
	        transaction = session.beginTransaction();
	        
	        String hql = "FROM Producto WHERE precio > :precio";
	        Query<Producto> query = session.createQuery(hql, Producto.class);
	        query.setParameter("precio", precio);
	        
	        List<Producto> productos = query.list();
	        
	        for (Producto producto : productos) {
	            System.out.println(producto);
	        }
	        
	        transaction.commit();
	    } catch (Exception e) {
	        if (transaction != null) {
	            transaction.rollback();
	        }
	        e.printStackTrace();
	    } finally {
	        session.close();
	    }
	}
	
	
	//Mostrar todos los productos 
	public void mostrarTodosLosProductos() {
        Session session = ConnectionUtil.getSessionFactory().openSession();
        try {
            Query<Object[]> query = session.createQuery("SELECT p.id, p.nombre FROM Producto p", Object[].class);
            List<Object[]> resultados = query.getResultList();
            for (Object[] resultado : resultados) {
                Long id = (Long) resultado[0];
                String nombre = (String) resultado[1];
                System.out.println("ID: " + id + ", Nombre: " + nombre);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
	
	
	//Imprimir lineas de pedido con cantidad mayor
	public void imprimirLineasPedidoCantidadMayor(Pedido pedido, int cantidad) {
	    Session session = ConnectionUtil.getSessionFactory().openSession();
	    Transaction transaction = null;
	    try {
	        transaction = session.beginTransaction();

	        String hql = "FROM LineaPedido WHERE pedido = :pedido AND cantidad > :cantidad";
	        System.out.println("Consulta HQL: " + hql); 

	        Query<LineaPedido> query = session.createQuery(hql, LineaPedido.class);
	        query.setParameter("pedido", pedido);
	        query.setParameter("cantidad", cantidad);

	        System.out.println("Pedido: " + pedido); 
	        System.out.println("Cantidad: " + cantidad); 

	        List<LineaPedido> lineasPedido = query.getResultList();

	        for (LineaPedido lineaPedido : lineasPedido) {
	            System.out.println(lineaPedido);
	        }

	        transaction.commit();
	    } catch (Exception e) {
	        if (transaction != null) {
	            transaction.rollback();
	        }
	        e.printStackTrace();
	    } finally {
	        session.close();
	    }
	}
	
	
	//mostrar productos pasandole una cadena 
	public void mostrarProductosPorCadenaEnCatalogo(Catalogo catalogo, String cadenaBusqueda) {
	    Session session = ConnectionUtil.getSessionFactory().openSession();
	    try {
	        Query<Producto> query = session.createQuery("FROM Producto WHERE catalogo = :catalogo AND nombre LIKE :cadena", Producto.class)
	                                       .setParameter("catalogo", catalogo)
	                                       .setParameter("cadena", "%" + cadenaBusqueda + "%");

	        List<Producto> productos = query.getResultList();

	        if (productos.isEmpty()) {
	            System.out.println("No se encontraron productos en el catálogo '" + catalogo.getNombre() + "' que coincidan con la búsqueda '" + cadenaBusqueda + "'.");
	        } else {
	            for (Producto producto : productos) {
	                System.out.println(producto.getNombre());
	            }
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        if (session != null && session.isOpen()) {
	            session.close();
	        }
	    }
	}

	
	
	
	//PDF 2
	//CONSULTA EJ1 
	public void consultarNumeroPedidosCliente(Cliente cliente) {
		Session session = ConnectionUtil.getSessionFactory().openSession();
        try {
            Query<Long> query = session.createQuery(
                "SELECT COUNT(pedido.id) FROM Pedido pedido WHERE pedido.cliente = :cliente",
                Long.class
            );
            query.setParameter("cliente", cliente);
            long numeroPedidos = query.getSingleResult().intValue();
            System.out.println("El cliente " + cliente.getNombre() + " ha realizado " + numeroPedidos + " pedidos.");
        } finally {
            session.close();
        }
    }
	
	
	//PDF 2
	//Consulta EJ2
	public void calcularImporteTotalCliente(Cliente cliente) {
	    Session session = ConnectionUtil.getSessionFactory().openSession();
	    Transaction transaction = null;
	    double importeTotal = 0.0;

	    try {
	        transaction = session.beginTransaction();

	        String hql = "SELECT SUM(lp.producto.precio * lp.cantidad) " +
	                     "FROM LineaPedido lp " +
	                     "WHERE lp.pedido.cliente = :cliente";
	        Query<Double> query = session.createQuery(hql, Double.class);
	        query.setParameter("cliente", cliente);

	        importeTotal = query.uniqueResult();

	        transaction.commit();
	    } catch (Exception e) {
	        if (transaction != null) {
	            transaction.rollback();
	        }
	        e.printStackTrace();
	    } finally {
	        session.close();
	    }

	    System.out.println("El importe total del cliente es: " + importeTotal);
	}

	//PDF 2
	//Consulta EJ3 
	public void productoMasDemandado() {
		Session session = ConnectionUtil.getSessionFactory().openSession();
        try {
            Query<Object[]> query = session.createQuery(
                "SELECT lineaPedido.producto, SUM(lineaPedido.cantidad) as total " +
                "FROM LineaPedido lineaPedido " +
                "GROUP BY lineaPedido.producto " +
                "ORDER BY total DESC",
                Object[].class
            );
            query.setMaxResults(1);
            Object[] result = query.getSingleResult();
            Producto productoMasDemandado = (Producto) result[0];
            long cantidadTotal = (long) result[1];
            System.out.println("El producto más demandado es: " + productoMasDemandado.getNombre() + ", con una cantidad total de " + cantidadTotal + " unidades vendidas.");
        } finally {
            session.close();
        }
    }

	
	//CONSULTA ULTIMO PDF 
	public void imprimirProductosOrdenadosPorNombre() {
	    Session session = ConnectionUtil.getSessionFactory().openSession();
	    try {
	        String queryString = "FROM Producto ORDER BY nombre";

	        Query<Producto> query = session.createQuery(queryString, Producto.class);

	        List<Producto> productos = query.getResultList();

	        for (Producto producto : productos) {
	            System.out.println(producto);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        session.close();
	    }
	}

	
	
	
	
}



