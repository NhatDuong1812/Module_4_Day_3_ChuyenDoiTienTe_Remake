package com.TuMangement.Exchange.Model;

public class Money {
    private String nameMoney;
    private double quantityMoney;
    private double exchangeRate;

    public Money(){};

    public Money(String nameMoney, double quantityMoney, double exchangeRate) {
        nameMoney = nameMoney;
        this.quantityMoney = quantityMoney;
        this.exchangeRate = exchangeRate;
    }

    public Money(String nameMoney, double quantityMoney) {
        nameMoney = nameMoney;
        this.quantityMoney = quantityMoney;
    }
}
