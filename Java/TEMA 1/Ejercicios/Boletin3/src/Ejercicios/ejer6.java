package Ejercicios;

public class ejer6 {
	
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
	
	private static boolean esCapicua(double numero) {
        String cadenaNumero = String.valueOf(numero);
        String cadenaFormateada = cadenaNumero.replace(".", "").toLowerCase();

        return esPalindromo(cadenaFormateada);
	}
	
	public static void main(String[] args) {
		/*Haciendo uso de la función anterior crea una función esCapicúa que acepte
		  números tanto enteros como decimales.
		*/
		
		System.out.println(esCapicua(12321));// true
        System.out.println(esCapicua(12345));// false
        System.out.println(esCapicua(12321.321));// true
        System.out.println(esCapicua(12345.678));// false
	}

}
