package main.java.model;

public class Apartamento extends Vivienda {
	
	private final static Double PRECIO_DIA_INQUILINO=50.0;
	
	public Apartamento() {
		super();
		this.numMaxInquilinos=5;
		this.identificador="APARTA"+identificador;
	}
	
	public Apartamento(int maxInquilinos) {
		super(maxInquilinos);
		this.identificador="APARTA"+identificador;
	}

	@Override
	public void alquilarVivienda(int numInquilinos, int numDias) throws Exception {
		if(!this.isAlquilada()) {
			if(numInquilinos<=numMaxInquilinos) {
				this.importeAlquilerActual=(numInquilinos*numDias)*PRECIO_DIA_INQUILINO;
				this.inquilinos=numInquilinos;
				this.numDias=numDias;
				this.setAlquilada(true);
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
		return this.isAlquilada()?"Apartamento con id "+this.identificador+" alquilada durante "+this.numDias+" dias a "+this.inquilinos+" personas generando "+this.importeAlquilerActual+"€, se encuentra actualmente alquilado."
			   :"Apartamento con id "+this.identificador+" ha generado un total de "+this.importeTotalAcumulado()+"€, no se encuentra actualmente alquilado.";
	}
}
