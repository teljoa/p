package main.java.model;

import java.util.Comparator;

public class OrdenarPorDuracion implements Comparator<Linea>{
	
	@Override
	public int compare(Linea l1,Linea l2) {
		return l1.getDuracionTrayecto()-l2.getDuracionTrayecto();
	}

}
