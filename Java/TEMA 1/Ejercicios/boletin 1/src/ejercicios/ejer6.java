package ejercicios;

import java.util.Scanner;

public class ejer6 {
	public static String temperatura(int dia,int mes) {
		String estacion="";
		if(((mes==12) && (21<=dia && dia<=31))||((mes==1)&&(1<=dia && dia<=31))||((mes==2)&&(1<=dia && dia<=29))||((mes==3) && (1<=dia && dia<=20))){
			estacion="Invierno->19º";
		}else if(((mes==3) && (21<=dia && dia<=31))||((mes==4)&&(1<=dia && dia<=30))||((mes==5)&&(1<=dia && 31<=dia))||((mes==6) && (1<=dia && dia<=20))){
			estacion="primavera->20º";
		}else if(((mes==6) && (21<=dia && dia<=30))||((mes==7)&&(1<=dia && dia<=31))||((mes==8)&&(1<=dia && 31<=dia))||((mes==9) && (1<=dia && dia<=20))){
			estacion="verano->24º";
		}else if(((mes==9) && (21<=dia && dia<=31))||((mes==10)&&(1<=dia && dia<=31))||((mes==11)&&(1<=dia && 30<=dia))||((mes==12) && (1<=dia && dia<=20))){
			estacion="Otoño->19º";
		}else {
			estacion="Fecha erronea";
		}
		return estacion;
	}
	
	
	public static void main(String[] args) {
		/*6. Programar un sistema de calefacción-refrigeración que compruebe en función del día y el mes, la estación en la que estamos y dependiendo 
		 * de la estación programe la temperatura: Invierno→19º, Primavera→20º, Verano→24º, Otoño→19º.
		   El método deberá recibir como parámetro el mes y el día actual y devolver los grados a los que deberemos programar el sistema.
		*/
		
		Scanner sc=new Scanner(System.in);
		
		int dia=0;
		do {
			System.out.println("Que dias quieres comprobar:");
			dia=Integer.valueOf(sc.nextLine());
		}while(dia<0 || dia>31);
		
		int mes=0;
		do {
			System.out.println("Que mes quieres comprobar:");
			mes=Integer.valueOf(sc.nextLine());
		}while(mes<0 || mes>13);
		
		System.out.println(temperatura(dia,mes));
	}

}
