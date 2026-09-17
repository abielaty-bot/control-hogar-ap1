-- =====================================================
-- CONTROL HOGAR
-- Script 11: creación de la tabla tienda
-- =====================================================

USE controlhogar;

CREATE TABLE IF NOT EXISTS tienda (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    usuario_id BIGINT NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(255) NULL,
    activo BOOLEAN NOT NULL DEFAULT TRUE,
    creado_en DATETIME NOT NULL,
    actualizado_en DATETIME NOT NULL,

    CONSTRAINT uq_tienda_usuario_nombre
        UNIQUE (usuario_id, nombre),

    CONSTRAINT fk_tienda_usuario
        FOREIGN KEY (usuario_id)
        REFERENCES usuario (id)
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;