package main.java;

import java.time.LocalDate;

public abstract class Mascota {
	protected LocalDate fechaNacimiento;
	protected LocalDate fechaRegistro;
	protected Genero genero;
	protected String id;
	protected String nombre;
	protected boolean castrado;
	protected int numeroVacunas;
	private static int secuencia=0;
	
	public Mascota(LocalDate fechaNacimiento, Genero genero, String nombre) {
		super();
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.nombre = nombre;
		this.numeroVacunas=0;
		this.fechaRegistro=LocalDate.now();
		secuencia++;
		this.id=String.valueOf(secuencia);
	}
	
	public boolean castrar() {
		return estaEnEdadFertir() && !isCastrado();
	}
	
	public abstract boolean estaEnEdadFertir();
	
	public int getEdad() {
		return LocalDate.now().getYear()-this.fechaNacimiento.getYear();
	}
	
	public boolean vacunar() {
		return numeroVacunas<getEdad();
	}

	public boolean isCastrado() {
		return castrado;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+":"+this.nombre+
			   "\nNumero de vacunas:"+this.numeroVacunas+
			   "\nEsta castrado:"+this.castrado+
			   "\nEdad:"+this.getEdad()+
			   "\nGenero:";
	}
	
	public int compareTo(Mascota o) {
		return o.id.equals(this.id)? 0:1;
	}
}
