package Ejecicio2y3;

public class Main {

	public static void main(String[] args) throws Exception {
		Alumno alumno1 = new Alumno("Juan", "111111111H");
        Alumno alumno2 = new Alumno("María", "121111111B");
        Alumno alumno3 = new Alumno("Pedro", "131111111K");
        
        Equipo equipo1 = new Equipo("Equipo A");
        Equipo equipo2 = new Equipo("Equipo B");

        equipo1.anadirAlumno(alumno1);
        equipo1.anadirAlumno(alumno2);
        equipo2.anadirAlumno(alumno2);
        equipo2.anadirAlumno(alumno3);

        System.out.println("Equipo 1:");
        equipo1.toString();
        System.out.println("Equipo 2:");
        equipo2.toString();

        System.out.println("Unión de equipos:");
        Equipo equipoUnion = equipo1.unirEquipos(equipo2);
        equipoUnion.toString();

        System.out.println("Intersección de equipos:");
        Equipo equipoInterseccion = equipo1.interseccionEquipos(equipo2);
        equipoInterseccion.toString();
        
        //Ejercicio 3
        
        Equipo equipoNumeros = new Equipo<>("Equipo de Números");

        equipoNumeros.anadirAlumno(1);
        equipoNumeros.anadirAlumno(2);
        equipoNumeros.anadirAlumno(3);

        equipoNumeros.toString();

        Equipo<Integer> otroEquipoNumeros = new Equipo<>("Otro Equipo de Números");

        otroEquipoNumeros.anadirAlumno(3);
        otroEquipoNumeros.anadirAlumno(4);
        otroEquipoNumeros.anadirAlumno(5);

        otroEquipoNumeros.toString();

        Equipo<Integer> nuevoEquipo1 = equipoNumeros.unirEquipos(otroEquipoNumeros);
        System.out.println("Unión de equipos:");
        nuevoEquipo1.mostrarAlumnos();

        Equipo<Integer> nuevoEquipo2 = equipoNumeros.interseccionEquipos(otroEquipoNumeros);
        System.out.println("Intersección de equipos:");
        equipoInterseccion.mostrarAlumnos();
	}

}
