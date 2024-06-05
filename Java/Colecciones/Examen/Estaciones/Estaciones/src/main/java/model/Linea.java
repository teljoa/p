package main.java.model;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Collection;
import java.util.Objects;
import java.util.TreeSet;

import main.java.model.exception.FerrocarrilesException;

public class Linea {
	private ParadaEstacion origen;
	private ParadaEstacion destino;
	private Conexion conexion;
	private String identificador;
	private Collection<ParadaEstacion> paradas;
	
	public Linea(ParadaEstacion origen, ParadaEstacion destino) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.conexion=getConexion();
		this.identificador=origen.getEstacion() + "-" + destino.getEstacion();
		this.paradas=new TreeSet<ParadaEstacion>();
	}
	
	public void addParada(ParadaEstacion p1) throws FerrocarrilesException {
		if(!paradas.contains(p1)) {
			paradas.add(p1);
		}else {
			throw new FerrocarrilesException("No se puede añadir una parada ya existente.");
		}
	}
	
	public LocalTime obtenerHoraDeParadaEnEstacion(String nombreEs) throws FerrocarrilesException {
		LocalTime parada=null;
		for(ParadaEstacion p:paradas) {
			if(p.getEstacion().equals(nombreEs)) {
				parada=p.getMomento();
			}
		}
		if(parada==null) {
			throw new FerrocarrilesException("No existe la parada en esta linea.");
		}
		
		return parada;
	}
	
	public int getDuracionTrayecto() {
		return (int) ChronoUnit.MINUTES.between(origen.getMomento(), destino.getMomento());
	}
	
	public int getNumeroParadas() {
		return paradas.size();
	}

	public ParadaEstacion getOrigen() {
		return origen;
	}

	public ParadaEstacion getDestino() {
		return destino;
	}

	public Conexion getConexion() {
		Conexion conexion=Conexion.SIN_CONEXION;
		
		if(getNumeroParadas()==1) {
			conexion=Conexion.CON_CONEXION;
		}else if(getNumeroParadas()>1){
			conexion=Conexion.MULTIPLE_CONEXION;
		}
		
		return conexion;
	}

	public String getIdentificador() {
		return identificador;
	}

	public Collection<ParadaEstacion> getParadas() {
		return paradas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(destino, origen);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || obj!=null && obj.hashCode()==this.hashCode();
	}

	@Override
	public String toString() {
		return "Linea [origen=" + origen + ", destino=" + destino + ", conexion=" + conexion + ", identificador="
				+ identificador + ", paradas=" + paradas + "]";
	}
	
}
