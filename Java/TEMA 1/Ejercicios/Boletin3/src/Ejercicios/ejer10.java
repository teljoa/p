package Ejercicios;

public class ejer10 {
	
	public static final String ABECEDARIO="abcdefghigklmnñopqrstuvwyz";

	public static char cifrarCarcter(char caracter,int desplazamiento) {
		return ABECEDARIO.charAt(ABECEDARIO.indexOf(Character.toLowerCase(caracter)+desplazamiento)%ABECEDARIO.length());
	}
	
	public static String cifrarPalabra(String palabra,int desplazamiento) {
		String palabraResulta="";
		
		for(int i=0;i<palabra.length();i++) {
			palabraResulta+=cifrarCarcter(palabra.charAt(i), desplazamiento);
		}
		
		return palabraResulta;
	}
	
	public static boolean sonIguales(String cadena1,String cadena2,int desplazamiento) {
		boolean igual=false;
		
		if(cifrarPalabra(cadena1, desplazamiento).equals(cadena2)) {
			igual=true;
		}else if(cifrarPalabra(cadena2, desplazamiento).equals(cadena1)) {
			igual=true;
		}
		return igual;
	}
	
	public static void main(String[] args) {
		/* El cifrado César es un tipo de cifrado por sustitución en el que una letra del alfabeto
		   es sustituida por otra que se encuentra situada en el abecedario
		   (abcdefghijklmnñopqrstuvwxyz) un número dado de posiciones desde la primera,
		   como puede observarse en la siguiente imagen:
		   Así, por ejemplo, la palabra CASADO, con un cifrado de tres posiciones pasaría a
		   ser FDVDGR.
		   a. Realiza una función que cifre un carácter según el cifrado César y un
		   desplazamiento dado.
		   b. Elabora una función que, haciendo uso de la anterior, reciba una palabra y un
		   número fijo de posiciones y la codifique según este algoritmo.
		   c. Diseña otra función que reciba dos palabras y compruebe si son equivalentes
		   según este tipo de cifrado e indique el nivel de sustitución utilizado, es decir,
		   si cifrando una de ellas podemos obtener la otra.
		   Ej: Si recibe CASADO y FDVDGR debe indicar que son equivalentes
		   y utilizan un nivel de codificación 3
		   Si recibe CASADO y AAAABD debe indicar que no son equivalentes.
		   El programa no debe distinguir entre mayúsculas y minúsculas.
		*/
		
		System.out.println(cifrarPalabra("casado", 3));
		System.out.println(sonIguales("casado","fdvdgr",3));
		System.out.println(sonIguales("casado","aaaabd",3));
	}

}
