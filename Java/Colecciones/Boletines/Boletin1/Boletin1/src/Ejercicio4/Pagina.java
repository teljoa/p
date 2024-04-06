package Ejercicio4;

import java.time.LocalDateTime;
import java.util.Objects;

public class Pagina {
	private String url;
	private LocalDateTime visita;
	
	public Pagina(String url, LocalDateTime visita) {
		super();
		this.url = url;
		this.visita = visita;
	}
	
	public String getUrl() {
		return url;
	}

	public LocalDateTime getVisita() {
		return visita;
	}

	@Override
	public int hashCode() {
		return Objects.hash(url, visita);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || 
				obj!=null && obj.hashCode()==this.hashCode();
	}

	@Override
	public String toString() {
		return "Pagina [url=" + url + ", visita=" + visita + "]";
	}
	
	
}
