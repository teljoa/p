package inicio;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String salir="n";
		
		String menu="Elige una de las siguientes operaciones:"+
						"a.sumar/"+
						"b.restar/"+
						"c.multiplicar/"+
						"d.dividir/";
		do {
			System.out.println("Introduce un numero:");
			int num1=Integer.valueOf(sc.nextLine());
			
			System.out.println("Introduce un numero:");
			int num2=Integer.valueOf(sc.nextLine());
			
			System.out.println(menu);
			
			System.out.println("Elige una opcion:");
			String opcion=sc.nextLine();
			
			if(opcion.equals("a")) {
				System.out.println(num1+num2);
			}else if(opcion.equals("b")) {
				System.out.println(num1-num2);
			}else if(opcion.equals("c")) {
				System.out.println(num1*num2);
			}else if(opcion.equals("d")) {
				System.out.println(num1/num2);
			}else {
				System.out.println("Operacion no valida");
			}
			System.out.println("Quieres salir de aqui(s/n)?");
			salir=sc.nextLine();
			
		}while(salir=="s");
	}

}
