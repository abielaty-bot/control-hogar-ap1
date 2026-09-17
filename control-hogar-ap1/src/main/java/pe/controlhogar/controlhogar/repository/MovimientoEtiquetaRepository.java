package pe.controlhogar.controlhogar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.controlhogar.controlhogar.entity.MovimientoEtiqueta;

public interface MovimientoEtiquetaRepository extends JpaRepository<MovimientoEtiqueta, Long> {

    List<MovimientoEtiqueta> findByMovimientoId(Long movimientoId);
}
