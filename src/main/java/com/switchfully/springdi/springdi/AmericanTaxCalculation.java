package com.switchfully.springdi.springdi;

public class AmericanTaxCalculation implements TaxCalculation {

    private static final double LUMP_SUM = 950;
    private static final double US_TAX_RATE = 0.18;

    public double calculateTax(double yearlyIncome) {
        return (yearlyIncome * US_TAX_RATE) + LUMP_SUM;
    }
}
