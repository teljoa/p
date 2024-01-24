package ejercicios;

import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {
		/*Realiza un programa que sume los 100 números siguientes a un número entero y positivo introducido por teclado. Se debe comprobar que el 
		 * dato introducido es correcto (que es un número positivo).
		*/
		
		int num=0;
		int total=0;
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<100;i++) {
			do {
				System.out.println("Indroducce un numero:");
				num=Integer.valueOf(sc.nextLine());
			}while(num<0);
			total+=num;
		}
		System.out.println(total);
	}
}
