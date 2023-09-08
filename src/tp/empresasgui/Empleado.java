/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.empresasgui;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joaco
 */
public class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private String categoria;
    private String sueldo;
    private String empresa;
    private List<Empleado> listaDeEmpleados;

    public Empleado(String dni, String nombre, String apellido, String categoria, String sueldo, String empresa, List<Empleado> listaDeEmpleados) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.categoria = categoria;
        this.sueldo = sueldo;
        this.empresa = empresa;
        this.listaDeEmpleados = listaDeEmpleados;
    }

   

   

      

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
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

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public List<Empleado> getListaDeEmpleados() {
        return listaDeEmpleados;
    }

    public void setListaDeEmpleados(List<Empleado> listaDeEmpleados) {
        this.listaDeEmpleados = listaDeEmpleados;
    }
    
    

    

    
        
    }
    

