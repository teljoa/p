package main.java.model.exception;

@SuppressWarnings("serial")
public class JugadorException extends Exception {

	public JugadorException() {
	}

	public JugadorException(String message) {
		super(message);
	}

	public JugadorException(Throwable cause) {
		super(cause);
	}
}
