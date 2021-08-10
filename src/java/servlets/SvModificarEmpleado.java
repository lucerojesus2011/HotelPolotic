
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controladora;
import logica.Empleado;


@WebServlet(name = "SvModificarEmpleado", urlPatterns = {"/SvModificarEmpleado"})
public class SvModificarEmpleado extends HttpServlet {

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
        int id = Integer.parseInt(request.getParameter("modificarEmpleado"));
        Controladora controladoraLogica = new Controladora();
        Empleado empleado = controladoraLogica.consultaEmpleado(id);
        Date fNacimiento = empleado.getfNacimiento();
        SimpleDateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");
        String nacimiento = fecha.format(fNacimiento);
        
        //Guardo datos en la session
        request.getSession().setAttribute("empleadoId", empleado.getId());
        request.getSession().setAttribute("empleadoNombre", empleado.getNombre());
        request.getSession().setAttribute("empleadoApellido", empleado.getApellido());
        request.getSession().setAttribute("empleadoDni", empleado.getDni());
        request.getSession().setAttribute("empleadoCargo", empleado.getCargo());
        request.getSession().setAttribute("empleadoNacimiento", nacimiento);
        request.getSession().setAttribute("empleadoDireccion", empleado.getDireccion());
        
        //Reenvio al formulario para modificar
        response.sendRedirect("modificarEmpleadoForm.jsp");

    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
