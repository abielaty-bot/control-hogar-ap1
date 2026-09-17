-- =====================================================
-- CONTROL HOGAR
-- Script 22: creación de la tabla pago_deuda
-- =====================================================
USE controlhogar;

CREATE TABLE IF NOT EXISTS pago_deuda (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    deuda_id BIGINT NOT NULL,
    monto DECIMAL(12, 2) NOT NULL,
    fecha DATE NOT NULL,
    creado_en DATETIME NOT NULL,

    CONSTRAINT chk_pago_deuda_monto CHECK (monto > 0),

    CONSTRAINT fk_pago_deuda_deuda
        FOREIGN KEY (deuda_id) REFERENCES deuda (id)
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;
