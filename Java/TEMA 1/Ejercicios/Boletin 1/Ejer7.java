package ejercicios;

public class Ejer7 {
	public static void main(String[] args) {
		/*7. Codifica las siguientes secuencias numéricas haciendo uso de estructuras: 
		 * i) for, 
		 * ii)while, 
		 * iii) do-while 
		 * en cada una de ellas:
		 * a. Crea un método que muestre los números del 1 al 100 
		 * b. Repite el ejercicio anterior, pero en formato descendente, es decir, del 100 al 1. 
		 * c. Crea un programa que calcule y escriba los números múltiplos de 5 de 0 a 100. 
		 * d. Escribe los números del 320 al 160, contando de 20 en 20 hacia atrás.
		 */
		
		//a
		
			for(int i=0;i<=100;i++) {
				System.out.println(i);
			}
			
			int i=0;
			
			while(i<=100) {
				System.out.println(i);
				i++;
			}
			
			i=0;
			
			do {
				System.out.println(i);
				i++;
			}while(i<=100);
			
		//b
		
			for(int j=100;j>=0;j--) {
				System.out.println(j);
			}
			
			int j=0;
			
			while(j>=0) {
				System.out.println(j);
				j--;
			}
			
			j=100;
			
			do {
				System.out.println(j);
				j--;
			}while(j>=0);
			
		//c
			for(int l=0;l<=20;l++) {
				System.out.println(l*5);
			}
			
			int l=0;
			
			while(l<=20) {
				System.out.println(l*5);
				l++;
			}

			l=0;
			
			do {
				System.out.println(l*5);
				l++;
			}while(l<=20);
		
		
		//d
			
			for(int m=320;m>=160;m-=20) {
				System.out.println(m);
			}
			
			int m=320;
			
			while(m>=160) {
				System.out.println(m);
				m-=20;
			}
			
			m=320;
			
			do {
				System.out.println(m);
				m-=20;
			}while(m>=160);
			
	}
}
