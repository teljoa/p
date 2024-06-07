package main.java.model.Comparators;

import java.util.Comparator;

import main.java.model.jugadores.Jugador;

public class OrdenadosPorProbalidad implements Comparator<Jugador>{

	@Override
	public int compare(Jugador o1, Jugador o2) {
		int resultado=0;
		
		if(o1==null||o2==null) {
			resultado=0;
		}else {
			resultado=(int) (o1.calcularPosibilidadJuego()+o2.calcularPosibilidadJuego());
		}
		
		return resultado;
	}
}
