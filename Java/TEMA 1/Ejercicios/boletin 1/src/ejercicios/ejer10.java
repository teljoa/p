package ejercicios;

import java.util.Scanner;

public class ejer10 {
	
	public static void suma(int num) {
		int total=0;
		for(int i=0;i<100;i++) {
			total+=num;
			num++;
		}
		System.out.println(total);
	}

	public static void main(String[] args) {
		/*Realiza un programa que sume los 100 números siguientes a un número entero y positivo introducido por teclado. Se debe comprobar que el 
		 * dato introducido es correcto (que es un número positivo).
		*/
		
		int num=0;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Indroducce un numero:");
			num=Integer.valueOf(sc.nextLine());
		}while(num<0);
		
		suma(num);
	}

}
