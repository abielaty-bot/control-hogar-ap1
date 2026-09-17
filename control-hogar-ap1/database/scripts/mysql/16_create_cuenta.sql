-- =====================================================
-- CONTROL HOGAR
-- Script 16: creación de la tabla cuenta
-- =====================================================
USE controlhogar;

CREATE TABLE IF NOT EXISTS cuenta (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    usuario_id BIGINT NOT NULL,
    moneda_id BIGINT NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    tipo VARCHAR(20) NOT NULL DEFAULT 'EFECTIVO',
    saldo_actual DECIMAL(12, 2) NOT NULL DEFAULT 0,
    activo BOOLEAN NOT NULL DEFAULT TRUE,
    creado_en DATETIME NOT NULL,
    actualizado_en DATETIME NOT NULL,

    CONSTRAINT fk_cuenta_usuario
        FOREIGN KEY (usuario_id) REFERENCES usuario (id),

    CONSTRAINT fk_cuenta_moneda
        FOREIGN KEY (moneda_id) REFERENCES moneda (id)
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;
