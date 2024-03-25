package ejercicio1y2;

public class Principal {

	public static void main(String[] args) {
		Punto p1 = new Punto(8, 5);
		Punto p2 = new Punto(2, 9);
		
		Linea linea1 = new Linea(p1, p2);
		Linea linea2 = new Linea(p2, p1);
		Linea linea3 = new Linea();
		
		System.out.println(linea1.calcularDistancia());
		System.out.println(linea2.calcularDistancia());
		System.out.println(linea3.calcularDistancia());

	}

}
