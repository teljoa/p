package Ejer2;

public class Triangulo {
	public double[] lados;

	public Triangulo() {
		super();
		this.lados=new double[] {1,1,1};
	}

	public Triangulo(double[] lados) {
		super();
		this.lados = lados;
	}
	
	public double calcularArea() {
		double s=calcularPerimetro()/2;//semiperimetro
		return Math.sqrt(s * (s - lados[0]) * (s - lados[1]) * (s - lados[2]));
	}
	
	public double calcularPerimetro() {
		return lados[0]+lados[1]+lados[2];
	}
	
	public boolean equilatero() {
		return lados[0]==lados[1] && lados[1]==lados[2];
	}
	
	public boolean isoceles() {
        return lados[0] == lados[1] || lados[1] == lados[2] || lados[2] == lados[0];
	}
	
	public boolean escaleno() {
		return !isoceles() && !equilatero();
	}

	public double[] getLados() {
		return lados;
	}

	public void setLados(double[] lados) {
		this.lados = lados;
	}
	
	public double getLado1() {
		return lados[0];
	}

	public void setLado1(double[] lados) {
		this.lados[0]=lados[0];
	}
	
	public double getLado2() {
		return lados[1];
	}

	public void setLado2(double[] lados) {
		this.lados[1]=lados[2];
	}
	
	public double getLado3() {
		return lados[2];
	}

	public void setLado3(double[] lados) {
		this.lados[2]=lados[2];
	}
	
}
