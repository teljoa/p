package Ejercicios;

import java.util.Scanner;

public class Ejer1 {

	public static int voltear(int numero) {
		int volteado=0;
		while(numero>0) {
			volteado=(volteado*10)+(numero% 10);
			numero/=10;
		}
		return volteado;
	}
	
	public static void main(String[] args) {
		/*Realiza una función que reciba un número y que devuelva ese número al revés. El
		  tipo de datos recibido puede ser numérico o cadena. Realiza pruebas y nombra la
		  función correctamente.
		*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero:");
		int numero=Integer.valueOf(sc.nextLine());
		
		System.out.println(voltear(numero));
		
		
	}

}
