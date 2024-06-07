package main.java.model;

public abstract class Vivienda {
	protected String identificador;
	private boolean alquilada;
	protected int numDias;
	protected int inquilinos;
	protected int numMaxInquilinos;
	protected Double importeAlquilerActual;
	private Double alquilerAcumulado;
	private static Integer sec=0;
	
	public Vivienda() {
		super();
		this.identificador=String.valueOf(sec);
		this.importeAlquilerActual=0.0;
		this.alquilerAcumulado=0.0;
		sec++;
	}

	public Vivienda(int numMaxInquilinos) {
		super();
		this.numMaxInquilinos = numMaxInquilinos;
		this.identificador=String.valueOf(sec);
		this.importeAlquilerActual=0.0;
		this.alquilerAcumulado=0.0;
		sec++;
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
            alquilerAcumulado+=importeAlquilerActual;
            inquilinos=0;
            numMaxInquilinos=0;
            importeAlquilerActual=0.0;
            numDias=0;
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
		return alquilerAcumulado;
	}
}
