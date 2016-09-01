package com.mycompany.webservername.db.impl;

import com.mycompany.webservername.db.dao.CrudOperations;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Artemie on 30.08.2016.
 */
public abstract class AbstractDao<T, I> implements CrudOperations<T, I> {

    @Autowired
    protected SessionFactory sessionFactory;

    private Class<T> clazz;

    public AbstractDao(Class<T> clazz) {
        this.clazz = clazz;
    }

    public Long saveEntity(T entity) {
        return (Long) getCurrentSession().save(entity);
    }

    public T findById(I identifier) {
        return getCurrentSession().find(clazz, identifier);
    }

    public void update(T entity) {
        getCurrentSession().update(entity);
    }

    public void delete(T entity) {
        getCurrentSession().delete(entity);
    }

    protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

}
