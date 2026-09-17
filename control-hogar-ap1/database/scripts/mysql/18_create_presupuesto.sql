-- =====================================================
-- CONTROL HOGAR
-- Script 18: creación de la tabla presupuesto
-- =====================================================
USE controlhogar;

CREATE TABLE IF NOT EXISTS presupuesto (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    usuario_id BIGINT NOT NULL,
    categoria_id BIGINT NOT NULL,
    monto_limite DECIMAL(12, 2) NOT NULL,
    periodo VARCHAR(10) NOT NULL DEFAULT 'MENSUAL',
    fecha_inicio DATE NOT NULL,
    fecha_fin DATE NULL,
    activo BOOLEAN NOT NULL DEFAULT TRUE,
    creado_en DATETIME NOT NULL,
    actualizado_en DATETIME NOT NULL,

    CONSTRAINT chk_presupuesto_monto CHECK (monto_limite > 0),

    CONSTRAINT fk_presupuesto_usuario
        FOREIGN KEY (usuario_id) REFERENCES usuario (id),

    CONSTRAINT fk_presupuesto_categoria
        FOREIGN KEY (categoria_id) REFERENCES categoria (id)
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;
