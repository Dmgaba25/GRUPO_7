import java.util.HashMap;

public class Login {
    private HashMap<String, String> usuariosRegistrados;

    public Login() {
        usuariosRegistrados = new HashMap<>();
        usuariosRegistrados.put("admin", "1234");
        usuariosRegistrados.put("empleado1", "pass123");
        usuariosRegistrados.put("empleado2", "abc");
    }

    // Sobrecarga 1: login con usuario y contraseña
    public boolean login(String usuario, String clave) {
        try {
            if (!usuariosRegistrados.containsKey(usuario)) {
                throw new Exception("Usuario no encontrado");
            }
            return usuariosRegistrados.get(usuario).equals(clave);
        } catch (Exception e) {
            System.out.println("Error en login: " + e.getMessage());
            return false;
        }
    }

    // Sobrecarga 2: login con token simulado
    public boolean login(String token) {
        return token.startsWith("valid-");
    }

    // Mostrar usuarios registrados
    public void mostrarUsuarios() {
        System.out.println("Usuarios registrados:");
        for (String user : usuariosRegistrados.keySet()) {
            System.out.println("- " + user);
        }
    }
}
