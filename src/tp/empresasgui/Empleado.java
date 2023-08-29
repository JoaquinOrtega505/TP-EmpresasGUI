/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.empresasgui;

/**
 *
 * @author Joaco
 */
class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private String categoria;
    private double sueldo;
    Empresa empresa;

    public Empleado(int dni, String nombre, String apellido, String categoria, double sueldo, Empresa empresa) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.categoria = categoria;
        this.sueldo = sueldo;
        this.empresa = empresa;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    
    
}