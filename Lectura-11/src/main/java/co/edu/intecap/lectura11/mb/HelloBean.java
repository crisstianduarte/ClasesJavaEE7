/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.lectura11.mb;

import co.edu.intecap.lectura11.ejb.HelloEJBLocal;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author INTECAP
 */
@Named(value = "helloBean")
@RequestScoped
public class HelloBean {

    @EJB
    private HelloEJBLocal helloEJB;
    
    
    
    private String name;
    private String helloName;
    
    
    /**
     * Creates a new instance of HelloBean
     */
    public HelloBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHelloName() {
        this.helloName = helloEJB.Hello(this.name);
        return helloName;
    }

    public void setHelloName(String helloName) {
        this.helloName = helloName;
    }
    
}
