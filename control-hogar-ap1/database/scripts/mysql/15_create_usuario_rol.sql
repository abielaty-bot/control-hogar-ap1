-- =====================================================
-- CONTROL HOGAR
-- Script 15: creación de la tabla usuario_rol
-- =====================================================
USE controlhogar;

CREATE TABLE IF NOT EXISTS usuario_rol (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    usuario_id BIGINT NOT NULL,
    rol_id BIGINT NOT NULL,
    asignado_en DATETIME NOT NULL,

    CONSTRAINT uq_usuario_rol UNIQUE (usuario_id, rol_id),

    CONSTRAINT fk_usuario_rol_usuario
        FOREIGN KEY (usuario_id) REFERENCES usuario (id),

    CONSTRAINT fk_usuario_rol_rol
        FOREIGN KEY (rol_id) REFERENCES rol (id)
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;
