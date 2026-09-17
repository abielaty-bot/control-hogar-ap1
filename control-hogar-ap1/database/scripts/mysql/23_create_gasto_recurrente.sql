-- =====================================================
-- CONTROL HOGAR
-- Script 23: creación de la tabla gasto_recurrente
-- =====================================================
USE controlhogar;

CREATE TABLE IF NOT EXISTS gasto_recurrente (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    usuario_id BIGINT NOT NULL,
    categoria_id BIGINT NULL,
    descripcion VARCHAR(150) NOT NULL,
    monto DECIMAL(12, 2) NOT NULL,
    frecuencia VARCHAR(20) NOT NULL DEFAULT 'MENSUAL',
    proximo_pago DATE NULL,
    activo BOOLEAN NOT NULL DEFAULT TRUE,
    creado_en DATETIME NOT NULL,
    actualizado_en DATETIME NOT NULL,

    CONSTRAINT chk_gasto_recurrente_monto CHECK (monto > 0),

    CONSTRAINT fk_gasto_recurrente_usuario
        FOREIGN KEY (usuario_id) REFERENCES usuario (id),

    CONSTRAINT fk_gasto_recurrente_categoria
        FOREIGN KEY (categoria_id) REFERENCES categoria (id)
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;
