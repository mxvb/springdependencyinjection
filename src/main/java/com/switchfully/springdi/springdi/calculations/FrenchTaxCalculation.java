package com.switchfully.springdi.springdi.calculations;

import com.switchfully.springdi.springdi.TaxCalculation;
import org.springframework.stereotype.Component;

@Component
public class FrenchTaxCalculation implements TaxCalculation {

    private static final double FR_TAX_RATE = 0.48;

    public double calculateTaxes(double yearlyIncome) {
        return yearlyIncome * FR_TAX_RATE;
    }
}

