package Ejercicio8;

public interface ComparaNombre {
	
	public default int compare(Alumno a1, Alumno a2) {
		int resultado=0;
		if(a1==null) {
			resultado=-1;
		}else if(a2==null) {
			resultado=1;
		}else {
			resultado=a1.nombre.compareTo(a2.nombre);
		}
		
		return resultado;
	}
}
