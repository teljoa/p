package Ejercicio7;

public class Cliente {
	private int numero;
	private int secuencia;

	public Cliente() {
		super();
		this.secuencia=1;
		this.numero = secuencia;
		secuencia++;
		
	}

	public int getNumero() {
		return numero;
	}
}
