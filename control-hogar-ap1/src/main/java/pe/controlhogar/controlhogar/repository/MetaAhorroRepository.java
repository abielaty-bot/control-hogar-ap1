package pe.controlhogar.controlhogar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.controlhogar.controlhogar.entity.MetaAhorro;

public interface MetaAhorroRepository extends JpaRepository<MetaAhorro, Long> {

    List<MetaAhorro> findByUsuarioIdAndActivoTrueOrderByFechaObjetivoAsc(Long usuarioId);
}
