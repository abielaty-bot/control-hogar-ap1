package pe.controlhogar.controlhogar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.controlhogar.controlhogar.entity.Movimiento;
import pe.controlhogar.controlhogar.repository.MovimientoRepository;

import java.util.List;

@Service
public class MovimientoService {

    @Autowired
    private MovimientoRepository repository;

    public List<Movimiento> listar() {
        return repository.findAll();
    }

    public Movimiento guardar(Movimiento movimiento) {
        return repository.save(movimiento);
    }
}