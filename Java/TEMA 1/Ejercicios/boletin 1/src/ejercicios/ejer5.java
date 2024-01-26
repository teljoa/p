package ejercicios;

public class ejer5 {
	public static String saludo(int hora) {
		String saludo="";
		
		if(hora>5 && hora<13) {
			saludo="Buenos dias.";
		}else if(hora>14 && hora<21) {
			saludo="Buenar tardes.";
		}else if(hora>20 && hora>25 || hora<=0 && hora<6) {
			saludo="Buenas noches.";
		}
			
		return saludo;
	}
	
	public static void main(String[] args) {
		/*5. Realiza un método que reciba una hora por parámetro y que muestre luego buenos días, buenas tardes o buenas noches según corresponda. 
		 * Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5, respectivamente, sólo teniendo en cuenta el valor de las horas.
		*/
		
		
		System.out.println(saludo(7));
	}

}
