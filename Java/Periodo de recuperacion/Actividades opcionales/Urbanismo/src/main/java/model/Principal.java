package main.java.model;

public class Principal {

	public static void main(String[] args) {
		Vivienda[] viviendas=new Vivienda[15];
		
		viviendas[0]=new Apartamento(7);
		viviendas[1]=new Apartamento(10);
		viviendas[2]=new Casa(10,false);
		viviendas[3]=new Casa(8,true);
		viviendas[4]=new Casa(4, false);
		viviendas[5]=new Casa(20, true);
		try {
			viviendas[1].alquilarVivienda(10, 8);
			viviendas[0].alquilarVivienda(4, 10);
			viviendas[4].alquilarVivienda(2, 14);
			viviendas[3].alquilarVivienda(2, 21);
		}catch (Exception e) {
			e.printStackTrace();
		}
			viviendas[4].realizarCheckout();
			viviendas[0].realizarCheckout();
		
		System.out.println("\nViviendas alquiladas actualmente.\n");	
		mostrarAlquilados(viviendas);
		System.out.println("\nViviendas sin alquilar\n");
		mostrarNoAlquilados(viviendas);
		System.out.println("\nImporte acumulado con el alquiler de viviendas.\n");
		System.out.println(importeAcumulado(viviendas)+"€");
	}
	
	public static void mostrarAlquilados(Vivienda[] a) {
		for(Vivienda v:a) {
			if(v!=null && v.isAlquilada()) {
				System.out.println(v);
			}
		}
	}
	
	public static void mostrarNoAlquilados(Vivienda[] a) {
		for(Vivienda v:a) {
			if(v!=null && !v.isAlquilada()) {
				System.out.println(v);
			}
		}
	}
	
	public static double importeAcumulado(Vivienda[] a) {
		double totalAcumulado=0.00;
		
		for(Vivienda v:a) {
			if(v!=null) {
				totalAcumulado+=v.importeTotalAcumulado();
			}
		}
		return totalAcumulado;
	}
}
