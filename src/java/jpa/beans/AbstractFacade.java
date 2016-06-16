/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.beans;

import java.util.List;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Gabriel Bran <gbran@promerica.com.sv>
 * @param <Entity>
 * @param <PrimaryKey>
 */
public abstract class AbstractFacade<Entity, PrimaryKey> {

    @PersistenceContext
    protected EntityManager entityManager;
    protected Class<Entity> entityClass;
    protected static final Logger logger = Logger.getLogger(AbstractFacade.class.getName());

    public AbstractFacade(Class<Entity> entityClass) {
        this.entityClass = entityClass;
    }

    public void create(Entity entity) {
        entityManager.persist(entity);
    }

    public Entity find(PrimaryKey primaryKey) {
        return entityManager.find(entityClass, primaryKey);
    }

    public void update(Entity entity) {
        entityManager.merge(entity);
    }

    public void delete(Entity entity) {
        entityManager.remove(entityManager.merge(entity));
    }

    public List<Entity> findAll() {
        CriteriaQuery<Entity> cq = entityManager.getCriteriaBuilder().createQuery(entityClass);
        return entityManager.createQuery(cq).getResultList();
    }
}
