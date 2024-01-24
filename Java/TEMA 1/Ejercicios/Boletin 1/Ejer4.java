package ejercicios;

public class Ejer4 {
	
	public static String notafinal(double notaPractica,double notaTeorica,double notaProblemas) {
		double notaFinal=((notaPractica*0.1)+(notaProblemas*0.5)+(notaTeorica*0.4));
		String nota="";
		
		if(0<notaFinal && notaFinal<5) {
			nota="Insuficiente.";
		}else if(5<notaFinal && notaFinal<6) {
			nota="Suficiente.";
		}else if(6<notaFinal && notaFinal<7) {
			nota="bien.";
		}else if(7<=notaFinal && notaFinal<9) {
			nota="notable.";
		}else if(9<=notaFinal && notaFinal<11) {
			nota="sobresaliebnte.";
		}
		
		return nota;
	}
	
	public static void main(String[] args) {
		/*4. Calcular las calificaciones de un alumno con un método que reciba la nota de la parte práctica, la nota de los problemas y la parte teórica. 
		 * La nota final se calcula según el siguiente criterio: la parte práctica vale el 10%; la parte de problemas vale el 50% y la parte teórica el 40%. 
		 * Las notas deben estar entre 0 y 10, si no lo están, deberá devolver un mensaje de error.
		   
		   Realiza el método que calcule la media de tres notas y te devuelva la nota del boletín (insuficiente, suficiente, bien, notable o sobresaliente).
		*/
		
		double notaPractica=7;
		double notaTeorica=3.5;
		double notaProblemas=8.9;
		
		System.out.println("Has sacado un "+ notafinal(notaPractica,notaTeorica,notaProblemas));
	}
}
