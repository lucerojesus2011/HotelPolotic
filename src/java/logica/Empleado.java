
package logica;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

public class Empleado extends Persona {
 
@Basic
    private String cargo;

    public Empleado() {
    }

    public Empleado(String cargo, String nombre, String apellido, String direccion, String dni, Date fNacimiento) {
        super(nombre, apellido, direccion, dni, fNacimiento);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
}
