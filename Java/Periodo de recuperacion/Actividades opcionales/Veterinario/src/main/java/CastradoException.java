package main.java;

@SuppressWarnings("serial")
public class CastradoException extends Exception {

	public CastradoException() {
	}

	public CastradoException(String message) {
		super(message);
	}

	public CastradoException(Throwable cause) {
		super(cause);
	}

	public CastradoException(String message, Throwable cause) {
		super(message, cause);
	}

	public CastradoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
