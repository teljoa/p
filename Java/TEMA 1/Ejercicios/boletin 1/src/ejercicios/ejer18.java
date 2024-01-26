package ejercicios;

import java.util.Scanner;

public class ejer18 {
	
	private static final double π=3.14;
	
	public static double calcularAreaCirculo(double radio) { //π*r²
		return π*(radio*radio);
	}
	
	public static double calcularLongitudCirculo(double radio) { //2.π*r
		return 2*π*radio;
	}
	
	public static void main(String[] args) {
		/* Realizar un método llamado calcularAreaCirculo que devuelva el área de un círculo y otro llamado calcularLongitudCirculo que devuelva su longitud.
		*/
		
		Scanner sc=new Scanner(System.in);
		
		double radio=Integer.valueOf(sc.nextLine());
		
		System.out.println("El area del circulo es de:"+ calcularAreaCirculo(radio)+"cm.");
		System.out.println("La longitud del circulo es de"+ calcularLongitudCirculo(radio)+"cm.");
	}

}
