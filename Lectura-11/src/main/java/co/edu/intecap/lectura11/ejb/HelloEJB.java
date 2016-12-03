/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.lectura11.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author INTECAP
 */
@Stateless
public class HelloEJB implements HelloEJBLocal {
    public String Hello(String name){
        return "hi "+name+"!";
    }
}
