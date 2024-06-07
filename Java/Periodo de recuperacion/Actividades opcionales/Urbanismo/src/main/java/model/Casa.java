package main.java.model;

public class Casa extends Vivienda {
	
	private boolean unifamiliar;
	private final static Double PRECIO_INQUILINO_DIA_UNIFAMILIAR=75.0;
	private final static Double PRECIO_INQUILINO_DIA_ADOSADO=65.0;
	
	public Casa(int maxInquilinos, boolean unifamiliar) {
		super();
		this.numMaxInquilinos=maxInquilinos;
		this.unifamiliar=unifamiliar;
		if(unifamiliar) {
			this.identificador="UNIF"+identificador;
		}else {
			this.identificador="ADOS"+identificador;
		}
	}
	
	public Casa(boolean unifamiliar) {
		this.unifamiliar=unifamiliar;
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
		return "Casa [unifamiliar=" + unifamiliar + "]";
	}
}