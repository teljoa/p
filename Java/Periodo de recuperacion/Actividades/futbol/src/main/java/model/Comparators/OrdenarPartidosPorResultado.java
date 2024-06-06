package main.java.model.Comparators;

import java.util.Comparator;

import main.java.model.Partido;

public class OrdenarPartidosPorResultado implements Comparator<Partido> {

	@Override
	public int compare(Partido o1, Partido o2) {
		int resultado=0;
		if(o1==null || o2==null) {
			resultado=0;
		}else {
			resultado=o1.getResultado().compareTo(o2.getResultado());
		}
		
		return resultado;
	}

}
