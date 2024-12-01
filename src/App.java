import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Mostrar menú principal
        System.out.println("Seleccione una opción:");
        System.out.println("1. Iniciar sesión");
        System.out.println("2. Registrar usuario");
        System.out.println("3. Recuperar contraseña");
        System.out.println("4. Cambiar contraseña");
        System.out.println("5. Cerrar sesión");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        switch (opcion) {
            case 1:
                iniciarSesion(scanner);
                break;
            case 2:
                registrarUsuario(scanner);
                break;
            case 3:
                recuperarContrasena(scanner);
                break;
            case 4:
                cambiarContrasena(scanner);
                break;
            case 5:
                cerrarSesion(scanner);
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }

    // Método para iniciar sesión
    public static void iniciarSesion(Scanner scanner) {
        String usuarioCorrecto = "usuario1";
        String contrasenaCorrecta = "1234";

        System.out.print("Ingrese su usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        if (usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecta)) {
            System.out.println("¡Inicio de sesión exitoso!");
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }
    }

    // Método para registrar un nuevo usuario
    public static void registrarUsuario(Scanner scanner) {
        System.out.print("Ingrese su nuevo nombre de usuario: ");
        String nuevoUsuario = scanner.nextLine();

        System.out.print("Ingrese su nueva contraseña: ");
        String nuevaContrasena = scanner.nextLine();

        System.out.println("¡Registro exitoso! Ahora puede iniciar sesión con su nuevo usuario.");
    }

    // Método para recuperar la contraseña
    public static void recuperarContrasena(Scanner scanner) {
        String correoRegistrado = "usuario@example.com";

        System.out.print("Ingrese su correo electrónico: ");
        String correo = scanner.nextLine();

        if (correo.equals(correoRegistrado)) {
            System.out.println("Se ha enviado un enlace para restablecer la contraseña a su correo.");
        } else {
            System.out.println("El correo no está registrado.");
        }
    }

    // Método para cambiar la contraseña
    public static void cambiarContrasena(Scanner scanner) {
        String usuarioCorrecto = "usuario1";
        String contrasenaCorrecta = "1234";

        System.out.print("Ingrese su usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Ingrese su contraseña actual: ");
        String contrasena = scanner.nextLine();

        if (usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecta)) {
            System.out.print("Ingrese su nueva contraseña: ");
            String nuevaContrasena = scanner.nextLine();
            System.out.println("Contraseña cambiada con éxito.");
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }
    }

    // Método para cerrar sesión
    public static void cerrarSesion(Scanner scanner) {
        String usuarioCorrecto = "usuario1";
        String contrasenaCorrecta = "1234";

        System.out.print("Ingrese su usuario: ");
        String usuario = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        if (usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecta)) {
            System.out.println("¡Bienvenido, " + usuario + "!");
            System.out.print("¿Desea cerrar sesión? (si/no): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("si")) {
                System.out.println("Sesión cerrada con éxito.");
            } else {
                System.out.println("Aún está conectado.");
            }
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }
    }
}
