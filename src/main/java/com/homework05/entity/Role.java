package com.homework05.entity;

public class Role {
    private String id;
    private String name;
    //有参构造函数
    public Role(String id, String name) {
        this.id = id;
        this.name = name;
    }
    //setter and getter
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


