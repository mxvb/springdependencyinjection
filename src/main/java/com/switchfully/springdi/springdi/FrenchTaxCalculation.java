package com.switchfully.springdi.springdi;

public class FrenchTaxCalculation implements TaxCalculation {

    private static final double FR_TAX_RATE = 0.48;

    public double calculateTax(double yearlyIncome) {
        return yearlyIncome * FR_TAX_RATE;
    }
}

