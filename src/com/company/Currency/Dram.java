package com.company.Currency;

public class Dram extends AbstractCurrencyUnit {
    public Dram() {
    }

    @Override
    public void printCurrency() {
        System.out.println(getCurrencyUnit() + "AMD");
    }
}
