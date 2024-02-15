package Ejercicios;

public class ejer2 {

	public static boolean divisible3(int numero) {
		boolean divisible=false;
		int temporal=0;
		
		if(numero>0) {
			while (numero != 0) {
				temporal += numero % 10;
	            numero /= 10;
			}
			if(temporal == 0 || temporal == 3 || temporal == 6 || temporal == 9) {
				divisible=true;
			}
		}
		
		return divisible;
	}
	
	public static void main(String[] args) {
		/*Un número es divisible por 3 si la suma de todas sus cifras reducidas a una cifra es
		  igual a 0, 3, 6 ó 9.
		  Por ejemplo, 156 ⇒ 1+5+6=12 ⇒ 1+2 = 3 es divisible,
		  pero 157 ⇒ 1+5+7 =13 ⇒ 1+3 =4 no lo es.
		  Elabora un programa que compruebe la divisibilidad por 3 según este algoritmo. El
		  programa debe comprobar que el número facilitado es válido.
		*/
	}

}
