package main.java.model.jugadores;

import java.time.LocalDate;
import java.util.Objects;

import main.java.model.enumerated.AreaCampo;
import main.java.model.exception.JugadorException;

public abstract class Jugador {
	
	protected String nombre;
	protected String apellidos;
	protected LocalDate fechaNacimiento;
	protected Double altura;
	protected Double peso;
	protected Integer partidosJugados;
	protected Integer expulsiones;
	protected AreaCampo areaCampo;
	
	public Jugador() {
		super();
		this.partidosJugados=0;
		this.expulsiones=0;
	}
	
	public abstract String getInfo() throws JugadorException;
	
	public abstract Double calcularPosibilidadJuego();
	
	public Double getAltura() throws JugadorException {
		double altura=0.0;
		if(this.altura>1.70) {
			altura=this.altura;
		}else {
			throw new JugadorException("Los jugadores no pueden medir menos de 1,70 metros");
		}
		return altura;
	}
	
	public int getEdad() throws JugadorException {
		int edad= LocalDate.now().getYear()-this.fechaNacimiento.getYear();
		
		if(edad<18) {
			throw new JugadorException("No puede haber un jugador menor de ead.");
		}
		return edad;
	}
	
	public AreaCampo getAreaCampo() {
		return areaCampo;
	}
	
	public Integer getPartidosJugados() {
		return partidosJugados;
	}

	public void setPartidosJugados(Integer partidosJugados) {
		this.partidosJugados += partidosJugados;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, fechaNacimiento, nombre, partidosJugados);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || obj!=null && obj.hashCode()==this.hashCode();
	}
}
