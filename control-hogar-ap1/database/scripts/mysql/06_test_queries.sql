-- =====================================================
-- CONTROL HOGAR
-- Script 06: consultas de verificación
-- =====================================================

USE controlhogar;

-- Verificar las tablas creadas
SHOW TABLES;

-- Consultar las categorías
SELECT * FROM categoria
ORDER BY id;

-- Consultar los movimientos
SELECT * FROM movimiento
ORDER BY fecha DESC, id DESC;

-- Consultar movimientos junto con su categoría
SELECT
    m.id,
    m.descripcion,
    m.monto,
    m.fecha,
    c.id AS categoria_id,
    c.nombre AS categoria_nombre
FROM movimiento m
LEFT JOIN categoria c
    ON m.categoria_id = c.id
ORDER BY m.fecha DESC, m.id DESC;