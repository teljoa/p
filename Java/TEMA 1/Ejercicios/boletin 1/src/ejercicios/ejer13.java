package ejercicios;

import java.util.Scanner;

public class ejer13 {
	
	public static void maximoMinimo() {
		Scanner sc=new Scanner(System.in);
		
		int numMaximo=0;
		int numMinimo=0;
		int num=0;
		
		System.out.println("Introducce un numero:");
		num=Integer.valueOf(sc.nextLine());
		numMaximo=num;
		numMinimo=num;
		
		for(int i=0;i<9;i++) {
			
			System.out.println("Introducce un numero:");
			num=Integer.valueOf(sc.nextLine());
			
			if(num>numMaximo) {
				numMaximo=num;
			}else if(num<numMinimo) {
				numMinimo=num;
			}
		}
		System.out.println("El numero introduccido mas alto es el:"+ numMaximo);
		System.out.println("El numero introduccido mas bajo es el:"+ numMinimo);
	}
	
	public static void main(String[] args) {
		/*13. Programa que reciba 10 números y nos indique el valor máximo y mínimo.
		*/
		maximoMinimo();

	}

}
