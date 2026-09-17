package pe.controlhogar.controlhogar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.controlhogar.controlhogar.entity.Tarjeta;

public interface TarjetaRepository extends JpaRepository<Tarjeta, Long> {

    List<Tarjeta> findByCuentaIdAndActivoTrueOrderByNombreAsc(Long cuentaId);
}
