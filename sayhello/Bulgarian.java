package com.n3.sayhello;

public class Bulgarian implements Person {

    private String name;

    public Bulgarian(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getHello() {
        return "Zdravei";
    }
}
