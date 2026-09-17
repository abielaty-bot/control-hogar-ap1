-- =====================================================
-- CONTROL HOGAR
-- Script 05: inserción de datos iniciales
-- =====================================================

USE controlhogar;

INSERT IGNORE INTO categoria (nombre) VALUES
('Alimentacion'),
('Transporte'),
('Vivienda'),
('Salud'),
('Educacion'),
('Entretenimiento'),
('Otros');