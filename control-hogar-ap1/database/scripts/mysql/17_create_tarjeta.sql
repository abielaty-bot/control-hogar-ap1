-- =====================================================
-- CONTROL HOGAR
-- Script 17: creación de la tabla tarjeta
-- =====================================================
USE controlhogar;

CREATE TABLE IF NOT EXISTS tarjeta (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    cuenta_id BIGINT NOT NULL,
    nombre VARCHAR(60) NOT NULL,
    tipo VARCHAR(20) NOT NULL DEFAULT 'DEBITO',
    ultimos_digitos VARCHAR(4) NULL,
    limite_credito DECIMAL(12, 2) NULL,
    activo BOOLEAN NOT NULL DEFAULT TRUE,
    creado_en DATETIME NOT NULL,
    actualizado_en DATETIME NOT NULL,

    CONSTRAINT fk_tarjeta_cuenta
        FOREIGN KEY (cuenta_id) REFERENCES cuenta (id)
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;
