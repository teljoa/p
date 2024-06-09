package restaurante.model;

@SuppressWarnings("serial")
public class ServicioNoDisponibleException extends Exception {

	public ServicioNoDisponibleException() {
	}

	public ServicioNoDisponibleException(String message) {
		super(message);
	}
}
