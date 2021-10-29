package com.leoamaral.design.strategy;

import com.leoamaral.design.builder.Card;

public class CreditCardStrategy implements PaymentStrategy{
    private final Card card;

    public CreditCardStrategy(Card card){
        this.card = card;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + "paid with credit card in name: " + card.getName());
    }
}
