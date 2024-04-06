package Ejercicio5;

public interface ComparaRemitente {
	
	public default int compare(Mensaje m1, Mensaje m2)  {
		int resultado=0;
		if(m1==null) {
			resultado=-1;
		}else if(m2==null) {
			resultado=1;
		}else {
			resultado= m1.getRemitente().compareTo(m2.getRemitente());
		}

		return resultado;
	}
}
