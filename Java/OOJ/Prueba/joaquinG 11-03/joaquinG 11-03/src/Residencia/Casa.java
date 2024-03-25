package Residencia;

public class Casa extends Vivienda {
	
	private boolean unifamiliar;
	
	public Casa(int maxInquilinos, boolean unifamiliar) {
		super();
		this.numMaxInquilinos=maxInquilinos;
		this.unifamiliar=unifamiliar;
		if(unifamiliar) {
			this.identificador="UNIFA"+ identificador;
		}else {
			this.identificador="ADOSA"+ identificador;
		}
	}
	
	public Casa(boolean unifamiliar) {
		this.unifamiliar=unifamiliar;
	}
	
	@Override
	public void realizarCheckout() {
		this.inquilinos=0;
		this.numDias=0;
	}

	@Override
	public void alquilarVivienda(int numInquilinos, int numDias) {
		if(unifamiliar) {
			this.importeAlquilerActual=(numInquilinos*numDias)*75.00;
			isAlquilada();
			importeTotalAcumulado();
		}else {
			this.importeAlquilerActual=(numInquilinos*numDias)*65.00;
			isAlquilada();
			importeTotalAcumulado();
		}
	}
	
	public String toString() {
		String mensaje="";
		if(isAlquilada()) {
			mensaje="Casa con id" + identificador + "alquilada durante" + numDias + "dias a " + inquilinos + "personas generando " + importeAlquilerActual + "€, se"
					+ "encuentra actualmente alquilada.";
		}else {
			mensaje="Casa con id" + identificador + "ha generado un total de" + importeTotalAcumulado() + "€,no se encuentra actualmente alquilada.";
		}
		
		return mensaje;
	}
}
