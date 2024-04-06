package test.java.com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.com.modelo.Alumno;
import main.java.com.modelo.Equipo;

class EquipoTest {
	
	@Test
	void testEquipoVacioAlPrincipio() {
		Equipo equipoA = new Equipo();
		
		assertEquals(equipoA.getAlumnos().size(), 0);
	}

	@Test
	void testAddAlumnoAtributosAumentaTamanio() {
		
		Equipo equipoA = new Equipo();
		equipoA.addAlumno("JM", "Sevillano", "56565689M");
		
		assertEquals(equipoA.getAlumnos().size(), 1);
		
	}

	@Test
	void testAddAlumnoClaseAumentaTamanio() {
		Equipo equipoA = new Equipo();
		Alumno alumno = new Alumno("JM", "Sevillano", "56565689M");
		equipoA.addAlumno(alumno);
		
		assertEquals(equipoA.getAlumnos().size(), 1);
	}

	
}
