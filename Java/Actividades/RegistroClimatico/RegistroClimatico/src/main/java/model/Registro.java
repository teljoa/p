package main.java.model;

public class Registro {
	private String fecha;
	private double tmed;
	private double prec;
	private double tmin;
	private double tmax;
	
	public Registro() {
		super();
	}
	
	public Registro(String fecha, double tmed, double prec, double tmin, double tmax) {
		super();
		this.fecha = fecha;
		this.tmed = tmed;
		this.prec = prec;
		this.tmin = tmin;
		this.tmax = tmax;
	}
	
	public String toCsv() {
		return fecha + "," + tmed +"," + prec +"," + tmin +"," + tmax;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getTmed() {
		return tmed;
	}

	public void setTmed(double tmed) {
		this.tmed = tmed;
	}

	public double getPrec() {
		return prec;
	}

	public void setPrec(double prec) {
		this.prec = prec;
	}

	public double getTmin() {
		return tmin;
	}

	public void setTmin(double tmin) {
		this.tmin = tmin;
	}

	public double getTmax() {
		return tmax;
	}

	public void setTmax(double tmax) {
		this.tmax = tmax;
	}

	@Override
	public String toString() {
		return "Registro [fecha=" + fecha + ", tmed=" + tmed + ", prec=" + prec + ", tmin=" + tmin + ", tmax=" + tmax
				+ "]";
	}
}
