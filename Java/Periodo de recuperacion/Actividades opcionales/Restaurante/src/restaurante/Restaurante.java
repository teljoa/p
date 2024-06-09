package restaurante;

import java.time.LocalDate;
import java.util.Arrays;

import restaurante.compare.ObtenerClientesPorAlergiasYedad;
import restaurante.compare.ObtenerClientesPorConsumo;
import restaurante.compare.OrdenarProductosPorAlergenos;
import restaurante.model.Cliente;
import restaurante.model.Producto;
import restaurante.model.ServicioNoDisponibleException;

public class Restaurante {
	private Producto[] cartaProducto;
	private int ultimoProductoCarta;
	private static final int NUM_MAXIMO_PRODUCTOS=100;
	private Cliente[] clientes;
	private int ultimoCliente;
	private static final int NUM_MAXIMO_CLIENTES=20;
	private static int secuenciaGlobal=0;
	
	public Restaurante() {
		this.cartaProducto=new Producto[NUM_MAXIMO_PRODUCTOS];
		this.clientes=new Cliente[NUM_MAXIMO_CLIENTES];
	}
	
	public boolean darAltaCliente(Cliente cliente) throws Exception {
		 boolean alta = false;

		    if (obtenerPosicionCliente(cliente.getCodigoCliente()) != -1) {
		        throw new Exception("Ya existe el cliente");
		    }

		    else if (ultimoCliente < NUM_MAXIMO_CLIENTES) {
		        cliente.setCodigoCliente(String.valueOf(secuenciaGlobal));
		        clientes[ultimoCliente] = cliente;
		        secuenciaGlobal++;
		        alta = true;
		        ultimoCliente++; 
		    } else {
		        
		        for (int i = 0; i < NUM_MAXIMO_CLIENTES - 1; i++) {
		            clientes[i] = clientes[i + 1];
		        }
		        cliente.setCodigoCliente(String.valueOf(secuenciaGlobal));
		        clientes[NUM_MAXIMO_CLIENTES - 1] = cliente;
		        secuenciaGlobal++;
		        alta = true;
		    }

		    return alta;
	}
	
	public boolean darAltaProducto(Producto producto) throws Exception {
		 boolean alta = false;

		    if (obtenerPosicionProducto(producto.getCodigoProducto()) != -1) {
		        throw new Exception("Ya existe el producto");
		    }

		    else if (ultimoProductoCarta < NUM_MAXIMO_PRODUCTOS) {
		        cartaProducto[ultimoProductoCarta] = producto;
		        alta = true;
		        ultimoProductoCarta++; 
		    } else {
		        
		        for (int i = 0; i < NUM_MAXIMO_PRODUCTOS - 1; i++) {
		            cartaProducto[i] = cartaProducto[i + 1];
		        }
		        cartaProducto[NUM_MAXIMO_PRODUCTOS - 1] = producto;
		        alta = true;
		    }

		    return alta;
	}
	
	public boolean darBajaProducto(Producto producto) throws ServicioNoDisponibleException {
		boolean baja=false;
		
		for(int i=0;i<cartaProducto.length && !baja;i++) {
			if(cartaProducto[i]!=null && cartaProducto[i].equals(producto)) {
				cartaProducto[i].setFechaBajaMenu(LocalDate.now());
				baja=true;
			}
		}
		if(!baja) {
			throw new ServicioNoDisponibleException("Este producto no se encuentra en la carta.");
		}
		
		return false;
	}
	
	@SuppressWarnings("unused")
	private int obtenerPosicionUltimoCliente() {
		int result=0;
		boolean sal=false;
		
		for(int i=0;i<clientes.length && !sal;i++) {
			if(clientes[i]==null) {
				result=i;
				ultimoCliente=i-1;
				sal=true;
			}
		}
		if(ultimoCliente<0) {
			ultimoCliente=0;
		}
		return result;
	}
	
	@SuppressWarnings("unused")
	private int obtenerPosicionUltimoProducto() {
		int result=0;
		boolean sal=false;
		
		for(int i=0;i<cartaProducto.length && !sal;i++) {
			if(cartaProducto[i]==null) {
				result=i;
				ultimoProductoCarta=i-1;
				sal=true;
			}
		}
		if(ultimoProductoCarta<0) {
			ultimoProductoCarta=0;
		}
		return result;
	}
	
	private int obtenerPosicionCliente(String s) {
		int posicion=0;
		boolean sal=false;
		
		for(int i=0;i<clientes.length && !sal;i++) {
			if(clientes[i]!=null && s!=null && s.equals(clientes[i].getCodigoCliente())) {
				posicion=i;
				sal=true;
			}
		}
		
		if(!sal) {
			posicion=-1;
		}
		
		return posicion;
	}
	
	private int obtenerPosicionProducto(String s) {
		int posicion=0;
		boolean sal=false;
		
		for(int i=0;i<cartaProducto.length && !sal;i++) {
			if(cartaProducto[i]!=null && s.equals(cartaProducto[i].getCodigoProducto())) {
				posicion=i;
				sal=true;
			}
		}
		
		if(!sal) {
			posicion=-1;
		}
		
		return posicion;
	}
	
	public void obtenerProductosPorAlergenos() {
		Arrays.sort(cartaProducto,new OrdenarProductosPorAlergenos());
		
		for(Producto p:cartaProducto) {
			if(p!=null) {
				System.out.println(p+"\n");
			}
		}
	}
	
	public void obtenerClientesPorAlergiaEdad() {
		Arrays.sort(clientes,new ObtenerClientesPorAlergiasYedad());
		
		for(Cliente c:clientes) {
			if(c!=null) {
				System.out.println(c+"\n");
			}
		}
	}
	
	public void obtenerClientesNoBebedores() {
		for(Cliente c:clientes) {
			if(c!=null && !c.esBebedor()) {
				System.out.println(c+"\n");
			}
		}
	}
	
	public void obtenerClientesPorConsumo() {
		Arrays.sort(clientes,new ObtenerClientesPorConsumo());
		
		for(Cliente c:clientes) {
			if(c!=null) {
				System.out.println(c+"\n");
			}
		}
	}
}
