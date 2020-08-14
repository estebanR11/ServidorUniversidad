/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructural;

import java.io.Serializable;

/**
 *
 * @author juane, CristianDevia
 */
import java.util.Date;

/**
 *
 * @author Cristian Devia, Esteban Rubio
 */
public class Estudiante implements Serializable
{
    private String nombre,codigo,correo;
    private int cedula,celular,edad;

    public Estudiante(String nombre, int cedula , String codigo, String correo, int celular,int edad) 
    {
        this.nombre = nombre;
        this.codigo = codigo;
        this.correo = correo + "@estudiantes.edu";
        this.cedula = cedula;
        this.celular = celular;
        this.edad = edad;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) 
    {
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) 
    {
        this.correo = correo;
    }

    public int getCedula()
    {
        return cedula;
    }

    public void setCedula(int cedula) 
    {
        this.cedula = cedula;
    }

    public int getCelular() 
    {
        return celular;
    }

    public void setCelular(int celular) 
    {
        this.celular = celular;
    }   

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}