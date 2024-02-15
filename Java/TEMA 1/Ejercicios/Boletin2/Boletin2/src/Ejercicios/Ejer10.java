package Ejercicios;

import java.util.Scanner;

public class Ejer10 {
	
	public static int mcd(int num1, int num2) {

        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);

        int resultado = 0;
        do {
            resultado = b;
            b = a % b;
            a = resultado;

        } while (b != 0);

        return resultado;
	}
	
	public static int mcm(int num1, int num2) {
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);

        int resultado = (a / mcd(num1, num2)) * b;
        
        return resultado;
    }
	
	public static void main(String[] args) {
		/*Realizar un método llamado minimoComunMultiplo que reciba dos números y
		  calcule el mínimo común múltiplo de dos números. Con el máximo común divisor de
		  una pareja de números podemos obtener fácilmente el mínimo común múltiplo de
		  dicha pareja. El mínimo común múltiplo de dos números es igual al producto de los
		  números dividido entre su máximo común divisor. Por ejemplo, el máximo común
		  divisor de 24 y 36 es 12, por tanto el mínimo común múltiplo de 24 y 36 es
		  (24×36)/12=72.
		*/
		Scanner sn = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        int num1 = sn.nextInt();

        System.out.println("Introduce el segundo numero");
        int num2 = sn.nextInt();

        int resto = mcm(num1, num2);

        System.out.println("MCM: " + resto);

    }

    

    

}
