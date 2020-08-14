/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionservidoruniversidad;

import estructural.Universidad;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import model.ServicioUniversidad;

/**
 *
 * @author Estudiantes
 */
public class AplicacionServidorUniversidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
             Universidad uni = Universidad.getUniversidad();
            ServicioUniversidad model = new ServicioUniversidad();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("//127.0.0.1/ServidorUniversidad", model);
            System.out.println("Servidor Universidad operando");
        }catch(Exception e){
            System.out.println("Error! : " +e);
        }
    }
    
}
