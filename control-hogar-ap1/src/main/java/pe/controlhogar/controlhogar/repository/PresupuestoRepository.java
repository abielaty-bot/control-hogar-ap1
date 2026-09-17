package pe.controlhogar.controlhogar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.controlhogar.controlhogar.entity.Presupuesto;

public interface PresupuestoRepository extends JpaRepository<Presupuesto, Long> {

    List<Presupuesto> findByUsuarioIdAndActivoTrueOrderByFechaInicioDesc(Long usuarioId);
}
