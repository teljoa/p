package Coleciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class nUMEROS {

	public nUMEROS() {
		Scanner sc=new Scanner(System.in);
		
		Map<String, List<Integer>> numeros=new HashMap<String, List<Integer>>();
		
		numeros.put("PAR", new ArrayList<Integer>());
		numeros.put("IMPAR", new ArrayList<Integer>());
		
		System.out.println("Introduce un numero.");
		int numero=Integer.valueOf(sc.nextLine());
		
		if(numero%2==0) {
			
			numeros.get("PAR").add(numero);
		}else {
			
			numeros.get("IMPAR").add(numero);
		}
		System.out.println(numeros);
	}
}
