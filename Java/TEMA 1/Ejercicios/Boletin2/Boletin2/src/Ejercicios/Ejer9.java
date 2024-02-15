package Ejercicios;

public class Ejer9 {
	
	public static int gcd(int num1,int num2) {
		int divisor;
	    while (num2 != 0) {
	        divisor = num2;
	        num2 = num1 % num2;
	        num1 = divisor;
	    }
		return num1;
	}

	public static void main(String[] args) {
		/*Realiza un método llamado gcd (greaterCommonDivisor) que recibirá dos números y
		  devuelva el máximo común divisor según el algoritmo de Euclides.
		*/
		
		int num1=42;  
		int num2=100;
	    
	    System.out.println(gcd(num1, num2));
	}

}
