package restaurante.model;

@SuppressWarnings("serial")
public class ClienteNoExistenteException extends Exception {

	public ClienteNoExistenteException() {
	}

	public ClienteNoExistenteException(String message) {
		super(message);
	}
}
