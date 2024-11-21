package biblioteca;



import biblioteca.models.Libro;
import biblioteca.services.LibroService;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        LibroService libroService = new LibroService();

        try {
            // Agregar un libro
            Libro nuevoLibro = new Libro("Cien Años de Soledad", "García Márquez", "9876");
            libroService.agregarLibro(nuevoLibro);

            // Actualizar un libro
            libroService.actualizarLibro(1, "El Quijote (Edición Revisada)");

            // Eliminar un libro
            libroService.eliminarLibro(5);

            System.out.println("Operaciones de biblioteca completadas con éxito.");
        } catch (SQLException e) {
            System.err.println("Error en la operación: " + e.getMessage());
        }
    }
}
