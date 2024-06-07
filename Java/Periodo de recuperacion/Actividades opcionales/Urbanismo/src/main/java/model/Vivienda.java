package main.java.model;

public abstract class Vivienda {
	protected String identificador;
	private boolean alquilada;
	protected int inquilinos;
	protected int numMaxInquilinos;
	protected Double importeAlquilerActual;
	private Double alquilerAcumulado;
	private static Integer sec;
	
	public Vivienda() {
		super();
		this.identificador+=sec++;
	}

	public Vivienda(int numMaxInquilinos) {
		super();
		this.numMaxInquilinos = numMaxInquilinos;
	}

	@Override
	public String toString() {
		return "Vivienda [identificador=" + identificador + ", alquilada=" + alquilada + ", inquilinos=" + inquilinos
				+ ", numMaxInquilinos=" + numMaxInquilinos + ", importeAlquilerActual=" + importeAlquilerActual
				+ ", alquilerAcumulado=" + alquilerAcumulado + "]";
	}
	
	public void realizarCheckout() {
		if (alquilada) {
            alquilada = false;
            System.out.println("Se ha realizado el check-out de la vivienda.");
            inquilinos=0;
            numMaxInquilinos=0;
            importeAlquilerActual=0.0;
        } else {
            System.out.println("La vivienda no está alquilada actualmente.");
        }
	}

	public boolean isAlquilada() {
		return alquilada;
	}
	
	public void setAlquilada(boolean alquilada) {
		this.alquilada = alquilada;
	}

	public abstract void alquilarVivienda(int numInquilinos,int numDias) throws Exception;
	
	public double importeTotalAcumulado() {
		alquilerAcumulado+=importeAlquilerActual;
		
		return alquilerAcumulado;
	}
}
