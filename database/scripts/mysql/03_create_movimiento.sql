-- =====================================================
-- CONTROL HOGAR
-- Script 03: creación de la tabla movimiento
-- =====================================================

USE controlhogar;

CREATE TABLE IF NOT EXISTS movimiento (
    id BIGINT NOT NULL AUTO_INCREMENT,
    descripcion VARCHAR(200),
    monto DECIMAL(12,2) NOT NULL,
    fecha DATE NOT NULL,
    categoria_id BIGINT,

    PRIMARY KEY (id),

    CONSTRAINT chk_movimiento_monto
        CHECK (monto > 0)
) ENGINE=InnoDB;