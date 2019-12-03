package com.company.Currency;

public class PoundSterling extends AbstractCurrencyUnit {
    public PoundSterling() {
    }

    @Override
    public void printCurrency() {
        System.out.println(getCurrencyUnit() + " GBP");
    }
}
