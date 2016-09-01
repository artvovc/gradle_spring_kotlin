package com.mycompany.webservername.db.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Artemie on 26.08.2016.
 */
@Entity
@Table(name = "base_table")
public class Base implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
