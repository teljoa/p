package ejercicios;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		/*Método que pida 15 números y realice su suma.*/
		
		Scanner sc=new Scanner(System.in);
		
		int num=0;
		int total=0;
		
		for(int i=0;i<=15;i++) {
			System.out.println("Introduce un numero:");
			num=Integer.valueOf(sc.nextLine());
			total+=num;
		}
		
		System.out.println("La suma total es de:"+ total);
	}
}
