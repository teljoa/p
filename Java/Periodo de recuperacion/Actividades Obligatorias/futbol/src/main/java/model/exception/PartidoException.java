package main.java.model.exception;

@SuppressWarnings("serial")
public class PartidoException extends Exception {

	public PartidoException() {
	}

	public PartidoException(String message) {
		super(message);
	}

	public PartidoException(Throwable cause) {
		super(cause);
	}
}
