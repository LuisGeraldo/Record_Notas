/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.record.project.controller;

import com.record.project.controller.util.Crypto;
import com.record.project.controller.util.SessionReference;
import com.record.project.ejb.UsuarioFacade;
import com.record.project.entities.TipoUsuario;
import com.record.project.entities.Usuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author luis
 */
@Named
@ViewScoped
public class RegisterController implements Serializable{

    @EJB
    private UsuarioFacade ejbUsuarioFacade;
    
    Usuario usuario;
    
    SessionReference reference;

    public Usuario getUsuario() {
        if(usuario == null){
            usuario = new Usuario();
        }
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    @PostConstruct
    public void init(){
        usuario = new Usuario();         
    }
    
    public void registrarse(){
        try {
            reference = new SessionReference();
            usuario.setPass(Crypto.Encriptar(usuario.getPass()));
            usuario.setIdNombre(new TipoUsuario("ESTUDIANTE"));
            ejbUsuarioFacade.create(usuario);
            reference.getFacesContext().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Cuenta creada, Inicie sesion", "cuenta creada"));
      } catch (Exception e) {
            reference.getFacesContext().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "No se puedo crear la cuenta", "error"));
      }
    }
}
