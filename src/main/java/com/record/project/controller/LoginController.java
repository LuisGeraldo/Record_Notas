/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.record.project.controller;

import com.record.project.controller.util.SessionReference;
import com.record.project.ejb.UsuarioFacade;
import com.record.project.entities.Usuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author luis
 */
@Named(value = "loginController")
@ViewScoped
public class LoginController implements Serializable{

    @EJB
    private UsuarioFacade ejbUsuarioFacade;
    
    Usuario usuario;
    
    SessionReference reference;

     /**
     * Creates a new instance of LoginController
     */
    
    public Usuario getUsuario(){
        return usuario;
    }   

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @PostConstruct
    public void init() {
        usuario = new Usuario();
    }
   
    public void iniciarSesion(){
       Usuario user;
 
       try {
            reference = new SessionReference();
            user = ejbUsuarioFacade.iniciarSesion(usuario);

                switch (user.getIdNombre().getIdNombre()) {
                    
                case "ADMIN":   
                    reference.sessionMapPut("usuario", user);
                    reference.getFacesContext().getExternalContext().redirect("view/admin/mantenimiento/index/index.xhtml");  
                    break;
                    
                case "ESTUDIANTE":
                      reference.sessionMapPut("usuario", user); 
                      reference.getFacesContext().getExternalContext().redirect("view/estudiantes/Estudiantes.xhtml");  
                    break;
                    
                default:   
                    reference.getFacesContext().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Credenciales incorrectas", "error"));
                    break;      
              } 
                
           } catch (Exception e) {          
                    reference.getFacesContext().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Credenciales incorrectas", "error"));
        }  
    }          
}