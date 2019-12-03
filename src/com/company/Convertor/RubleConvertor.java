package com.company.Convertor;

import com.company.Currency.*;

public class RubleConvertor implements Convertor {

    @Override
    public AbstractCurrencyUnit convert(AbstractCurrencyUnit unit) {
        double currency;
        if (unit instanceof Euro) {
            currency = unit.getCurrencyUnit() * 71;
        } else if (unit instanceof Dollar) {
            currency = unit.getCurrencyUnit() * 64;
        } else if (unit instanceof Dram) {
            currency = unit.getCurrencyUnit() * 0.14;
        } else if (unit instanceof PoundSterling) {
            currency = unit.getCurrencyUnit() * 83;
        } else {
            currency = unit.getCurrencyUnit();
        }
        Ruble ruble = new Ruble();
        ruble.setCurrencyUnit(currency);
        return ruble;
    }
}

