package pe.controlhogar.controlhogar.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.controlhogar.controlhogar.entity.Movimiento;
import pe.controlhogar.controlhogar.repository.MovimientoRepository;

@Service
public class MovimientoService {

    @Autowired
    private MovimientoRepository repository;

    public List<Movimiento> listar() {
        return repository.findByEliminadoEnIsNullOrderByFechaDesc();
    }

    public Movimiento guardar(Movimiento movimiento) {
        return repository.save(movimiento);
    }

    public Movimiento buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException(
                "Movimiento no encontrado con ID: " + id
        ));
    }

    public Movimiento actualizar(Long id, Movimiento datos) {
        Movimiento movimientoExistente = buscarPorId(id);

        movimientoExistente.setDescripcion(datos.getDescripcion());
        movimientoExistente.setMonto(datos.getMonto());
        movimientoExistente.setFecha(datos.getFecha());
        movimientoExistente.setCategoria(datos.getCategoria());

        return repository.save(movimientoExistente);
    }

    public void eliminar(Long id) {
        Movimiento movimiento = buscarPorId(id);
        movimiento.setEliminadoEn(LocalDateTime.now());
        repository.save(movimiento);
    }
}
