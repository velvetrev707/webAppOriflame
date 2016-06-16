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
import jpa.entidades.Empleados;

/**
 *
 * @author criscas
 */
@Stateless
@LocalBean
public class EmpleadosFacade extends AbstractFacade<Empleados, Integer>{

       public EmpleadosFacade() {
        super(Empleados.class);
    }
    
       public List<Deptos> findByCodDepartamento() {  
        Query query = entityManager.createNamedQuery("Empleados.findByCodDepto", entityClass);
        return query.getResultList();
       }  
       public List<Deptos> findByIdempl() {  
        Query query = entityManager.createNamedQuery("Empleados.findByIdempl", entityClass);
        return query.getResultList();
       }  
       public List<Deptos> findByDirecEmpl() {  
        Query query = entityManager.createNamedQuery("Empleados.findByDirecEmpl", entityClass);
        return query.getResultList();
       }  
       public List<Deptos> findByTelEmpl() {  
        Query query = entityManager.createNamedQuery("Empleados.findByTelEmpl", entityClass);
        return query.getResultList();
       }  
       public List<Deptos> findByFecnacEmpl() {  
        Query query = entityManager.createNamedQuery("Empleados.findByFecnacEmpl", entityClass);
        return query.getResultList();
       }  
       public List<Deptos> findByEmailEmpl() {  
        Query query = entityManager.createNamedQuery("Empleados.findByEmailEmpl", entityClass);
        return query.getResultList();
       }  
       public List<Deptos> findBySexo() {  
        Query query = entityManager.createNamedQuery("Empleados.findBySexo", entityClass);
        return query.getResultList();
       }  public List<Deptos> findByAll() {  
        Query query = entityManager.createNamedQuery("Empleados.findAll", entityClass);
        return query.getResultList();
       }  
       
}
