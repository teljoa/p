package ejercicio1y2;

public class Linea {
	
	private Punto lineaA;
	private Punto lineaB;
	
	public Linea() {
		super();
		this.lineaA=new Punto();
		this.lineaB=new Punto();
	}

	public Linea(Punto lineaA, Punto lineaB) {
		super();
		this.lineaA = lineaA;
		this.lineaB = lineaB;
	}
	
	public double calcularDistancia() {
		return Math.pow(Math.sqrt((lineaB.getPuntox()-lineaA.getPuntox()) + Math.sqrt((lineaB.getPuntoY()-lineaA.getPuntoY()))), 1/2);
	}
	
	public void moverDerecha(double desplazamiento) {
		this.lineaA.moverHorizontal(desplazamiento);
		this.lineaB.moverHorizontal(desplazamiento);
	}
	
	public void moverIzquierda(double desplazamiento) {
		moverDerecha(-desplazamiento);
	}
	
	public void subir(double desplazamiento) {
		this.lineaA.moverVertical(desplazamiento);
		this.lineaB.moverVertical(desplazamiento);
	}
	
	public void bajar(double desplazamiento) {
		subir(-desplazamiento);
	}
	
	public Punto getLineaA() {
		return lineaA;
	}

	public void setLineaA(Punto lineaA) {
		this.lineaA = lineaA;
	}

	public Punto getLineaB() {
		return lineaB;
	}

	public void setLineaB(Punto lineaB) {
		this.lineaB = lineaB;
	}
	
	@Override
	public String toString() {
		return String.format("[%s , %s]", this.lineaA, this.lineaB);
		
	}
}
