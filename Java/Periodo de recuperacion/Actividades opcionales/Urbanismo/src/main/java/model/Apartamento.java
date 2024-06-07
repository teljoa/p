package main.java.model;

public class Apartamento extends Vivienda {
	
	private final static Double PRECIO_DIA_INQUILINO=50.0;
	
	public Apartamento() {
		super();
		this.numMaxInquilinos=5;
		this.identificador="APAR"+identificador;
	}
	
	public Apartamento(int maxInquilinos) {
		super();
		this.numMaxInquilinos=maxInquilinos;
	}

	@Override
	public void alquilarVivienda(int numInquilinos, int numDias) throws Exception {
		if(!this.isAlquilada()) {
			if(numInquilinos<=numMaxInquilinos) {
				this.importeAlquilerActual=(numInquilinos*numDias)*PRECIO_DIA_INQUILINO;
				this.inquilinos=numInquilinos;
			}else {
				throw new Exception("Ha superado el limite de inqulinos permitidos.");
			}
		}else {
			throw new Exception("Esta vivienda ya esta alquilada.");
		}
	}
	
	@Override
	public void realizarCheckout() {
		if (isAlquilada()) {
            setAlquilada(false);
            System.out.println("Se ha realizado el check-out de la casa.");
            inquilinos=0;
            numMaxInquilinos=0;
            importeAlquilerActual=0.0;
        } else {
            System.out.println("La vivienda no está alquilada actualmente.");
        }
	}

	@Override
	public String toString() {
		return "Apartamento []";
	}
}
