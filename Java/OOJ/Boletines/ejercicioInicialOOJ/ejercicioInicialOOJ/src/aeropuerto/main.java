package aeropuerto;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		String menu="Eliga una de las siguientes opciones"
					+ "a) Asignar Vuelo."
					+ "b) Obtener el número de vuelos."
					+ "c) Obtener el número de kilómetros."
					+ "d) Obtener la media de kilómetros por vuelo."
					+ "e) Cambio de compañía."
					+ "f) Mostrar información del avión."
					+ "con el siguiente formato."
					+ "g) Salir.";
		String opcion="";
		
		Scanner sc=new Scanner(System.in); 
		Avion opcion1=new Avion("6546546545HJ",300);
		Avion opcion2=new Avion("5465456456AB","RAYNERS",500);
		int avion=0;
		int capacidad=0;
		double km=0;
		String companniaCompradora="";
		
		while(!opcion.equals("g")) {
			System.out.println(menu);
			switch (opcion) {
			case "a":
				System.out.println("Que avion quiere asignar(1 o 2).");
				avion=Integer.valueOf(sc.nextLine());
				System.out.println("Cuantos asientos se van a ocupar:");
				capacidad=Integer.valueOf(sc.nextLine());
				System.out.println("Cuantos kilometros va a volar:");
				km=Double.valueOf(sc.nextLine());
				switch (avion) {
					case 1:
						opcion1.asignarVuelo(capacidad, km);
					case 2:
						opcion2.asignarVuelo(capacidad, km);
					default:
						System.out.println("Avion no existente.");
				}
				break;
			case "b":
				System.out.println("De que avion quiere saver cuantos vuelos a realizado:.");
				avion=Integer.valueOf(sc.nextLine());
				switch (avion) {
				case 1:
					opcion1.getNumvuelos();
				case 2:
					opcion2.getNumvuelos();
				default:
					System.out.println("Avion no existente.");
				}
				break;
			case "c":
				System.out.println("De que avion quiere saver cuantos kilometros a realizado:.");
				avion=Integer.valueOf(sc.nextLine());
				switch (avion) {
				case 1:
					opcion1.getTotalKmVolados();
				case 2:
					opcion2.getTotalKmVolados();
				default:
					System.out.println("Avion no existente.");
				}
				break;
			case "d":
				System.out.println("De que avion quiere saver cuantos kilometros por vuelos a realizado:.");
				avion=Integer.valueOf(sc.nextLine());
				switch (avion) {
				case 1:
					opcion1.getMediaKmVolados();
				case 2:
					opcion2.getMediaKmVolados();
				default:
					System.out.println("Avion no existente.");
				}
				break;
			case "e":
				System.out.println("Que compañia a comprado el avion:");
				companniaCompradora=sc.nextLine();
				System.out.println("Que avion a compado:");
				avion=Integer.valueOf(sc.nextLine());
				switch (avion) {
				case 1:
					opcion1.cambiarCompannia(companniaCompradora);
				case 2:
					opcion2.cambiarCompannia(companniaCompradora);
				default:
					System.out.println("Avion no existente.");
				}
				break;
			case "f":
				System.out.println("Avión con id: "+ opcion1.idAvion +" de la compañía "+ opcion1.compannia +" ha realizado\r\n"
						+ opcion1.numvuelos +" vuelos, con un total de "+ opcion1.getTotalKmVolados() +" km y una media de"+ opcion1.getMediaKmVolados() +"\r\n"
						+ " km por vuelo.");
				System.out.println("Avión con id: "+ opcion2.idAvion +" de la compañía "+ opcion2.compannia +" ha realizado\r\n"
						+ opcion2.numvuelos +" vuelos, con un total de "+ opcion2.getTotalKmVolados() +" km y una media de"+ opcion2.getMediaKmVolados() +"\r\n"
						+ " km por vuelo.");
				break;
			case "g":
				System.out.println();
				break;
			default:
				System.out.println("Opcion no validad vuelva a introducir una opcion.");
			}
		}
	}

}
