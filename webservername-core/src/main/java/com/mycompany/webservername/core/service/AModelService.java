package com.mycompany.webservername.core.service;

import com.mycompany.webservername.db.dao.AModelDao;
import com.mycompany.webservername.db.model.Base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Artemie on 30.08.2016.
 */
@Service
public class AModelService {
    private final AModelDao aModelDao;

    @Autowired
    public AModelService(AModelDao aModelDao) {
        this.aModelDao = aModelDao;
    }

    @Transactional
    public void saveModel(Base base) {
        aModelDao.saveEntity(base);
    }
}
