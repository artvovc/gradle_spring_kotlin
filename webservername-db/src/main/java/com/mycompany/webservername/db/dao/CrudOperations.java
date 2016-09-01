package com.mycompany.webservername.db.dao;

/**
 * Created by Artemie on 30.08.2016.
 */
public interface CrudOperations<T, I> {
    Long saveEntity(T entity);

    T findById(I idEntity);

    void update(T entity);

    void delete(T entity);
}
