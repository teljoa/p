package Ejercicios;

public class ejer8 {
	//sin terminal revisar
	private static String reemplazarPalabra(String frase, String palabraBuscar, String palabraReemplazo) {
        String[] palabras = frase.split(" ");
        
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabraBuscar)) {
                palabras[i] = palabraReemplazo;
            }
        }
        return String.join(" ", palabras);
	}
	
	public static void main(String[] args) {
		/*Diseñar una función que reciba como parámetro tres cadenas, la primera será una
		  frase y deberá buscar si existe la palabra que recibe como segundo parámetro y
		  reemplazarla por la tercera.
		*/
		
		String fraseOriginal = "La programación es muy intensa";
        String palabraBuscar = "intensa";
        String palabraReemplazo = "interesante";

        String nuevaFrase = reemplazarPalabra(fraseOriginal, palabraBuscar, palabraReemplazo);

        System.out.println("Frase original: " + fraseOriginal);
        System.out.println("Nueva frase: " + nuevaFrase);
	}

}
