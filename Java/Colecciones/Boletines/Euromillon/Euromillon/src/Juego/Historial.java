package Juego;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Historial {
private Map<LocalDate,Combinacion> sorteos;
	
	public Historial() {
		super();
		sorteos= new HashMap<>();
	}
	
	public boolean addSorteo(LocalDate fecha, Combinacion c1) throws CombinacionException {
		boolean entra=false;
		if(fecha!=null && c1!=null) {
			sorteos.put(fecha, c1);
			entra=true;
		}else {
			throw new CombinacionException();
		}
		return entra;
	}
	
	public boolean adSorteo(int dia, int mes , int ayo, Combinacion c1)  throws CombinacionException {
		boolean entra=false;
		if(c1!=null && LocalDate.of(ayo, mes, dia)!=null) {
			sorteos.put(LocalDate.of(ayo, mes, dia), c1);
			entra=true;
		}else {
			throw new CombinacionException();
		}
		return entra;
	}
	
	public boolean actualizarSorteo(int dia, int mes , int ayo, Combinacion c1) throws CombinacionException {
		boolean actualizar=false;
		if(sorteos.containsKey(LocalDate.of(ayo, mes, dia))) {
			sorteos.replace(LocalDate.of(ayo, mes, dia), c1);
			actualizar=true;
		}else {
			throw new CombinacionException();
		}
		return actualizar;
	}
	
	public boolean actualizarSorteo(LocalDate fecha, Combinacion c1) throws CombinacionException {
		boolean actualizar=false;
		if(sorteos.containsKey(fecha)) {
			sorteos.replace(fecha, c1);
			actualizar=true;
		}else {
			throw new CombinacionException();
		}
		return actualizar;
	}
	
	public boolean borrarSorteo(LocalDate fecha, Combinacion c1) throws CombinacionException {
		boolean borrar=false;
		if(sorteos.containsKey(fecha)) {
			sorteos.remove(fecha);
			borrar=true;
		}else {
			throw new CombinacionException();
		}
		return borrar;
	}
	
	public List<String> listarSorteoDesdeFecha(LocalDate fecha){
		List<String> lista = new ArrayList<String>();
		if(sorteos.containsKey(fecha)) {
			for(LocalDate D : sorteos.keySet()) {
				if(D.isAfter(fecha)) {
					lista.add(D.toString()+": "+sorteos.get(D).toString());
				}
			}
		}
		return lista;
	}
	
	public List<String> mostrarHistorico(){
		List<String> lista = new ArrayList<String>();
		for(LocalDate D : sorteos.keySet()) {
			lista.add(D.toString()+sorteos.get(D));
		}
		return lista;
	}
	
	public Map<String,Integer> comprobarAciertos(LocalDate fecha, Combinacion c1) throws HistorialException{
		Map<String, Integer> aciertos=new HashMap<String, Integer>();
		if(sorteos.containsKey(fecha)) {
			aciertos.put("Para la fecha: "+fecha.toString()+" el numero premiado es: "+sorteos.get(fecha)+", numero a comprobar: "+c1, sorteos.get(fecha).comprobarCombinacion(c1));
		}else {
			throw new HistorialException();
		}
		return aciertos;
	}
}
