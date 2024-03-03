package Ejer4;

public class TarjetaCredito {
	private int calificacionCrediticia;
    private double limiteGasto; 
    private double saldo;

    public TarjetaCredito(int calificacionCrediticia, double limiteGasto) {
        if (calificacionCrediticia < 1 || calificacionCrediticia > 10) {
            throw new IllegalArgumentException("La calificación crediticia debe estar entre 1 y 10.");
        }

        this.calificacionCrediticia = calificacionCrediticia;
        this.limiteGasto = Math.min(limiteGasto, 2000);
        this.saldo = 0;
    }

    public void comprar(double dinerogastar) {
        if (dinerogastar <= 0) {
            System.out.println("El dinero a gastar de la compra debe ser mayor que 0.");
            return;
        }

        if (saldo + dinerogastar > limiteGasto) {
            calificacionCrediticia--; 
            limiteGasto = Math.max(limiteGasto - 200, 0); 
        }

        saldo += dinerogastar;
        System.out.println("Compra realizada correctamente. Saldo actual: " + saldo + "€");
    }

    public void saldarDeudas() {
        saldo = 0;
        System.out.println("Deudas saldadas correctamente. Saldo actual: " + saldo + "€");
    }

    public void mostrarInformacion() {
        System.out.println("Calificación Crediticia: " + calificacionCrediticia);
        System.out.println("Límite de Gasto: " + limiteGasto + "€");
        System.out.println("Saldo: " + saldo + "€");
    }
}
