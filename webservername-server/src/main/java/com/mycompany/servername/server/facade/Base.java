package com.mycompany.servername.server.facade;

import java.io.Serializable;

/**
 * Created by Artemie on 26.08.2016.
 */
public class Base implements Serializable {

    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
