package main.java;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Gato extends Mascota {

	public Gato(LocalDate fechaNacimiento, Genero genero, String nombre) {
		super(fechaNacimiento, genero, nombre);
		
	}

	@Override
	public boolean estaEnEdadFertir() {
		return ChronoUnit.DAYS.between(fechaNacimiento,LocalDate.now())>=5*30;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(fechaNacimiento, genero, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || obj!=null && obj.hashCode()==this.hashCode();
	}

	@Override
	public String toString() {
		return super.toString()+
			   (this.genero.equals(Genero.MASCULINO)?"Gato.":"Gata.");
	}
}
