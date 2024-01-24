package ejercicios;

public class Ejer1 {
	
	public static boolean multiplo(int num1,int num2) {
			boolean multiplo=num1%num2==0 || num2%num1==0;
			
			return multiplo;
		}
	
	public static void main(String[] args) {
		/*1.Realiza un método que reciba dos números y devuelva True si uno es múltiplo del otro.*/
		
		int num1=675;
		int num2=5;
		
		System.out.println(multiplo(num1,num2));
	}
}
