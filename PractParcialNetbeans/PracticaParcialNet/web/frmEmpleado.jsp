<%-- 
    Document   : frmEmpleado
    Created on : 08-sep-2017, 13:53:26
    Author     : elvinsallinas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="estilos.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="principal">
            <div class="encabezado"></div>
            <div class="menu">
                <ul class="listas">
                    <li><a href="">Formulario Empleados</a></li>
                    <li><a href="">Lista de Empleados</a></li>
                </ul>
            </div>
            <div class="contenido">
                <div class="titulo"></div>
                <form action="EmpleadoServlets" method="POST">
                    <input type="hidden" name="action" value="agregarempleado">
                    <table class="tablaFrm">
                        <tr>
                            <td>Cargo</td>
                            <td>
                                <select name="cbocargo">
                                    <option>Gerente</option>
                                   <option>Administrador</option>
                                   <option>Contador</option>
                                   <option>Asistente</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>Nombre</td>
                            <td><input type="text" name="txtnombre"></td>
                        </tr>
                        <tr>
                            <td>Edad</td>
                            <td><input type="text" name="txtedad"></td>
                        </tr>
                           <tr>
                            <td></td>
                            <td><input type="submit" value="Agregar"></td>
                        </tr>
                    </table>
                    ${mensaje}
                </form>
            </div>
        </div>
    </body>
</html>
