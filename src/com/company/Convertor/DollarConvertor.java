package com.company.Convertor;

import com.company.Currency.*;

public class DollarConvertor implements Convertor {

    @Override
    public AbstractCurrencyUnit convert(AbstractCurrencyUnit unit) {
        double currency;
        if (unit instanceof Euro) {
            currency = unit.getCurrencyUnit() * 1.1;
        } else if (unit instanceof Ruble) {
            currency = unit.getCurrencyUnit() * 63.87;
        } else if (unit instanceof Dram) {
            currency = unit.getCurrencyUnit() * 0.0021;
        } else if (unit instanceof PoundSterling) {
            currency = unit.getCurrencyUnit() * 1.29;
        } else {
            currency = unit.getCurrencyUnit();
        }
        Dollar dollar = new Dollar();
        dollar.setCurrencyUnit(currency);
        return dollar;
    }
}
