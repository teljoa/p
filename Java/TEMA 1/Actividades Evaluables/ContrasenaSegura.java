package aparte;

public class ContrasenaSegura {
	
	public static <in> boolean segura(String contrasena) {
		boolean seguro = false;
		boolean numero=false;
		boolean mayuscula=false;
		boolean minuscula=false;
		boolean caracterE=false;
		boolean spacioN=false;
		String caracteres="~`! @#$%^&*()_-+={[}]|\\:;\"'<,>.?/";
		
		if(contrasena.length()>8) {
			for(int i=0;i<contrasena.length();i++) {
				if (Character.isDigit(contrasena.charAt(i)) && numero!=true){
					numero=true;
				}if(Character.isLowerCase(contrasena.charAt(i)) && minuscula!=true) {
					minuscula=true;
				}if(Character.isUpperCase(contrasena.charAt(i)) && mayuscula!=true) {
					mayuscula=true;
				}if(contrasena.charAt(i)==' ' && spacioN!=true){
					spacioN=true;
				}if(caracterE!=true) {
					for(int l=0;l<caracteres.length();l++) {
						if(contrasena.charAt(i)==caracteres.charAt(l)) {
							caracterE=true;
						}
					}
				}
			}seguro=numero==true && mayuscula==true && minuscula==true && caracterE==true && spacioN==false;
		}
		return seguro;
	}

	public static <Scanners> void main(String[] args) {
		/*Una contraseña se considera segura si reúne las siguientes características:

    	incluye letras y números

    	combina mayúsculas y minúsculas

    	incluye algún carácter especial de entre: ~`! @#$%^&*()_-+={[}]|\:;"'<,>.?/

    	posee una longitud de al menos 8 caracteres

    	no contiene ningún espacio en blanco.


		1.1. Crea una función denominada esPassSegura  que reciba como argumento una contraseña y devuelva si esta contraseña es segura o no.

		1.2 Prueba esta función en el método main con los casos de prueba que le den cobertura.
		*/
		
		String contrasena="djghsjkdhgjFksdh13214.";
		System.out.println("La contraseña es:"+segura(contrasena));
	}

}
