/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.empresasgui;

import java.util.ArrayList;

/**
 *
 * @author Joaco
 */
public class Empresa {
    private String razonSocial;
    private int cuit;
    private ArrayList<Empleado> empleado;

    public Empresa(String razonSocial, int cuit, ArrayList<Empleado> empleado) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.empleado = empleado;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public ArrayList<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(ArrayList<Empleado> empleado) {
        this.empleado = empleado;
    }
    
    public void agregarEmpleado(Empleado e){
        
    }
    public void mostrarEmpleados(){
        
    }
}
