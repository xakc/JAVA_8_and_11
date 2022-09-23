package com.n3.Encapsulation.ValidationViaSettersDemo;

public class Person {
    private  String firstName;
    private String secondName;
    private String lastName;
    private double age;
    private double salary;

    public Person(String firstName, String secondName, String lastName, double age) {
        this.setFirstName(firstName);
        this.setSecondName(secondName);
        this.setLastName(lastName);
        this.setAge(age);
        this.salary = salary;
    }

    //General methods
    private void ensureMinLengthForName(String nameParam, String messagePrefix) {
        if (nameParam.length()<=3) {
            throw new IllegalArgumentException(messagePrefix+" cannot be less than 3 symbols." );
        }
    }

    private void ensureMaxLengthForName(String nameParam, String messagePrefix) {
        if (nameParam.length()>=55) {
            throw new IllegalArgumentException(messagePrefix+" cannot be more than 55 symbols." );
        }
    }

    private void ensureMinLengthForAge(Double age, String messagePrefix) {
        if (age <=3) {
            throw new IllegalArgumentException(messagePrefix+" cannot be less than 3 symbols." );
        }
    }

    private void ensureMaxLengthForAge(Double age, String messagePrefix) {
        if (age >=25) {
            throw new IllegalArgumentException(messagePrefix+" cannot be more than 25 symbols." );
        }
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
    public double getSalary() {return salary;}

    //Setters
    private void setFirstName(String firstName) {
        ensureMinLengthForName(firstName,"First name");
        this.firstName = firstName;
    }

    private void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setAge(double age) {
        ensureMinLengthForAge(age,"The provided person age ");

        this.age =  age;
    }

    private void setSalary(double salary) {this.salary = salary;}
}
