package main.java.com.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name="linea_pedido")
public class LineaPedido {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_lineaPedido")
    private long id;
	
	@ManyToOne(optional = false)
    @JoinColumn(name="id_pedido",
        foreignKey = @ForeignKey(name="id_pedido_fk"),nullable = false, updatable = false)
    private Pedido pedido;
	
	@ManyToOne(optional = false)
    @JoinColumn(name ="id_producto",
		foreignKey = @ForeignKey(name="id_producto_fk"),nullable = false, updatable = false)
    private Producto producto;
	
	@Column(name="cantidad")
	private int cantidad;
	
	@Column(name="fecha_creacion")
	private LocalDate fechaCreacion;
	
	@Column(name="codigo")
	private String codigo;
	
	public LineaPedido() {
		super();
		this.fechaCreacion=LocalDate.now();
	}
	
	public LineaPedido(Producto producto,int cantidad,Pedido pedido,String codigo) {
		super();
		this.producto=producto;
		this.pedido=pedido;
		this.cantidad=cantidad;
		this.fechaCreacion=LocalDate.now();
		this.codigo=codigo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
    public String toString() {
        return "LineaPedido [id=" + id + ", pedido=" + pedido.getId() + ", producto=" + producto + ", cantidad=" + cantidad
                + ", fechaCreacion=" + fechaCreacion + "]";
    }
}


