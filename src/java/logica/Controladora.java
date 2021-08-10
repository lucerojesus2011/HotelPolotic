
package logica;

import java.util.Date;
import java.util.List;
import persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();
    
      
    
        //Metodos empleado
    public void crearEmpleado(String cargo, String nombre, String apellido, String direccion, String dni, Date fNacimiento){
        //Creo una instancia de Empleado
        Empleado empleado = new Empleado();
        
        //Seteo los atributos recibidos por parametro
        empleado.setApellido(apellido);
        empleado.setCargo(cargo);
        empleado.setDireccion(direccion);
        empleado.setNombre(nombre);
        empleado.setfNacimiento(fNacimiento);
        empleado.setDni(dni);
        //Envio el objeto a la persistencia
        controlPersistencia.altaEmpleado(empleado);
    }

        //Baja Empleado
        public void bajaEmpleado(int id){
            controlPersistencia.bajaEmpleado(id);
        }

        //Consulta Empleados
        public List<Empleado> consultaEmpleados(){
            return controlPersistencia.listaEmpleados();
        }
        
        //Consulta Empleado
        public Empleado consultaEmpleado(int id){
            return controlPersistencia.consultaEmpleado(id);
        }

        
        //Metodos Huesped
    public void crearHuesped(String profesion, String nombre, String apellido, String direccion, String dni, Date fNacimiento){
        //Creo una instancia de Huesped
        Huesped huesped = new Huesped();
        
        //Seteo los atributos recibidos por parametro
        huesped.setApellido(apellido);
        huesped.setProfesion(profesion);
        huesped.setDireccion(direccion);
        huesped.setNombre(nombre);
        huesped.setfNacimiento(fNacimiento);
        huesped.setDni(dni);
        //Envio el objeto a la persistencia
        controlPersistencia.altaHuesped(huesped);
    }

        //Baja Huesped
        public void bajaHuesped(int id){
            controlPersistencia.bajaHuesped(id);
        }

        //Consulta Huespeds
        public List<Huesped> consultaHuespeds(){
            return controlPersistencia.listaHuespeds();
        }
        
        //Consulta Huesped
        public Huesped consultaHuesped(int id){
            return controlPersistencia.consultaHuesped(id);
        }


        //Metodos habitacion
    public void crearHabitacion(String piso, String nombre, String tipo, double precio, int cantidadPersonas){
        //Creo una instancia de Habitacion
        Habitacion habitacion = new Habitacion();
        
        //Seteo los atributos recibidos por parametro
        habitacion.setCantidadPersonas(cantidadPersonas);
        habitacion.setNombre(nombre);
        habitacion.setPiso(piso);
        habitacion.setPrecio(precio);
        habitacion.setPrecio(precio);
        habitacion.setTipo(tipo);
        //Envio el objeto a la persistencia
        controlPersistencia.altaHabitacion(habitacion);
    }

        //Baja Habitacion
        public void bajaHabitacion(int id){
            controlPersistencia.bajaHabitacion(id);
        }

        //Consulta Habitacions
        public List<Habitacion> consultaHabitacions(){
            return controlPersistencia.listaHabitacions();
        }
        
        //Consulta Habitacion
        public Habitacion consultaHabitacion(int id){
            return controlPersistencia.consultaHabitacion(id);
        }

















}
