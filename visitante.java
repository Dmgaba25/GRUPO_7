import java.util.HashMap;

public class Visitante {
    private String nombre;
    private String habitacion;

    // Sobrecarga de constructores
    public Visitante(String nombre) {
        this.nombre = nombre;
        this.habitacion = "No asignada";
    }

    public Visitante(String nombre, String habitacion) {
        this.nombre = nombre;
        this.habitacion = habitacion;
    }

    public void mostrarDatos() {
        System.out.println("Visitante: " + nombre + " - Habitación: " + habitacion);
    }
}
