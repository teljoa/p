package Ejercicio7;

import java.util.Scanner;

public class principal {

	public principal() {
		String menu="Bienbenido al gran almacen."+
					"Las opciones son:"+
					"1.Abrir caja."+
					"2.Cerrar caja."+
					"3.Nuevo cliente."+
					"4.Atender a cliente."+
					"5.Salir.";
		
		Scanner sc=new Scanner(System.in);
		int opcion=0;
		
		while(opcion!=5){
			GranAlmacen a=new GranAlmacen();
			System.out.println(menu);
			opcion=Integer.valueOf(sc.nextLine());

			switch(opcion) {
			case 1:
				System.out.println("Cual es el numero de la caja a abrir:");
			int numero=Integer.valueOf(sc.nextLine());
			Caja nueva=new Caja(numero, false);
				try {
					a.abrircaja(nueva.getNcaja());
				} catch (Exception e) {
					System.out.println("Esta caja ya esta abierta.");
					e.printStackTrace();
				}
				break;
			case 2:
				System.out.println("Cual es el numero de la caja a cerrar:");
				numero=Integer.valueOf(sc.nextLine());
				try {
					a.cerrarcaja(numero);
				} catch (Exception e) {
					System.out.println("Esta caja ya esta cerrada.");
					e.printStackTrace();
				}
				break;
			case 3:
				Cliente nuevo=new Cliente();
				a.asignarNuevoCliente(nuevo);
				break;
			case 4:
				System.out.println("Cual es el numero de la caja en la que esta el cliente:");
				numero=Integer.valueOf(sc.nextLine());
				a.atenderCliente(numero);
				break;
			case 5:
				System.out.println("Adios.");
				break;
			default:
			}
		}
	}

}
