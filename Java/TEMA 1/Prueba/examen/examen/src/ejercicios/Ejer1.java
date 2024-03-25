package ejercicios;

import java.util.Scanner;

public class Ejer1 {

	public static String validarMensaje(String cadena) {
		 String cadenaNueva="";
		 
		 if(cadena.length()<50 && cadena.indexOf("#")<=0) {
			 cadenaNueva=cadena.replaceAll("[\s.,]", "#");
		 }else {
			 cadenaNueva="La cadena introducida no es valida";
		 }
		 return cadenaNueva;
	}
	
	public static char[][] construtorMatriz(String cadena){
		char[][] mensaje=new char[5][10];
		
		for(int l=0;l<cadena.length();l++) {
			for(int i=0;i<mensaje.length;i++) {
				for(int j=0;j<mensaje[i].length;j++) {
					mensaje[i][j]=cadena.charAt(l);
					if(l<cadena.length()-1) {
						l++;
					}
				}
			}
		}
		return mensaje;
	}
	
	public static void imprimirCadena(char[][] cs) {
		for(int i=0;i<cs.length;i++) {
			System.out.println(cs[i]);
		}
	}
	
	public static String sysoCadena(char[][] mensaje) {
		String cadenaNueva="";
		int i=0;
		int j=0;
		int contador=0;
		
		while(contador<50) {
			if(i<mensaje.length-1 || j<mensaje[i].length-1) {
				cadenaNueva+=mensaje[i][j];
				if(i==mensaje.length-1) {
					i=0;
					j++;
				}else if(i<mensaje.length-1) {
					i++;
				}
				contador++;
			}else {
				contador++;
			}
			
		}
		
		return cadenaNueva;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Apartado 1");
		System.out.println("Introduce un mensaje:");
		String mensaje=sc.nextLine();
		System.out.println(validarMensaje(mensaje));
		System.out.println("Apartado2");
		imprimirCadena(construtorMatriz(validarMensaje(mensaje)));
		System.out.println("Apartado3");
		sysoCadena(construtorMatriz(validarMensaje(mensaje)));
		
	}

}
