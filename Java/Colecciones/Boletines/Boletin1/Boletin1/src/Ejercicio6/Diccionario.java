package Ejercicio6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Diccionario {
	
	private Map<String, Set<String>> diccionario;

	public Diccionario() {
		this.diccionario = new HashMap<String, Set<String>>();
	}
	
	
	public void addPalabra(String palabra, String significado) {
		if(!diccionario.containsKey(palabra)) {
			Set<String> significados = new HashSet<String>();
			significados.add(significado);
			diccionario.put(palabra, significados);
		}else {
			diccionario.get(palabra).add(significado);
		}
		
	}
	
	public Set<String> buscarPalabra(String palabra) throws Exception {
		Set<String> significados=null;
		if(diccionario.containsKey(palabra)) {
			significados=diccionario.get(palabra);
		}else {
			throw new Exception("Dicha palabra no esta en el diccionario.");
		}
		
		return significados;
	}
	
	public void borrarPalabra(String palabra) throws Exception {
		if(diccionario.containsKey(palabra)) {
			diccionario.remove(palabra);
		}else {
			throw new Exception("Dicha palabra no esta en el diccionario.");
		}
		
		
	}
	
	public void eliminarSignificado(String palabra, String significado) throws Exception {
		if(diccionario.containsKey(palabra) && diccionario.get(palabra).contains(significado)) {
			diccionario.get(palabra).remove(significado);
		}else {
			throw new Exception("No existe dicha palabra o este significado para la palabra introduccida.");
		}
		
		
	}
	
	public List<String> listarPalabras(String comienzoPalabra){
		
		List<String> palabras = new ArrayList<String>();
		
		for(String clave : diccionario.keySet()) {
			if(clave.startsWith(comienzoPalabra)) {
				palabras.add(clave);
			}
		}
		
		palabras.sort(Comparator.naturalOrder());
		return palabras;
	}

	public Map<String, Set<String>> getDiccionario() {
		return diccionario;
	}


	public void setDiccionario(Map<String, Set<String>> diccionario) {
		this.diccionario = diccionario;
	}
	
	
}
