package main.java.model;

import java.time.LocalDate;
import java.util.Arrays;

import main.java.exception.HowagwartsException;

public class Bruja {
	private Hechizo[] hechizos;
	private final int N_HECHIZOS_RECORDADOS=30;
	private final int MAXIMO_PUNTOS_DIA=50;
	private boolean bloqueada;
	private int puntos_del_dia;
	
	public Bruja() {
		super();
		this.hechizos = new Hechizo[N_HECHIZOS_RECORDADOS];
		this.bloqueada=false;
		this.puntos_del_dia=0;
	}
	
	public int posicionUltimoHechizo() {
		int posicion=0;
		boolean encontrada=false;
		
		for(int i=0;i<hechizos.length && !encontrada;i++) {
			if(hechizos[i]==null) {
				posicion=i;
				encontrada=true;
			}
		}
		if(posicion==N_HECHIZOS_RECORDADOS) {
			posicion=N_HECHIZOS_RECORDADOS-1;
		}
		return posicion;
	}
	
	public void lanzarHechizo(Hechizo hechizo) throws HowagwartsException {
	    if(permitido(hechizo)) {
	    	if (posicionUltimoHechizo() >= N_HECHIZOS_RECORDADOS) {
		        for (int i = 0; i < hechizos.length - 1; i++) {
		            hechizos[i] = hechizos[i + 1];
		        }
		    }else if(posicionUltimoHechizo() > 0 && !hechizo.getFechaLanzamiento().equals(hechizos[posicionUltimoHechizo() - 1].getFechaLanzamiento())) {
		    	puntos_del_dia = 0; 
		    }else if (hechizo instanceof Maldicion && ((Maldicion) hechizo).esImperdonable()) {
	            bloqueada = true;
	        }
	    	hechizos[posicionUltimoHechizo()] = hechizo;
	        puntos_del_dia += hechizo.getPuntos();
	    }
	}
	
	private boolean permitido(Hechizo hechizo) throws HowagwartsException {
		boolean permitido=true;
		
		if (puntos_del_dia + hechizo.getPuntos() > MAXIMO_PUNTOS_DIA) {
			permitido=false;
            throw new HowagwartsException("Se ha alcanzado el máximo de puntos diarios.");
        }
        else if (bloqueada) {
        	permitido=false;
            throw new HowagwartsException("No puedes lanzar más hechizos, has sido bloqueado.");
        }
        else if (posicionUltimoHechizo() >= 2 && ((hechizos[posicionUltimoHechizo()-1] instanceof Defensa && hechizos[posicionUltimoHechizo()-2] instanceof Defensa && hechizo instanceof Defensa)
        		|| (hechizos[posicionUltimoHechizo()-1] instanceof Maldicion && hechizos[posicionUltimoHechizo()-2] instanceof Maldicion && hechizo instanceof Maldicion))) {
                permitido=false;
            	throw new HowagwartsException("No se puede lanzar hechizos del mismo tipo más de 2 veces seguidas.");
        }
		
		return permitido;
	}
	
	public void mostrarHistorialDefesas() {
		for(Hechizo h:hechizos) {
			if(h!=null && h instanceof Defensa) {
				System.out.println(h);
			}
		}
	}
	
	public void mostrarHistorialMaldiciones() {
		for(Hechizo h:hechizos) {
			if(h!=null && h instanceof Maldicion) {
				System.out.println(h);
			}
		}
	}
	
	public String mostrarUltimoHechizoRealizado() {
		return hechizos[posicionUltimoHechizo()-1].toString();
	}
	
	public LocalDate fechaLanzamientoHechizo(String hechizo) {
		LocalDate lanzado=null;
		for(Hechizo h:hechizos) {
			if(h != null && h.getNombre()==hechizo) {
				lanzado=h.getFechaLanzamiento();
			}
		}
		
		return lanzado;
	}
	
	public int consumoMagicoTotal() {
		int puntosT=0;
		
		for(Hechizo h:hechizos) {
			if(h!=null) {
				puntosT+=h.getPuntos();
			}
		}
		return puntosT;
	}
	
	public int consumeMagicoMedio() {
		return consumoMagicoTotal()/posicionUltimoHechizo();
	}
	
	public void mostrarOrdenadoPorConsumo() {
		Arrays.sort(hechizos, new OrdenarPorPuntos());
		
		for(Hechizo h:hechizos) {
			if(h!=null){
				System.out.println(h);
			}
		}
	}
	
	public void hechizosLanzadosEnFecha(LocalDate fecha) {
		for(Hechizo h:hechizos) {
			if(h != null && h.getFechaLanzamiento().equals(fecha)) {
				System.out.println(h);
			}
		}
	}
}