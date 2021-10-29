package com.leoamaral.design.strategy;

public class PayPalStrategy implements PaymentStrategy{
    private final String name;
    private final String emailId;
    private final String password;

    public PayPalStrategy(String name, String email, String passwd){
        this.name = name;
        this.emailId = email;
        this.password = passwd;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid using PayPal in name: " + name);
    }
}
