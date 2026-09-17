-- =====================================================
-- CONTROL HOGAR
-- Script 27: monedas iniciales
-- =====================================================
USE controlhogar;

INSERT IGNORE INTO moneda (codigo, nombre, simbolo) VALUES
('PEN', 'Sol peruano', 'S/'),
('USD', 'Dólar estadounidense', '$'),
('EUR', 'Euro', '€');
