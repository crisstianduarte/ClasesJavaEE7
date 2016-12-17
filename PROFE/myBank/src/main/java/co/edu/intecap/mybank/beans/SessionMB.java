/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.mybank.beans;

import co.edu.intecap.mybank.model.Cliente;
import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Cesar
 */
@Named(value = "sessionMB")
@SessionScoped
public class SessionMB implements Serializable {

    private boolean logged;

    private Cliente cliente;

    @PostConstruct
    public void init() {
        cliente = new Cliente();
    }

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String validate() {
        if (this.cliente.getCorreoElectronio().equalsIgnoreCase("admin") && this.cliente.getPwd().equals("123")) {
            HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
            session.setAttribute("logged", Boolean.TRUE);
            return "clients";
        } else {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error de inicio de sesión", "Usuario o Clave inválidos");
            FacesContext.getCurrentInstance().addMessage(null, message);
            return "fail";
        }
    }

}
