package ejercicios;

import java.util.Scanner;

public class Ejer14 {
	public static void main(String[] args) {
		/*Realiza un programa que vaya pidiendo números hasta que se introduzca un número negativo y nos diga cuántos números se han introducido, 
		 * la media de los impares y el mayor de los pares. El número negativo sólo se utiliza para indicar el final de la introducción de datos 
		 * pero no se incluye en el cómputo. 
		*/
		
		Scanner sc=new Scanner(System.in);
		int num=0;
		int numIntroduccidosT=0;
		int numIntroduccidosI=0;
		int numIntroduccidoMP=0;
		
		do {
			System.out.println("Introducce un numero:");
			num=Integer.valueOf(sc.nextLine());
			if(num>0) {
				numIntroduccidosT++;
				if(num%2!=0) {
					numIntroduccidosI+=num;
				}if(num%2==0) {
					if(numIntroduccidoMP<num) {
						numIntroduccidoMP=num;
					}
				}
			}
		}while(num<0);
		
		System.out.println("Se ha introduccido un total de:"+ numIntroduccidosT + "numeros.");
		System.out.println("La media de los numeros impaares introduccidos es de:"+ numIntroduccidosI/numIntroduccidosT);
		System.out.println("El numero par mayor introduccido es el:"+ numIntroduccidoMP);
	}
}
