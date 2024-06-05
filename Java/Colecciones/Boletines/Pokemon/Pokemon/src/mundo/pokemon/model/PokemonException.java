package mundo.pokemon.model;

public class PokemonException extends Exception {

	public PokemonException() {
	}

	public PokemonException(String message) {
		super(message);
	}

	public PokemonException(String message, Throwable cause) {
		super(message, cause);
	}
}
