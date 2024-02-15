package Ejercicios;

public class ejer5 {

	private static boolean esPalindromo(String cadena) {
        boolean palimdromo=true;
        
        String cadenaFormateada = cadena.replaceAll("[\\s,.;:'¡!¿?()-]", "").toLowerCase();

        int longitud = cadenaFormateada.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (cadenaFormateada.charAt(i) != cadenaFormateada.charAt(longitud - 1 - i)) {
            	palimdromo= false;
            }
        }

        return palimdromo;
    }
	
	public static void main(String[] args) {
		/*Diseña una función llamada esPalindromo que reciba una cadena de caracteres y
		  determine si constituye un palíndromo o no. Una palabra es un palíndromo si puede
		  leerse del mismo modo de izquierda a derecha que de derecha a izquierda. Obvia
		  los espacios en blanco y caracteres separadores, así como tildes, etc.
		  Ejemplos de palíndromos: ‘Ligar es ser ágil’, ‘Somos o no somos’.
		*/
		
		System.out.println(esPalindromo("Ligar es ser ágil"));
        System.out.println(esPalindromo("Somos o no somos"));
	}

}
