-- =====================================================
-- CONTROL HOGAR
-- Script 20: creación de la tabla aporte_meta
-- =====================================================
USE controlhogar;

CREATE TABLE IF NOT EXISTS aporte_meta (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    meta_ahorro_id BIGINT NOT NULL,
    monto DECIMAL(12, 2) NOT NULL,
    fecha DATE NOT NULL,
    creado_en DATETIME NOT NULL,

    CONSTRAINT chk_aporte_meta_monto CHECK (monto > 0),

    CONSTRAINT fk_aporte_meta_meta_ahorro
        FOREIGN KEY (meta_ahorro_id) REFERENCES meta_ahorro (id)
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;
