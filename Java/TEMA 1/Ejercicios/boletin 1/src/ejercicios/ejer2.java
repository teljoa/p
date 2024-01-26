package ejercicios;

public class ejer2 {

	public static String asignatura(String dia) {
		String asignatura="";
		
		if(dia.equals("lunes")) {
			asignatura="Base de datos.";
		}else if(dia.equals("martes")) {
			asignatura="Entornos de desarrollo.";
		}else if(dia.equals("miercoles")) {
			asignatura="Base de datos.";
		}else if(dia.equals("jueves")) {
			asignatura="Lenjuages de marca y sistemas.";
		}else if(dia.equals("viernes")) {
			asignatura="Sistemas informaticos.";
		}
		return asignatura;
	}
	
	public static void main(String[] args) {
		/*2. Escribe un método que reciba por parámetro el día de la semana (Lunes, Martes, Miércoles, etc) y devuelva qué asignatura toca a primera 
		 * hora ese día.*/
		
		String dia="lunes";
		
		System.out.println("El " + dia + " hay a primera hora hay " + asignatura(dia));
	}

}
