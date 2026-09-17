package pe.controlhogar.controlhogar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.controlhogar.controlhogar.entity.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {

    List<Cuenta> findByUsuarioIdAndActivoTrueOrderByNombreAsc(Long usuarioId);
}
