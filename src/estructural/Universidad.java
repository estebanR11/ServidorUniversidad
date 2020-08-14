/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructural;

import java.io.Serializable;

/**
 *
 * @author Estudiantes
 */
public class Universidad implements Serializable{
    
    private static Universidad universidad;
    
    
    private String nit;
    private String nombre;

    
    private Universidad(String nit, String nombre) {
        this.nit = nit;
        this.nombre = nombre;
    }

    public static Universidad getUniversidad(){
        if(universidad == null){
            return new Universidad("", "Unibague");
        }else{
            return universidad;
        }
          
    }
   
   
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
