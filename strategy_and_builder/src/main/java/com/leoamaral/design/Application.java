//padroes implementados: strategy e builder
// tentar adicionar o design pattern command e o decorator
package com.leoamaral.design;

import com.leoamaral.design.builder.Card;
import com.leoamaral.design.builder.CardBuilder;
import com.leoamaral.design.strategy.CreditCardStrategy;
import com.leoamaral.design.strategy.DebitCardStrategy;
import com.leoamaral.design.strategy.PayPalStrategy;
import com.leoamaral.design.strategy.PixStrategy;

public class Application {
    public static void main(String[] args) {
        int option;
        //Testing Card
        Card card = CardBuilder.builder()
                .nameInCard("LEONARDO M AMARAL")
                .withBrand("Master")
                .withCardNumber("2020 3030 4040 3030")
                .withCvv("123")
                .withDateOfExpiry("12/20")
                .build();
        System.out.println(card);

        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("0123", 10.0);
        Item item2 = new Item("2130", 20.25);

        cart.addItem(item1);
        cart.addItem(item2);

        System.out.println("Which method do you want to use?");
        System.out.println("1- Debit Card");
        System.out.println("2- Credit Card");
        System.out.println("3- PayPal");
        System.out.println("4- Pix");

        option = 4;

        switch (option) {
            case 1 -> cart.pay(new DebitCardStrategy(card));
            case 2 -> cart.pay(new CreditCardStrategy(card));
            case 3 -> cart.pay(new PayPalStrategy("Leonardo Miranda", "leo.amaral@teste.com", "pass123"));
            case 4 -> cart.pay(new PixStrategy("Leonardo Miranda", "leo.amaral@teste.com", "617e"));
            default -> System.out.println("Invalid pay method");
        }


    }
}
