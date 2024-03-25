package inicio;

import java.util.Scanner;

public class PrimeraClase {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		/*System.out.println("Ingrese su nombre:");
	
		String name = sc.nextLine();
	
		System.out.println("Hola mi nombre es:" + name);*/
		
		System.out.println("Introduce tu edad:");
		
		int edad=Integer.valueOf(sc.nextLine());
		
		edad++;
		
		System.out.println("Tu edad +1 es de:" + edad);
	
    }
}
