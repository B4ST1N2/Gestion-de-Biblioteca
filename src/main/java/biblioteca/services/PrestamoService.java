package biblioteca.services;


import biblioteca.conexion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrestamoService {
    public void registrarPrestamo(int libroId, int usuarioId) throws SQLException {
        String sql = "INSERT INTO Prestamo (libro_id, usuario_id, fecha_prestamo) VALUES (?, ?, CURDATE())";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, libroId);
            stmt.setInt(2, usuarioId);
            stmt.executeUpdate();
        }
    }

    public void registrarDevolucion(int prestamoId) throws SQLException {
        String sql = "UPDATE Prestamo SET fecha_devolucion = CURDATE() WHERE id = ?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, prestamoId);
            stmt.executeUpdate();
        }
    }
}
