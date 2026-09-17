-- =====================================================
-- CONTROL HOGAR
-- Script 09: creación de la tabla usuario
-- =====================================================
USE controlhogar;

CREATE TABLE
    IF NOT EXISTS usuario (
        id BIGINT AUTO_INCREMENT PRIMARY KEY,
        nombres VARCHAR(100) NOT NULL,
        apellido_paterno VARCHAR(80) NOT NULL,
        apellido_materno VARCHAR(80) NULL,
        correo VARCHAR(150) NOT NULL,
        telefono VARCHAR(20) NULL,
        password_hash VARCHAR(255) NOT NULL,
        activo BOOLEAN NOT NULL DEFAULT TRUE,
        creado_en DATETIME NOT NULL,
        actualizado_en DATETIME NOT NULL,
        CONSTRAINT uq_usuario_correo UNIQUE (correo)
    ) ENGINE = InnoDB CHARACTER
SET
    = utf8mb4 COLLATE = utf8mb4_unicode_ci;

