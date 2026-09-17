-- =====================================================
-- CONTROL HOGAR
-- Script 13: creación de la tabla tipo_cambio
-- =====================================================
USE controlhogar;

CREATE TABLE IF NOT EXISTS tipo_cambio (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    moneda_origen_id BIGINT NOT NULL,
    moneda_destino_id BIGINT NOT NULL,
    valor DECIMAL(12, 6) NOT NULL,
    fecha DATE NOT NULL,

    CONSTRAINT chk_tipo_cambio_valor CHECK (valor > 0),

    CONSTRAINT fk_tipo_cambio_origen
        FOREIGN KEY (moneda_origen_id) REFERENCES moneda (id),

    CONSTRAINT fk_tipo_cambio_destino
        FOREIGN KEY (moneda_destino_id) REFERENCES moneda (id)
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;
