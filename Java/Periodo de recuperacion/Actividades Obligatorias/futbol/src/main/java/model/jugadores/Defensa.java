package main.java.model.jugadores;

import java.time.LocalDate;

import main.java.model.enumerated.AreaCampo;
import main.java.model.exception.JugadorException;

public class Defensa extends Jugador {
	
	private int jugadasBloqueadas;
	
	public Defensa() {
		super();
	}
	
	
	public Defensa(String nombre,String apellidos,LocalDate fechaNacimiento,Double altura,Double peso,int jugadasBloqueadas) {
		super();
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.fechaNacimiento=fechaNacimiento;
		this.altura=altura;
		this.peso=peso;
		this.jugadasBloqueadas=jugadasBloqueadas;
		this.areaCampo=AreaCampo.DEFENSA;
	}
	
	public int getJugadasBloqueadas() {
		return jugadasBloqueadas;
	}


	public void setJugadasBloqueadas(int jugadasBloqueadas) {
		this.jugadasBloqueadas += jugadasBloqueadas;
	}

	@Override
	public String getInfo() throws JugadorException {
		return this.nombre + " " + this.apellidos + " Defensa con " + this.getEdad() + " años de edad, " + this.altura + " metros de altura y " + this.peso + "Kg de peso."
			   + "Ha jugado " + this.partidosJugados + " partidos y " + this.expulsiones + " expulsiones.Ha realizado " + this.jugadasBloqueadas + " jugadasBloqueadas.";
	}

	@Override
	public Double calcularPosibilidadJuego() {
		return this.jugadasBloqueadas/100.0;
	}
	
}
