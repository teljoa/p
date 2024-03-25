package Cuenta;

public class Credencial {
	
	private String username;
	private String password;
	private static int secuencia=100;
	
	public Credencial(String nombre,String apellidos,String password) {
		super();
		this.username=nombre.substring(-3, 0) + apellidos.substring(0, 3) + secuencia++;
		setPassword(password);
	}
	
	public boolean comprobarPassword(String password) {
		return this.password.equals(password);
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
	
	public String mostrarpassword() {
		String codificar="";
		for(int i=0;i<this.password.length();i++){
			codificar+="*";
		}
		return codificar;
	}
	
	public Usuario buscarUsuarioPorUsername(Usuario[] usuarios, String username) {
        for (Usuario usuario : usuarios) {
            if (usuario != null && usuario.hacerLogin(username, this.password)) {
                return usuario;
            }
        }
        return null;
    }

	@Override
	public String toString() {
		return ", username:" + this.username + " y contraseña:" + mostrarpassword();
	}
	
	
}
