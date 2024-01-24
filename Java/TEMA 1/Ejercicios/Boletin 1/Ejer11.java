package ejercicios;

import java.util.Scanner;

public class Ejer11 {
	public static void main(String[] args) {
		/*Realiza un programa que pida números y muestre su cuadrado, repitiendo el proceso hasta que se introduzca un número negativo. 
		*/
		
		Scanner sc=new Scanner(System.in);
		
		int num=0;
		
		do {
			System.out.println("Introduce un numero:");
			num=Integer.valueOf(sc.nextLine());
			if(num>0) {
				System.out.println(num*num);
			}
		}while(0<num);
	}
}
