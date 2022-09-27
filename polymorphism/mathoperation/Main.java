package com.n3.polymorphism.mathoperation;

public class Main {
    public static void main(String[] args) {
        MathOperation math = new MathOperation();

        System.out.println(math.add(2,3));
        System.out.println(math.add(3,3,3));
        System.out.println(math.add(4,4,4,4));
    }
}
