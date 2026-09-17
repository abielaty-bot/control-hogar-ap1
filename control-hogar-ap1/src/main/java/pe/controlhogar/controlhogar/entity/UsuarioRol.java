package pe.controlhogar.controlhogar.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "usuario_rol", uniqueConstraints = {
        @UniqueConstraint(name = "uq_usuario_rol", columnNames = { "usuario_id", "rol_id" })
})
public class UsuarioRol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "El usuario es obligatorio")
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @NotNull(message = "El rol es obligatorio")
    @ManyToOne
    @JoinColumn(name = "rol_id", nullable = false)
    private Rol rol;

    @Column(name = "asignado_en", nullable = false, updatable = false)
    private LocalDateTime asignadoEn;

    public UsuarioRol() {
    }

    @PrePersist
    public void antesDeCrear() {
        asignadoEn = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public LocalDateTime getAsignadoEn() {
        return asignadoEn;
    }

    public void setAsignadoEn(LocalDateTime asignadoEn) {
        this.asignadoEn = asignadoEn;
    }
}
