package com.company;

import com.company.Convertor.Convertor;
import com.company.Convertor.DramConvertor;
import com.company.Convertor.PoundSterlingConvertor;
import com.company.Currency.AbstractCurrencyUnit;
import com.company.Currency.Dram;
import com.company.Currency.PoundSterling;

public class Main {

    public static void main(String[] args) {
        DramConvertor dramconvertor = new DramConvertor();
        PoundSterling poundSterling = new PoundSterling();
        poundSterling.setCurrencyUnit(1000);
        AbstractCurrencyUnit convert = dramconvertor.convert(poundSterling);
        convert.printCurrency();
    }
}

