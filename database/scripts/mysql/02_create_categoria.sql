-- =====================================================
-- CONTROL HOGAR
-- Script 02: creación de la tabla categoria
-- =====================================================

USE controlhogar;

CREATE TABLE IF NOT EXISTS categoria (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(80) NOT NULL,

    PRIMARY KEY (id),
    CONSTRAINT uq_categoria_nombre UNIQUE (nombre),
    CONSTRAINT chk_categoria_nombre
        CHECK (CHAR_LENGTH(TRIM(nombre)) > 0)
) ENGINE=InnoDB;