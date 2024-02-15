package Ejercicios;

public class ejer1 {
	
	public static String imprimirCaracteres(String cadena,boolean par) {
		String resultado="";
		
		for(int i=0;i<cadena.length();i++) {
			if(par && i%2==0) {
				resultado+=cadena.charAt(i);
			}else if(!par && i%2!=0) {
				resultado+=cadena.charAt(i);
			}
		}
		
		return resultado;
	}
	
	public static void main(String[] args) {
		/*Escribe una función que reciba una cadena de texto y una variable bandera
		  (par/impar) e imprima solo los caracteres que se encuentran situados en las
		  posiciones pares o impares (según indique la variable bandera).
		  Desarrolla el código con un bucle for y después modifica el código para que utilice
		  una estructura while y do-while.
		*/
		
		System.out.println(imprimirCaracteres("hola", true));
		System.out.println(imprimirCaracteres("hola", false));
	}

}
