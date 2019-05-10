package com.vsk.task.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Address")
public class Address {
    private long id;
    private long userId;
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String d) {
        this.description = d;
    }
}
