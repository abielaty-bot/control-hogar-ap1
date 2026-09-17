-- =====================================================
-- CONTROL HOGAR
-- Script 24: creación de la tabla etiqueta
-- =====================================================
USE controlhogar;

CREATE TABLE IF NOT EXISTS etiqueta (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    usuario_id BIGINT NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    color VARCHAR(7) NULL,
    creado_en DATETIME NOT NULL,

    CONSTRAINT uq_etiqueta_usuario_nombre UNIQUE (usuario_id, nombre),

    CONSTRAINT fk_etiqueta_usuario
        FOREIGN KEY (usuario_id) REFERENCES usuario (id)
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;
