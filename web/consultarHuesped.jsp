<%@page import="logica.Huesped"%>
<%@page import="logica.Empleado"%>
<%@page import="java.util.List"%>
<%@page import="logica.Controladora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
        <meta charset="utf-8">
        <meta name="description" content="Menú vertical con submenú desplegable vertical">
        <meta name="author" content="Francesc Ricart">
        <title>Hotel</title>
     
<style type="text/css">
  
/* The navigation menu */
.navbar {
  overflow: hidden;
  background-color: #023047;
}

/* Navigation links */
.navbar a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* The subnavigation menu */
.subnav {
  float: left;
  overflow: hidden;
}

/* Subnav button */
.subnav .subnavbtn {
  font-size: 16px;
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

/* Add a red background color to navigation links on hover */
.navbar a:hover, .subnav:hover .subnavbtn {
  background-color: #1b7f98;
}

/* Style the subnav content - positioned absolute */
.subnav-content {
  display: none;
  position: absolute;
  left: 0;
  background-color: #1b7f98;
  width: 100%;
  z-index: 1;
}

/* Style the subnav links */
.subnav-content a {
  float: left;
  color: white;
  text-decoration: none;
}

/* Add a grey background color on hover */
.subnav-content a:hover {
  background-color: #eee;
  color: black;
}

/* When you move the mouse over the subnav container, open the subnav content */
.subnav:hover .subnav-content {
  display: block;
}

 </style>


    </head>
    <body>
  
<!-- The navigation menu -->
<div class="navbar">
  <a href="#home">Inicio</a>
  <div class="subnav">
    <button class="subnavbtn">Empleados <i class="fa fa-caret-down"></i></button>
    <div class="subnav-content">
      <a href="altaEmpleado.jsp">Alta Empleado</a>
      <a href="bajaEmpleado.jsp">Baja Empleado</a>
      <a href="modificarEmpleado">Modificar Empleado</a>
      <a href="consultarEmpleado">Consultar Empleado</a>
    </div>
  </div>
  
  <div class="subnav">
    <button class="subnavbtn">Huespedes <i class="fa fa-caret-down"></i></button>
    <div class="subnav-content">
      <a href="altaEmpleado.jsp">Alta Empleado</a>
      <a href="bajaEmpleado.jsp">Baja Empleado</a>
      <a href="modificarEmpleado.jsp">Modificar Empleado</a>
      <a href="consultarEmpleado.jsp">Consultar Empleado</a>
    </div>
  </div>
  
  <div class="subnav">
    <button class="subnavbtn">Habitaciones <i class="fa fa-caret-down"></i></button>
    <div class="subnav-content">
      <a href="#bring">Alta Habitacion</a>
      <a href="#deliver">Baja Habitacion</a>
      <a href="#package">Modificar Habitacion</a>
      <a href="#express">Consultar Habitacion</a>
    </div>
  </div>
  
  <div class="subnav">
    <button class="subnavbtn">Reservas <i class="fa fa-caret-down"></i></button>
    <div class="subnav-content">
      <a href="#bring">Alta Reserva</a>
      <a href="#deliver">Baja Reserva</a>
      <a href="#package">Modificar Reserva</a>
      <a href="#express">Consultar Reserva</a>
    </div>
  </div>
  
</div>

<!--FORMULARIO-->

<H1>Huespedes</h1> 
<TABLE BORDER>
            	
            
    <TR><TH>ID</TH><TH>NOMBRE</TH><TH>APELLIDO</TH><TH>DNI</TH><TH>CARGO</TH><TH>FECHA DE NACIMIENTO</TH><TH>DIRECCION</TH>	</TR>
            <%
            Controladora controlLogica = new Controladora();    
            List<Huesped> listaHuespeds = controlLogica.consultaHuespeds();
            
            for (Huesped huesped:listaHuespeds){%>
            <TR><TD><%= huesped.getId() %></TD><TD><%= huesped.getNombre() %></TD><TD><%= huesped.getApellido() %></TD><TD><%= huesped.getDni() %></TD><TD><%= huesped.getProfesion() %></TD><TD><%= huesped.getfNacimiento() %></TD><TD><%= huesped.getDireccion() %></TD></TR>
            
            <%}%>
    
</TABLE>

    </body>
</html>
