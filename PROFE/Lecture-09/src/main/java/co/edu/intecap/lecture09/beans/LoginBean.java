/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.lecture09.beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Cesar
 */
@Named(value = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {

    private String user;

    private String password;

    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String validateUser() {
        
        if (user.equalsIgnoreCase("Admin") && password.equals("123")) {
            return "success";
        } else {
            
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                                                "Invalid User or Password", 
                                                "Invalid User or Password");
            
            FacesContext.getCurrentInstance().addMessage("general-messages", msg);
            
            return "fail";
        }
    }

}
