 package Ejercicios;

import java.util.Scanner;

public class Ejer3 {
	
	public static String[] fechaArray(String fecha) {
		return fecha.split("-");
	}
	
	public static int conseguirDia(String[] fecha) {	
		return Integer.valueOf(fecha[0]);
	}
	
	public static int conseguirMes(String[] fecha) {	
		return Integer.valueOf(fecha[1]);
	}
	
	public static int conseguirAno(String[] fecha) {	
		return Integer.valueOf(fecha[2]);
	}
	
	public static boolean esbisiesto(int ano) {
		return ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;
	}
	
	public static boolean fechavalida(int dia,int mes, int ano) {
		boolean valido=false;
		
		if((dia>0 && dia<32)&&(mes>0 && mes<13)&&(ano>0)) {
			switch (mes) {
			case 1,3,5,7,8,10,12:{
				valido=dia<32;
				break;
			}case 2:{
				if(esbisiesto(ano)) {
					valido=dia<30;
				}else {
					valido=dia<29;
				}
				break;
			}case 4,6,9,11:{
				valido=dia<31;
				}
			}
		}
		
		return valido;
	}
	
	public static String diasiguiente(int dia,int mes,int ano) {
		
		String fechaSiguiente="";
		
		switch (mes) {
		case 1,3,5,7,8,10,12:{
			if(dia!=31) {
				dia+=1;
			}else if(mes==12 && dia==31) {
				mes=1;
				dia=1;
				ano+=1;
			}else {
				dia=1;
				mes+=1;
			}
			break;
		}
		case 2:{
			if(esbisiesto(ano ) && dia!=29) {
				dia+=1;
			}else {
				dia=1;
				mes+=1;
			}
			break;
		}
		case 4,6,9,11:{
			if(dia!=30) {
				dia+=1;
			}else {
				dia=1;
				mes+=1;
			}
		}
		}
		
		fechaSiguiente=dia+"-"+mes+"-"+ano;
		
		return fechaSiguiente;
	}

	public static void main(String[] args) {
		/*Crea una función que reciba una fecha en formato dd-mm-yyyy, valide que es
		  correcta y nos muestre la fecha del día siguiente en ese mismo formato. Se
		  recomienda utilizar funciones auxiliares.
		*/
		
		Scanner sc=new Scanner(System.in);
		String fecha="";
		
		do {
			System.out.println("Introduce una fecha en el siguiente formato:dd-mm-yyyy");
			fecha=sc.nextLine();
		}while(!fechavalida(conseguirDia(fechaArray(fecha)),conseguirMes(fechaArray(fecha)),conseguirAno(fechaArray(fecha))));
		
		System.out.println(diasiguiente(conseguirDia(fechaArray(fecha)),conseguirMes(fechaArray(fecha)),conseguirAno(fechaArray(fecha))));
		
		
	}

}
