-- =====================================================
-- CONTROL HOGAR
-- Script 08: agregar eliminación lógica a movimiento
-- =====================================================
USE controlhogar;

ALTER TABLE movimiento
ADD COLUMN eliminado_en DATETIME NULL AFTER categoria_id;
