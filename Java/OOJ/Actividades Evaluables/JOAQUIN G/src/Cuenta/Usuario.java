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
		this.credencial.setPassword(password);
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
		if(hacerLogin(this.credencial.getUsername(), oldpass) && oldpass!=newpass && newpass==newpassverif) {
			modificar=true;
			this.credencial.setPassword(newpass);
		}
		return modificar;
	}
	
	public boolean esPasswordSegura() {
		return this.credencial.esPasswordSegura();
	}
	
	public boolean hacerLogin(String username,String password) {
		return this.credencial.getUsername()==username && this.credencial.comprobarPassword(password);
	}
	
	public String mostrarpassword(String password) {
		String codificar="";
		for(int i=0;i<password.length();i++){
			codificar+="*";
		}
		return codificar;
	}
	
	@Override
	public String toString() {
		String mensaje="Cuenta Bloqueada.";
		if(!esCuentaBloqueada())
			mensaje= "Uusuari@:"+ nombre + apellidos + " con email " + email + ",username:" + this.credencial.getUsername() + "y"
				+ "contraseña" + mostrarpassword(this.credencial.getPassword());
		return mensaje;
	}
}