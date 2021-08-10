
package logica;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

public class Huesped extends Persona{
   
@Basic
    private String profesion;

    public Huesped() {
        
    }

    public Huesped(String profesion, String nombre, String apellido, String direccion, String dni, Date fNacimiento) {
        super(nombre, apellido, direccion, dni, fNacimiento);
        this.profesion = profesion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    
    
    
    
     
}
