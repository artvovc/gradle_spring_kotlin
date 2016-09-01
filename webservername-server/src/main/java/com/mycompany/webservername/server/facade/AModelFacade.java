package com.mycompany.webservername.server.facade;

import com.mycompany.webservername.core.service.AModelService;
import com.mycompany.webservername.db.model.Base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Artemie on 30.08.2016.
 */
@Service
public class AModelFacade {
    private final AModelService aModelService;

    @Autowired
    public AModelFacade(AModelService aModelService) {
        this.aModelService = aModelService;
    }

    public void saveAModelDto(Base base) {
        aModelService.saveModel(base);
    }
}
