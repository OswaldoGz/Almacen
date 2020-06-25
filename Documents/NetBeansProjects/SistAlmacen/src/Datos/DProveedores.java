/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Oswaldo
 */
public class DProveedores {
    int Id;
    String Nombre;
    String telefono;
    String domicilio;
    
    public DProveedores(){
    
    }

    public DProveedores(int Id, String Nombre, String telefono, String domicilio) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

 
   
    
}
