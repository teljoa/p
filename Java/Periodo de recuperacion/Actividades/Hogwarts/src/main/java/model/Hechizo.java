package main.java.model;

import java.time.LocalDate;

import main.java.exception.HowagwartsException;

public abstract class Hechizo {
	private String nombre;
	private int puntos;
	private LocalDate fechaLanzamiento;
	private static final int MINIMO_CONSUMO_PUNTOS=5;
	private static final int MAXIMO_CONSUMO_PUNTOS_DEFENSAS=10;
	private static final int MAXIMO_CONSUMO_PUNTOS_MALDICIONES=20;
	
	public Hechizo(String nombre, int puntos) {
		super();
		this.nombre = nombre;
		this.puntos = puntos;
		this.fechaLanzamiento=LocalDate.now();
	}

	public Hechizo(String nombre, int puntos, LocalDate fechaLanzamiento) {
		super();
		this.nombre = nombre;
		this.puntos = puntos;
		this.fechaLanzamiento = fechaLanzamiento;
	}
	
	public  int consumoMagico() throws HowagwartsException {
		int puntoss=0;
		
		if(this instanceof Maldicion) {
			if(getPuntos()>=MINIMO_CONSUMO_PUNTOS && getPuntos()<=MAXIMO_CONSUMO_PUNTOS_MALDICIONES) {
				puntoss=getPuntos();
			}else {
				throw new HowagwartsException("El hechizo tiene mas/menos puntos de lo permitido para su tipo.");
			}
		}else {
			if(getPuntos()>=MINIMO_CONSUMO_PUNTOS && getPuntos()<=MAXIMO_CONSUMO_PUNTOS_DEFENSAS) {
				puntoss=getPuntos();
			}else {
				throw new HowagwartsException("El hechizo tiene mas/menos puntos de lo permitido para su tipo.");
			}
		}
		
		return puntoss;
	}

	public String getNombre() {
		return nombre;
	}
	
	public int getPuntos() {
		return puntos;
	}

	public LocalDate getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	@Override
	public String toString() {
		return "Hechizo " + nombre + " lanzada " + "el " + fechaLanzamiento.getDayOfMonth() + " del " + fechaLanzamiento.getMonthValue() + " de " + fechaLanzamiento.getYear() + " consumiendo " + puntos + " puntos.";
	}
}