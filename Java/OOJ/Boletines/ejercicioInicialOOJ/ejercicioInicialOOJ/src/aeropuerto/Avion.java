package aeropuerto;

public class Avion {
	public String idAvion;
	public int capacidad;
	public int numvuelos;
	public double kmVolados;
	public String compannia;
	
	public Avion(String idAvion, int capacidad) {
		super();
		this.idAvion = idAvion;
		this.capacidad = capacidad;
		this.numvuelos=0;
		this.kmVolados=0;
	}

	public Avion(String idAvion, String compannia, int capacidad) {
		this(idAvion,capacidad);
		this.compannia = compannia;
	}
	
	public boolean asignarVuelo(int capacidad,double kilometros) {
		boolean asignar=false;
		if(capacidad<this.capacidad && kilometros>0.0) {
			asignar=true;
			numvuelos++;
			kmVolados+=kilometros;
		}
		
		return asignar;
	}
	
	public boolean cambiarCompannia(String compannia) {
		boolean cambiar=false;
		if(!this.compannia.equals(compannia)) {
			this.compannia=compannia;
			cambiar=true;
		}
		return cambiar;
	}
	
	public int getNumvuelos() {
		return numvuelos;
	}
	
	public double getTotalKmVolados() {
		return kmVolados;
	}

	public double getMediaKmVolados() {
		return kmVolados/numvuelos;
	}
	
	
}
