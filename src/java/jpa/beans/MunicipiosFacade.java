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
import jpa.entidades.Municipios;

/**
 *
 * @author criscas
 */
@Stateless
@LocalBean
public class MunicipiosFacade extends AbstractFacade<Municipios, Integer>{

    public MunicipiosFacade() {
        super(Municipios.class);
    }
 
    public List<Municipios> findByCodDepto(Integer Depto)
    {
        Query query = entityManager.createQuery("SELECT d FROM Municipios d WHERE d.iddepto.iddepto = :iddepto",entityClass);
                query.setParameter("iddepto", Depto);
        
                return query.getResultList();
    }
    
     public List<Municipios> findByAll() {  
        Query query = entityManager.createNamedQuery("Empleados.findAll", entityClass);
        return query.getResultList();
       } 
      public List<Municipios> findByIdmunicipio() {  
        Query query = entityManager.createNamedQuery("Empleados.findByIdmunicipio", entityClass);
        return query.getResultList();
       } 
       public List<Municipios> findByNombMunicipio() {  
        Query query = entityManager.createNamedQuery("Empleados.findByNombMunicipio", entityClass);
        return query.getResultList();
       } 
   
    
}
