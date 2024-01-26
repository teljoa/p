package ejercicios;

import java.util.Scanner;

public class ejer9 {
	
	public static void multiplo3() {
		Scanner sc=new Scanner(System.in);
		
		int num=0;
		boolean multiplo=false;
		
		for(int i=0;i<5;i++) {
			System.out.println("Introduce un numero:");
			num=Integer.valueOf(sc.nextLine());
			if(num%3==0 && multiplo!=true) {
				multiplo=true;
			}
		}
		System.out.println(multiplo);
	}
	
	public static void main(String[] args) {
		/*Método que pida 5 números e imprima si alguno es múltiplo de 3.*/
		multiplo3();

	}

}
