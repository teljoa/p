package Ejercicio4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		String menu="Historial de navegacion las opciones a elegir son:"+
					"1. Nueva página consultada."+
					"2. Consultar historial completo."+
					"3. Consultar historial de un día."+
					"4. Borrar todo el historial."+
					"5. Borrar visitas a una página."+
					"6. Salir.";
		
		Scanner sc=new Scanner(System.in);
		
		int opcion=0;
		
		while(opcion!=6) {
			ArrayList<Pagina> paginas=null;
			Historial historial=new Historial(paginas);
			System.out.println(menu);
			System.out.println("Que opcion elige:");
			opcion=Integer.valueOf(sc.nextLine());
			
			switch (opcion) {
			case 1:{
				System.out.println("que pagina va a visitar:");
				String url=sc.nextLine();
				historial.anadirPagina(url, LocalDateTime.now());
				break;
			}case 2:{
				historial.concultarHistorial();
				break;
			}case 3:{
				System.out.println("De que dia quieres revisar el historial:");
				String dia=sc.nextLine();
				LocalDateTime visita=LocalDateTime.parse(dia);
				historial.consultarDia(visita);
				break;
			}case 4:{
				historial.borrarHistorial();
				break;
			}case 5:{
				System.out.println("De que pagina quiere borrar el historial:");
				String url=sc.nextLine();
				historial.borrarUnapagina(url);
				break;
			}case 6:{
				System.out.println("Uste esta saliendo del historial.");
				break;
			}default:
				throw new Exception("Opcion no valida.");
			}
		}
	}
}
