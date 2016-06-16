/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.beans;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Query;
import jpa.entidades.Cliente;

/**
 *
 * @author criscas
 */
@ Stateless
@ LocalBean
public class ClienteFacade  extends AbstractFacade<Cliente, Integer>{

        public ClienteFacade() {
        super(Cliente.class);
    }
    public List<Cliente> findByAll() {  
        Query query = entityManager.createNamedQuery("Cliente.findAll", entityClass);
        return query.getResultList();
       }  
        
    public List<Cliente> findByIdcliente() {  
        Query query = entityManager.createNamedQuery("Cliente.findByIdcliente", entityClass);
        return query.getResultList();
       }  
    public List<Cliente> findByDuicliente() {  
        Query query = entityManager.createNamedQuery("Cliente.findByDuicliente", entityClass);
        return query.getResultList();
       }  
    public List<Cliente> findByNomcliente() {  
        Query query = entityManager.createNamedQuery("Cliente.findByNomcliente", entityClass);
        return query.getResultList();
       }  
    public List<Cliente> findByDireccliente() {  
        Query query = entityManager.createNamedQuery("Cliente.findByDireccliente", entityClass);
        return query.getResultList();
       }  
    public List<Cliente> findByFecnacClient() {  
        Query query = entityManager.createNamedQuery("Cliente.findByFecnacClient", entityClass);
        return query.getResultList();
       }  
    public List<Cliente> findByTelCliente() {  
        Query query = entityManager.createNamedQuery("Cliente.findByTelCliente", entityClass);
        return query.getResultList();
       }  
    public List<Cliente> findByEmailClient() {  
        Query query = entityManager.createNamedQuery("Cliente.findByEmailClient", entityClass);
        return query.getResultList();
       }  
    
}
