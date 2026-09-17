package pe.controlhogar.controlhogar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.controlhogar.controlhogar.entity.AporteMeta;

public interface AporteMetaRepository extends JpaRepository<AporteMeta, Long> {

    List<AporteMeta> findByMetaAhorroIdOrderByFechaDesc(Long metaAhorroId);
}
