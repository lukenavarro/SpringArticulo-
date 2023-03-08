package supermercado.conexionSupermercadoJPA.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Articulo {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Precio")
    private Double precio;

    @Column(name= "isRebajado")
    private Boolean rebajado =false;

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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Boolean getRebajado() {
        return rebajado;
    }

    public void setRebajado(Boolean rebajado) {
        this.rebajado = rebajado;
    }

    public Double getPrecioReal(){
        return rebajado ? this.precio/2:this.precio;
    }
    public String getNombreCompleto(){
        return "("+this.id+") "+this.nombre+ " - "+this.getPrecioReal();
    }
}
