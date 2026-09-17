package pe.controlhogar.controlhogar.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.controlhogar.controlhogar.entity.Moneda;

public interface MonedaRepository extends JpaRepository<Moneda, Long> {

    Optional<Moneda> findByCodigo(String codigo);

    List<Moneda> findByActivoTrueOrderByCodigoAsc();
}
