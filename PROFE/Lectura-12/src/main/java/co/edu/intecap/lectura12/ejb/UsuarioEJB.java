/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.lectura12.ejb;

import co.edu.intecap.lectura12.jpa.Cliente;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Cesar
 */
@Stateless
public class UsuarioEJB implements UsuarioEJBLocal {

    @PersistenceContext(unitName = "banco-pu")
    private EntityManager em;

    @Override
    public void nuevoCliente(Cliente cliente) {
        em.persist(cliente);
    }

    @Override
    public List<Cliente> listarClientes() {
        Query q = em.createNamedQuery("Cliente.findAll");
        return q.getResultList();
    }

}
