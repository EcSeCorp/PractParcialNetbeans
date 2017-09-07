/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Elvin
 */
public class Empleados {
    private int codigo;
    private String cargo;
    private String nombre;
    private int edad;
    private double sueldo;

    public Empleados() {
    }

    public Empleados(int codigo, String cargo, String nombre, int edad, double sueldo) {
        this.codigo = codigo;
        this.cargo = cargo;
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
          public double calcularSueldo(){
              double sueldo=0;
              
              if(cargo.equalsIgnoreCase("Gerente")){
                  sueldo = 2000;
              }
              if(cargo.equalsIgnoreCase("Administrador")){
                  sueldo = 1650;
              }
              if(cargo.equalsIgnoreCase("Contador")){
                  sueldo = 1500;
              }
              if(cargo.equalsIgnoreCase("Asistente")){
                  sueldo = 900;
              }
              return sueldo;
          }  
}
