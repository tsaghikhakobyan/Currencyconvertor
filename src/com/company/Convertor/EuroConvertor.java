package com.company.Convertor;

import com.company.Currency.*;

public class EuroConvertor implements Convertor {
    @Override
    public AbstractCurrencyUnit convert(AbstractCurrencyUnit unit) {
        double currency;
        if (unit instanceof Dollar) {
            currency = unit.getCurrencyUnit() * 0.91;
        } else if (unit instanceof Ruble) {
            currency = unit.getCurrencyUnit() * 0.014;
        } else if (unit instanceof Dram) {
            currency = unit.getCurrencyUnit() * 0.0019;
        } else if (unit instanceof PoundSterling) {
            currency = unit.getCurrencyUnit() * 1.17;
        } else {
            currency = unit.getCurrencyUnit();
        }
        Euro euro = new Euro();
        euro.setCurrencyUnit(currency);
        return euro;
    }
}
