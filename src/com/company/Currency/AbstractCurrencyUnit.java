package com.company.Currency;

public abstract class AbstractCurrencyUnit {
    public double currencyUnit;

    public AbstractCurrencyUnit() {
    }

    public abstract void printCurrency();

    public void setCurrencyUnit(double currencyUnit) {
        this.currencyUnit = currencyUnit;
    }

    public AbstractCurrencyUnit(double currencyUnit) {
        this.currencyUnit = currencyUnit;

    }

    public double getCurrencyUnit() {
        return currencyUnit;
    }
}
