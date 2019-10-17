package com.switchfully.springdi.springdi;

public class BelgianTaxCalculation implements TaxCalculation {

    private static final double BE_TAX_RATE = 0.45;

    public double calculateTax(double yearlyIncome) {
        return yearlyIncome * BE_TAX_RATE;
    }
}
