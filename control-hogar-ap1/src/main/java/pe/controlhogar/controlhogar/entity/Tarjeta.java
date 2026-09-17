package pe.controlhogar.controlhogar.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tarjeta")
public class Tarjeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "La cuenta es obligatoria")
    @ManyToOne
    @JoinColumn(name = "cuenta_id", nullable = false)
    private Cuenta cuenta;

    @NotBlank(message = "El nombre de la tarjeta es obligatorio")
    @Size(max = 60, message = "El nombre no puede superar los 60 caracteres")
    @Column(nullable = false, length = 60)
    private String nombre;

    @NotBlank(message = "El tipo de tarjeta es obligatorio")
    @Size(max = 20, message = "El tipo no puede superar los 20 caracteres")
    @Column(nullable = false, length = 20)
    private String tipo = "DEBITO";

    @Size(max = 4, message = "Los últimos dígitos no pueden superar los 4 caracteres")
    @Column(name = "ultimos_digitos", length = 4)
    private String ultimosDigitos;

    @Column(name = "limite_credito", precision = 12, scale = 2)
    private BigDecimal limiteCredito;

    @Column(nullable = false)
    private Boolean activo = true;

    @Column(name = "creado_en", nullable = false, updatable = false)
    private LocalDateTime creadoEn;

    @Column(name = "actualizado_en", nullable = false)
    private LocalDateTime actualizadoEn;

    public Tarjeta() {
    }

    @PrePersist
    public void antesDeCrear() {
        LocalDateTime ahora = LocalDateTime.now();
        creadoEn = ahora;
        actualizadoEn = ahora;
        if (activo == null) {
            activo = true;
        }
    }

    @PreUpdate
    public void antesDeActualizar() {
        actualizadoEn = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUltimosDigitos() {
        return ultimosDigitos;
    }

    public void setUltimosDigitos(String ultimosDigitos) {
        this.ultimosDigitos = ultimosDigitos;
    }

    public BigDecimal getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(BigDecimal limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public LocalDateTime getCreadoEn() {
        return creadoEn;
    }

    public void setCreadoEn(LocalDateTime creadoEn) {
        this.creadoEn = creadoEn;
    }

    public LocalDateTime getActualizadoEn() {
        return actualizadoEn;
    }

    public void setActualizadoEn(LocalDateTime actualizadoEn) {
        this.actualizadoEn = actualizadoEn;
    }
}
