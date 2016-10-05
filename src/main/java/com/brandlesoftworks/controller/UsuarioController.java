
package com.brandlesoftworks.controller;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import com.brandlesoftworks.ejb.UsuarioFacadeLocal;
import com.brandlesoftworks.model.Usuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;

@Named
@ViewScoped
public class UsuarioController implements Serializable{
    @EJB
    private UsuarioFacadeLocal usuarioEJB;
    private Usuario usuario;
    
    @PostConstruct
    public void init(){
        setUsuario(new Usuario());
     
    }
    
    public void agregarUsuario(){
        try{
            usuarioEJB.create(getUsuario());
        }catch(Exception ex){
            //growl
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
