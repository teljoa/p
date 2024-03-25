package Cuenta;

public class Usuario {
	private String nombre;
	private String apellidos;
	private String email;
	private int intentos;
	private Credencial credencial;
	
	public Usuario(String nombre,String apellidos, String password) {
		super();
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.credencial=new Credencial(nombre,apellidos,password);
	}
	
	public Usuario(String nombre,String apellidos,String email, String password) {
		this(nombre,apellidos,password);
		this.email=email;
	}
	
	public boolean esCuentaBloqueada() {
		return intentos>2;
	}

	private void setCredencial(Credencial credencial) {
		this.credencial = credencial;
	}
	
	public boolean modificarPassworl(String oldpass, String newpass, String newpassverif) {
		boolean modificar=false;
		if(hacerLogin(this.credencial.getUsername(), oldpass) && !oldpass.equals(newpass) && newpass.equals(newpassverif) && !esCuentaBloqueada()) {
			modificar=true;
			this.credencial.setPassword(newpass);
		}
		return modificar;
	}
	
	public boolean esPasswordSegura() {
		return this.credencial.esPasswordSegura();
	}
	
	public boolean hacerLogin(String username,String password) {
		boolean login=false;
		if(this.credencial.getUsername().equals(username) && this.credencial.comprobarPassword(password) && esCuentaBloqueada()) {
			login=true;
			this.intentos=0;
		}else {
			this.intentos++;
		}
		
		return login;
	}
	
	
	@Override
	public String toString() {
		String mensaje="Cuenta bloqueada.";
		if(!esCuentaBloqueada())
			mensaje= "Uusuari@:"+ nombre + apellidos + " con email " + email + this.credencial.toString();
		return mensaje;
	}
}