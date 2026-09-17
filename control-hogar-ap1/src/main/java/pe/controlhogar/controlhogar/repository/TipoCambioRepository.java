package pe.controlhogar.controlhogar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.controlhogar.controlhogar.entity.TipoCambio;

public interface TipoCambioRepository extends JpaRepository<TipoCambio, Long> {

    List<TipoCambio> findByMonedaOrigenIdAndMonedaDestinoIdOrderByFechaDesc(
            Long monedaOrigenId, Long monedaDestinoId);
}
