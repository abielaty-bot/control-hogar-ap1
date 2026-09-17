package pe.controlhogar.controlhogar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.controlhogar.controlhogar.entity.Categoria;

public interface CategoriaRepository
        extends JpaRepository<Categoria, Long> {

    List<Categoria> findByActivoTrueOrderByNombreAsc();
}