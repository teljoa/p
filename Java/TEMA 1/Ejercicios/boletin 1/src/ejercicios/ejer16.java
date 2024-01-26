package ejercicios;

import java.util.Scanner;

public class ejer16 {
	
	public static void salarios() {
		Scanner sc=new Scanner(System.in);
		
		int salario=0;
		int salariaM=0;
		int sumaSalario=0;
		
		for(int i=0;i<10;i++) {
			System.out.println("Introducce el salario del trabajador:");
			salario=Integer.valueOf(sc.nextLine());
			sumaSalario+=salario;
			if(salario>1000) {
				salariaM++;
			}
		}
		
		System.out.println("Entre los 10 empleados ganan un total de:"+ sumaSalario);
		System.out.println("Hay un total de:"+ salariaM + " empleados que tienen un salario mayor a 1000€ mensuales.");
	}
	
	public static void main(String[] args) {
		/*Pedir 10 valores numéricos que representan el salario mensual de 10 empleados.
		 * Mostrar su suma y cuantos hay mayores de 1000€.
		*/
		salarios();
	}

}
