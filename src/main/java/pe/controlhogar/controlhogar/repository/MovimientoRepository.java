package pe.controlhogar.controlhogar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.controlhogar.controlhogar.entity.Movimiento;

public interface MovimientoRepository
        extends JpaRepository<Movimiento, Long> {

    List<Movimiento> findByEliminadoEnIsNullOrderByFechaDesc();
}
