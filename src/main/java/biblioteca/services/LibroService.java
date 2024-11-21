package biblioteca.services;


import biblioteca.conexion.Conexion;
import biblioteca.models.Libro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LibroService {
    public void agregarLibro(Libro libro) throws SQLException {
        String sql = "INSERT INTO Libro (titulo, autor, isbn, disponible) VALUES (?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, libro.getTitulo());
            stmt.setString(2, libro.getAutor());
            stmt.setString(3, libro.getIsbn());
            stmt.setBoolean(4, libro.isDisponible());
            stmt.executeUpdate();
        }
    }

    public void actualizarLibro(int id, String nuevoTitulo) throws SQLException {
        String sql = "UPDATE Libro SET titulo = ? WHERE id = ?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nuevoTitulo);
            stmt.setInt(2, id);
            stmt.executeUpdate();
        }
    }

    public void eliminarLibro(int id) throws SQLException {
        String sql = "DELETE FROM Libro WHERE id = ?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
