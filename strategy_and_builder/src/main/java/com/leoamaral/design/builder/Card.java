package com.leoamaral.design.builder;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Card {
    private String name;
    private String brand;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(String dateOfExpiry) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yy");
        YearMonth expiryDate = YearMonth.parse(dateOfExpiry, formatter);
        dateOfExpiry = String.valueOf(expiryDate);
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", cvv='" + cvv + '\'' +
                ", dateOfExpiry='" + dateOfExpiry + '\'' +
                '}';
    }
}
