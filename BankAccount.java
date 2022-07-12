package com.n3.ObjectsAndClasses;

public class BankAccount {
    private static int accountCaunt = 1;
    private static double interestRate = 0.02 ;


    private int id;
    private double balance;

    public BankAccount() {
        this.id = accountCaunt;
        accountCaunt++;

        
    }
}
