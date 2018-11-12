/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.record.project.controller;

import com.record.project.controller.util.JsfUtil;
import com.record.project.controller.util.SessionReference;
import com.record.project.entities.Usuario;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author luis
 */
@Named
@ViewScoped

public class ControlAccesoClass implements Serializable{
    SessionReference reference;
    Usuario user;
  
    public void onlyAdmin() {
        try {
           reference = new SessionReference();
           user = new Usuario();
           
           user = (Usuario) reference.sessionMapGet("usuario");
           
           if(user == null || !user.getIdNombre().getIdNombre().equals("ADMIN")){
               reference.getFacesContext().getExternalContext().redirect("./../../../../index.xhtml");
           }   
           
        } catch (Exception e) {
          
        }
    }
     
    public void onlyEstudiante(){
        try {
           reference = new SessionReference();
           user = new Usuario();
           
           user = (Usuario) reference.sessionMapGet("usuario");
           
           if(user == null || !user.getIdNombre().getIdNombre().equals("ESTUDIANTE")){
               reference.getFacesContext().getExternalContext().redirect("./../../index.xhtml");
           }     
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "exception");
        }
    }    
          
    public void onlyEmpleado(){
        try {
           reference = new SessionReference();
           user = new Usuario();
           
           user = (Usuario) reference.sessionMapGet("usuario");
           
           if(user == null || !user.getIdNombre().getIdNombre().equals("EMPLEADO")){
                reference.getFacesContext().getExternalContext().redirect("./../acceso/login.xhtml");
           }   
           
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "exception");
        }
    }    
               
    public void cerraSesion(){           
          
        try {
           reference = new SessionReference();    
           reference.sessionMapGetRemove("usuario");
           
        } catch (Exception e) {
           JsfUtil.addErrorMessage(e, "exception");
        }
    }   
}
