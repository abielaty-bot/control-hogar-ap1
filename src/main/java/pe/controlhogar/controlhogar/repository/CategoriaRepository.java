package pe.controlhogar.controlhogar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.controlhogar.controlhogar.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}