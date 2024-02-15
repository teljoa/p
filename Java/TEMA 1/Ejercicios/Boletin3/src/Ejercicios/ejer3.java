package Ejercicios;

public class ejer3 {
	
	private static int contarPalabra(String texto, String palabra) {
        int contador = 0;
        int indice = texto.indexOf(palabra);

        while (indice != -1) {
            contador++;
            indice = texto.indexOf(palabra, indice + 1);
        }

        return contador;
    }
	
	public static void main(String[] args) {
		/*Diseña un programa que cuente el número de veces que aparece una palabra en
		  una cadena de texto (sin considerar mayúsculas).
		*/
		
		System.out.println(contarPalabra("el sol es sol", "sol"));
	}

}
