package ejercicios;

import java.util.Scanner;

public class ejer11 {
	
	public static int cuadrado(int num) {
		return num*num;
	}
	
	public static void main(String[] args) {
		/*Realiza un programa que pida números y muestre su cuadrado, repitiendo el proceso hasta que se introduzca un número negativo. 
		*/
		Scanner sc=new Scanner(System.in);
		int num=1;
		
		while(num>=0) {
			num=Integer.valueOf(sc.nextLine());
			System.out.println("Introducce un numero para mostrar su cuadado:");
			System.out.println(cuadrado(num));
		}
	}

}
