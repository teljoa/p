package main.java.model;


import java.time.LocalTime;
import java.util.Objects;

public class ParadaEstacion {
	private String estacion;
	private LocalTime momento;
	
	public ParadaEstacion(String estacion, LocalTime momento) {
		super();
		this.estacion = estacion;
		this.momento = momento;
	}

	public String getEstacion() {
		return estacion;
	}

	public LocalTime getMomento() {
		return momento;
	}

	public void setMomento(LocalTime momento) {
		this.momento = momento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(estacion, momento);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || obj!=null && obj.hashCode()==this.hashCode();
	}

	@Override
	public String toString() {
		return "ParadaEstacion [estacion=" + estacion + ", momento=" + momento + "]";
	}
}
