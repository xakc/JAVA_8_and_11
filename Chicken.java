package com.n3.encapsulation.animalfarm;

public class Chicken {

    private String name;
    private  int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public void setName(String name) {
        name.trim();
        if (name.isEmpty()){
            throw new IllegalArgumentException("Name must be provided");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if ( 0 >age || age >15) {
            throw new IllegalArgumentException("Age must be bigger than 0 and less than 15 years");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
