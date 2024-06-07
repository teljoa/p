package main.java.model;

import java.util.Comparator;

public class OrdenarPorPuntos implements Comparator<Hechizo> {

	@Override
	public int compare(Hechizo o1, Hechizo o2) {
		int tmp=0;
		if(o1==null || o2==null) {
			tmp=0;
		}else {
			tmp=o1.getPuntos()-o2.getPuntos();
		}
		
		return tmp;
	}

}