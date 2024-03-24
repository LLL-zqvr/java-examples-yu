package com.homework05.entity;

public class Game {
    private String id;
    private String name;
    private String introduction;

//有参构造函数
    public Game(String id, String name, String introduction) {
        this.id = id;
        this.name = name;
        this.introduction = introduction;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setIntroduction(String introduction){
        this.introduction = introduction;
    }
    public String getIntroduction(){
        return introduction;
    }

}



