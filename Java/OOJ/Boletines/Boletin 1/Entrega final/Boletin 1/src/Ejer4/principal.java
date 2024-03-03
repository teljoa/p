package Ejer4;

public class principal {
	public static void main(String[] args) {
        
        TarjetaCredito tarjeta = new TarjetaCredito(9, 1900);
        tarjeta.mostrarInformacion();
        
        System.out.println("------------------------------------------------------");
        
        tarjeta.comprar(100);
        tarjeta.mostrarInformacion();
        
        System.out.println("------------------------------------------------------");
        
        tarjeta.comprar(1500);
        tarjeta.mostrarInformacion();
        
        System.out.println("------------------------------------------------------");

        tarjeta.saldarDeudas();
        tarjeta.mostrarInformacion();
    }
}
