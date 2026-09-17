-- =====================================================
-- CONTROL HOGAR
-- Script maestro para ejecutar todos los scripts MySQL
-- =====================================================

SOURCE 01_create_database.sql;
SOURCE 02_create_categoria.sql;
SOURCE 03_create_movimiento.sql;
SOURCE 04_create_foreign_keys.sql;
SOURCE 05_insert_initial_data.sql;
SOURCE 09_create_usuario.sql;
SOURCE 10_create_ajuste_usuario.sql;
SOURCE 11_create_tienda.sql;
SOURCE 12_create_moneda.sql;
SOURCE 13_create_tipo_cambio.sql;
SOURCE 14_create_rol.sql;
SOURCE 15_create_usuario_rol.sql;
SOURCE 16_create_cuenta.sql;
SOURCE 17_create_tarjeta.sql;
SOURCE 18_create_presupuesto.sql;
SOURCE 19_create_meta_ahorro.sql;
SOURCE 20_create_aporte_meta.sql;
SOURCE 21_create_deuda.sql;
SOURCE 22_create_pago_deuda.sql;
SOURCE 23_create_gasto_recurrente.sql;
SOURCE 24_create_etiqueta.sql;
SOURCE 25_create_movimiento_etiqueta.sql;
SOURCE 26_create_notificacion.sql;
SOURCE 27_insert_moneda_inicial.sql;

SOURCE 06_test_queries.sql;
