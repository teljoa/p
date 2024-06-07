package main.java.model.Comparators;

import java.util.Comparator;

import main.java.model.exception.JugadorException;
import main.java.model.jugadores.Jugador;

public class OrdenadosPorEdad implements Comparator<Jugador>{

	@Override
	public int compare(Jugador o1, Jugador o2) {
		int resultado=0;
		
		if(o1==null || o2==null) {
			resultado=0;
		}else {
			try {
				resultado=o1.getEdad()-o2.getEdad();
			} catch (JugadorException e) {
				e.printStackTrace();
			}
		}
		
		return resultado;
	}
}
