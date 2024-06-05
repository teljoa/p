package main.java.model.exception;

public class FerrocarrilesException extends Exception {

	public FerrocarrilesException() {
	}

	public FerrocarrilesException(String message) {
		super(message);
	}

	public FerrocarrilesException(Throwable cause) {
		super(cause);
	}

	public FerrocarrilesException(String message, Throwable cause) {
		super(message, cause);
	}

	public FerrocarrilesException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
