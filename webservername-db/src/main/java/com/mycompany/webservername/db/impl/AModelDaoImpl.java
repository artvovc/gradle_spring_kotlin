package com.mycompany.webservername.db.impl;

import com.mycompany.webservername.db.dao.AModelDao;
import com.mycompany.webservername.db.model.Base;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Artemie on 30.08.2016.
 */
@Repository
@Transactional
public class AModelDaoImpl extends AbstractDao<Base, Long> implements AModelDao {

    public AModelDaoImpl() {
        super(Base.class);
    }
}
