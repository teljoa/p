package main.java;

import java.util.Arrays;

public class Clinica {
	private static final int MAX_CAPACIDAD=20;
	private Mascota[] mascotas;
	
	public Clinica() {
		super();
		this.mascotas=new Mascota[MAX_CAPACIDAD];
	}
	
	private int posicionUltimaMascota() {
		boolean entra=false;
		int posicion=0;
		
		for(int i=0;i<mascotas.length && !entra;i++) {
			if(mascotas[i]==null) {
				posicion=i;
				entra=true;
			}
		}
		
		return posicion;
	}
	
	private int posicionMascota(Mascota mas) {
		boolean entra=false;
		int posicion=0;
		
		for(int i=0;i<mascotas.length && !entra;i++) {
			if(mas.equals(mascotas[i])) {
				posicion=i;
				entra=true;
			}
		}
		
		if(!entra) {
			posicion=-1;
		}
		
		return posicion;
	}
	public boolean darAltaMascota(Mascota masc) throws ClinicaException {
		boolean alta=false;
		if(posicionMascota(masc)==-1) {
			if(posicionUltimaMascota()==MAX_CAPACIDAD-1) {
				for(int i=0;i<posicionUltimaMascota();i++) {
					mascotas[i]=mascotas[i+1];
				}
			}
			mascotas[posicionUltimaMascota()]=masc;
			alta=true;
		}else {
			throw new ClinicaException("Ya esta registrada la mascota.");
		}
		return alta;
	}
	
	public boolean darBajaMascota(String codigo) throws ClinicaException {
		boolean baja=false;
		
		for(int i=0;i<mascotas.length && !baja;i++) {
			if(mascotas[i]!=null && mascotas[i].id.equals(codigo)) {
				mascotas[i]=null;
				baja=true;
			}
		}
		if(!baja) {
			throw new ClinicaException("No hay mascota en el sistema con ese codigo.");
		}
		
		return baja;
	}
	
	public boolean vacunarMascotaConCodigo(String codigo) throws VacunaException {
		boolean entra=false;
		
		for(int i=0;i<mascotas.length && !entra;i++) {
			if(mascotas[i]!=null && codigo.equals(mascotas[i].id) && mascotas[i].vacunar()) {
				entra=true;
				mascotas[i].numeroVacunas++;
			}
		}
		if(!entra) {
			throw new VacunaException("La mascota ya tiene el maximo de vacunas permitodo para su edad.");
		}
		
		return entra;
	}
	
	public boolean castrarMascotaConCodigo(String codigo) throws CastradoException {
		boolean entra=false;
		
		for(int i=0;i<mascotas.length && !entra;i++) {
			if(mascotas[i]!=null && codigo.equals(mascotas[i].id) && mascotas[i].castrar()) {
				entra=true;
				mascotas[i].castrado=true;
			}
		}
		if(!entra) {
			throw new CastradoException("Esta mascotra no se puede castrar porque: (no esta en edad fertir/ya ha sido castrada).");
		}
		
		return entra;
	}
	
	public void listarTodosLosPerros() {
		for(Mascota m:mascotas) {
			if(m!=null && m instanceof Perro) {
				System.out.println(m+"\n");
			}
		}
	}
	
	public void listarTodosLosGatos() {
		for(Mascota m:mascotas) {
			if(m!=null && m instanceof Gato) {
				System.out.println(m+"\n");
			}
		}
	}
	
	public void listarAnimalesCastrados() {
		for(Mascota m:mascotas) {
			if(m!=null && m.isCastrado()) {
				System.out.println(m+"\n");
			}
		}
	}
	
	public void listarAnimalesPorTipoYEdad() {
		Arrays.sort(mascotas,new OrdenarPorTipoYEdad());
		
		for(Mascota m:mascotas) {
			if(m!=null) {
				System.out.println(m+"\n");
			}
		}
	}
	
	public void listarAnimalesPorNumeroVacunas() {
		Arrays.sort(mascotas,new OrdenarPorNumeroDeVacunas());
		
		for(Mascota m:mascotas) {
			if(m!=null) {
				System.out.println(m+"\n");
			}
		}
	}
}
