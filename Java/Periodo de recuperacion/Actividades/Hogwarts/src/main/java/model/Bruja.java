package main.java.model;

import java.time.LocalDate;
import java.util.Arrays;

import main.java.exception.HowagwartsException;

public class Bruja {
	private Hechizo[] hechizos;
	private String[] tipo_Hechizos;
	private final int N_HECHIZOS_RECORDADOS=30;
	private final int MAXIMO_PUNTOS_DIA=50;
	private boolean bloqueada;
	private int puntos_del_dia;
	
	public Bruja() {
		super();
		this.hechizos = new Hechizo[N_HECHIZOS_RECORDADOS];
		this.tipo_Hechizos=new String[N_HECHIZOS_RECORDADOS];
		this.bloqueada=false;
		this.puntos_del_dia=0;
	}
	
	public int posicionUltimoHechizo() {
		int posicion=0;
		boolean encontrada=false;
		
		for(int i=0;i<hechizos.length;i++) {
			if(hechizos[i]==null && !encontrada) {
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
	    if (posicionUltimoHechizo() >= N_HECHIZOS_RECORDADOS) {
	        for (int i = 0; i < hechizos.length - 1; i++) {
	            hechizos[i] = hechizos[i + 1];
	            tipo_Hechizos[i] = tipo_Hechizos[i + 1];
	        }
	        hechizos[hechizos.length - 1] = hechizo;
	        if (hechizo instanceof Maldicion) {
	            tipo_Hechizos[hechizos.length - 1] = "Maldicion";
	        } else {
	            tipo_Hechizos[hechizos.length - 1] = "Defensa";
	        }
	    } else {
	        if (puntos_del_dia + hechizo.getPuntos() > MAXIMO_PUNTOS_DIA) {
	            throw new HowagwartsException("Se ha alcanzado el máximo de puntos diarios.");
	        }
	        if (bloqueada) {
	            throw new HowagwartsException("No puedes lanzar más hechizos, has sido bloqueado.");
	        }
	        if (posicionUltimoHechizo() >= 2) {
	            String tipoAnterior = tipo_Hechizos[posicionUltimoHechizo() - 1];
	            String tipoAnteriorAnterior = tipo_Hechizos[posicionUltimoHechizo() - 2];
	            if ((tipoAnterior=="Defensa" && tipoAnteriorAnterior=="Defensa" && hechizo instanceof Defensa) || (tipoAnterior=="Maldicion" && tipoAnteriorAnterior=="Maldicion" && hechizo instanceof Maldicion)) {
	                throw new HowagwartsException("No se puede lanzar hechizos del mismo tipo más de 2 veces seguidas.");
	            }
	        }

	        hechizos[posicionUltimoHechizo()] = hechizo;
	        if (hechizo instanceof Maldicion) {
	            tipo_Hechizos[posicionUltimoHechizo()] = "Maldicion";
	        } else {
	            tipo_Hechizos[posicionUltimoHechizo()] = "Defensa";
	        }
	        if (posicionUltimoHechizo() > 0 && !hechizo.getFechaLanzamiento().equals(hechizos[posicionUltimoHechizo() - 1].getFechaLanzamiento())) {
	            puntos_del_dia = 0; 
	        }
	        puntos_del_dia += hechizo.getPuntos();

	        if (hechizo instanceof Maldicion && ((Maldicion) hechizo).esImperdonable()) {
	            bloqueada = true;
	        }
	    }
	}
	
	public void mostrarHistorialDefesas() {
		for(Hechizo h:hechizos) {
			if(h instanceof Defensa) {
				System.out.println(h);
			}
		}
	}
	
	public void mostrarHistorialMaldiciones() {
		for(Hechizo h:hechizos) {
			if(h instanceof Maldicion) {
				if(((Maldicion) h).esImperdonable()) {
					System.out.println("Maldicion Imperdonable");
				}else {
					System.out.println(h);
				}
			}
		}
	}
	
	public String mostrarUltimoHechizoRealizado() {
		String hechizo=hechizos[posicionUltimoHechizo()-1].toString();
				
		if(((Maldicion) hechizos[posicionUltimoHechizo()-1]).esImperdonable()){
			hechizo="Maldicion Imperdonable.";
		}
		
		return hechizo;
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
			if(h instanceof Maldicion){
				Maldicion maldicion=(Maldicion) h;
				if(maldicion.esImperdonable()) {
					System.out.println("Maldicion Imperdonable.");
				}else {
					System.out.println(h);
				}
				
			}else if(h!=null){
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