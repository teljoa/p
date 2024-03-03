package Ejer1;

public class principal {

	public static void main(String[] args) {
		Circulo circulo1 = new Circulo(); 
        System.out.println("Radio del círculo 1: " + circulo1.getRadio());
        System.out.println("Área del círculo 1: " + circulo1.CalcularArea());
        System.out.println("Perímetro del círculo 1: " + circulo1.CalcularPerimetro());

        Circulo circulo2 = new Circulo(10); 
        System.out.println("Radio del círculo 2: " + circulo2.getRadio());
        System.out.println("Área del círculo 2: " + circulo2.CalcularArea());
        System.out.println("Perímetro del círculo 2: " + circulo2.CalcularPerimetro());
	}

}
