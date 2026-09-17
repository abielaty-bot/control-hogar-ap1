package pe.controlhogar.controlhogar.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "movimiento_etiqueta", uniqueConstraints = {
        @UniqueConstraint(name = "uq_movimiento_etiqueta", columnNames = { "movimiento_id", "etiqueta_id" })
})
public class MovimientoEtiqueta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "El movimiento es obligatorio")
    @ManyToOne
    @JoinColumn(name = "movimiento_id", nullable = false)
    private Movimiento movimiento;

    @NotNull(message = "La etiqueta es obligatoria")
    @ManyToOne
    @JoinColumn(name = "etiqueta_id", nullable = false)
    private Etiqueta etiqueta;

    public MovimientoEtiqueta() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Movimiento getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(Movimiento movimiento) {
        this.movimiento = movimiento;
    }

    public Etiqueta getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(Etiqueta etiqueta) {
        this.etiqueta = etiqueta;
    }
}
