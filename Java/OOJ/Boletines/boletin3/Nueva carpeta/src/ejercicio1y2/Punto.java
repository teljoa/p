package ejercicio1y2;

public class Punto {
	
	private int puntox;
	private int puntoY;
	
	public Punto() {
		super();
		this.puntox=0;
		this.puntoY=0;
	}

	public Punto(int puntox, int puntoY) {
		super();
		this.puntox = puntox;
		this.puntoY = puntoY;
	}
	
	public void moverHorizontal(double desplazamiento) {
		this.puntox+=desplazamiento;
	}
	
	public void moverVertical(double desplazamiento) {
		this.puntoY+=desplazamiento;
	}

	public int getPuntox() {
		return puntox;
	}

	public void setPuntox(int puntox) {
		this.puntox = puntox;
	}

	public int getPuntoY() {
		return puntoY;
	}

	public void setPuntoY(int puntoY) {
		this.puntoY = puntoY;
	}
	
	@Override
	public String toString() {
		return String.format(("( %s , %s )"), this.puntox, this.puntoY);
	}
	
}
