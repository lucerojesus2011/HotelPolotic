
package servlets;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controladora;
import logica.Empleado;
import logica.Huesped;


@WebServlet(name = "SvModificarHuesped", urlPatterns = {"/SvModificarHuesped"})
public class SvModificarHuesped extends HttpServlet {

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
        
        
        //Datos del formulario
        int id = Integer.parseInt(request.getParameter("modificarHuesped"));
        Controladora controladoraLogica = new Controladora();
        Huesped huesped = controladoraLogica.consultaHuesped(id);
        Date fNacimiento = huesped.getfNacimiento();
        SimpleDateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");
        String nacimiento = fecha.format(fNacimiento);
        
        //Guardo datos en la session
        request.getSession().setAttribute("huespedId", huesped.getId());
        request.getSession().setAttribute("huespedNombre", huesped.getNombre());
        request.getSession().setAttribute("huespedApellido", huesped.getApellido());
        request.getSession().setAttribute("huespedDni", huesped.getDni());
        request.getSession().setAttribute("huespedProfesion", huesped.getProfesion());
        request.getSession().setAttribute("huespedNacimiento", nacimiento);
        request.getSession().setAttribute("huespedDireccion", huesped.getDireccion());
        
        //Reenvio al formulario para modificar
        response.sendRedirect("modificarHuespedForm.jsp");

    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
