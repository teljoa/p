package Ejercicio3;

import java.util.Objects;

public class Usuario {
	private String nombre;
	private String correoElectronico;
	private String clave;
	private boolean premium;
	
	public Usuario(String nombre, String correoElectronico, String clave, boolean premium) {
		super();
		this.nombre = nombre;
		this.correoElectronico = correoElectronico;
		this.clave = clave;
		this.premium = premium;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public boolean isPremium() {
		return premium;
	}

	public void setPremium(boolean premium) {
		this.premium = premium;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(clave, other.clave) && Objects.equals(correoElectronico, other.correoElectronico)
				&& Objects.equals(nombre, other.nombre) && premium == other.premium;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", correoElectronico=" + correoElectronico + ", clave=" + clave
				+ ", premium=" + premium + "]";
	}
	
	
}
