package ejercicios;

public class Ejer17 {
	public static void main(String[] args) {
		/*17. Escribe un programa que muestre los N primeros términos de la serie de Fibonacci.
		 * El primer término de la serie de Fibonacci es 1, el segundo es 1 y el resto se calcula sumando los dos anteriores, por lo que 
		 * tendríamos que los términos son 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144.
		*/
		
		int serie = 15, num1 = 0, num2 = 1, suma = 1;
		 
        System.out.println(num1);
         
        for (int i = 1; i < serie; i++) {
             
            System.out.println(suma);
             
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;    
        }
		
	}
}
