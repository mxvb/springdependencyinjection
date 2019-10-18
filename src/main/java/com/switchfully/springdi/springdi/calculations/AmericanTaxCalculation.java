package com.switchfully.springdi.springdi.calculations;

import com.switchfully.springdi.springdi.TaxCalculation;
import org.springframework.stereotype.Component;

@Component
public class AmericanTaxCalculation implements TaxCalculation {

    private static final double LUMP_SUM = 950;
    private static final double US_TAX_RATE = 0.18;

    public double calculateTaxes(double yearlyIncome) {
        return (yearlyIncome * US_TAX_RATE) + LUMP_SUM;
    }
}
