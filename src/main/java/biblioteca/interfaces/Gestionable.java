package biblioteca.interfaces;


import biblioteca.models.Libro;
import biblioteca.models.Usuario;

public interface Gestionable {
    void prestarLibro(Libro libro, Usuario usuario);
    void devolverLibro(Libro libro, Usuario usuario);
}
