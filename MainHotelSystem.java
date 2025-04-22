import java.util.*;

public class MainHotelSystem {
    public static void main(String[] args) {
        // Colecciones para almacenar objetos
        List<Usuario> usuarios = new ArrayList<>();
        List<Producto> productos = new ArrayList<>();
        List<Visitante> visitantes = new ArrayList<>();

        try {
            // Agregando usuarios
            usuarios.add(new Usuario("Carlos", "Recepcionista", 1));
            usuarios.add(new Usuario("Lucía", "Administrador", 2));

            // Agregando productos
            productos.add(new Producto("Agua", 1.5, 10));
            productos.add(new Producto("Cerveza", 3.0, 5));

            // Agregando visitantes
            visitantes.add(new Visitante("Pedro"));
            visitantes.add(new Visitante("Ana", "102"));

            // Mostrar usuarios
            for (Usuario u : usuarios) {
                u.mostrarInfo(true);
            }

            // Mostrar productos


            for (Producto p : productos) {
                p.mostrarProducto();
            }

            // Actualizar stock
            productos.get(0).actualizarStock(-2);

            // Mostrar visitantes
            for (Visitante v : visitantes) {
                v.mostrarDatos();
            }

        } catch (Exception e) {
            System.out.println("Error al procesar información: " + e.getMessage());
        }
    }
}
