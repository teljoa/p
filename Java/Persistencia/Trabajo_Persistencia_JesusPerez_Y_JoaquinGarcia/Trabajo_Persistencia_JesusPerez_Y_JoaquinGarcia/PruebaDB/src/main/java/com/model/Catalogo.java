package main.java.com.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="Catalogo")
public class Catalogo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_catalogo")
	private long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "catalogo", cascade = CascadeType.MERGE)
    @Column(name="productos")
    private List<Producto> productos;
	

	

	public Catalogo() {
		super();
		this.productos =new ArrayList<Producto>();
	}

	public Catalogo(String nombre) {
		super();
		this.nombre = nombre;
		this.productos =new ArrayList<Producto>();
	}
	
	
	
	public boolean addProducto(Producto p) {
        boolean valida =false;

        if(!this.productos.contains(p)) {
            this.productos.add(p);
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

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	

	public void setId(long id) {
		this.id = id;
	}
	
	
	@Override
    public String toString() {
        return "Catalogo [id=" + id + ", nombre=" + nombre + ", productos=" + productos + "]";
    }
}

