/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.lecture11.ejb;

import javax.ejb.Local;

/**
 *
 * @author Cesar
 */
@Local
public interface HelloEJBLocal {
    
    String hello(String name);
    
}
