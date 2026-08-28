package pe.controlhogar.controlhogar.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "movimiento")
public class Movimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    @NotNull(message = "El monto es obligatorio")
    @DecimalMin(
            value = "0.01",
            message = "El monto debe ser mayor que cero"
    )
    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal monto;

    @NotNull(message = "La fecha es obligatoria")
    @Column(nullable = false)
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @Column(name = "eliminado_en")
    private LocalDateTime eliminadoEn;

    public Movimiento() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public LocalDateTime getEliminadoEn() {
        return eliminadoEn;
    }

    public void setEliminadoEn(LocalDateTime eliminadoEn) {
        this.eliminadoEn = eliminadoEn;
    }
}
