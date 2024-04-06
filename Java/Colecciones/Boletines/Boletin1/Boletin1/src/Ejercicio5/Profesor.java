package Ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Profesor extends Persona {

	public Profesor(String nombre, String dni, LocalDate fechaNacimiento, ArrayList<Mensaje> buzon) {
		super(nombre, dni, fechaNacimiento, buzon);
		
	}

	@Override
	public void enviarMensaje(Mensaje a,Persona b) {
		this.getBuzon().add(a);
		
	}

	@Override
	public String leerBuzon() {
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
		return this.buscarFraseMensaje(frase);
	}

}
