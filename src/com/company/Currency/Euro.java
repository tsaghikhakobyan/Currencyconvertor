package com.company.Currency;

public class Euro extends AbstractCurrencyUnit {
    public Euro() {
    }

    @Override
    public void printCurrency() {
        System.out.println(getCurrencyUnit() + " Euro");
    }
}
