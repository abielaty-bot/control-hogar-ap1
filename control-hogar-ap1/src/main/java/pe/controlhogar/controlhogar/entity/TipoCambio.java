package pe.controlhogar.controlhogar.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

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
@Table(name = "tipo_cambio")
public class TipoCambio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "La moneda de origen es obligatoria")
    @ManyToOne
    @JoinColumn(name = "moneda_origen_id", nullable = false)
    private Moneda monedaOrigen;

    @NotNull(message = "La moneda de destino es obligatoria")
    @ManyToOne
    @JoinColumn(name = "moneda_destino_id", nullable = false)
    private Moneda monedaDestino;

    @NotNull(message = "El valor del tipo de cambio es obligatorio")
    @DecimalMin(value = "0.0001", message = "El valor debe ser mayor que cero")
    @Column(nullable = false, precision = 12, scale = 6)
    private BigDecimal valor;

    @NotNull(message = "La fecha es obligatoria")
    @Column(nullable = false)
    private LocalDate fecha;

    public TipoCambio() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Moneda getMonedaOrigen() {
        return monedaOrigen;
    }

    public void setMonedaOrigen(Moneda monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public Moneda getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(Moneda monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
