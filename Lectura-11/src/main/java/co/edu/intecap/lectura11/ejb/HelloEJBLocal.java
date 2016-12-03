/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.lectura11.ejb;

import javax.ejb.Local;

/**
 *
 * @author INTECAP
 */
@Local
public interface HelloEJBLocal {

    public String Hello(String name);


}
