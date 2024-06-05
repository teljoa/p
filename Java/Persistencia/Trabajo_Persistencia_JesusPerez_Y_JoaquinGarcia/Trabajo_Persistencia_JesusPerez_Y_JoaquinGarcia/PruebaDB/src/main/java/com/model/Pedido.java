package main.java.com.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_pedido")
	private long id;
	
	@OneToMany(mappedBy = "pedido", cascade = CascadeType.MERGE)
	@Column(name="lineas")
	private List<LineaPedido> lineas;
	
	@Column(name="codigo")
	private String codigo;
	
	@Column(name="fecha")
	private LocalDate fechaCtreacion;
	
	@ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
	
	public Pedido() {
		super();
		this.fechaCtreacion=LocalDate.now();
		this.lineas=new ArrayList<LineaPedido>();
	}
	
	public Pedido(String codigo,Cliente cliente) {
		super();
		this.codigo=codigo;
		this.fechaCtreacion=LocalDate.now();
		this.lineas=new ArrayList<LineaPedido>();
		this.cliente=cliente;
	}
	
	public void agregarLineaPedido(LineaPedido lp) {
		
		if(!this.lineas.contains(lp)) {
			this.lineas.add(lp);
		}
		
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<LineaPedido> getLineas() {
		return lineas;
	}

	public void setLineas(List<LineaPedido> lineas) {
		this.lineas = lineas;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public LocalDate getFechaCtreacion() {
		return fechaCtreacion;
	}

	public void setFechaCtreacion(LocalDate fechaCtreacion) {
		this.fechaCtreacion = fechaCtreacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
    public String toString() {
        return "Pedido [id=" + id + ", lineas=" + lineas + ", codigo=" + codigo + ", fechaCtreacion=" + fechaCtreacion
                + ", cliente=" + cliente.getId() + "]";
    }
}



