package Ejercicios;

public class ejer9 {

	public static int contarPalabras(String texto) {
		int resultado=0;
		
		for(int i=0;i<texto.length();i++) {
			resultado+=texto.split("\\s").length;
		}
		
		return resultado;
	}
	
	public static int contarFrases(String texto) {
		int resultado=0;
		
		for(int i=0;i<texto.length();i++) {
			if(texto.charAt(i)=='.') {
				resultado++;
			}
		}
		
		
		return resultado;
	}
	
	public static int contarParrafos(String texto) {
		int resultado=0;
		
		for(int i=0;i<texto.length();i++) {
			if(texto.charAt(i)=='\n') {
				resultado++;
			}
		}
		
		return resultado;
	}
	
	public static void main(String[] args) {
		/*Escribir una función que devuelva el número de palabras, frases y párrafos que
		  existen en una cadena de texto que recibe como parámetro. Ten en cuenta que entre
		  dos palabras puede haber más de un blanco, las frases se separan por puntos y los
		  párrafos por saltos de línea.
		*/
		
		System.out.println(contarPalabras("Escribir una función que devuelva el número de palabras, frases y párrafos que\r\n"
				+ "		  existen en una cadena de texto que recibe como parámetro. Ten en cuenta que entre\r\n"
				+ "		  dos palabras puede haber más de un blanco, las frases se separan por puntos y los\r\n"
				+ "		  párrafos por saltos de línea."));
		
		System.out.println(contarFrases("Escribir una función que devuelva el número de palabras, frases y párrafos que\r\n"
				+ "		  existen en una cadena de texto que recibe como parámetro. Ten en cuenta que entre\r\n"
				+ "		  dos palabras puede haber más de un blanco, las frases se separan por puntos y los\r\n"
				+ "		  párrafos por saltos de línea."));
		
		System.out.println(contarParrafos("Escribir una función que devuelva el número de palabras, frases y párrafos que\r\n"
				+ "		  existen en una cadena de texto que recibe como parámetro. Ten en cuenta que entre\r\n"
				+ "		  dos palabras puede haber más de un blanco, las frases se separan por puntos y los\r\n"
				+ "		  párrafos por saltos de línea."));
	}

}
