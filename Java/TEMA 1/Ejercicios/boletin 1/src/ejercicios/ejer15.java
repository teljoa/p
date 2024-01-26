package ejercicios;

import java.util.Scanner;

public class ejer15 {
	
	public static void suma() {
		Scanner sc=new Scanner(System.in);
		int num=0;
		int suma=0;
		String seguir="";
		
		do {
			System.out.println("Introducce un numero:");
			num=Integer.valueOf(sc.nextLine());
			suma+=num;
			
			System.out.println("Para salir introduzca la palabra: fin.");
			seguir=sc.nextLine();
			
		}while(seguir!="fin");
		
		System.out.println("La suma de los numeros que has introduccido es de:"+ suma);
	}
	
	public static void main(String[] args) {
		/*Crea un programa que permita sumar N números. El usuario decide cuándo termina de introducir números al indicar la palabra ‘fin’. 
		*/
		suma();

	}

}
