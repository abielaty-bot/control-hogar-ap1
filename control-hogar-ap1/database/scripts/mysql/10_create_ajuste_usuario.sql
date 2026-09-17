-- =====================================================
-- CONTROL HOGAR
-- Script 10: creación de la tabla ajuste_usuario
-- =====================================================

USE controlhogar;

CREATE TABLE IF NOT EXISTS ajuste_usuario (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    usuario_id BIGINT NOT NULL,
    moneda_principal VARCHAR(10) NOT NULL DEFAULT 'PEN',
    zona_horaria VARCHAR(50) NOT NULL DEFAULT 'America/Lima',
    idioma VARCHAR(10) NOT NULL DEFAULT 'es-PE',
    creado_en DATETIME NOT NULL,
    actualizado_en DATETIME NOT NULL,

    CONSTRAINT uq_ajuste_usuario_usuario
        UNIQUE (usuario_id),

    CONSTRAINT fk_ajuste_usuario_usuario
        FOREIGN KEY (usuario_id)
        REFERENCES usuario (id)
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;