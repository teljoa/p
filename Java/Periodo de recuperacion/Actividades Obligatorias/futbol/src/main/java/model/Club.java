package main.java.model;

import java.time.LocalDate;
import java.util.Arrays;
import main.java.model.Comparators.OrdenadosPorEdad;
import main.java.model.Comparators.OrdenadosPorProbalidad;
import main.java.model.Comparators.OrdenarPartidosPorResultado;
import main.java.model.enumerated.AreaCampo;
import main.java.model.exception.JugadorException;
import main.java.model.exception.PartidoException;
import main.java.model.jugadores.Centrocampista;
import main.java.model.jugadores.Defensa;
import main.java.model.jugadores.Delantero;
import main.java.model.jugadores.Jugador;
import main.java.model.jugadores.Portero;

public class Club {
	private static final Integer JORNADAS=38;
	private static final Integer JUGADORES=23;
	private static final Integer PORTEROS=2;
	private static final Integer DEFENSAS=6;
	private static final Integer CENTROCAMPISTA=8;
	private static final Integer DELANTEROS=7;
	private String nombre;
	private LocalDate fechaCreacion;
	private Integer puntosTemporada;
	private Jugador[] jugadores;
	private Partido[] partidos;
	private int contadorP;
	private int contadorDf;
	private int contadorC;
	private int contadorDl;
	private int contadorPartidos;
	
	public Club(String nombre, LocalDate fechaCreacion) {
		super();
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.puntosTemporada = 0;
		this.jugadores = new Jugador[JUGADORES];
		this.partidos = new Partido[JORNADAS];
	}
	
	public int posicionUltimoJugador() {
		int posicion=0;
		boolean entra=false;
		
		for(int i=0;i<jugadores.length && !entra;i++) {
			if(jugadores[i]==null) {
				posicion=i;
				entra=true;
			}
		}
		if(posicion==JUGADORES) {
			posicion--;
		}
		return posicion;
	}
	
	public int posicionUltimoPartido() {
		int posicion=0;
		boolean entra=false;
		
		for(int i=0;i<partidos.length && !entra;i++) {
			if(partidos[i]==null) {
				posicion=i;
				entra=true;
			}
		}
		if(posicion==JORNADAS) {
			posicion--;
		}
		return posicion;
	}
	
	public boolean addJugador(Jugador jugador) {
		boolean fichado=false;
		if(posicionUltimoJugador()>=JUGADORES || contadorP>=PORTEROS || contadorDf>=DEFENSAS || contadorC>=CENTROCAMPISTA || contadorDl>=DELANTEROS) {
			fichado=false;
		}else {
			if(jugador instanceof Portero) {
				contadorP++;
			}else if(jugador instanceof Defensa) {
				contadorDf++;
			}else if(jugador instanceof Centrocampista) {
				contadorC++;
			}else if(jugador instanceof Delantero) {
				contadorDl++;
			}
			fichado=true;
			jugadores[posicionUltimoJugador()]=jugador;
		}
		
		return fichado;
	}
	
	public boolean addPartido(Partido partido) throws PartidoException {
		boolean jugado=false;
		
		if(posicionUltimoPartido()>=JORNADAS) {
			jugado=false;
			throw new PartidoException("Has superado el maximo de partidos permitidos.");
		}else if(posicionUltimoPartido()<=0){
			jugado=true;
			partidos[posicionUltimoPartido()]=partido;
			contadorPartidos++;
			this.puntosTemporada=getNumeroPuntos();
			actualizarEstadisticasJugadores(partido);
		}else {
			if(posicionUltimoPartido() > 0 && partido.getFechaPartido().isBefore(this.partidos[posicionUltimoPartido()-1].getFechaPartido())) {
				jugado=false;
				throw new PartidoException("La fecha del partido que se quiere incluir no puede ser inferior al partido anterior.");
			
			}else {
				jugado=true;
				partidos[posicionUltimoPartido()]=partido;
				contadorPartidos++;
				this.puntosTemporada=getNumeroPuntos();
				actualizarEstadisticasJugadores(partido);
			}
		}
		
		return jugado;
	}
	
