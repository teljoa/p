package Ejercicios;

import java.time.LocalDate;
import java.util.Objects;

public class Producto {
	private String ci;
	private String nombre;
	private String descripcion;
	private LocalDate fAlta;
	private LocalDate fPublico;
	private LocalDate fBaja;
	
	public Producto(String ci, String nombre, String descripcion, LocalDate fAlta, LocalDate fPublico,
			LocalDate fBaja) {
		super();
		this.ci = ci;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fAlta = fAlta;
		this.fPublico = fPublico;
		this.fBaja = fBaja;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getfAlta() {
		return fAlta;
	}

	public void setfAlta(LocalDate fAlta) {
		this.fAlta = fAlta;
	}

	public LocalDate getfPublico() {
		return fPublico;
	}

	public void setfPublico(LocalDate fPublico) {
		this.fPublico = fPublico;
	}

	public LocalDate getfBaja() {
		return fBaja;
	}

	public void setfBaja(LocalDate fBaja) {
		this.fBaja = fBaja;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ci, descripcion, fAlta, fBaja, fPublico, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(ci, other.ci) && Objects.equals(descripcion, other.descripcion)
				&& Objects.equals(fAlta, other.fAlta) && Objects.equals(fBaja, other.fBaja)
				&& Objects.equals(fPublico, other.fPublico) && Objects.equals(nombre, other.nombre);
	}
}
