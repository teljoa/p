package mundo.pokemon.model;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Entrenador {
	private String nombre;
	private int batallasGanadas;
	private Set<Pokemon> pokemons;
	
	public Entrenador(String nombre) {
		super();
		this.nombre = nombre;
		this.batallasGanadas=0;
		this.pokemons=new TreeSet<Pokemon>();
	}
	
	public void competir(Entrenador e1) throws PokemonException {
		Pokemon p1=e1.obtenerMasFuerte();
		Pokemon p2=obtenerMasFuerte();
		Pokemon perdedor=p1.luchar(p2);
		if(e1.pokemons.contains(perdedor)) {
			e1.eliminarPokemons(perdedor);
			this.addPokemon(perdedor);
			this.batallasGanadas++;
		}else if(this.pokemons.contains(perdedor)) {
			this.eliminarPokemons(perdedor);
			e1.addPokemon(perdedor);
			e1.batallasGanadas++;
		}
	}
	
	public boolean addPokemon(Pokemon p1) {
		boolean res=false;
		
		if(!this.pokemons.contains(p1)) {
			res=true;
			this.pokemons.add(p1);
		}
		
		return res;
	}
	
	public boolean eliminarPokemons(Pokemon p1) {
		boolean res=false;
		
		if(this.pokemons.contains(p1)) {
			res=true;
			this.pokemons.remove(p1);
		}
		
		return res;
	}
	
	public boolean eliminarPokemons(String n1,Elemento e1) {
		return eliminarPokemons(new Pokemon(n1, e1));
	}
	
	public void vaciar() {
		this.pokemons.clear();
	}
	
	protected Pokemon obtenerMasFuerte() throws PokemonException {
		if (pokemons.isEmpty()) {
            throw new PokemonException();
        }
        return ((TreeSet<Pokemon>) pokemons).last();
    }
	
	public boolean donar(Entrenador p1) {
		boolean res=false;
		
		if (this.pokemons.isEmpty() || p1.pokemons.isEmpty()) {
            p1.pokemons.addAll(this.pokemons);
            vaciar();
            res=true;
        } else {
            System.out.println("No se puede donar si ambos entrenadores tienen Pokémon en común.");
        }
		
		return res;
	}
	
	public String mostrarPokemons() {
		Map<Elemento,TreeSet<Pokemon>> pokemonsM=new TreeMap<Elemento, TreeSet<Pokemon>>();
		StringBuilder sb=new StringBuilder();
		
		for(Pokemon p:this.pokemons) {
			if(!pokemonsM.containsKey(p.getElemento())) {
				pokemonsM.put(p.getElemento(), new TreeSet<Pokemon>());
			}
			pokemonsM.get(p.getElemento()).add(p);
		}
		
		for(Elemento e:pokemonsM.keySet()) {
			sb.append("Los pokemons que tengo de tipo:" + e + ",son:" + pokemonsM.get(e)).append("\n"); 
		}
		
		return sb.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, pokemons);
	}

	@Override
	public boolean equals(Object obj) {
		return obj==this || obj!=null && obj instanceof Entrenador && obj.hashCode()==this.hashCode();
	}

	@Override
	public String toString() {
		return "Entrenador:"+ this.nombre + ", batallas ganadas:" + this.batallasGanadas + ", equipo pokemon formado por:" + this.pokemons;
	}
	
}
