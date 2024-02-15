package Ejercicios;

import java.util.Scanner;

public class Ejer5 {
	
	public static String[] horaArray(String hora) {
		return hora.split(":");
	}
	
	public static int conseguirhora(String[] hora) {	
		return Integer.valueOf(hora[0]);
	}
	
	public static int conseguirMinuto(String[] hora) {	
		return Integer.valueOf(hora[1]);
	}
	
	public static int conseguirSegundo(String[] hora) {	
		return Integer.valueOf(hora[2]);
	}
	
	public static boolean validarHora(int hora) {
		return hora>=0 && hora<25;
	}
	
	public static boolean validarMinuto(int minuto) {
		return minuto>=0 && minuto<60;
	}
	
	public static boolean validarSegundo(int segundo) {
		return segundo>=0 && segundo<60;
	}
	
	public static String obtenerHoraMayor(int hora1,int hora2,int minuto1,int minuto2,int segundo1,int segundo2) {
		String horaMayor="";
		if(hora1>hora2) {
			horaMayor=hora1 + ":" + minuto1 + ":" + segundo1;
		}else if(hora1<hora2) {
			horaMayor=hora2 + ":" + minuto2 + ":" + segundo2;
		}else {
			if(minuto1<minuto2) {
				horaMayor=hora2 + ":" + minuto2 + ":" + segundo2;
			}else if(minuto1>minuto2) {
				horaMayor=hora1 + ":" + minuto1 + ":" + segundo1;
			}else {
				if(segundo1<segundo2) {
					horaMayor=hora2 + ":" + minuto2 + ":" + segundo2;
				}else if(segundo1>segundo2) {
					horaMayor=hora1 + ":" + minuto1 + ":" + segundo1;
				}else {
					horaMayor="Ambas son iguales.";
				}
			}
		}
		return horaMayor;
	}

	public static void main(String[] args) {
		/*Realizar un método llamado obtenerHoraMayor que recibirá dos momentos
		  temporales como cadenas en formato hh:mm:ss y devolverá la hora con mayor valor
  		  temporal. Si los datos no son correctos se devolverá un mensaje de error.
		*/
		
		Scanner sc=new Scanner(System.in);
		
		String hora1="";
		String hora2="";
		
		do {
			System.out.println("Indroduce la primera hora en el siguiente formato=hh:mm:ss");
			hora1=sc.nextLine();
			System.out.println("Indroduce la segunda hora en el siguiente formato=hh:mm:ss");
			hora2=sc.nextLine();
		}while(!(validarHora(conseguirhora(horaArray(hora1)))&&validarHora(conseguirhora(horaArray(hora2)))&&validarMinuto(conseguirMinuto(horaArray(hora1)))&&validarMinuto(conseguirMinuto(horaArray(hora2)))&&validarSegundo(conseguirSegundo(horaArray(hora1)))&&validarSegundo(conseguirSegundo(horaArray(hora2)))));
		
		System.out.println(obtenerHoraMayor(conseguirhora(horaArray(hora1)),conseguirhora(horaArray(hora2)),conseguirMinuto(horaArray(hora1)),conseguirMinuto(horaArray(hora2)),conseguirSegundo(horaArray(hora1)),conseguirSegundo(horaArray(hora2))));
	}

}
