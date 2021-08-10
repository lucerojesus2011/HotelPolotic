
package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Habitacion implements Serializable {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)    
    private int id;
@Basic
    private String piso;
    private String nombre;
    private String tipo;
    private double precio;
    private int cantidadPersonas;

    public Habitacion() {
    }

    public Habitacion(String piso, String nombre, String tipo, double precio, int cantidadPersonas) {
       
        this.piso = piso;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.cantidadPersonas = cantidadPersonas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }
    
    
    
    
}
