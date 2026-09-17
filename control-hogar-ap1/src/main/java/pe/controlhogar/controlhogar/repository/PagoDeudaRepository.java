package pe.controlhogar.controlhogar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.controlhogar.controlhogar.entity.PagoDeuda;

public interface PagoDeudaRepository extends JpaRepository<PagoDeuda, Long> {

    List<PagoDeuda> findByDeudaIdOrderByFechaDesc(Long deudaId);
}
