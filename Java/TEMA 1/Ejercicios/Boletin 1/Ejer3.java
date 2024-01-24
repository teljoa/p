package ejercicios;

public class Ejer3 {
	
	public static String tipoCaracter(char caracter) {
		boolean numero=Character.isDigit(caracter);
		boolean minuscula=Character.isLowerCase(caracter);
		boolean mayuscula=Character.isUpperCase(caracter);
		boolean puntuacion=caracter=='.';
		boolean espacio=caracter==' ';
		boolean llaves=caracter=='{' || caracter=='}' || caracter=='(' || caracter==')' || caracter=='[' || caracter==']';
		boolean caracterO= !numero || !mayuscula || !minuscula || !puntuacion || !llaves;
		String tipo=" ";
		
		if(numero==true) {
			tipo="numero";
		}else if(mayuscula==true) {
			tipo="mayuscula";
		}else if(minuscula==true) {
			tipo="minuscula";
		}else if(puntuacion==true) {
			tipo="puntiacion";
		}else if(llaves==true) {
			tipo="llaves";
		}else if(caracterO==true) {
			tipo="otro caracter";
		}else if(espacio==true) {
			tipo="espacio";
		}
		
		return tipo;
	}
	
	public static void main(String[] args) {
		/*3. Escribir un método que reciba un carácter y devuelva el tipo de carácter que es.
			 Debe devolver una de los siguientes mensajes según corresponda:
				◦ Letra mayúscula
				◦ Letra minúscula
				◦ Dígito entre 0 y 9
				◦ Signo de puntuación
				◦ Espacio en blanco
				◦ Paréntesis () o llaves {}
				◦ Otro carácter 
		*/
		
		System.out.println(tipoCaracter('['));
		
	}
}
