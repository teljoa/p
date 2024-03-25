package Ejercicio3;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class ListaReproducion {
	
	private String nombre;
	private Usuario usuario;
	private int nreproducciones;
	private Date fechaCreacion;
	private Date fechaUltimaReproduccion;
	private Cancion[] lista;
	private String ordenReproduccion;
	
	public ListaReproducion(String nombre, Usuario usuario, int nreproducciones, Date fechaCreacion,
			Date fechaUltimaReproduccion, Cancion[] lista) {
		super();
		this.nombre = nombre;
		this.usuario = usuario;
		this.nreproducciones = nreproducciones;
		this.fechaCreacion = fechaCreacion;
		this.fechaUltimaReproduccion = fechaUltimaReproduccion;
		this.lista = lista;
	}
	
	public int posicionUltimaCalcion() {
		int i=0;
		int posicion=0;
		boolean ultimo=false;
		while(i<this.lista.length || ultimo==true) {
			if(this.lista[i].equals(null)) {
				ultimo=true;
				posicion=i;
			}
			i++;
		}
		return posicion;
	}
	
	public void anadirCancion(Cancion a) {
		if(a.isPremium() && this.usuario.isPremium()==true) {
			this.lista[posicionUltimaCalcion()]=a;
		}else if(a.isPremium() && !this.usuario.isPremium()) {
			System.out.println("No se puede añadir la cancion.");
		}else if(!a.isPremium() && this.usuario.isPremium()==true) {
			this.lista[posicionUltimaCalcion()]=a;
		}else if(!a.isPremium() && !this.usuario.isPremium() && posicionUltimaCalcion()<24) {
			this.lista[posicionUltimaCalcion()]=a;
		}else if(!a.isPremium() && !this.usuario.isPremium() && posicionUltimaCalcion()==24) {
			System.out.println("No se puede añadir la cancion.");
		}
	}
	
	public void eliminarCancion(Cancion a) {
		int i=0;
		boolean eliminar=false;
		while(i<this.lista.length || eliminar==true) {
			if(this.lista[i].equals(a)) {
				eliminar=true;
				this.lista[i]=null;
			}
		}
	}
	
	public void reproducirCancionSiguiente(Cancion a) {
		int i=0;
		boolean cambiar=false;
		
		while(i<this.lista.length || cambiar==true) {
			if(this.lista[i].equals(a) && this.lista[i].terminarcancion(a)) {
				reproducir(i+1);
			}
		}
	}
	
	public void reproducir(int posicion/*, Date fechaActual*/) {
		if(this.usuario.isPremium()==true) {
			this.lista[posicion].empezarCancion();
		}else if(!this.usuario.isPremium() /*&& fechaActual-this.fechaCreacion< DateTime.getday(30)*/) {
			this.lista[posicion].empezarCancion();
		}else if(!this.usuario.isPremium() /*&& fechaActual-this.fechaCreacion<DateTime.getday(30)*/) {
			System.out.println("No se puede reproduccir.");
		}
	}
	
	public Cancion[] buscarArtista(String artista) {
		Cancion[] a =new Cancion[this.lista.length];
		int posicion=0;
		for(int i=0;i<this.lista.length;i++) {
			if(this.lista[i].getArtista().equals(artista)) {
				a[posicion]=this.lista[i];
				posicion++;
			}
		}
		return a;
	}
	
	public boolean hayAnuncio() {
		return this.usuario.isPremium();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getNreproducciones() {
		return nreproducciones;
	}

	public void setNreproducciones(int nreproducciones) {
		this.nreproducciones = nreproducciones;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaUltimaReproduccion() {
		return fechaUltimaReproduccion;
	}

	public void setFechaUltimaReproduccion(Date fechaUltimaReproduccion) {
		this.fechaUltimaReproduccion = fechaUltimaReproduccion;
	}

	public Cancion[] getLista() {
		return lista;
	}

	public void setLista(Cancion[] lista) {
		this.lista = lista;
	}
	
	public String getOrdenReproduccion() {
		return ordenReproduccion;
	}

	public void setOrdenReproduccion(String ordenReproduccion) {
		this.ordenReproduccion = ordenReproduccion;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListaReproducion other = (ListaReproducion) obj;
		return Objects.equals(fechaCreacion, other.fechaCreacion)
				&& Objects.equals(fechaUltimaReproduccion, other.fechaUltimaReproduccion)
				&& Arrays.equals(lista, other.lista) && Objects.equals(nombre, other.nombre)
				&& nreproducciones == other.nreproducciones && Objects.equals(usuario, other.usuario);
	}

	@Override
	public String toString() {
		return "ListaReproducion [nombre=" + nombre + ", usuario=" + usuario + ", nreproducciones=" + nreproducciones
				+ ", fechaCreacion=" + fechaCreacion + ", fechaUltimaReproduccion=" + fechaUltimaReproduccion
				+ ", lista=" + Arrays.toString(lista) + "]";
	}
	
	
}
