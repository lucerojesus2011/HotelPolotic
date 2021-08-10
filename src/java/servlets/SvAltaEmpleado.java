
package servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controladora;


@WebServlet(name = "SvAltaEmpleado", urlPatterns = {"/SvAltaEmpleado"})
public class SvAltaEmpleado extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        //Datos enviados por el formulario
        String nombre = request.getParameter("EmpleadoNombre");
        String apellido = request.getParameter("EmpleadoApellido");
        String dni = request.getParameter("EmpleadoDni");
        String direccion = request.getParameter("EmpleadoDireccion");
        String cargo = request.getParameter("EmpleadoCargo");
        
        //Conversion Date
        String nacimiento = request.getParameter("EmpleadoNacimiento");
        Date fNacimiento = null;
        SimpleDateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            fNacimiento = fecha.parse(nacimiento);
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());;
        }
        
        //Envio datos a la logica
        Controladora controlLogica = new Controladora();
        
        controlLogica.crearEmpleado(cargo, nombre, apellido, direccion, dni, fNacimiento);
        
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
