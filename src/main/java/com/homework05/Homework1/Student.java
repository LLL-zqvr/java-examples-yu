package com.homework05.Homework1;

public class Student {
    //属性
    private String name;
    private Sex sex;
    //有参构造函数
    public Student(String name, Sex sex){
        this.name = name;
        this.sex = sex;
    }
    //setter and getter
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSex(Sex sex){
        this.sex = sex;
    }
    public Sex getSex(){
        return sex;
    }
}
