package ejercicios;

import java.util.Scanner;

public class Ejer2 {
	
	public static void ls(String[] archivos) {
		System.out.println(archivos);
	}
	
	public static boolean existeArchivo(String archivo,String[] archivos) {
		boolean existe=false;
		for(int i=0;i<archivos.length;i++) {
			if(archivos[i].equals(archivo)) {
				existe=true;
			}
		}
		return existe;
	}
	
	public static int posicionArchivo(String archivo,String[] archivos) {
		int posicion=0;
		for(int i=0;i<archivos.length;i++) {
			if(archivos[i].equals(archivo)) {
				posicion=i;
			}
		}
		return posicion;
	}
	
	public static int obtenerUltimaPosicion(String[] archivos) {
		int i=0;
		int posicion=0;
		boolean encontrar=false;
		
		while(i<archivos.length-1 && !encontrar) {
			if(archivos.equals(null)) {
				encontrar=true;
				posicion=i;
			}
		}
		return posicion;
	}
	
	public static String[] añadirArchivo(int posicion,String archivo, String[] archivos) {
		archivos[posicion]=archivo;
		
		return archivos;
	}
	
	public static String[] cambiarNombre(String archivoV,String archivoN,String[] archivos) {
		for(int i=0;i<archivos.length;i++) {
			if(archivos[i].equals(archivoV)) {
				archivos[i]=archivoN;
			}
		}
		return archivos;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] archivos=new String[50];
		String opcion="";
		String archivo="";
		String archivoV="";
		String archivoN="";		
		
		while(opcion!="exit") {
			System.out.println("Introduce uno de los siguientes comandos:ls,mkdir,touch,mv,exit");
			System.out.println("Para salir introduzca exit");
			
			opcion=sc.nextLine();
			
			switch (opcion) {
				
				case "ls":
					ls(archivos);
				case "mkdir":
					if(!existeArchivo(archivo, archivos)) {
						archivo=sc.nextLine();
						añadirArchivo(obtenerUltimaPosicion(archivos), archivo, archivos);
					}else {
						System.out.println("Ya existe el directorio.");
					}
				case "touch":
					if(!existeArchivo(archivo, archivos)) {
						archivo=sc.nextLine();
						añadirArchivo(obtenerUltimaPosicion(archivos), archivo, archivos);
					}else {
						System.out.println("Ya existe el archivo.");
					}
				case "mv":
					if(!existeArchivo(archivo, archivos)) {
						archivoN=sc.nextLine();
						archivoV=sc.nextLine();
						cambiarNombre(archivoV, archivoN, archivos);
					}else {
						System.out.println("Ya existe el directorio o archivo.");
					}
				default:
					System.out.println("Comando no valido.");
			}
		}
	}
}
