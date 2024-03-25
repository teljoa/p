package Ejer2;

public class principal {
	public static void main(String[] args) {
        Triangulo[] triangulos = new Triangulo[10];
        
        double[] lados1= {4,6,1};
        double[] lados2= {2,7,2};
        
        triangulos[0] = new Triangulo();
        triangulos[1] = new Triangulo(lados1);
        triangulos[2] = new Triangulo(lados2);

        for (int i = 0; i < triangulos.length; i++) {
            if (triangulos[i] != null) {
                System.out.println("Triángulo " + (i + 1) + ":");
                System.out.println("Lado 1: " + triangulos[i].getLado1());
                System.out.println("Lado 2: " + triangulos[i].getLado2());
                System.out.println("Lado 3: " + triangulos[i].getLado3());
                System.out.println("Área: " + triangulos[i].calcularArea());
                System.out.println("Perímetro: " + triangulos[i].calcularPerimetro());
                System.out.println("Es Isósceles: " + triangulos[i].isoceles());
                System.out.println("Es Equilátero: " + triangulos[i].equilatero());
                System.out.println("Es Escaleno: " + triangulos[i].escaleno());
                System.out.println("-------------");
            }
        }
    }
}
