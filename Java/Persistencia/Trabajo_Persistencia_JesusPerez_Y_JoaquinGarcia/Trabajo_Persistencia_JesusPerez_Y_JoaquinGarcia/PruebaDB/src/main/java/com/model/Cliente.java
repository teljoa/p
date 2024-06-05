package main.java.com.model;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="Cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_cliente")
	private long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
	private List<Pedido> pedidos;
	
	
	@Column(name="dni")
	private String dni;
	
	public Cliente() {
		super();
		this.pedidos =new ArrayList<Pedido>();
	}

	public Cliente(String nombre,String dni) {
		super();
		this.nombre = nombre;
		this.pedidos =new ArrayList<Pedido>();
		this.dni=dni;
	}
	
	public boolean hacerPedido(Pedido p) {
        boolean valida =false;

        if(!this.pedidos.contains(p)) {
            this.pedidos.add(p);
            valida=true;
        }
        return valida;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	

	

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
    public String toString() {
        return "Cliente [id=" + id + ", nombre=" + nombre + ", pedidos=" + pedidos + "," + ", dni=" + dni + "]";
    }

	
}


