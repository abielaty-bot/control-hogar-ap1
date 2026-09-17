package pe.controlhogar.controlhogar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.controlhogar.controlhogar.entity.UsuarioRol;

public interface UsuarioRolRepository extends JpaRepository<UsuarioRol, Long> {

    List<UsuarioRol> findByUsuarioId(Long usuarioId);
}
