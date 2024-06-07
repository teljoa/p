package main.java.model;

public class Casa extends Vivienda {
	
	private boolean unifamiliar;
	private final static Double PRECIO_INQUILINO_DIA_UNIFAMILIAR=75.0;
	private final static Double PRECIO_INQUILINO_DIA_ADOSADO=65.0;
	
	public Casa(int maxInquilinos, boolean unifamiliar) {
		super(maxInquilinos);
		this.unifamiliar=unifamiliar;
		if(unifamiliar) {
			this.identificador="UNIFA"+identificador;
		}else {
			this.identificador="ADOSA"+identificador;
		}
	}
	
	public Casa(boolean unifamiliar) {
		super();
		this.unifamiliar=unifamiliar;
		if(unifamiliar) {
			this.identificador="UNIFA"+identificador;
		}else {
			this.identificador="ADOSA"+identificador;
		}
	}

	@Override
	public void alquilarVivienda(int numInquilinos, int numDias) throws Exception {
		if(!isAlquilada()) {
			if(numInquilinos<=numMaxInquilinos) {
				if(numDias%7==0) {
					if(unifamiliar) {
						this.importeAlquilerActual=(numInquilinos*numDias)*PRECIO_INQUILINO_DIA_UNIFAMILIAR;
					}else {
						this.importeAlquilerActual=(numInquilinos*numDias)*PRECIO_INQUILINO_DIA_ADOSADO;
					}
					this.inquilinos=numInquilinos;
					this.numDias=numDias;
					this.setAlquilada(true);
				}else {
					throw new Exception("Solo se puede alquilar por semanas completas.");
				}
			}else {
				throw new Exception("Ha superado el limite de inqulinos permitidos.");
			}
		}else {
			throw new Exception("Esta vivienda ya esta alquilada.");
		}
	}
	
	@Override
	public void realizarCheckout() {
		super.realizarCheckout();
	}

	@Override
	public String toString() {
		return this.isAlquilada()?"Casa con id "+this.identificador+" alquilada durante "+this.numDias+" dias a "+this.inquilinos+" personas generando "+this.importeAlquilerActual+"€, se encuentra actualmente alquilada."
				   :"Casa con id "+this.identificador+" ha generado un total de "+this.importeTotalAcumulado()+"€, no se encuentra actualmente alquilada.";
	}
}