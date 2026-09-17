package pe.controlhogar.controlhogar.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "moneda", uniqueConstraints = {
        @UniqueConstraint(name = "uq_moneda_codigo", columnNames = "codigo")
})
public class Moneda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El código de la moneda es obligatorio")
    @Size(max = 10, message = "El código no puede superar los 10 caracteres")
    @Column(nullable = false, length = 10)
    private String codigo;

    @NotBlank(message = "El nombre de la moneda es obligatorio")
    @Size(max = 50, message = "El nombre no puede superar los 50 caracteres")
    @Column(nullable = false, length = 50)
    private String nombre;

    @Size(max = 5, message = "El símbolo no puede superar los 5 caracteres")
    @Column(length = 5)
    private String simbolo;

    @Column(nullable = false)
    private Boolean activo = true;

    public Moneda() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}
