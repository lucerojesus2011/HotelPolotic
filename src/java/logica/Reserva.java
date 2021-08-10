
package logica;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reserva implements Serializable {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)    
    private long id;

@Temporal(TemporalType.DATE)
    private Date ingreso;
@Temporal(TemporalType.DATE)
    private Date egreso;

@OneToOne
    private Huesped huesped;
@OneToOne
    private Habitacion habitacion;
   
@Basic
    private int cantidadAcompañantes;
    private double costoEstadia;

    public Reserva() {
    }

    public Reserva(long id, Date ingreso, Date egreso, Huesped huesped, Habitacion habitacion, int cantidadAcompañantes, double costoEstadia) {
        this.id = id;
        this.ingreso = ingreso;
        this.egreso = egreso;
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.cantidadAcompañantes = cantidadAcompañantes;
        this.costoEstadia = costoEstadia;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getIngreso() {
        return ingreso;
    }

    public void setIngreso(Date ingreso) {
        this.ingreso = ingreso;
    }

    public Date getEgreso() {
        return egreso;
    }

    public void setEgreso(Date egreso) {
        this.egreso = egreso;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public int getCantidadAcompañantes() {
        return cantidadAcompañantes;
    }

    public void setCantidadAcompañantes(int cantidadAcompañantes) {
        this.cantidadAcompañantes = cantidadAcompañantes;
    }

    public double getCostoEstadia() {
        return costoEstadia;
    }

    public void setCostoEstadia(double costoEstadia) {
        this.costoEstadia = costoEstadia;
    }

   

   
    
    
    
    
    
}
