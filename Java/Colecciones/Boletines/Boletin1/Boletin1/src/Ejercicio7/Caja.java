package Ejercicio7;

import java.util.ArrayList;
import java.util.Iterator;

public class Caja {
	
	private int ncaja;
	private boolean abierta;
	public ArrayList<Cliente> clientes;
	
	public Caja(int ncaja, boolean abierta) {
		super();
		this.ncaja = ncaja;
		this.abierta = abierta;
		this.clientes = new ArrayList<Cliente>();
	}

	public int getNcaja() {
		return ncaja;
	}

	public boolean isAbierta() {
		return abierta;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	
	public void addCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void removeCliente(Cliente cliente) {
		this.clientes.remove(cliente);
	}
	
	public Cliente encontrarCliente(int numeroCliente) {
		Cliente tmp=null;
		Iterator<Cliente> it = clientes.iterator();
		while(it.hasNext()) {
			Cliente Ctmp = it.next();
			if(Ctmp.getNumero()==numeroCliente) {
				tmp=Ctmp;
			}
		}
		
		return tmp;
	}
	
	public int numeroClientes() {
		return this.clientes.size();
	}

	public void setAbierta(boolean abierta) {
		this.abierta = abierta;
	}

	
}
