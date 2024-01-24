package ejercicios;

import java.util.Scanner;

public class Ejer12 {
	public static void main(String[] args) {
		/*Realiza un programa que pida números hasta que se teclee uno negativo y muestre cuántos números se han introducido.
		*/
		
		Scanner sc=new Scanner(System.in);
		
		int num=0;
		int numeros=0;
		
		do {
			System.out.println("Introduce un numero:");
			num=Integer.valueOf(sc.nextLine());
			if(num>0) {
				numeros++;
			}
		}while(0<num);
		
		System.out.println("Se han introduccido un total de: "+ numeros + " numeros.");
	}
}
