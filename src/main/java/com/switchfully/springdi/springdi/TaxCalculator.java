package com.switchfully.springdi.springdi;

public class TaxCalculator {

    private TaxCalculation taxCalculation;

        public TaxCalculator(TaxCalculation taxCalculation) {
        this.taxCalculation = taxCalculation;
    }
}
