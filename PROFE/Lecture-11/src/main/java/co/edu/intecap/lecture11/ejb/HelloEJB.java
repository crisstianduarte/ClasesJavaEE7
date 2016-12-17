/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.lecture11.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author Cesar
 */
@Stateless
public class HelloEJB implements HelloEJBLocal {

    @Override
    public String hello(String name) {
        return "hi " + name + "!";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
