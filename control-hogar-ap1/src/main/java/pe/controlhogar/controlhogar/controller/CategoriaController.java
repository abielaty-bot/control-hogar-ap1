package pe.controlhogar.controlhogar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import pe.controlhogar.controlhogar.entity.Categoria;
import pe.controlhogar.controlhogar.service.CategoriaService;

@RestController
@RequestMapping("/api/categorias")
@CrossOrigin("*")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @GetMapping
    public List<Categoria> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PostMapping
     public ResponseEntity<Categoria> guardar(
        @Valid @RequestBody Categoria categoria) {

         return ResponseEntity.ok(service.guardar(categoria));
    }

    @PutMapping("/{id}")
      public ResponseEntity<Categoria> actualizar(
        @PathVariable Long id,
        @Valid @RequestBody Categoria categoria) {

         return ResponseEntity.ok(service.actualizar(id, categoria));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}