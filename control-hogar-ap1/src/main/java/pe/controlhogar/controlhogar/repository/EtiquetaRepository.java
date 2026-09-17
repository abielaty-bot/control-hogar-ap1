package pe.controlhogar.controlhogar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.controlhogar.controlhogar.entity.Etiqueta;

public interface EtiquetaRepository extends JpaRepository<Etiqueta, Long> {

    List<Etiqueta> findByUsuarioIdOrderByNombreAsc(Long usuarioId);
}
