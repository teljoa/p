package Ficheros;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sorteo {
	private LocalDate fecha;
	private List<Integer> numeros;
	private List<Integer> estrellas;
	
	public Sorteo(LocalDate fecha, List<Integer> numeros, List<Integer> estrellas) {
		super();
		this.fecha = fecha;
		this.numeros = numeros;
		this.estrellas = estrellas;
	}
	
	public Sorteo(String linea) {
		String[] campos=linea.split(",");
		String[] fecha=campos[0].split("/");
		this.numeros=new ArrayList<Integer>();
		this.estrellas=new ArrayList<Integer>();
		
		this.fecha=LocalDate.of(Integer.valueOf(fecha[2]),Integer.valueOf(fecha[1]),Integer.valueOf(fecha[0]));
		this.numeros.add(Integer.valueOf(campos[1]));
		this.numeros.add(Integer.valueOf(campos[2]));
		this.numeros.add(Integer.valueOf(campos[3]));
		this.numeros.add(Integer.valueOf(campos[4]));
		this.numeros.add(Integer.valueOf(campos[5]));
		this.estrellas.add(Integer.valueOf(campos[7]));
		this.estrellas.add(Integer.valueOf(campos[8]));
		
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public List<Integer> getNumeros() {
		return numeros;
	}

	public List<Integer> getEstrellas() {
		return estrellas;
	}

	@Override
	public String toString() {
		return "Sorteo [fecha=" + fecha + ", numeros=" + numeros + ", estrellas=" + estrellas + "]";
	}
}
