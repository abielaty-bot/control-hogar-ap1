-- =====================================================
-- CONTROL HOGAR
-- Script 12: creación de la tabla moneda
-- =====================================================
USE controlhogar;

CREATE TABLE IF NOT EXISTS moneda (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    codigo VARCHAR(10) NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    simbolo VARCHAR(5) NULL,
    activo BOOLEAN NOT NULL DEFAULT TRUE,

    CONSTRAINT uq_moneda_codigo UNIQUE (codigo)
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;
