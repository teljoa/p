package Ejer3;

public abstract class  Figura {
	public String nombre;
	public int nlados;
	
	public Figura(String nombre, int nlados) {
		super();
		this.nombre = nombre;
		this.nlados = nlados;
	}
	
	public Figura() {
		super();
	}
	
	public abstract double CalcularArea();
	public abstract double CalcularPerimetro();

	public String tipoFigura() {
		String tipo="";
		if(nlados==1) {
			tipo="Circulo";
		}
		else if(nlados==3) {
			tipo="Triangulo";
		}
		else if(nlados==4) {
			tipo="cuadrado";
		}
		return tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNlados() {
		return nlados;
	}

	public void setNlados(int nlados) {
		this.nlados = nlados;
	}
	
	
}
