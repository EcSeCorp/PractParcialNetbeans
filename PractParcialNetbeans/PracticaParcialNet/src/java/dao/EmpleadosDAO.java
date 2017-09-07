/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Empleados;
import java.util.List;

/**
 *
 * @author elvinsallinas
 */
public interface EmpleadosDAO {
    public String agregar(Empleados emp);
    public List<Empleados> lista();
}
