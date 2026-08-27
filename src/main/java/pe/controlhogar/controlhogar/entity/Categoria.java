package pe.controlhogar.controlhogar.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(
    name = "categoria",
    uniqueConstraints = {
        @UniqueConstraint(
            name = "uq_categoria_nombre",
            columnNames = "nombre"
        )
    }
)
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre de la categoría es obligatorio")
    @Size(
        max = 80,
        message = "El nombre no puede superar los 80 caracteres"
    )
    @Column(nullable = false, length = 80)
    private String nombre;

    @Size(
        max = 255,
        message = "La descripción no puede superar los 255 caracteres"
    )
    @Column(length = 255)
    private String descripcion;

    @Column(nullable = false)
    private Boolean activo = true;

    @Column(
        name = "creado_en",
        nullable = false,
        updatable = false
    )
    private LocalDateTime creadoEn;

    @Column(
        name = "actualizado_en",
        nullable = false
    )
    private LocalDateTime actualizadoEn;

    public Categoria() {
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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