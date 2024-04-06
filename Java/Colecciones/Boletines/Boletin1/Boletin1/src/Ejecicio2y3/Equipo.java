package Ejecicio2y3;

import java.util.List;

public class Equipo<T> {
	private String nombre;
    private List<T> alumnos;
	
	public Equipo(String nombre) {
		super();
		this.nombre=nombre;
	}
	
	public void anadirAlumno(T alumno) {
        if (alumnos.contains(alumno)) {
            throw new IllegalArgumentException("El alumno ya pertenece al equipo.");
        }
        alumnos.add(alumno);
    }

    public void borrarAlumno(T alumno) {
        if (!alumnos.contains(alumno)) {
            throw new IllegalArgumentException("El alumno no pertenece al equipo.");
        }
        alumnos.remove(alumno);
    }

    public T buscarAlumno(T alumno) {
        for (T a : alumnos) {
            if (a.equals(alumno)) {
                return a;
            }
        }
        return null;
    }

    public void mostrarAlumnos() {
        System.out.println("Alumnos del equipo " + nombre + ":");
        for (T alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    public Equipo<T> unirEquipos(Equipo<T> otroEquipo) {
        Equipo<T> nuevoEquipo = new Equipo<>(this.nombre + "_" + otroEquipo.nombre);
        nuevoEquipo.alumnos.addAll(this.alumnos);
        nuevoEquipo.alumnos.addAll(otroEquipo.alumnos);
        return nuevoEquipo;
    }

    public Equipo<T> interseccionEquipos(Equipo<T> otroEquipo) {
        Equipo<T> nuevoEquipo = new Equipo<>(this.nombre + "_" + otroEquipo.nombre);
        for (T alumno : this.alumnos) {
            if (otroEquipo.alumnos.contains(alumno)) {
                nuevoEquipo.alumnos.add(alumno);
            }
        }
        return nuevoEquipo;
    }
}
