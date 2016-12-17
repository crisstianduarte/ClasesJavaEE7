/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.lectura13.business;

import co.edu.intecap.lectura13.model.Cliente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author INTECAP
 */
@Local
public interface ClientEJBLocal {
    void createClient(Cliente c);
    List<Cliente> clientList();
}
