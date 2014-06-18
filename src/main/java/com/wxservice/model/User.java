package com.wxservice.model;

public class User {
    private String innerId;
    private String id;
    private String name;

    public User(String innerId, String id, String name) {
        this.innerId = innerId;
        this.id = id;
        this.name = name;
    }

    public String getInnerId() {
        return innerId;
    }

    public void setInnerId(String innerId) {
        this.innerId = innerId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
