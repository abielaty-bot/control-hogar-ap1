-- =====================================================
-- CONTROL HOGAR
-- Script 07: actualización de la tabla categoria
-- =====================================================

USE controlhogar;

ALTER TABLE categoria
    ADD COLUMN descripcion VARCHAR(255) NULL AFTER nombre,
    ADD COLUMN activo BOOLEAN NOT NULL DEFAULT TRUE AFTER descripcion,
    ADD COLUMN creado_en DATETIME NOT NULL
        DEFAULT CURRENT_TIMESTAMP AFTER activo,
    ADD COLUMN actualizado_en DATETIME NOT NULL
        DEFAULT CURRENT_TIMESTAMP
        ON UPDATE CURRENT_TIMESTAMP AFTER creado_en;