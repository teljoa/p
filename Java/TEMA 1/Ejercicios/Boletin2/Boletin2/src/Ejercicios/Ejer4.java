package Ejercicios;

public class Ejer4 {
	
	public static char convertirLetra(char letra) {
		char numero='0';
		switch (letra) {
			
			case 'a':{
				numero='4';
				break;
			}
			case 'e':{
				numero='3';
				break;
			}
			case 'i':{
				numero='1';
				break;
			}
			case 'o':{
				numero='0';
				break;
			}
			case 'u':{
				numero='5';
				break;
			}
			default:{
				numero=letra;
			}
		}
		
		return numero;
	}
	
	public static char convertirNumero(char letra ) {
		char numero='0';
		switch (letra) {
			
			case '4':{
				numero='a';
				break;
			}
			case '3':{
				numero='e';
				break;
			}
			case '1':{
				numero='i';
				break;
			}
			case '0':{
				numero='o';
				break;
			}
			case '5':{
				numero='u';
				break;
			}
			default:{
				numero=letra;
			}
		}
		
		return numero;
	}
	
	public static String codificador(String cadena) {
		String codificada = "";
		
		for(int i=0;i<cadena.length();i+=2) {
			codificada+=convertirLetra(cadena.charAt(i+1));
			codificada+=convertirLetra(cadena.charAt(i));
		}
		
		return codificada;
	}
	
	public static String descodificador(String codificada) {
		String descodificada = "";
		
		for(int i=0;i<codificada.length();i+=2) {
			descodificada+=convertirNumero(codificada.charAt(i+1));
			descodificada+=convertirNumero(codificada.charAt(i));
		}
		
		return descodificada;
	}

	public static void main(String[] args) {
		/*Elabora un programa que codifique una cadena, de tal modo que en el resultado se
		  inviertan cada 2 caracteres y las vocales se cambien por números (a-4, e-3, i-1, o-0,
		  u-5). Los caracteres intercambiados no pueden volver a intercambiarse.
		  Por ejemplo:

								 Entrada -> Hola mundo
								 Salida -> 0H4lm n50d
		  Genera la función inversa y realiza una llamada compuesta de una sobre otra, ¿qué
		  es lo que sucede?
		*/
		
		String cadena="Hola mundo";
		
		System.out.println("Frase introduccida:"+cadena);
		System.out.println("Cadena codificada:"+codificador(cadena));
		System.out.println("Cadena descodificada"+descodificador(codificador(cadena)));
	}

}
