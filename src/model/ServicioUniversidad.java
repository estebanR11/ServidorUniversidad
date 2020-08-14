/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import estructural.Estudiante;
import estructural.Universidad;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Estudiantes
 */
public class ServicioUniversidad extends UnicastRemoteObject implements IServicioUniversidad{

    Universidad uni = Universidad.getUniversidad();
    
    public ServicioUniversidad( )throws RemoteException 
    {
        
    }
    private static ArrayList estudiantes = new ArrayList();
      


    public ArrayList getEstudiantes()
    {
        return estudiantes;
    }

    @Override
    public void setEstudiantes(ArrayList pEstudiantes) {
      estudiantes = pEstudiantes;
    }
          
  
    @Override
    public void anadirEstudiante(String pNombre, int pCedula, String pCodigo, String pCorreo, int pCelular, int edad )
    {
        
        Estudiante nuevo = new Estudiante(pNombre,pCedula,pCodigo,pCorreo,pCelular, edad);
        estudiantes.add(nuevo);
        
    }
    
    @Override
    public void eliminarPorCodigo(String pCodigo)
    {
        for(int i=0; i< estudiantes.size();i++)
        {
            Estudiante actual = (Estudiante) estudiantes.get(i);
            if(actual.getCodigo().equals(pCodigo))
            {
                estudiantes.remove(actual);
            }
        }
    }
    
    @Override
    public void actualizarPorCodigo(String pCodigo,String pNombre, int pCedula, String pCorreo, int pCelular,int edad)
    {
        for(int i=0; i< estudiantes.size();i++)
        {
            Estudiante actual = (Estudiante) estudiantes.get(i);
            if(actual.getCodigo().equals(pCodigo))
            {
              actual.setCedula(pCedula);
              actual.setNombre(pNombre);
              actual.setCorreo(pCorreo);
              actual.setCelular(pCelular);
              actual.setEdad(edad);
            }
        }
    }
    
    @Override
    public Estudiante buscarEstudiantePorCodigo(String codigo)
    {
        Estudiante buscado =null;
        
        for(int i =0; i<estudiantes.size();i++ )            
        {
            Estudiante actual = (Estudiante)estudiantes.get(i);
            if(actual.getCodigo().equals(codigo))
            {
                buscado = actual;
            }
        }
        return buscado;
    }
    
    @Override
    public boolean existeCorreo(String pCorreo)
    {
        boolean centinela = false;
         for(int i =0; i<estudiantes.size() && centinela == false;i++ )            
        {
            Estudiante actual = (Estudiante)estudiantes.get(i);
            
            if(actual.getCorreo().equals(pCorreo))
            {
                centinela = true;
            }
        }
         
         return centinela;
    }
    
    @Override
       public boolean existeCelular(int pCelular)
    {
        boolean centinela = false;
         for(int i =0; i<estudiantes.size() && centinela == false;i++ )            
        {
            Estudiante actual = (Estudiante)estudiantes.get(i);
            
            if(actual.getCelular() == pCelular)
            {
                centinela = true;
            }
        }
         
         return centinela;
    }
       
    @Override
     public boolean usuarioExiste( String pCodigo )
    {
        boolean centinela = false;
        
        for(int i = 0; i < estudiantes.size() && !centinela; i++)
        {
            Estudiante estu = (Estudiante) estudiantes.get(i);
            String auxCod = estu.getCodigo();
            
            if(pCodigo.equalsIgnoreCase(auxCod))
            {
                centinela = true;
                
            }
        }
        
        return centinela;
    }
    
}
