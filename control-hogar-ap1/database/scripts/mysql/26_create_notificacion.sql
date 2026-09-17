-- =====================================================
-- CONTROL HOGAR
-- Script 26: creación de la tabla notificacion
-- =====================================================
USE controlhogar;

CREATE TABLE IF NOT EXISTS notificacion (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    usuario_id BIGINT NOT NULL,
    titulo VARCHAR(100) NOT NULL,
    mensaje VARCHAR(255) NULL,
    leido BOOLEAN NOT NULL DEFAULT FALSE,
    creado_en DATETIME NOT NULL,

    CONSTRAINT fk_notificacion_usuario
        FOREIGN KEY (usuario_id) REFERENCES usuario (id)
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;
