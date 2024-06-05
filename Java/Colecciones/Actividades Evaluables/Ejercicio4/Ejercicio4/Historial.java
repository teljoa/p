package Ejercicio4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class Historial {
	private ArrayList<Pagina> historial;

	public Historial(ArrayList<Pagina> historial) {
		super();
		this.historial = historial;
	} 
	
	public void anadirPagina(String url,LocalDateTime visita) throws Exception{
		Pagina pagina=new Pagina(url,visita);
		if(!pagina.getVisita().isBefore(this.historial.get(ultimaPagina()).getVisita())) {
			this.historial.add(pagina);
		}else {
			throw new Exception("Nose puede añadir una pagina con una fecha anterior a la ultima añadida.");
		}
		
	}
	
	public int ultimaPagina() {
		int ubicacion=0;
		int i=0;
		boolean tmp=false;
		while(tmp==true && this.historial.size()<i) {
			if(this.historial.get(i)==null) {
				tmp=true;
				ubicacion=i-1;
			}
		}
		return ubicacion;
	}
	
	public void concultarHistorial() {
		for(Pagina a:this.historial) {
			System.out.println(a);
		}
	}
	
	public void consultarDia(LocalDateTime dia) {
		for(Pagina a:this.historial) {
			if(a.getVisita().equals(dia)) {
				System.out.println(a);
			}
		}
	}
	
	public void borrarHistorial() {
		this.historial.clear();
	}
	
	public void borrarUnapagina(String url) {
		for(Pagina a:this.historial) {
			if(a.getUrl().equals(url)){
				this.historial.remove(a);
			}
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(historial);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj ||
				obj!=null && obj.hashCode()==this.hashCode();
	}
	
}
