INSERT INTO Persona (nombre, apellido, tipo) VALUES
    ('Sebastián', 'Gómez', 'Usuario'),
    ('Ana', 'Pérez', 'Bibliotecario'),
    ('Laura', 'Martínez', 'Usuario'),
    ('Carlos', 'Ruiz', 'Usuario'),
    ('Marta', 'López', 'Bibliotecario');

INSERT INTO Usuario (id, prestamos) VALUES
    (1, 0),
    (3, 1),
    (4, 2);

INSERT INTO Bibliotecario (id) VALUES
    (2),
    (5);

INSERT INTO Libro (titulo, autor, isbn, disponible) VALUES
    ('El Quijote', 'Cervantes', '1234', TRUE),
    ('1984', 'Orwell', '5678', TRUE),
    ('La Odisea', 'Homero', '9101', FALSE),
    ('Hamlet', 'Shakespeare', '1123', TRUE),
    ('Don Juan Tenorio', 'Zorrilla', '3141', TRUE);

INSERT INTO Prestamo (libro_id, usuario_id, fecha_prestamo, fecha_devolucion) VALUES
    (3, 4, '2024-11-01', NULL);
