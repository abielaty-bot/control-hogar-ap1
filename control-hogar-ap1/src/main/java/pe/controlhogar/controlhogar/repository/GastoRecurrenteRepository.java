package pe.controlhogar.controlhogar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.controlhogar.controlhogar.entity.GastoRecurrente;

public interface GastoRecurrenteRepository extends JpaRepository<GastoRecurrente, Long> {

    List<GastoRecurrente> findByUsuarioIdAndActivoTrueOrderByProximoPagoAsc(Long usuarioId);
}
