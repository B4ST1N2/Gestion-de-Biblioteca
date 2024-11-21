package biblioteca.models;


import biblioteca.interfaces.Gestionable;

public class Bibliotecario extends Persona implements Gestionable {
    public Bibliotecario(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public void prestarLibro(Libro libro, Usuario usuario) {
        if (usuario.getLibrosPrestados() >= 3) {
            System.out.println("El usuario ya tiene el máximo de libros prestados.");
            return;
        }
        if (libro.prestar()) {
            usuario.incrementarPrestamos();
            System.out.println("Libro prestado exitosamente.");
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    @Override
    public void devolverLibro(Libro libro, Usuario usuario) {
        libro.devolver();
        usuario.decrementarPrestamos();
        System.out.println("Libro devuelto exitosamente.");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Bibliotecario: " + getNombre() + " " + getApellido());
    }
}
