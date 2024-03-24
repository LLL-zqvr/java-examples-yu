package com.homework05.Homework1;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("张三", Sex.MALE);
        Student student2 = new Student("李四",Sex.FEMALE);
        System.out.println(student1.getName() + " " + student1.getSex());
        System.out.println(student2.getName() + " " + student2.getSex());
    }
}
