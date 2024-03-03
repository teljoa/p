package Ejer5;

import java.util.Scanner;

public class principal {
	
	private static final double PrecioCafeS = 1.20;
	private static final double PrecioLeche = 1.00;
	private static final double PrecioCafeyLeche = 1.5;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String menu="1. Servir café solo (1,20 euros)\r\n"
				  + "2. Servir leche (1 euro)\r\n"
				  + "3. Servir café con leche (1,5 euros)\r\n"
				  + "4. Consultar estado máquina (estado de depósitos y del monedero)\r\n"
				  + "5. Apagar máquina y salir";
		System.out.println(menu);
		System.out.println("Elige una opcion:");
		int opcion=sc.nextInt();
		int capacidadVasos = 80;
		double modenero = 0;
		double pedidoD = 0;
		int capacidadCafe = 50;
		int capacidadLeche = 50;
		
		Maquina maquina1=new Maquina(capacidadCafe,capacidadLeche,capacidadVasos,PrecioCafeS,PrecioLeche,PrecioCafeyLeche,modenero,pedidoD);

		
		while(opcion!=5){
			System.out.println(menu);
			System.out.println("Elige una opcion:");
			opcion=sc.nextInt();
			System.out.println("Cuanto dinero tienes:");
			modenero=sc.nextDouble();
			switch (opcion) {
			
			case 1:
				if (capacidadCafe>0 || capacidadVasos>0) {
					pedidoD=PrecioCafeS;
					modenero=modenero-pedidoD;
					System.out.println("Su cafe esta servido");
				}
				break;
			case 2:
				if (capacidadCafe>0 || capacidadVasos>0) {
					pedidoD=PrecioLeche;
					modenero=modenero-pedidoD;
					System.out.println("Su leche esta servida");
				}
				break;
			case 3:
				if (capacidadCafe>0 || capacidadVasos>0) {
					pedidoD=PrecioCafeyLeche;
					modenero=modenero-pedidoD;
					System.out.println("Su cafe con leche esta servido");
				}
				break;
			case 4:
				System.out.println(maquina1.toString());
				break;
			case 5:
				System.out.println("");
				break;
			default:
				System.out.println("Opcion no valida escoga ota opcion.");
			}
		}

	}

}
