package Ejer3;

public class figura {
	public String nombre;
	public int nlados;
	
	public figura(String nombre, int nlados) {
		super();
		this.nombre = nombre;
		this.nlados = nlados;
	}
	
	public String tipoFigura() {
		String tipo="";
		if(nlados==1) {
			tipo="Circulo";
		}
		if(nlados==3) {
			tipo="Triangulo";
		}
		if(nlados==4) {
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
