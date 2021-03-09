/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap05;

/**
 *
 * @author YoelR
 */
public class Persona {
    
    String Nombre;
    String Apellidos;
    
    public String Nombre()
    {
        return Nombre;
    }
    public void Nombre(String nombre)
    {
        this.Nombre=nombre;
    }
    
    public String Apellidos()
    {
        return Apellidos;
    }
    
    public void Apellidos(String Apellido)
    {
        this.Apellidos=Apellido;
    }
    
    public String getNombreCompleto()
    {
        return "El Nombre Completo es:"+Nombre+" "+Apellidos;
    }
}
