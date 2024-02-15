package Ejercicios;

public class Ejer8 {
	
	public static int toDecimal(String binario) {
        int decimal = 0;
        int longitud = binario.length();

        for (int i = 0; i < longitud; i++) {
            char bitChar = binario.charAt(i);
            int bit = Character.getNumericValue(bitChar);
            int exponente = longitud - i - 1;
            decimal += bit * Math.pow(2, exponente);
        }

        return decimal;
    }

	public static void main(String[] args) {
		/*Realiza un método llamado toDecimal que reciba un String con un valor numérico
		  en binario como argumento y devuelva el número decimal correspondiente.
		*/
		
		String valorBinario = "1010";
        int resultadoDecimal = toDecimal(valorBinario);
        System.out.println("El valor binario es:" + valorBinario + ",en decimal es:" + resultadoDecimal);
	}

}
