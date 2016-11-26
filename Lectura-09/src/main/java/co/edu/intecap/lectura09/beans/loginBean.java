/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.lectura09.beans;


import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 *
 * @author capacitaciones
 */
@Named(value = "loginBean")
@SessionScoped
public class loginBean implements Serializable {
    private String user;
    private String pwd;
    /**
     * Creates a new instance of loginBean
     */
    public loginBean() {
        
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }    
    
    public String validateUser(){
        if(user.equalsIgnoreCase("Admin")&& pwd.equals("123")){
            return "success";
        }else{
            
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                                 "Invalid User or Password",
                                                 "Invalid User or Password");
            
            FacesContext.getCurrentInstance().addMessage("general-messages", msg);
            
            return "fail";
        }
    }
    
}
