package com.company.Currency;

public class Dollar extends AbstractCurrencyUnit {
    public Dollar() {
    }

    @Override
    public void printCurrency() {
        System.out.println(getCurrencyUnit() + " $");
    }
}

