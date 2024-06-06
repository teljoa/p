package main.java.model.jugadores;

import java.time.LocalDate;

import main.java.model.enumerated.AreaCampo;
import main.java.model.exception.JugadorException;
import main.java.model.interf.Goleable;

public class Delantero extends Jugador  implements Goleable{
	
	private int goles;
	
	public Delantero() {
		super();
	}
	
	
	public Delantero(String nombre,String apellidos,LocalDate fechaNacimiento,Double altura,Double peso,int goles) {
		super();
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.fechaNacimiento=fechaNacimiento;
		this.altura=altura;
		this.peso=peso;
		this.goles=goles;
		this.areaCampo=AreaCampo.CONTRARIO;
	}
	
	public int getGoles() {
		return goles;
	}


	public void setGoles(int goles) {
		this.goles += goles;
	}

	@Override
	public String getInfo() throws JugadorException {
		return this.nombre + " " + this.apellidos + " Delantero con " + this.getEdad() + " años de edad, " + this.altura + " metros de altura y " + this.peso + "Kg de peso."
			   + "Ha jugado " + this.partidosJugados + " partidos y " + this.expulsiones + " expulsiones.Ha realizado " + this.goles + " goles.";
	}
	
	@Override
	public double marcarGol() {
		return Math.random();
	}
	
	@Override
	public Double calcularPosibilidadJuego() {
		return (this.goles/100)+marcarGol();
	}
}
