package main.java;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		try {
			Clinica clinica = new Clinica();
	        
	        Perro perro1 = new Perro(LocalDate.of(2020, 1, 1), Genero.MASCULINO, "Rex");
	        Perro perro2 = new Perro(LocalDate.of(2019, 5, 15), Genero.FEMENINO, "Bella");
	        Perro perro3 = new Perro(LocalDate.of(2023, 1, 15), Genero.MASCULINO,"Pluto");
	        Gato gato1 = new Gato(LocalDate.of(2021, 6, 1), Genero.MASCULINO, "Tom");
	        Gato gato2 = new Gato(LocalDate.of(2022, 3, 20), Genero.FEMENINO, "Luna");
	        Gato gato3 = new Gato(LocalDate.of(2017, 2, 10),Genero.FEMENINO,"Michi");
	        
	        System.out.println("Dar de alta a los animales.\n");
	        System.out.println(clinica.darAltaMascota(perro1));
	        System.out.println(clinica.darAltaMascota(perro2));
	        System.out.println(clinica.darAltaMascota(perro3));
	        System.out.println(clinica.darAltaMascota(gato1));
	        System.out.println(clinica.darAltaMascota(gato2));
	        System.out.println(clinica.darAltaMascota(gato3));
	
	        System.out.println("\nListar todos los perros:\n");
	        clinica.listarTodosLosPerros();
	
	        System.out.println("Listar todos los gatos:");
	        clinica.listarTodosLosGatos();
	        
	        System.out.println("Dar de baja a un gato y un perro.\n");
	        System.out.println(clinica.darBajaMascota("3"));
	        System.out.println(clinica.darBajaMascota("6"));
	        
	        System.out.println("\nListar todos los perros:");
	        clinica.listarTodosLosPerros();
	
	        System.out.println("\nListar todos los gatos:");
	        clinica.listarTodosLosGatos();
	        
	        System.out.println("\nVacunacion y castracion de animales.\n");
	        System.out.println(clinica.vacunarMascotaConCodigo("1"));
	        System.out.println(clinica.castrarMascotaConCodigo("2"));
	        System.out.println(clinica.vacunarMascotaConCodigo("4"));
	        System.out.println(clinica.castrarMascotaConCodigo("5"));
	
	        System.out.println("\nListar animales castrados:\n");
	        clinica.listarAnimalesCastrados();
	        
	        System.out.println("\nListar animales por tipo y edad:\n");
	        clinica.listarAnimalesPorTipoYEdad();
	        
	        System.out.println("\nListar animales por numero de vacunas:\n");
	        clinica.listarAnimalesPorNumeroVacunas();
	
	    } catch (ClinicaException | VacunaException | CastradoException e) {
	        e.printStackTrace();
		}
	}
}
