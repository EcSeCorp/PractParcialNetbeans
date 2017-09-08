/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.EmpleadosDAO;
import daoimpl.EmpleadosDAOImpl;
import entidades.Empleados;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author elvinsallinas
 */
public class EmpleadoServlets extends HttpServlet {

            EmpleadosDAOImpl empleados = new EmpleadosDAOImpl();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
      String accion = request.getParameter("accion");
      
      if(accion.equalsIgnoreCase("agregarEmpleado")){
          agregarEmpleado(request,response);
      }
        }

    private void agregarEmpleado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String cargo = request.getParameter("cbocargo");
            String nombre = request.getParameter("txtnombre");
            int edad = Integer.parseInt(request.getParameter("txtedad"));
           
            Empleados emp = new Empleados();
            emp.setCargo(cargo);
            emp.setNombre(nombre);
            emp.setEdad(edad);
            emp.setSueldo(emp.calcularSueldo());
            
            String mensaje = empleados.agregar(emp);
            
            request.setAttribute("mensaje", mensaje);
            request.getRequestDispatcher("frmEmpleado.jsp").forward(request, response);
    }
    
    
    
        // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    }




