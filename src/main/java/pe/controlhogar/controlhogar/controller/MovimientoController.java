package pe.controlhogar.controlhogar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import pe.controlhogar.controlhogar.entity.Movimiento;
import pe.controlhogar.controlhogar.service.MovimientoService;

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
    public Movimiento guardar(
            @Valid @RequestBody Movimiento movimiento) {

        return service.guardar(movimiento);
    }
}
