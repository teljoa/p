package main.java.model;

import java.util.Comparator;

public class OrdenarPorCantidadDeParadas implements Comparator<Linea>{
	
	@Override
	public int compare(Linea l1,Linea l2) {
		return l1.getNumeroParadas()-l2.getNumeroParadas();
	}
}
