package main.java.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import main.java.model.enumerated.AreaCampo;
import main.java.model.exception.*;
import main.java.model.jugadores.*;

public class Principal {

	public static void main(String[] args) {
		 // Creación de dos clubes
        Club clubRM = new Club("Real Madrid", LocalDate.of(1902, 3, 6));
        Club clubB = new Club("FC Barcelona", LocalDate.of(1899, 11, 29));

        // Creación de jugadores
        Portero portero1 = new Portero("Thibaut", "Courtois", LocalDate.of(1992, 5, 11), 1.99, 96.0, 0);
        Defensa defensa1 = new Defensa("Sergio", "Ramos", LocalDate.of(1986, 3, 30), 1.84, 82.0, 0);
        Centrocampista centrocampista1 = new Centrocampista("Luka", "Modric", LocalDate.of(1985, 9, 9), 1.74, 66.0, 0);
        Delantero delantero1 = new Delantero("Karim", "Benzema", LocalDate.of(1987, 12, 19), 1.85, 81.0, 0);

        Portero portero2 = new Portero("Marc-André", "ter Stegen", LocalDate.of(1992, 4, 30), 1.87, 85.0, 0);
        Defensa defensa2 = new Defensa("Gerard", "Piqué", LocalDate.of(1987, 2, 2), 1.94, 85.0, 0);
        Centrocampista centrocampista2 = new Centrocampista("Frenkie", "de Jong", LocalDate.of(1997, 5, 12), 1.81, 74.0, 0);
        Delantero delantero2 = new Delantero("Lionel", "Messi", LocalDate.of(1987, 6, 24), 1.70, 72.0, 0);

        // Añadir jugadores a los clubes
        clubRM.addJugador(portero1);
        clubRM.addJugador(defensa1);
        clubRM.addJugador(centrocampista1);
        clubRM.addJugador(delantero1);

        clubB.addJugador(portero2);
        clubB.addJugador(defensa2);
        clubB.addJugador(centrocampista2);
        clubB.addJugador(delantero2);

        // Creación y añadir partidos a los clubes
        Partido partido1a=new Partido("Real Madrid", "FC Barcelona", 2, 1, LocalDateTime.of(2024, 6, 1, 18, 0));
        Partido partido2a=new Partido("FC Barcelona", "Real Madrid", 1, 1, LocalDateTime.of(2024, 6, 5, 18, 0));
        Partido partido3a=new Partido("FC Barcelona", "Real Madrid", 3, 0, LocalDateTime.of(2024, 6, 10, 18, 0));
        
        Partido partido1b=new Partido("FC Barcelona", "Real Madrid", 1, 2, LocalDateTime.of(2024, 6, 1, 18, 0));
        Partido partido2b=new Partido("Real Madrid", "FC Barcelona", 1, 1, LocalDateTime.of(2024, 6, 5, 18, 0));
        Partido partido3b=new Partido("Real Madrid", "FC Barcelona", 0, 3, LocalDateTime.of(2024, 6, 10, 18, 0));
        
        try {
        	System.out.println("Insersion de partidos.\n");
        	
            System.out.println(clubRM.addPartido(partido1a));
            System.out.println(clubB.addPartido(partido1b));
            
            System.out.println(clubRM.addPartido(partido2b));
            System.out.println(clubB.addPartido(partido2a));
            
            System.out.println(clubRM.addPartido(partido3b));
            System.out.println(clubB.addPartido(partido3a) + "\n");
            
        } catch (PartidoException e) {
            System.out.println("Error al añadir partido: " + e.getMessage());
        }

        // Mostrar información de los clubes
        System.out.println("Información del Real Madrid:");
        System.out.println(clubRM.mostrarInformacionClub());
        System.out.println("\nInformación del FC Barcelona:");
        System.out.println(clubB.mostrarInformacionClub());

        // Mostrar jugadores de los clubes ordenados por edad
        try {
            System.out.println("\nJugadores del Real Madrid:");
            clubRM.mostrarJugadores();
            System.out.println("\nJugadores del FC Barcelona:");
            clubB.mostrarJugadores();
        } catch (JugadorException e) {
            System.out.println("Error al mostrar jugadores: " + e.getMessage());
        }
        
        // Mostrar jugadores del los clubes de una area determinada por su Probalidad de juego
        try {
        	System.out.println("\nJugadores del Real Madrid que son porteros:");
        	clubRM.mostrarJugadoresPorTipoYProbalidadJuego(AreaCampo.PORTERIA);
        	System.out.println("\nJugadores del FC Barcelona que son centrocampistas:");
        	clubB.mostrarJugadoresPorTipoYProbalidadJuego(AreaCampo.CENTRO);
        } catch (JugadorException e) {
            System.out.println("Error al mostrar jugadores: " + e.getMessage());
        }
        
        // Mostrar partidos jugados hasta la fecha dada
        LocalDate fechaMostrar = LocalDate.of(2024, 6, 7);
        System.out.println("\nPartidos jugados hasta " + fechaMostrar + " por el Real Madrid:");
        clubRM.mostrarPartidosJugados(fechaMostrar);
        System.out.println("\nPartidos jugados hasta " + fechaMostrar + " por el FC Barcelona:");
        clubB.mostrarPartidosJugados(fechaMostrar);
	}
}