	private void actualizarEstadisticasJugadores(Partido partido) {
        for (Jugador jugador : jugadores) {
            if (jugador != null) {
                if (partido.getVisitante().equals(nombre) && jugador instanceof Delantero) {
                    Delantero delantero=(Delantero) jugador;
                    delantero.setGoles(partido.getGolesVisitante());
                    delantero.setPartidosJugados(1);
                } else if (partido.getLocal().equals(nombre) && jugador instanceof Delantero) {
	                Delantero delantero=(Delantero) jugador;
	                delantero.setGoles(partido.getGolesLocal());
	                delantero.setPartidosJugados(1);
	            } else if (jugador instanceof Portero) {
	                Portero portero=(Portero) jugador;
	                portero.setBalonesParados((int) (Math.random() * 10) + 1);
	                portero.setPartidosJugados(1);
	            } else if (jugador instanceof Centrocampista) {
	                Centrocampista centrocampista=(Centrocampista) jugador;
	                centrocampista.setAsistencias((int) (Math.random() * 10) + 1);
	                centrocampista.setPartidosJugados(1);
	            } else if (jugador instanceof Defensa) {
	                Defensa defensa=(Defensa) jugador;
	                defensa.setJugadasBloqueadas((int) (Math.random() * 10) + 1);
	                defensa.setPartidosJugados(1);
	            }
            }
        }
    }
    
	
	private int getNumeroPuntos() {
		int puntos=this.puntosTemporada;
		if(this.partidos[posicionUltimoPartido()-1].getLocal().equals(nombre)) {
			if(this.partidos[posicionUltimoPartido()-1].getGolesLocal()>this.partidos[posicionUltimoPartido()-1].getGolesVisitante()) {
				puntos+=3;
			}else if(this.partidos[posicionUltimoPartido()-1].getGolesLocal()==this.partidos[posicionUltimoPartido()-1].getGolesVisitante()) {
				puntos++;
			}
		}else {
			if(this.partidos[posicionUltimoPartido()-1].getGolesLocal()<this.partidos[posicionUltimoPartido()-1].getGolesVisitante()) {
				puntos+=3;
			}else if(this.partidos[posicionUltimoPartido()-1].getGolesLocal()==this.partidos[posicionUltimoPartido()-1].getGolesVisitante()) {
				puntos++;
			}
		}
		
		return puntos;
	}
	
	public void mostrarPartidosJugados(LocalDate fecha) {
		Arrays.sort(partidos,new OrdenarPartidosPorResultado());
		
		for(int i=0;i<posicionUltimoPartido();i++) {
			if(partidos[i].getFechaPartido().toLocalDate().isBefore(fecha) || partidos[i].getFechaPartido().toLocalDate().equals(fecha)) {
				System.out.println("Jornada "+(i+1)+":Partido celebrado entre "+partidos[i].getLocal()+" y "+ partidos[i].getVisitante()+" el dia "+partidos[i].getFechaPartido().toLocalDate()+" a las "+partidos[i].getFechaPartido().toLocalTime()+" con resultado:"+partidos[i].getResultado());
			}
		}
	}
	
	public String mostrarInformacionClub() {
		return this.nombre+" fundado el año "+this.fechaCreacion.getYear()+", ha jugado "+this.contadorPartidos+" partidos en esta temporada y tiene "+this.puntosTemporada+" puntos actualmente.";
	}
	
	public void mostrarJugadores() throws JugadorException {
		Arrays.sort(jugadores,new OrdenadosPorEdad());
		
		for(Jugador j:jugadores) {
			if(j!=null) {
				System.out.println(j.getInfo());
			}
		}
	}
	
	public void mostrarJugadoresPorTipoYProbalidadJuego(AreaCampo area) throws JugadorException {
		Arrays.sort(jugadores,new OrdenadosPorProbalidad());
		
		for(Jugador j:jugadores) {
			if(j!=null && j.getAreaCampo().equals(area)) {
				System.out.println(j.getInfo());
			}
		}
	}
}
