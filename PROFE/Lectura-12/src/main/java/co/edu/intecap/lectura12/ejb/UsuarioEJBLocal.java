/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.lectura12.ejb;

import co.edu.intecap.lectura12.jpa.Cliente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Cesar
 */
@Local
public interface UsuarioEJBLocal {

    void nuevoCliente(Cliente cliente);

    List<Cliente> listarClientes();

}
