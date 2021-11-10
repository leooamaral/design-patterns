package com.leoamaral.design.builder;

public class CardBuilder {
    private final Card card;

    private CardBuilder(){
        this.card = new Card();
    }

    public static CardBuilder builder(){
        return new CardBuilder();
    }

    public CardBuilder nameInCard(String name){
        card.setName(name);
        return this;
    }

    public CardBuilder withBrand(String brand){
        card.setBrand(brand);
        return this;
    }

    public CardBuilder withCardNumber(String cardNumber){
        card.setCardNumber(cardNumber);
        return this;
    }

    public CardBuilder withCvv(String cvv){
        card.setCvv(cvv);
        return this;
    }

    public CardBuilder withDateOfExpiry(String dateOfExpiry){
        card.setDateOfExpiry(dateOfExpiry);
        return this;
    }

    public Card build(){
        return this.card;
    }
}
