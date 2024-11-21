package biblioteca.models;


public class Usuario extends Persona {
    private int librosPrestados;

    public Usuario(String nombre, String apellido) {
        super(nombre, apellido);
        this.librosPrestados = 0;
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }

    public void incrementarPrestamos() {
        librosPrestados++;
    }

    public void decrementarPrestamos() {
        librosPrestados--;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Usuario: " + getNombre() + " " + getApellido() + ", Libros prestados: " + librosPrestados);
    }
}
