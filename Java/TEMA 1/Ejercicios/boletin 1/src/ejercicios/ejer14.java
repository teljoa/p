package ejercicios;

import java.util.Scanner;

public class ejer14 {
	
	public static int paresMaximo(int num) {
		int max=0;
		if(num>max) {
			max=num;
		}
		return max;
	}
	
	public static int imparesMedia(int numTotal,int numImpares) {
		return numImpares/numTotal;
	}
	
	public static void main(String[] args) {
		/*Realiza un programa que vaya pidiendo números hasta que se introduzca un número negativo y nos diga cuántos números se han introducido, 
		 * la media de los impares y el mayor de los pares. El número negativo sólo se utiliza para indicar el final de la introducción de datos 
		 * pero no se incluye en el cómputo. 
		*/
		Scanner sc=new Scanner(System.in);
		int num=0;
		int numTotal=0;
		int numImpares=0;
		int maximo=0;
		
		do {
			System.out.println("Introducce un numero:");
			num=Integer.valueOf(sc.nextLine());
			if(num>0) {
				numTotal++;
				if(num%2==0) {
					maximo=paresMaximo(num);
				}if(num%2!=0) {
					numImpares++;
				}
			}
		}while(num<0);
		
		System.out.println("Se ha introduccido un total de:"+ numTotal + "numeros.");
		System.out.println("La media de los numeros impaares introduccidos es de:"+ imparesMedia(numTotal, numImpares));
		System.out.println("El numero par mayor introduccido es el:"+ maximo);
	}

}
