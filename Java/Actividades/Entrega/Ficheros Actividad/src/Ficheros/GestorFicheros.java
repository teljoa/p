package Ficheros;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.BufferedReader;

public class GestorFicheros {
	
	public static List<Sorteo> combretirASorteo(String nombreFichero) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
		
		br.readLine();
		
		List<Sorteo> sorteos=new ArrayList<Sorteo>();
		
		br.lines().forEach(linea -> sorteos.add(new Sorteo(linea)));
		
		br.close();
		
		return sorteos;
	}
	
	public static int estrellaMasRepetida(List<Sorteo> sorteos) {
		Map<Integer,Integer> estrellass=new HashMap<Integer,Integer>();
		int estrellaMRepetida=0;
		
		for(Sorteo s:sorteos) {
			for(int i:s.getEstrellas()) {
				if(!estrellass.containsKey(i)) {
					estrellass.put(i, 0);
				}
				estrellass.put(i,estrellass.get(i)+1);
			}
		}
		
		for(int j=0;j<estrellass.size();j++) {
			if(estrellass.containsKey(j)) {
				if(estrellass.get(j)>estrellaMRepetida) {
					estrellaMRepetida=j;
				}
			}
		}
		
		return estrellaMRepetida;
	}
	
	public static int estrellaMenosRepetida(List<Sorteo> sorteos) {
		Map<Integer,Integer> estrellass=new HashMap<Integer,Integer>();
		int estrellaMRepetida=1;
		
		for(Sorteo s:sorteos) {
			for(int i:s.getEstrellas()) {
				if(!estrellass.containsKey(i)) {
					estrellass.put(i, 0);
				}
				estrellass.put(i,estrellass.get(i)+1);
			}
		}
		
		for(int j=0;j<estrellass.size();j++) {
			if(estrellass.containsKey(j)) {
				if(estrellass.get(j)<=estrellaMRepetida) {
					estrellaMRepetida=j;
				}
			}
		}
		
		return estrellaMRepetida;
	}
	
	public static int numeroMasRepetido(List<Sorteo> sorteos) {
		Map<Integer,Integer> numeross=new HashMap<Integer,Integer>();
		int numeroMRepetida=0;
		
		for(Sorteo s:sorteos) {
			for(int i:s.getNumeros()) {
				if(!numeross.containsKey(i)) {
					numeross.put(i, 0);
				}
				numeross.put(i,numeross.get(i)+1);
			}
		}
		
		for(int j=0;j<numeross.size();j++) {
			if(numeross.containsKey(j)) {
				if(numeross.get(j)>numeroMRepetida) {
					numeroMRepetida=j;
				}
			}
		}
		
		return numeroMRepetida;
	}
	
	public static int numeroMenosRepetido(List<Sorteo> sorteos) {
		Map<Integer,Integer> numeross=new HashMap<Integer,Integer>();
		int numeroMRepetida=1;
		
		for(Sorteo s:sorteos) {
			for(int i:s.getNumeros()) {
				if(!numeross.containsKey(i)) {
					numeross.put(i, 0);
				}
				numeross.put(i,numeross.get(i)+1);
			}
		}
		
		for(int j=0;j<numeross.size();j++) {
			if(numeross.containsKey(j)) {
				if(numeross.get(j)<=numeroMRepetida) {
					numeroMRepetida=j;
				}
			}
		}
		
		return numeroMRepetida;
	}
	
	public static int maximoAciertosCombinacion(List<Sorteo> sorteos,List<Integer> numeros,List<Integer> estrellas) {
		int repeticiones=0;
		
		for(Sorteo s:sorteos) {
			if(s.getNumeros().equals(numeros) && s.getEstrellas().equals(estrellas)) {
				repeticiones++;
			}
		}
		
		return repeticiones;
	}
	
	public static List<Integer> combinacionSeguidaMasRepetida(List<Sorteo> sorteos){
		Map<List<Integer>,Integer> combinaciones=new HashMap<List<Integer>, Integer>();
		List<Integer> combinacionAnterior=new ArrayList<Integer>();
		int repeticiones=0;
		List<Integer> combinacionResultante=new ArrayList<Integer>();
		
		for(Sorteo s:sorteos) {
			if(s.getNumeros().equals(combinacionAnterior)) {
				combinaciones.put(combinacionAnterior, +1);
			}else {
				combinaciones.put(s.getNumeros(), 1);
				combinacionAnterior=s.getNumeros();
			}
		}
		
		for(List<Integer> n:combinaciones.keySet()) {
			for(Integer i:combinaciones.values()) {
				if(n.get(i)>repeticiones) {
					repeticiones=n.get(i);
					combinacionResultante=n;
				}
			}
		}
		
		return combinacionResultante;
	}
	
	public static void leerFichero(String nombreFichero) {
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
			System.out.println(br.readLine());		
			
			String lineaActual=br.readLine();
			
			do {
				System.out.println(lineaActual);
				lineaActual=br.readLine();
			}while(lineaActual!=null);
	
			br.lines().forEach(System.out::println);
			br.close();
		}catch(NullPointerException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException {
		try {
			
			List<Sorteo> sorteos= combretirASorteo("C:\\Users\\Usuario\\Documents\\Downloads\\t\\Entrega\\Euromillones 2004 a 2023.csv");//Para que funcione solo tieme que cambiar la dirreccion que esta puesta por donde lo tiene guardado. 
			
			System.out.println("La estrella que se repite mas veces es la:" + estrellaMasRepetida(sorteos) + ".");
			System.out.println("La estrella que se repite menos veces es la:" + estrellaMenosRepetida(sorteos) + ".");
			System.out.println("El numero que se repite mas veces es el:" + numeroMasRepetido(sorteos) + ".");
			System.out.println("El numero que se repite menos veces es el:" + numeroMenosRepetido(sorteos) + ".");
			
			List<Integer> numeros=new ArrayList<Integer>();
			numeros.add(7);
			numeros.add(8);
			numeros.add(18);
			numeros.add(33);
			numeros.add(42);
			
			List<Integer> estrellas=new ArrayList<Integer>();
			estrellas.add(2);
			estrellas.add(8);
			
			System.out.println("La combinacion:07,08,18,33,42,,02,08; aparece:" + maximoAciertosCombinacion(sorteos,numeros ,estrellas) + " vez/veces.");
			
			System.out.println("La combinacion que aparece mas veces seguidas es:" + combinacionSeguidaMasRepetida(sorteos) + ".");
			
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
	}
}
