
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


@WebServlet(name = "SvAltaHabitacion", urlPatterns = {"/SvAltaHabitacion"})
public class SvAltaHabitacion extends HttpServlet {

   
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
        String nombre = request.getParameter("HabitacionNombre");
        String tipo = request.getParameter("HabitacionTipo");
        double precio = Double.parseDouble(request.getParameter("HabitacionPrecio"));
        String piso = request.getParameter("HabitacionPiso");
        int cantidadPersonas = Integer.parseInt(request.getParameter("HabitacionCantidad"));
        
                
        //Envio datos a la logica
        Controladora controlLogica = new Controladora();
        
        controlLogica.crearHabitacion(piso, nombre, tipo, precio, cantidadPersonas);
        
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
