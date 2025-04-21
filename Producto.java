import java.util.HashMap;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Sobrecarga para actualizar stock
    public void actualizarStock(int cantidad) {
        this.stock += cantidad;
    }

    public void actualizarStock() {
        this.stock = 0; // Reiniciar stock
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " - Precio: $" + precio + " - Stock: " + stock);
    }

    public String getNombre() {
        return nombre;
    }
}
