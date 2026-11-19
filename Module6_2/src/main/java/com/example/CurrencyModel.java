package com.example;

import java.util.ArrayList;
import java.util.List;

public class CurrencyModel {

    private List<Currency> currencies;

    public CurrencyModel() {
        currencies = new ArrayList<>();

        currencies.add(new Currency("USD", "US Dollar", 1.0));
        currencies.add(new Currency("EUR", "Euro", 0.86));
        currencies.add(new Currency("GBP", "British Pound", 0.75));
        currencies.add(new Currency("JPY", "Japanese Yen", 150.0));
        currencies.add(new Currency("SEK", "Swedish Krona", 10.5));
        currencies.add(new Currency("CAD", "Canadian Dollar", 1.35));
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }
}
