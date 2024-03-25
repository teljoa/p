package Ejercicio3;

import java.util.Objects;

public class Cancion {
	
	private String titulo;
	private String artista;
	private String duraccion;
	private String disco;
	private int anoCreacion;
	private int numreproduciones;
	private boolean premium;
	
	public Cancion(String titulo, String artista, String duraccion, String disco, int anoCreacion, int numreproduciones) {
		super();
		this.titulo = titulo;
		this.artista = artista;
		this.duraccion = duraccion;
		this.disco = disco;
		this.anoCreacion = anoCreacion;
		this.numreproduciones = numreproduciones;
	}
	
	public boolean empezarCancion() {
		this.duraccion="00:00";
		return true;
	}
	
	public boolean terminarcancion(Cancion a) {
		return this.equals(a);
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getDuraccion() {
		return duraccion;
	}

	public void setDuraccion(String duraccion) {
		this.duraccion = duraccion;
	}

	public String getDisco() {
		return disco;
	}

	public void setDisco(String disco) {
		this.disco = disco;
	}

	public int getAnoCreacion() {
		return anoCreacion;
	}

	public void setAnoCreacion(int anoCreacion) {
		this.anoCreacion = anoCreacion;
	}

	public int getNumreproduciones() {
		return numreproduciones;
	}

	public void setNumreproduciones(int numreproduciones) {
		this.numreproduciones = numreproduciones;
	}
	
	public boolean isPremium() {
		return premium;
	}

	public void setPremium(boolean premium) {
		this.premium = premium;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cancion other = (Cancion) obj;
		return anoCreacion == other.anoCreacion && Objects.equals(artista, other.artista)
				&& Objects.equals(disco, other.disco) && Objects.equals(duraccion, other.duraccion)
				&& numreproduciones == other.numreproduciones && Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", artista=" + artista + ", duraccion=" + duraccion + ", disco=" + disco
				+ ", anoCreacion=" + anoCreacion + ", numreproduciones=" + numreproduciones + "]";
	}

	
	
	
}
