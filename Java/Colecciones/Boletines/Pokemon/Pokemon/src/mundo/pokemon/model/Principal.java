package mundo.pokemon.model;

public class Principal {

	public static void main(String[] args) {
		 // Crear algunos entrenadores
        Entrenador ash = new Entrenador("Ash");
        Entrenador rock = new Entrenador("Rock");
        Entrenador misty = new Entrenador("Misty"); 

        // Crear algunos Pokémon
        Pokemon pikachu = new Pokemon("Pikachu", Elemento.ELECTRICO);
        Pokemon charmander = new Pokemon("Charmander", Elemento.FUEGO);
        Pokemon squirtle = new Pokemon("Squirtle", Elemento.AGUA);
        Pokemon bulbasaur = new Pokemon("Bulbasaur", Elemento.PLANTA);

        // Agregar Pokémon a los entrenadores
        ash.addPokemon(pikachu);
        ash.addPokemon(charmander);
        rock.addPokemon(squirtle);
        rock.addPokemon(bulbasaur);

        // Mostrar los Pokémon de cada entrenador
        System.out.println("Pokémon de Ash:");
        System.out.println(ash.mostrarPokemons());
        System.out.println("Pokémon de Rock:");
        System.out.println(rock.mostrarPokemons());

        // Competir entre entrenadores
        try {
            ash.competir(rock);
            System.out.println("Después de la competencia:");
            System.out.println("Pokémon de Ash:");
            System.out.println(ash.mostrarPokemons());
            System.out.println("Pokémon de Rock:");
            System.out.println(rock.mostrarPokemons());
        } catch (PokemonException e) {
            System.out.println("No se pudo competir porque uno de los entrenadores no tiene Pokémon.");
        }

        // Intentar donar Pokémon entre entrenadores.
        if (ash.donar(rock)) {
            System.out.println("Ash donó sus Pokémon a Rock:");
            System.out.println("Pokémon de Ash:");
            System.out.println(ash.mostrarPokemons());
            System.out.println("Pokémon de Rock:");
            System.out.println(rock.mostrarPokemons());
        } else {
            System.out.println("La donación no fue posible.");
        // Intentar donar Pokémon entre entrenadores.
        }
        if (ash.donar(misty)) {
            System.out.println("Ash donó sus Pokémon a Misty:");
            System.out.println("Pokémon de Ash:");
            System.out.println(ash.mostrarPokemons());
            System.out.println("Pokémon de Mysty:");
            System.out.println(misty.mostrarPokemons());
        } else {
            System.out.println("La donación no fue posible.");
        }

	}

}
