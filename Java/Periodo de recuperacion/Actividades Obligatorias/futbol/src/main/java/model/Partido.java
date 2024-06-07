package main.java.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Partido {
	private String visitante;
	private String local;
	private String resultado;
	private int golesVisitante;
	private int golesLocal;
	private LocalDateTime fechaPartido;
	
	public Partido(String visitante, String local, int golesVisitante, int golesLocal, LocalDateTime fechaPartido) {
		super();
		this.visitante = visitante;
		this.local = local;
		this.golesVisitante = golesVisitante;
		this.golesLocal = golesLocal;
		this.fechaPartido = fechaPartido;
		this.resultado=this.golesLocal + "|X|" + this.golesVisitante + ".";
	}

	public String getResultado() {
		return resultado;
	}
	
	public LocalDateTime getFechaPartido() {
		return fechaPartido;
	}
	
	public String getVisitante() {
		return visitante;
	}

	public String getLocal() {
		return local;
	}
	
	public int getGolesVisitante() {
		return golesVisitante;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaPartido, local, visitante);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || obj!=null && obj.hashCode()==this.hashCode();
	}
	
	public String mostrarInfo() {
		return "Partido celebrado entre " + this.local + " y " +  this.visitante + " el dia " + this.fechaPartido + " con resultado " + this.resultado;
	}

	@Override
	public String toString() {
		return mostrarInfo();
	}
}
