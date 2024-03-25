package Cuenta;

public class Credencial {
	
	private String username;
	private String password;
	private int secuencia;
	
	public Credencial(String nombre,String apellidos,String password) {
		super();
		this.username=nombre.charAt(-1)+nombre.charAt(-2)+nombre.charAt(-3)+apellidos.charAt(0)+apellidos.charAt(1)+apellidos.charAt(2)+String.valueOf(this.secuencia);
		this.secuencia=100;
		this.password=password;
		secuencia++;
	}
	
	public boolean comprobarPassword(String password) {
		return this.password==password;
	}

	public String getUsername() {
		return username;
	}
	
	public boolean esPasswordSegura() {
		boolean segura=false;
		boolean mayuscula=false;
		boolean digito=false;
		int i=0;
		
		if(this.password.length()>8) {
			while((i<this.password.length()) || (mayuscula && digito)) {
				if(Character.isUpperCase(this.password.charAt(i))) {
					mayuscula=true;
				}else if(Character.isDigit(this.password.charAt(i))) {
					digito=true;
				}
				i++;
			}
			if(mayuscula && digito) {
				segura=true;
			}
		}
		return segura;
	}

	public void setPassword(String newpass) {
		this.password = newpass;
	}

	public String getPassword() {
		return password;
	}
	
	
}
