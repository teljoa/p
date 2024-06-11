package main.java;

import java.util.Comparator;

public class OrdenarPorNumeroDeVacunas implements Comparator<Mascota>{

	@Override
	public int compare(Mascota o1, Mascota o2) {
		return o1==null || o2==null?0:o1.numeroVacunas-o2.numeroVacunas;
	}

}
