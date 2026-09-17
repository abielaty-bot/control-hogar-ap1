-- =====================================================
-- CONTROL HOGAR
-- Script 25: creación de la tabla movimiento_etiqueta
-- =====================================================
USE controlhogar;

CREATE TABLE IF NOT EXISTS movimiento_etiqueta (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    movimiento_id BIGINT NOT NULL,
    etiqueta_id BIGINT NOT NULL,

    CONSTRAINT uq_movimiento_etiqueta UNIQUE (movimiento_id, etiqueta_id),

    CONSTRAINT fk_movimiento_etiqueta_movimiento
        FOREIGN KEY (movimiento_id) REFERENCES movimiento (id),

    CONSTRAINT fk_movimiento_etiqueta_etiqueta
        FOREIGN KEY (etiqueta_id) REFERENCES etiqueta (id)
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;
