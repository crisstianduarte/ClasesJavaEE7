/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.lectura12.mb;

import co.edu.intecap.lectura12.ejb.UsuarioEJBLocal;
import co.edu.intecap.lectura12.jpa.Cliente;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Cesar
 */
@Named(value = "clienteMB")
@RequestScoped
public class ClienteMB {

    @EJB
    private UsuarioEJBLocal usuarioEJB;

    private Cliente cliente;

    private List<Cliente> clientes;

    /**
     * Creates a new instance of ClienteMB
     */
    public ClienteMB() {
        cliente = new Cliente();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientes() {
        clientes = usuarioEJB.listarClientes();
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public void crearCliente (ActionEvent evt){
        usuarioEJB.nuevoCliente(cliente);
        cliente = new Cliente();
    }

}
