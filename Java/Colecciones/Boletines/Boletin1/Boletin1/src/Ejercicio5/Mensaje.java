package Ejercicio5;

import java.time.LocalDateTime;

public class Mensaje {
	private String remitente;
	private String texto;
	private LocalDateTime escrituta;
	
	public Mensaje(String remitente, String texto, LocalDateTime escrituta) {
		super();
		this.remitente = remitente;
		this.texto = texto;
		this.escrituta = escrituta;
	}
	
	public boolean buscarTextoPorMensaje(String texto) {
		return this.texto.endsWith(texto);
	}
	
	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getEscrituta() {
		return escrituta;
	}

	public void setEscrituta(LocalDateTime escrituta) {
		this.escrituta = escrituta;
	}

	@Override
	public String toString() {
		return "Mensaje [remitente=" + remitente + ", texto=" + texto + ", escrituta=" + escrituta + "]";
	}
	
	
}
