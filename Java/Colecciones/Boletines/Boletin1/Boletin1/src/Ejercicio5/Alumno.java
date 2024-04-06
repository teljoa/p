package Ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends Persona {

	public Alumno(String nombre, String dni, LocalDate fechaNacimiento, ArrayList<Mensaje> buzon) {
		super(nombre, dni, fechaNacimiento, buzon);
		
	}

	@Override
	public void enviarMensaje(Mensaje a,Persona b) throws Exception {
		if(b.getClass().equals("Profesor")) {
			b.getBuzon().add(a);
		}else if(b.getClass().equals("Alumno")&& this.getEdad()<18) {
			throw new Exception("Un alumno menos de edad no puede escribir a otro alumno.");
		}
	}

	@Override
	public String leerBuzon() throws Exception {
		return this.leerBuzon();
	}

	@Override
	public String leerBuzonRemitente() {
		return this.leerBuzonRemitente();
		
	}

	@Override
	public void borrarMensaje(int nMensaje) {
		this.borrarMensaje(nMensaje);
		
	}

	@Override
	public String buscarFraseMensaje(String frase) {
		
		return null;
	}

}
