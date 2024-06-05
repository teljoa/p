package main.java.exception;

@SuppressWarnings("serial")
public class HowagwartsException extends Exception {

	public HowagwartsException() {
	}

	public HowagwartsException(String message) {
		super(message);
	}

	public HowagwartsException(String message, Throwable cause) {
		super(message, cause);
	}
}
