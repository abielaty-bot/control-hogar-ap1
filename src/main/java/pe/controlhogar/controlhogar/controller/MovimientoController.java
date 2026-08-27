package pe.controlhogar.controlhogar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.controlhogar.controlhogar.entity.Movimiento;
import pe.controlhogar.controlhogar.service.MovimientoService;

import java.util.List;

@RestController
@RequestMapping("/api/movimientos")
@CrossOrigin("*")
public class MovimientoController {

    @Autowired
    private MovimientoService service;

    @GetMapping
    public List<Movimiento> listar() {
        return service.listar();
    }

    @PostMapping
    public Movimiento guardar(@RequestBody Movimiento movimiento) {
        return service.guardar(movimiento);
    }
}