/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.record.project.controller.util;

import com.record.project.entities.Usuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author luis
 */

@Named
@ViewScoped

public class InfSession implements Serializable{
    
    Usuario usuario;
    SessionReference reference;
    
    
    @PostConstruct
    public void init(){
        usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void sessionInfo(){
        try {
            reference = new SessionReference(); 
            usuario = (Usuario) reference.sessionMapGet("usuario");     
        } catch (Exception e) {
            throw e;
        }
    }
}
