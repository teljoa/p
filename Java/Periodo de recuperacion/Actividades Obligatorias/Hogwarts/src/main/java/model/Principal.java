package main.java.model;

import java.time.LocalDate;

import main.java.exception.HowagwartsException;

public class Principal {

	public static void main(String[] args) {
		try {
            Bruja bruja = new Bruja();

            // Crear hechizos
            Hechizo defensa1 = new Defensa("Expelliarmus", 8, LocalDate.of(2024, 06, 1));
            Hechizo defensa2 = new Defensa("Protego", 10, LocalDate.of(2024, 06, 2));
            Hechizo maldicion1 = new Maldicion("Bombarda", 7, LocalDate.of(2024, 06, 3));
            Hechizo maldicion2 = new Maldicion("Avada kedavra", 20, LocalDate.of(2024, 06, 4));

            // Lanzar hechizos
            bruja.lanzarHechizo(defensa1);
            bruja.lanzarHechizo(defensa2);
            bruja.lanzarHechizo(maldicion1);
            bruja.lanzarHechizo(maldicion2);

            // Mostrar historial de defensas y maldiciones
            System.out.println("Historial de Defensas:");
            bruja.mostrarHistorialDefesas();
            System.out.println("\nHistorial de Maldiciones:");
            bruja.mostrarHistorialMaldiciones();

            // Mostrar último hechizo realizado
            System.out.println("\nÚltimo Hechizo Realizado:");
            System.out.println(bruja.mostrarUltimoHechizoRealizado());

            // Mostrar consumo mágico total y medio
            System.out.println("\nConsumo Mágico Total: " + bruja.consumoMagicoTotal());
            System.out.println("Consumo Mágico Medio: " + bruja.consumeMagicoMedio());

            // Mostrar hechizos ordenados por consumo
            System.out.println("\nHechizos Ordenados por Consumo:");
            bruja.mostrarOrdenadoPorConsumo();

            // Mostrar hechizos lanzados en una fecha específica
            System.out.println("\nHechizos Lanzados el 2024-06-02:");
            bruja.hechizosLanzadosEnFecha(LocalDate.of(2024, 6, 2));

        } catch (HowagwartsException e) {
            System.err.println("Error en la ejecución: " + e.getMessage());
        }

	}

}
