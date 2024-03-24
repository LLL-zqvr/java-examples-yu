package com.homework05.entity;

public class User {
    private String id;
    private String name;
    private Game[] games;
    private Role role;
    //有参构造函数
    public User(String id, String name, Game[] games, Role role) {
        this.id = id;
        this.name = name;
        this.games = games;
        this.role = role;
    }
    //getter and setter
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
    public Game[] getGames() {
        return games;
    }
    public void setGames(Game[] games) {
        this.games = games;
    }
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
}


