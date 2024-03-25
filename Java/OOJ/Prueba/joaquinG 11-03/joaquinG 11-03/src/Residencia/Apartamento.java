package Residencia;

public class Apartamento extends Vivienda {
	
	public Apartamento() {
		super();
		this.numMaxInquilinos=5;
		this.identificador="APART"+ identificador;
	}
	
	public Apartamento(int maxInquilinos) {
		this.numMaxInquilinos=maxInquilinos;
	}

	@Override
	public void alquilarVivienda(int numInquilinos, int numDias) {
		this.importeAlquilerActual+=(numInquilinos*numDias)*50.00;
		isAlquilada();
		importeTotalAcumulado();
	}
	
	@Override
	public void realizarCheckout() {
		this.inquilinos=0;
		this.numDias=0;
	}
	
	public String toString() {
		String mensaje="";
		if(isAlquilada()) {
			mensaje="Apartamento con id" + identificador + "alquilada durante" + numDias + "dias a " + inquilinos + "personas generando " + importeAlquilerActual + "€, se"
					+ "encuentra actualmente alquilada.";
		}else {
			mensaje="Apartamento con id" + identificador + "ha generado un total de" + importeTotalAcumulado() + "€,no se encuentra actualmente alquilada.";
		}
		
		return mensaje;
	}
	
}
