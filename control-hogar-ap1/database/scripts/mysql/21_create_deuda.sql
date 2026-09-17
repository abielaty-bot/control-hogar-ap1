-- =====================================================
-- CONTROL HOGAR
-- Script 21: creación de la tabla deuda
-- =====================================================
USE controlhogar;

CREATE TABLE IF NOT EXISTS deuda (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    usuario_id BIGINT NOT NULL,
    acreedor VARCHAR(100) NOT NULL,
    monto_total DECIMAL(12, 2) NOT NULL,
    saldo_pendiente DECIMAL(12, 2) NOT NULL,
    tasa_interes DECIMAL(5, 2) NULL,
    fecha_inicio DATE NOT NULL,
    fecha_vencimiento DATE NULL,
    activo BOOLEAN NOT NULL DEFAULT TRUE,
    creado_en DATETIME NOT NULL,
    actualizado_en DATETIME NOT NULL,

    CONSTRAINT chk_deuda_monto CHECK (monto_total > 0),

    CONSTRAINT fk_deuda_usuario
        FOREIGN KEY (usuario_id) REFERENCES usuario (id)
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;
