package Ejercicios;

public class ejer7 {

	private static boolean buscarPalabra(String texto, String palabra) {
        int indiceTexto = 0;
        int indicePalabra = 0;

        while (indiceTexto < texto.length() && indicePalabra < palabra.length()) {
            if (texto.charAt(indiceTexto) == palabra.charAt(indicePalabra)) {
                indicePalabra++;
            }
            indiceTexto++;
        }

        return indicePalabra == palabra.length();
    }
	
	public static void main(String[] args) {
		/*Realizar una función que busque una palabra escondida dentro de un texto. Por
		  ejemplo, si la cadena es “shybaoxlna” y la palabra que queremos buscar es “hola”,
		  entonces si se encontrará y deberá devolver True, en caso contrario deberá devolver
		  False. Las letras de la palabra escondida deben aparecer en el orden correcto en la
		  cadena que la oculta:
		  shybaoxlna ⇒ hola: True
		  soybahxlna ⇒ hola: False
		*/
		
		System.out.println(buscarPalabra("shybaoxlna", "hola"));// true
        System.out.println(buscarPalabra("soybahxlna", "hola"));// false
	}

}
