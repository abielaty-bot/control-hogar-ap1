-- =====================================================
-- CONTROL HOGAR
-- Script 04: creación de claves foráneas
-- =====================================================

USE controlhogar;

ALTER TABLE movimiento
ADD CONSTRAINT fk_movimiento_categoria
    FOREIGN KEY (categoria_id)
    REFERENCES categoria(id)
    ON UPDATE CASCADE
    ON DELETE RESTRICT;