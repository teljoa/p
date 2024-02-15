package Ejercicios;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		/*Realizar un método llamado calcularSolucionesEcuacionSegundoGrado que
		  reciba los coeficientes de una ecuación de segundo grado y devuelva el número de
		  soluciones que tiene. Si los argumentos no son válidos (el primer coeficiente tiene
		  que ser distinto de cero) debe devolver un -1.
		*/
		
		Scanner sc=new Scanner(System.in);
		
		double x1, x2;//ax^2 + bx + c = 0
		
		System.out.println("Introduce un valor para a:");
		double a=Integer.valueOf(sc.nextLine());
		System.out.println("Introduce un valor para b:");
		double b=Integer.valueOf(sc.nextLine());
		System.out.println("Introduce un valor para c:");
		double c=Integer.valueOf(sc.nextLine());
		
		x1=((-b)+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
		x2=((-b)-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
		
		System.out.println(x1);
		System.out.println(x2);
	}

}
