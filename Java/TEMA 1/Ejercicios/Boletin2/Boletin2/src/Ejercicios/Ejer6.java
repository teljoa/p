package Ejercicios;

import java.util.Scanner;

public class Ejer6 {
	
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
	
	public static int[] obtenerTiempoEntreHoras(int hora1,int hora2,int minuto1,int minuto2,int segundo1,int segundo2) {
		int[] tiempo=new int[3];
		
		if(hora1>hora2) {
			tiempo[0]=hora1-hora2;
			tiempo[1]=minuto1-minuto2;
			tiempo[2]=segundo1-segundo2;
		}else if(hora1<hora2) {
			tiempo[0]=hora2-hora1;
			tiempo[1]=minuto2-minuto1;
			tiempo[2]=segundo2-segundo1;
		}else {
			if(minuto1<minuto2) {
				tiempo[0]=hora2-hora1;
				tiempo[1]=minuto2-minuto1;
				tiempo[2]=segundo2-segundo1;
			}else if(minuto1>minuto2) {
				tiempo[0]=hora1-hora2;
				tiempo[1]=minuto1-minuto2;
				tiempo[2]=segundo1-segundo2;
			}else {
				if(segundo1<segundo2) {
					tiempo[0]=hora2-hora1;
					tiempo[1]=minuto2-minuto1;
					tiempo[2]=segundo2-segundo1;
				}else if(segundo1>segundo2) {
					tiempo[0]=hora1-hora2;
					tiempo[1]=minuto1-minuto2;
					tiempo[2]=segundo1-segundo2;
				}else {
					tiempo[0]=0;
					tiempo[1]=0;
					tiempo[2]=0;
				}
			}
		}
		return tiempo;
	}
	
	
	public static int convertirasegundos(int[] tiempo) {
		return (tiempo[0]*3600)+(tiempo[1]*60)+tiempo[2];
	}

	public static void main(String[] args) {
		/*Realizar un método llamado calcularSegundosTranscurridos que recibirá al igual
		  que el anterior dos momentos como cadenas de texto y devolverá el número de
		  segundos que hay entre la primera hora y la segunda (el valor debe ser siempre en
		  positivo).
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
		
		System.out.println("Los segundos que han transcurrido entre las dos horas son:"+convertirasegundos(obtenerTiempoEntreHoras(conseguirhora(horaArray(hora1)), conseguirhora(horaArray(hora2)), conseguirMinuto(horaArray(hora1)), conseguirMinuto(horaArray(hora2)), conseguirSegundo(horaArray(hora1)), conseguirSegundo(horaArray(hora2))))+" Segundos");
	}

}
