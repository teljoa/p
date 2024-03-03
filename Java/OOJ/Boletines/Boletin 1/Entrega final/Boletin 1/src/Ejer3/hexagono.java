package Ejer3;

public class Hexagono extends Figura {

	private double[] lados;
	
	public Hexagono() {
		super();
		this.lados=new double[6];
		this.lados=new double[] {1,1,1,1,1,1};
	}

	public Hexagono(double[] lados) {
		super();
		this.lados=new double[6];
		this.lados = lados;
	}
	
	@Override
	public double CalcularArea() {
		double a=Math.pow(Math.pow(lados[0], 2)-Math.pow(lados[0]/2, 2), 1/2); //apotema
		return Math.pow(CalcularPerimetro()*a, 1/2);
	}
	
	@Override
	public double CalcularPerimetro() {
		return lados[0]+lados[1]+lados[2]+lados[3]+lados[4]+lados[5];
	}

	public double[] getLados() {
		return lados;
	}

	public void setLados(double[] lados) {
		this.lados = lados;
	}
	
	
}
