
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Empleado;
import logica.Habitacion;
import logica.Huesped;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    
   EmpleadoJpaController controlEmpleado = new EmpleadoJpaController();
   HabitacionJpaController controlHabitacion = new HabitacionJpaController();
   HuespedJpaController controlHuesped = new HuespedJpaController();
   PersonaJpaController controlPersona = new PersonaJpaController();
   ReservaJpaController controlReserva = new ReservaJpaController();
    
   
   
   
   
  
     //Metodos Empleado
    //Envio un empleado a la db
   public void altaEmpleado(Empleado empleado){
       try {
           controlEmpleado.create(empleado);
       } catch (Exception ex) {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    
   //Doy de baja un empleado
   public void bajaEmpleado(int id){
       try {
           controlEmpleado.destroy(id);
       } catch (NonexistentEntityException ex) {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    
    //Modifico un empleado
   public void modificarEmpleado(Empleado empleado){
       try {
           controlEmpleado.edit(empleado);
       } catch (Exception ex) {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    
   //Consulta de un empleado
   public Empleado consultaEmpleado(int id){
      return controlEmpleado.findEmpleado(id);
   }
    
    //Consulta lista de empleados
   public List<Empleado> listaEmpleados(){
      return controlEmpleado.findEmpleadoEntities();
   }
    
    
   //Metodos Huesped
    //Envio un huesped a la db
   public void altaHuesped(Huesped huesped){
       try {
           controlHuesped.create(huesped);
       } catch (Exception ex) {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    
   //Doy de baja un huesped
   public void bajaHuesped(int id){
       try {
           controlHuesped.destroy(id);
       } catch (NonexistentEntityException ex) {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    
    //Modifico un huesped
   public void modificarHuesped(Huesped huesped){
       try {
           controlHuesped.edit(huesped);
       } catch (Exception ex) {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    
   //Consulta de un huesped
   public Huesped consultaHuesped(int id){
      return controlHuesped.findHuesped(id);
   }
    
    //Consulta lista de huespeds
   public List<Huesped> listaHuespeds(){
      return controlHuesped.findHuespedEntities();
   }
   
   
   //Metodos Habitacion
    //Envio un habitacion a la db
   public void altaHabitacion(Habitacion habitacion){
       try {
           controlHabitacion.create(habitacion);
       } catch (Exception ex) {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    
   //Doy de baja un habitacion
   public void bajaHabitacion(int id){
       try {
           controlHabitacion.destroy(id);
       } catch (NonexistentEntityException ex) {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    
    //Modifico un habitacion
   public void modificarHabitacion(Habitacion habitacion){
       try {
           controlHabitacion.edit(habitacion);
       } catch (Exception ex) {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    
   //Consulta de un habitacion
   public Habitacion consultaHabitacion(int id){
      return controlHabitacion.findHabitacion(id);
   }
    
    //Consulta lista de habitacions
   public List<Habitacion> listaHabitacions(){
      return controlHabitacion.findHabitacionEntities();
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    
}
