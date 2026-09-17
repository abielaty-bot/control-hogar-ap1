package pe.controlhogar.controlhogar.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.controlhogar.controlhogar.entity.AjusteUsuario;

public interface AjusteUsuarioRepository extends JpaRepository<AjusteUsuario, Long> {

    Optional<AjusteUsuario> findByUsuarioId(Long usuarioId);
}
