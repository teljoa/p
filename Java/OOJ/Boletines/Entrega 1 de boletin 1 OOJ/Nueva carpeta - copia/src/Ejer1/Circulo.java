package Ejer1;

public class Circulo {
	public double radio ;

	public Circulo() {
		super();
	}

	public Circulo(double radio) {
		super();
		this.radio = radio ;
	}
	
	public double CalcularArea() {
		return 3.14*Math.pow(radio, 2);
	}
	
	public double CalcularPerimetro() {
		return 2*3.14*radio;
	}

	public double getRadio() {
		return radio ;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
}
