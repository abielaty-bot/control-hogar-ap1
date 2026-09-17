package pe.controlhogar.controlhogar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.controlhogar.controlhogar.entity.Deuda;

public interface DeudaRepository extends JpaRepository<Deuda, Long> {

    List<Deuda> findByUsuarioIdAndActivoTrueOrderByFechaVencimientoAsc(Long usuarioId);
}
