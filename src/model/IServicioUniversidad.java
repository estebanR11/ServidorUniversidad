/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import estructural.Estudiante;
import java.rmi.*;
import java.util.ArrayList;

/**
 *
 * @author Estudiantes
 */
public interface IServicioUniversidad extends Remote{
    

   public void setEstudiantes(ArrayList pEstudiantes)throws RemoteException;
   public void anadirEstudiante(String pNombre, int pCedula, String pCodigo, String pCorreo, int pCelular,int edad )throws RemoteException;
   public void eliminarPorCodigo(String pCodigo)throws RemoteException;
   public void actualizarPorCodigo(String pCodigo,String pNombre, int pCedula, String pCorreo, int pCelular, int edad)throws RemoteException;
   public Estudiante buscarEstudiantePorCodigo(String codigo)throws RemoteException;
   public boolean existeCorreo(String pCorreo)throws RemoteException;
   public boolean existeCelular(int pCelular)throws RemoteException;
   public boolean usuarioExiste( String pCodigo )throws RemoteException;
    
    
}
