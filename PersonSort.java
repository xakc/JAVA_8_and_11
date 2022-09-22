package com.n3.Encapsulation.SortByNameAndAge;

public class PersonSort {
    private  String firstName;
    private String secondName;
    private String lastName;
    private double age;


    public PersonSort(String firstName, String secondName, String lastName, double age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.age = age;
    }

    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAge() {
        return age;
    }

    //Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(double age) {
        this.age = age;
    }
}
