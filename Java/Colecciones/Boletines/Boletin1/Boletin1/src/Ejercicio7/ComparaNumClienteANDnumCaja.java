package Ejercicio7;

public interface ComparaNumClienteANDnumCaja {
	
	public default int compare(Caja c1, Caja c2) {
		int resultado=0;
		if(c1==null) {
			resultado=1;
		}else if(c2==null) {
			resultado=-1;
		}else {
			resultado= c1.getClientes().size()-c2.getClientes().size()==0? 
						c1.getNcaja()-c2.getNcaja():
						c1.getClientes().size()-c2.getClientes().size();
		}
		
		return resultado;
	}
}
