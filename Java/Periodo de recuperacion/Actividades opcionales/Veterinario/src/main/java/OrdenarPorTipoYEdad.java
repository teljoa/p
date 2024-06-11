package main.java;

import java.util.Comparator;

public class OrdenarPorTipoYEdad implements Comparator<Mascota>{

	@Override
	public int compare(Mascota o1, Mascota o2) {
		int result=0;
		
		if(o1 == null && o2 ==null) {
			result=0;
		} else if(o1 == null){
			result=1;
		} else if(o2 == null) {
			result=-1;
		} else {
			if((o1 instanceof Perro && o2 instanceof Perro)||(o1 instanceof Gato && o2 instanceof Gato)) {
				result=o1.getEdad()-o2.getEdad();
			} else if(o1 instanceof Perro && o2 instanceof Gato) {
				result=1;
			} else if(o1 instanceof Gato && o2 instanceof Perro) {
				result=-1;
			}
		}
		return result;
	}

}
