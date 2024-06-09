package restaurante.model;

import java.time.LocalDate;

public class Cliente{
	private static final int MAXIMO_PLATOS=100; 
	private LocalDate fechaNacimiento;
	private String codigoCliente;
	private Alergeno alergeno;
	private Producto[] consumo;
	private int consumoActual;
	
	
	public Cliente(LocalDate fechaNacimiento, Alergeno alergeno) {
		super();
		this.fechaNacimiento = fechaNacimiento;
		this.alergeno = alergeno;
		this.consumo=new Producto[MAXIMO_PLATOS];
		this.consumoActual=0;
	}

	public boolean solicitarServicio(Producto producto) throws ServicioNoDisponibleException {
		boolean entra=false;
		
		if (consumoActual >= MAXIMO_PLATOS) {
            throw new ServicioNoDisponibleException("Has superado el límite de servicios permitidos.");
        } else if (esAlergico(producto.getAlergeno())) {
            throw new ServicioNoDisponibleException("No puedes solicitar un producto al que eres alérgico.");
        } else if (producto instanceof Bebida) {
            if (((Bebida) producto).esBebidaAlcoholica() && !esMayorEdad()) {
                throw new ServicioNoDisponibleException("No se puede servir bebidas alcohólicas a menores.");
            }
        } else if (producto.estacaducado()) {
            throw new ServicioNoDisponibleException("El servicio que ha solicitado está de baja o está caducado.");
        }else {
        	consumo[consumoActual++] = producto;
        	entra=true;
        }
		
		return entra;
	}
	
	public int compareTo(Cliente o) {
		return o.codigoCliente.equals(this.codigoCliente)? 0:1;
	}
	
	public double calcularImporteConsumo() {
		double importe=0.0;
		
		for(Producto p:consumo) {
			if(p!=null) {
				importe+=p.getPrecioProducto();
			}
		}
		
		return importe;
	}
	
	public boolean esMayorEdad() {
		return getEdadActual()>=18;
	}
	
	public int getEdadActual() {
		return LocalDate.now().getYear()-this.fechaNacimiento.getYear();
	}
	
	public boolean esAlergico(Alergeno alergeno) {
		return alergeno!=null && alergeno.equals(this.alergeno);
	}
	
	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public boolean esBebedor() {
		boolean es=false;
		
		for(int i=0;i<consumo.length && !es;i++) {
			if(consumo[i]!=null && consumo[i] instanceof Bebida) {
				es=true;
			}
		}
		
		return es;
	}

	public Alergeno getAlergeno() {
		return alergeno;
	}

	public void setAlergenos(Alergeno alergeno) {
		this.alergeno = alergeno;
	}

	@Override
	public String toString() {
		return "Cliente con id:"+this.codigoCliente+" ha consumido"+this.calcularImporteConsumo()+"€.";
	}
}
