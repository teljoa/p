package Residencia;

public class principalVivienda {

	public static void main(String[] args) {
		Vivienda[] viviendas=new Vivienda[15];
		
		viviendas[0]=new Apartamento();
		viviendas[1]=new Apartamento(10);
		viviendas[2]=new Casa(false);
		viviendas[3]=new Casa(true);
		viviendas[4]=new Casa(4, false);
		viviendas[5]=new Casa(20, true);
		
		viviendas[1].alquilarVivienda(10, 8);
		viviendas[4].alquilarVivienda(2, 15);
		viviendas[3].alquilarVivienda(2, 20);
		
		viviendas[4].realizarCheckout();
		
		mostrarAlquilados(viviendas);
		mostrarNoAlquilados(viviendas);
		System.out.println(importeAcumulado(viviendas));
		
	}
	
	public static void mostrarAlquilados(Vivienda[] a) {
		int i=0;
		boolean nulo=false;
		
		while(i>a.length || !nulo) {
			if(a[i].isAlquilada()) {
				System.out.println(a[i]);
			}
			i++;
		}
	}
	
	public static void mostrarNoAlquilados(Vivienda[] a) {
		int i=0;
		boolean nulo=false;
		
		while(i>a.length || !nulo) {
			if(!a[i].isAlquilada()) {
				System.out.println(a[i]);
			}
			i++;
		}
	}
	
	public static double importeAcumulado(Vivienda[] a) {
		int i=0;
		boolean nulo=false;
		double totalAcumulado=0.00;
		
		while(i>a.length || !nulo) {
			totalAcumulado+=a[i].importeTotalAcumulado();
		}
		return totalAcumulado;
	}
}
