package main.java;

@SuppressWarnings("serial")
public class VacunaException extends Exception {

	public VacunaException() {
	}

	public VacunaException(String message) {
		super(message);
	}

	public VacunaException(Throwable cause) {
		super(cause);
	}

	public VacunaException(String message, Throwable cause) {
		super(message, cause);
	}

	public VacunaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
