package main.java.model.jugadores;

import java.time.LocalDate;

import main.java.model.enumerated.AreaCampo;
import main.java.model.exception.JugadorException;
import main.java.model.interf.Parable;

public class Portero extends Jugador implements Parable {
	
	private int balonesParados;
	
	public Portero() {
		super();
	}
	
	public Portero(String nombre,String apellidos,LocalDate fechaNacimiento,Double altura,Double peso) {
		super();
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.fechaNacimiento=fechaNacimiento;
		this.altura=altura;
		this.peso=peso;
		this.areaCampo=AreaCampo.PORTERIA;
	}
	
	public Portero(String nombre,String apellidos,LocalDate fechaNaciento,Double altura,Double peso,int balonesParados) {
		this(nombre,apellidos,fechaNaciento,altura,peso);
		this.balonesParados=balonesParados;
		this.areaCampo=AreaCampo.PORTERIA;
	}
	
	@Override
	public String getInfo() throws JugadorException {
		return this.nombre + " " + this.apellidos + " Portero con " + this.getEdad() + " años de edad, " + this.altura + " metros de altura y " + this.peso + "Kg de peso."
			   + "Ha jugado " + this.partidosJugados + " partidos y " + this.expulsiones + " expulsiones.Ha realizado " + this.balonesParados+ " balonesParados.";
	}
	
	public int getBalonesParados() {
		return balonesParados;
	}

	public void setBalonesParados(int balonesParados) {
		this.balonesParados += balonesParados;
	}

	@Override
	public double pararBalon() {
		return Math.random();
	}
	
	@Override
	public Double calcularPosibilidadJuego() {
		return 1-((this.balonesParados/100)+pararBalon());
	}
}
