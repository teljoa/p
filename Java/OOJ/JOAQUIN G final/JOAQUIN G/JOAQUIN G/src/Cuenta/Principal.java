package Cuenta;

public class Principal {

    public static void main(String[] args) {

        Usuario[] usuarios = new Usuario[10];
        usuarios[0] = new Usuario("Juan", "Perez", "juanperez@example.com", "Password123");
        usuarios[1] = new Usuario("Maria", "Lopez", "marialopez@example.com", "SecurePass789");
        
        System.out.println("Información de todos los usuarios:");
        mostrarInformacionUsuarios(usuarios);
    }

    private static void mostrarInformacionUsuarios(Usuario[] usuarios) {
        for (Usuario usuario : usuarios) {
            if (usuario != null) {
                System.out.println(usuario);
            }
        }
    }

}

