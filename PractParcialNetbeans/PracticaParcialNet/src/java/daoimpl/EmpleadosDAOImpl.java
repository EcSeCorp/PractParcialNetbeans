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
        } catch (Exception e) {
        }
                return mensaje;
    }

    @Override
    public List<Empleados> lista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
