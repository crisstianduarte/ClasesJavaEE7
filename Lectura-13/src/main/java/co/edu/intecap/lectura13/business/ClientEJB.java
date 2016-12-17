/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.lectura13.business;

import co.edu.intecap.lectura13.model.Cliente;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author INTECAP
 */
@Stateless
public class ClientEJB implements ClientEJBLocal {

    @PersistenceContext(unitName = "bank-pu")
    private EntityManager em;
    
    @Override
    public void createClient(Cliente c) {
        em.persist(c);
    }

    @Override
    public List<Cliente> clientList() {
        return em.createNamedQuery("Cliente.findAll").getResultList();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
