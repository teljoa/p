package main.java.model.jugadores;

import java.time.LocalDate;

import main.java.model.enumerated.AreaCampo;
import main.java.model.exception.JugadorException;
import main.java.model.interf.Goleable;
import main.java.model.interf.Parable;

public class Centrocampista extends Jugador implements Goleable, Parable {
	
	private int asistencias;
	
	public Centrocampista() {
		super();
	}
	
	
	public Centrocampista(String nombre,String apellidos,LocalDate fechaNacimiento,Double altura,Double peso,int asistencias) {
		super();
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.fechaNacimiento=fechaNacimiento;
		this.altura=altura;
		this.peso=peso;
		this.asistencias=asistencias;
		this.areaCampo=AreaCampo.CENTRO;
	}
	
	@Override
	public String getInfo() throws JugadorException {
		return this.nombre + " " + this.apellidos + " Centrocampista con " + this.getEdad() + " años de edad, " + this.altura + " metros de altura y " + this.peso + "Kg de peso."
			   + "Ha jugado " + this.partidosJugados + " partidos y " + this.expulsiones + " expulsiones.Ha realizado " + this.asistencias + " asistencias.";
	}
	
	@Override
	public double marcarGol() {
		return Math.random();
	}
	
	@Override
	public double pararBalon() {
		return Math.random();
	}
	
	public int getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(int asistencias) {
		this.asistencias += asistencias;
	}


	@Override
	public Double calcularPosibilidadJuego() {
		return (this.asistencias/100)+ pararBalon() + marcarGol();
	}
}
