package main.java;

@SuppressWarnings("serial")
public class ClinicaException extends Exception {

	public ClinicaException() {
	}

	public ClinicaException(String message) {
		super(message);
	}

	public ClinicaException(Throwable cause) {
		super(cause);
	}

	public ClinicaException(String message, Throwable cause) {
		super(message, cause);
	}

	public ClinicaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
