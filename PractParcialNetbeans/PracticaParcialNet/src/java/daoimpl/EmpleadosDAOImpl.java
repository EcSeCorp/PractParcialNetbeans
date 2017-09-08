/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoimpl;

import dao.EmpleadosDAO;
import entidades.Empleados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.BDConexion;

/**
 *
 * @author elvinsallinas
 */
public class EmpleadosDAOImpl implements EmpleadosDAO{
                Connection cn = BDConexion.conectar();
    @Override
    public String agregar(Empleados emp) {
                String mensaje = "";
                try {
                    String sql = "INSERT INTO TBEmpleado VALUE(null,?,?,?,?)";
                    PreparedStatement pstm = cn.prepareStatement(sql);
                    pstm.setString(1,emp.getCargo());
                    pstm.setString(2,emp.getNombre());
                    pstm.setInt(3, emp.getEdad());
                    pstm.setDouble(4, emp.getSueldo());
                    
                    pstm.executeUpdate();
                    
                    mensaje="AGREGADO";
                    
        } catch (Exception e) {
            mensaje = e + "";
        }
                return mensaje;
    }

    @Override
    public List<Empleados> lista() {
           List<Empleados> lstEmpleados = new ArrayList<Empleados>();
           
           try {
            String sql = "SELECT + FROM TBEmpleado";
               PreparedStatement pstm = cn.prepareStatement(sql);
               ResultSet rs = pstm.executeQuery();
               
               while (rs.next()) {                   
                   int codigo = rs.getInt(1);
                   String cargo = rs.getString(2);
                   String nombre = rs.getString(3);
                   int edad = rs.getInt(4);
                   double sueldo = rs.getDouble(5);
                   
                   Empleados emp = new Empleados(codigo, cargo, nombre, edad, sueldo);
                   lstEmpleados.add(emp);
               }
               
        } catch (Exception e) {
        }
    return lstEmpleados;
}
}