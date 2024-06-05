package main.java.model;

import java.time.LocalDate;

public class Maldicion extends Hechizo {
	
	private static final String[] MALDICIONES_IMPERDONABLES={"Avada kedavra","Imperius","Crusiatus"};
	
	public Maldicion(String nombre, int puntos, LocalDate fechaLanzamiento) {
		super(nombre, puntos, fechaLanzamiento);
	}

	public boolean esImperdonable() {
		boolean imperdonable=false;
		
		for(String s: MALDICIONES_IMPERDONABLES) {
			if(s.equals(this.getNombre()) && !imperdonable) {
				imperdonable=true;
			}
		}
		return imperdonable;
	}

	@Override
	public String toString() {
		String string="Maldicion " + getNombre() + " lanzada " + "el " + getFechaLanzamiento().getDayOfMonth() + " del " + getFechaLanzamiento().getMonthValue() + " de " + getFechaLanzamiento().getYear() + " consumiendo " + getPuntos() + " puntos.";
		
		if(esImperdonable()) {
			string="Maldicion Imperdonable";
		}
		
		return string;
	}
}