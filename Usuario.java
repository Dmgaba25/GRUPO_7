import java.util.HashMap;

public class Usuario {
    private String nombre;
    private String rol;
    private int id;

    // Constructor
    public Usuario(String nombre, String rol, int id) {
        this.nombre = nombre;
        this.rol = rol;
        this.id = id;
    }

    // Sobrecarga de método para mostrar información
    public void mostrarInfo() {
        System.out.println("Usuario: " + nombre + " - Rol: " + rol);
    }

    public void mostrarInfo(boolean mostrarID) {
        if (mostrarID) {
            System.out.println("Usuario: " + nombre + " - Rol: " + rol + " - ID: " + id);
        } else {
            mostrarInfo();
        }
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
