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
import jpa.entidades.Deptos;

/**
 *
 * @author criscas
 */
@Stateless
@LocalBean
public class DepartamentoFacade extends AbstractFacade<Deptos, Integer>{

    public DepartamentoFacade() {
        super(Deptos.class);
    }
    public List<Deptos> findByAll() {  
        Query query = entityManager.createNamedQuery("Empleados.findAll", entityClass);
        return query.getResultList();
       }  
    
    public List<Deptos> findByIddepto() {  
        Query query = entityManager.createNamedQuery("Empleados.findByIddepto", entityClass);
        return query.getResultList();
       }  
     public List<Deptos> findByNombDepto() {  
        Query query = entityManager.createNamedQuery("Empleados.findByNombDepto", entityClass);
        return query.getResultList();
       } 
    
 
}
