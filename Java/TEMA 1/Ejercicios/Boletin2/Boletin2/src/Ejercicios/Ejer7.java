package Ejercicios;

import java.util.Scanner;

public class Ejer7 {
	
	public static String toBinary(int decimal) {
		String binario="";
		while (decimal > 0) {
	        if (decimal % 2 == 0) {
	            binario = "0" + binario;
	        } else {
	            binario = "1" + binario;
	        }
	        decimal = decimal / 2;
	    }
		
		return binario;
	}

	public static void main(String[] args) {
		/*Realiza un método llamado toBinary que reciba un número decimal como
		  argumento y devuelva un String con el número binario correspondiente.
		*/
		
		Scanner sc = new Scanner(System.in);
	    int numero; 

	    System.out.print("Ingrese un numero: ");
	    numero = sc.nextInt();

	    
	    System.out.println(toBinary(numero));
	}

}
