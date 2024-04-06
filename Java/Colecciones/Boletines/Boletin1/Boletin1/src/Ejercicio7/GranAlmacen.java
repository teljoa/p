package Ejercicio7;

import java.util.ArrayList;

public class GranAlmacen {
	private Caja[] cajas;
	private ArrayList<Cliente> clientes;
	
	public GranAlmacen() {
		super();
		this.cajas =new  Caja[20];
		this.clientes =new ArrayList<Cliente>();
	}
	
	public void abrircaja(int ncaja) throws Exception {
		for(Caja a:this.cajas) {
			if(a.getNcaja()==ncaja && !a.isAbierta()) {
				a.setAbierta(true);
			}else if(a.getNcaja()==ncaja && a.isAbierta()){
				throw new Exception("Esta caja ya esta abierta.");
			}
		}
	}
	
	public void cerrarcaja(int ncaja) throws Exception {
		for(Caja a:this.cajas) {
			if(a.getNcaja()==ncaja && a.isAbierta()) {
				a.setAbierta(false);
			}else if(a.getNcaja()==ncaja && !a.isAbierta()){
				throw new Exception("Esta caja ya esta cerrada.");
			}
		}
	}
	
	public String asignarNuevoCliente(Cliente a) {
		Cliente tmp = new Cliente();
		cajas[0].addCliente(tmp);
		
		return "Es uste el cliente numero "+tmp.getNumero()+" y debe ir a la caja numero "+cajas[0].getNcaja();
	}
	
	public String atenderCliente(int ncaja) {
		int tmp = buscarPosicionCaja(ncaja);
		String mensaje="";
		if(tmp!=-1 && cajas[tmp].numeroClientes()!=0) {
			mensaje="Se ha atendido al cliente con numero "+cajas[tmp].clientes.get(0).getNumero();
			cajas[tmp].clientes.remove(0);
		}else if(tmp==-1) {
			mensaje="Caja cerrada";
		}else {
			mensaje="No hay clientes";
		}
		
		return mensaje;
	}
	
	public int buscarPosicionCaja(int numeroCaja) {
		int posicion =-1;
		boolean encontrada=false;
		for(int i=0; i<cajas.length && !encontrada; i++) {
			if(cajas[i]!=null && cajas[i].getNcaja()==numeroCaja) {
				posicion=i;
				encontrada=true;
			}
		}
		
		return posicion;
	}
	
	public Caja[] getCajas() {
		return cajas;
	}

	public void setCajas(Caja[] cajas) {
		this.cajas = cajas;
	}



	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
}
