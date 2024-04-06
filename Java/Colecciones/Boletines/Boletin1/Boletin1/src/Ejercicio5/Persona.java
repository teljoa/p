package Ejercicio5;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Persona {
	private String nombre;
	private String dni;
	private LocalDate fechaNacimiento;
	private ArrayList<Mensaje> buzon;
	
	public Persona(String nombre, String dni, LocalDate fechaNacimiento, ArrayList<Mensaje> buzon) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.buzon = buzon;
	}
	
	public abstract void enviarMensaje(Mensaje a,Persona b) throws Exception;
	
	public  String leerBuzon() throws Exception{
		String mensajes=null;
		if(this.getBuzon().size()>0) {
			for(int i=0;i<this.getBuzon().size();i++) {
				mensajes+="Mensaje" + i +":"+ this.getBuzon().toString();
			}
		}else {
			throw new Exception("No tiene mensajes.");
		}
		return mensajes;
	}
	
	public  String leerBuzonRemitente() {
		StringBuilder lista = new StringBuilder();
		List<Mensaje> tmp = new ArrayList<>();
		tmp.addAll(buzon);
		Iterator<Mensaje> it = tmp.iterator();
		while(it.hasNext()) {
			lista.append(it.next()+"\n");
		}
		
		return lista.toString();
	}
	
	public  void borrarMensaje(int nMensaje) throws Exception {
		if(this.buzon.size()>=nMensaje) {
			this.buzon.remove(nMensaje);
		}else {
			throw new Exception("No existe ese mensaje.");
		}
	}
	
	public  String buscarFraseMensaje(String frase) {
		String mensajes=null;
		for(Mensaje a:this.buzon) {
			if(a.buscarTextoPorMensaje(frase)) {
				mensajes+=a.getTexto();
			}
		}
		return mensajes;
	}
	
	public int getEdad() {
		return LocalDate.now().getYear()-this.fechaNacimiento.getYear();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public ArrayList<Mensaje> getBuzon() {
		return buzon;
	}

	public void setBuzon(ArrayList<Mensaje> buzon) {
		this.buzon = buzon;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
}
