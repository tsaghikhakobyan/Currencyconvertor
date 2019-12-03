package com.company.Convertor;

import com.company.Currency.*;

public class PoundSterlingConvertor implements Convertor {

    @Override
    public AbstractCurrencyUnit convert(AbstractCurrencyUnit unit) {
        double currency;
        if (unit instanceof Euro) {
            currency = unit.getCurrencyUnit() * 0.85;
        } else if (unit instanceof Ruble) {
            currency = unit.getCurrencyUnit() * 0.012;
        } else if (unit instanceof Dram) {
            currency = unit.getCurrencyUnit() * 0.0016;
        } else if (unit instanceof Dollar) {
            currency = unit.getCurrencyUnit() * 0.77;
        } else {
            currency = unit.getCurrencyUnit();
        }
        PoundSterling poundSterling = new PoundSterling();
        poundSterling.setCurrencyUnit(currency);
        return poundSterling;
    }
}

