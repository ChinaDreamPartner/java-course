package com;
import java.util.*;
class Dog{
    private String name,color;
    private int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Dog() {
        name="dog1";
        color="white";
        age=1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        Dog d1 = new Dog();
        Dog d = new Dog(sca.next(),sca.next(),sca.nextInt());
        System.out.println("name=" + d1.getName() + ",color=" +d1.getColor()+",age="+d1.getAge());
        System.out.println("name=" + d.getName() + ",color=" +d.getColor()+",age="+d.getAge());

    }
}
