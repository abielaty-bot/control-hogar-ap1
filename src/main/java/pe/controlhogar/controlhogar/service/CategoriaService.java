package pe.controlhogar.controlhogar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.controlhogar.controlhogar.entity.Categoria;
import pe.controlhogar.controlhogar.repository.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public List<Categoria> listar() {
        return repository.findAll();
    }

    public Categoria guardar(Categoria categoria) {
        return repository.save(categoria);
    }

    public Categoria buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException(
                        "Categoría no encontrada con ID: " + id
                ));
    }

    public Categoria actualizar(Long id, Categoria datos) {
    Categoria categoriaExistente = buscarPorId(id);

    categoriaExistente.setNombre(datos.getNombre());
    categoriaExistente.setDescripcion(datos.getDescripcion());

    if (datos.getActivo() != null) {
        categoriaExistente.setActivo(datos.getActivo());
    }

    return repository.save(categoriaExistente);
    }

    public void eliminar(Long id) {
        Categoria categoria = buscarPorId(id);
        repository.delete(categoria);
    }
}