package mundo.pokemon.model;

import java.util.Objects;
import java.util.Random;

public class Pokemon implements Comparable<Pokemon>{
	private String nombre;
	private Elemento elemento;
	protected int fuerza;
	private int nivel;
	
	public Pokemon(String nombre, Elemento elemento) {
		super();
		this.nombre = nombre;
		this.elemento = elemento;
		this.nivel=3;
		this.fuerza=obtenerFuerzaInicial();
	}
	
	public Pokemon luchar(Pokemon p1) {
		Pokemon perdedor=null;
		
		if(p1.fuerza<this.fuerza) {
			perdedor=p1;
			p1.evolucionarTrasBatalla(false);
			this.evolucionarTrasBatalla(true);
		}else {
			perdedor=this;
			this.evolucionarTrasBatalla(false);
			p1.evolucionarTrasBatalla(true);
		}
		
		return perdedor;
	}
	
	public void evolucionarTrasBatalla(boolean b) {
		if(b) {
			this.nivel++;
			this.fuerza+=10;
		}else {
			if(this.nivel>1 && this.fuerza>5 && this.fuerza-5>=5) {
				this.nivel--;
				this.fuerza-=5;
			}else if(this.nivel==1 && this.fuerza==5) {
				this.nivel=1;
				this.fuerza=5;
			}
		}
	}
	
	private int obtenerFuerzaInicial() {
		Random r=new Random();
		return r.nextInt(95)+5;
	}

	public String getNombre() {
		return nombre;
	}

	public Elemento getElemento() {
		return elemento;
	}

	public int compareTo(Pokemon p1) {
		return Integer.compare(this.fuerza, p1.fuerza);
	}

	@Override
	public int hashCode() {
		return Objects.hash(elemento, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		return obj==this || obj!=null && obj instanceof Pokemon && obj.hashCode()==this.hashCode();
	}
	
	@Override
	public String toString() {
		return "Nombre:" + nombre + ", tipo:" + elemento + ",nivel:" + nivel + ",fuerza:" + fuerza;
	}
}
