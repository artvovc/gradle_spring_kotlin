package com.mycompany.servername.server.controller;

import com.mycompany.servername.server.facade.Base;
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

    @GetMapping(path = "/lol", produces = MediaType.APPLICATION_JSON_VALUE)
    public HttpEntity<Base> work(){

        Base base = new Base();
        base.setName("WORK");
        return new ResponseEntity(base, HttpStatus.OK);
    }

}
