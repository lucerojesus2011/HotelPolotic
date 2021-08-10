
package servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controladora;


@WebServlet(name = "SvAltaHuesped", urlPatterns = {"/SvAltaHuesped"})
public class SvAltaHuesped extends HttpServlet {

   
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
        String nombre = request.getParameter("HuespedNombre");
        String apellido = request.getParameter("HuespedApellido");
        String dni = request.getParameter("HuespedDni");
        String direccion = request.getParameter("HuespedDireccion");
        String profesion = request.getParameter("HuespedProfesion");
        
        //Conversion Date
        String nacimiento = request.getParameter("HuespedNacimiento");
        Date fNacimiento = null;
        SimpleDateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");
        
        try {
            fNacimiento = fecha.parse(nacimiento);
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
        
        //Envio datos a la logica
        Controladora controlLogica = new Controladora();
        
        controlLogica.crearHuesped(profesion, nombre, apellido, direccion, dni, fNacimiento);
        
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
