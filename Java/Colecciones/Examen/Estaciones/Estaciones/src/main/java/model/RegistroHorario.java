package main.java.model;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import main.java.model.exception.FerrocarrilesException;

public class RegistroHorario {
	private Map<String,Collection<Linea>> registro;

	public RegistroHorario() {
		super();
		this.registro=new TreeMap<String, Collection<Linea>>();
	}
	
	public void addLinea(String origen,String destino,LocalTime origenD,LocalTime destinoD) throws FerrocarrilesException {
		String identificador=origen + "-" + destino;
		ParadaEstacion origenN=new ParadaEstacion(origen, origenD);
		ParadaEstacion destinoN=new ParadaEstacion(destino, destinoD);
		Linea lineaN=new Linea(origenN, destinoN);
		
		if(!registro.containsKey(identificador)) {
			registro.put(identificador, new TreeSet<Linea>());
		}else if(registro.get(identificador).contains(lineaN)) {
			throw new FerrocarrilesException("Esta linea ya existe en el sistema.");
		}
		
		registro.get(identificador).add(lineaN);
	}
	
	public void addParadaAlinea(String origen,String destino,String nueva,LocalTime momento) throws FerrocarrilesException {
		String identificador=origen + "-" + destino;
		ParadaEstacion paradaN=new ParadaEstacion(nueva, momento);
		if(registro.containsKey(identificador)) {
			for(Linea l:registro.get(identificador)) {
				if(l.getIdentificador().equals(identificador)) {
					l.addParada(paradaN);
				}
			}
		}
	}
	
	public void modificarHoraParadaEnEstacion(String identificador,String buscar,LocalTime momento) throws FerrocarrilesException {
		if(registro.containsKey(identificador)) {
			for(Linea l:registro.get(identificador)) {
				for(ParadaEstacion p:l.getParadas()) {
					if(p.getEstacion().equals(buscar)) {
						p.setMomento(momento);
					}
				}
			}
		}else {
			throw new FerrocarrilesException("No existe una linea/parada con tal identificador.");
		}
	}
	
	public LocalTime obtenerHoraDeParadaEnEstacion(String identificador,String buscar) throws FerrocarrilesException {
		LocalTime llegada=null;
		if(registro.containsKey(identificador)) {
			for(Linea l:registro.get(identificador)) {
				if(l.getIdentificador().equals(identificador)) {
					llegada=l.obtenerHoraDeParadaEnEstacion(buscar);
				}
			}
		}
		
		return llegada;
	}
	
	public void mostrarLineasOrdenadosPorDuracion() {
		List<Linea> lineaO=new ArrayList<Linea>();
		
		for(String i:registro.keySet()) {
			for(Linea l:registro.get(i)) {
				lineaO.add(l);
			}
		}
		
		lineaO.sort(new OrdenarPorDuracion());
		
		for(Linea l:lineaO) {
			System.out.println(l);
		}
	}
	
	public void mostrarLineasOrdenadosPorCantidadDeParadas() {
		List<Linea> lineaO=new ArrayList<Linea>();
		
		for(String i:registro.keySet()) {
			for(Linea l:registro.get(i)) {
				lineaO.add(l);
			}
		}
		
		lineaO.sort(new OrdenarPorCantidadDeParadas());
		
		for(Linea l:lineaO) {
			System.out.println(l);
		}
	}
	
	public Map<Conexion,Collection<Linea>> mapearLineasPorConexion(){
		Map<Conexion,Collection<Linea>> lineaC=new TreeMap<Conexion, Collection<Linea>>();
		
		for(String O:registro.keySet()) {
			for(Linea l:registro.get(O)) {
				if(!lineaC.containsKey(l.getConexion())) {
					lineaC.put(l.getConexion(), new TreeSet<Linea>());
				}
				lineaC.get(l.getConexion()).add(l);
			}
		}
		
		return lineaC;
	}
}
