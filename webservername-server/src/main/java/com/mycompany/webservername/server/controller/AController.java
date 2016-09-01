package com.mycompany.webservername.server.controller;

import com.mycompany.webservername.db.model.Base;
import com.mycompany.webservername.server.facade.AModelFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Artemie on 26.08.2016.
 */
@Controller
public class AController {
    private final AModelFacade aModelFacade;
    @Autowired
    public AController(AModelFacade aModelFacade) {
        this.aModelFacade = aModelFacade;
    }

    @GetMapping(path = "/lol", produces = MediaType.APPLICATION_JSON_VALUE)
    public HttpEntity<Base> work(){

        Base base = new Base();
        base.setName("WORK");

        aModelFacade.saveAModelDto(base);

        return new ResponseEntity(base, HttpStatus.OK);
    }

}
