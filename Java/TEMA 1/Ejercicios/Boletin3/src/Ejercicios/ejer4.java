package Ejercicios;

public class ejer4 {
		/*Crea tres funciones cuyo comportamiento sea como el de los métodos de String
		  startsWirth, contains y endsWith, pero sin utilizar ninguno de ellos.
		*/
	    public static void main(String[] args) {
	        String texto = "Hola, mundo";

	        System.out.println(startsWithCustom(texto, "Hola"));// true
	        System.out.println(containsCustom(texto, "mundo"));// true
	        System.out.println(endsWithCustom(texto, "mundo"));// false
	    }

	    private static boolean startsWithCustom(String texto, String prefijo) {
	        boolean resultado=true;
	    	if (texto.length() < prefijo.length()) {
	    		resultado= false;
	        }

	        for (int i = 0; i < prefijo.length(); i++) {
	            if (texto.charAt(i) != prefijo.charAt(i)) {
	            	resultado= false;
	            }
	        }
	        return resultado;
	    }
	    
	   
	    private static boolean containsCustom(String texto, String subcadena) {
	        boolean coincide = false;
	        for (int i = 0; i <= texto.length() - subcadena.length(); i++) {
	        	int j=0;
	            while (j < subcadena.length() && !coincide) {
	                if (texto.charAt(i + j) != subcadena.charAt(j)) {
	                    coincide = true;
	                }
	                j++;
	            }
	            if (coincide) {
	                coincide= true;
	            }
	        }
	        return coincide;
	    }

		    private static boolean endsWithCustom(String texto, String sufijo) {
		    	boolean resultado=false;
		    	if (texto.length() < sufijo.length()) {
		    		resultado= true;
		        }

		        int inicio = texto.length() - sufijo.length();
		        for (int i = 0; i < sufijo.length(); i++) {
		            if (texto.charAt(inicio + i) != sufijo.charAt(i)) {
		            	resultado= true;
		            }
		        }

		        return resultado;
		    }
}