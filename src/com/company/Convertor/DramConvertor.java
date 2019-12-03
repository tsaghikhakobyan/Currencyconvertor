package com.company.Convertor;

import com.company.Currency.*;

public class DramConvertor implements Convertor {

    @Override
    public AbstractCurrencyUnit convert(AbstractCurrencyUnit unit) {
        double currency;
        if (unit instanceof Euro) {
            currency = unit.getCurrencyUnit() * 525;
        } else if (unit instanceof Ruble) {
            currency = unit.getCurrencyUnit() * 7.5;
        } else if (unit instanceof Dollar) {
            currency = unit.getCurrencyUnit() * 480;
        } else if (unit instanceof PoundSterling) {
            currency = unit.getCurrencyUnit() * 620;
        } else {
            currency = unit.getCurrencyUnit();
        }
        Dram dram = new Dram();
        dram.setCurrencyUnit(currency);
        return dram;
    }
}

