package com.company.Currency;

public class Ruble extends AbstractCurrencyUnit {
    public Ruble() {
    }

    @Override
    public void printCurrency() {
        System.out.println(getCurrencyUnit() + "RUB");
    }
}
