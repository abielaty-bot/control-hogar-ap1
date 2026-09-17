-- =====================================================
-- CONTROL HOGAR
-- Script 19: creación de la tabla meta_ahorro
-- =====================================================
USE controlhogar;

CREATE TABLE IF NOT EXISTS meta_ahorro (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    usuario_id BIGINT NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    monto_objetivo DECIMAL(12, 2) NOT NULL,
    monto_actual DECIMAL(12, 2) NOT NULL DEFAULT 0,
    fecha_objetivo DATE NULL,
    activo BOOLEAN NOT NULL DEFAULT TRUE,
    creado_en DATETIME NOT NULL,
    actualizado_en DATETIME NOT NULL,

    CONSTRAINT chk_meta_ahorro_objetivo CHECK (monto_objetivo > 0),

    CONSTRAINT fk_meta_ahorro_usuario
        FOREIGN KEY (usuario_id) REFERENCES usuario (id)
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;
