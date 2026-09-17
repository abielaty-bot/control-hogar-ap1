-- =====================================================
-- CONTROL HOGAR
-- Script 14: creación de la tabla rol
-- =====================================================
USE controlhogar;

CREATE TABLE IF NOT EXISTS rol (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    descripcion VARCHAR(255) NULL,
    creado_en DATETIME NOT NULL,

    CONSTRAINT uq_rol_nombre UNIQUE (nombre)
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;
