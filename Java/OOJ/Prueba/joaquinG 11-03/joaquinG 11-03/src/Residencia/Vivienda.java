package Residencia;

public abstract class Vivienda {
	
	protected String identificador;
	private boolean alquilada;
	protected int inquilinos;
	protected int numMaxInquilinos;
	protected Double importeAlquilerActual;
	protected int numDias;
	private Double alquilerAcumulado;
	private static Integer sec;
	
	
	public Vivienda() {
		super();
	}
	
	public Vivienda(int maxInquilinos) {
		this.numMaxInquilinos=maxInquilinos;
		this.identificador=""+sec++;
	}
	
	public abstract void realizarCheckout();

	public boolean isAlquilada() {
		return alquilada;
	}
	
	public abstract void alquilarVivienda(int numInquilinos,int numDias);
	
	public double importeTotalAcumulado() {
		alquilerAcumulado=importeAlquilerActual;
		return importeAlquilerActual;
	}
	
	public String toString() {
		return "";
	}
}
