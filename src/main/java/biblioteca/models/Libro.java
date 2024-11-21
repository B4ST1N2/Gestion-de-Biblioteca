package biblioteca.models;


public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isDisponible() {
        return disponible;
    }

    private void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean prestar() {
        if (disponible) {
            setDisponible(false);
            return true;
        }
        return false;
    }

    public void devolver() {
        setDisponible(true);
    }
}
